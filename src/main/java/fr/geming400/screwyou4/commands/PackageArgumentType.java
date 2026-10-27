package fr.geming400.screwyou4.commands;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.Suggestions;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import fr.geming400.screwyou4.killer.ClassExecutioner;
import net.minecraft.commands.SharedSuggestionProvider;

import java.util.*;
import java.util.concurrent.CompletableFuture;
import java.util.function.Predicate;

public class PackageArgumentType implements ArgumentType<List<Class<?>>> {
    private final static SimpleCommandExceptionType GLOB_SYNTAX_ERROR = new SimpleCommandExceptionType(() -> "Missing glob characters: '*' or '**' was expected");
    private final static SimpleCommandExceptionType PACKAGE_NOT_FOUND_ERROR = new SimpleCommandExceptionType(() -> "Package not found");

    @Override
    public List<Class<?>> parse(StringReader reader) throws CommandSyntaxException {
        String packageNameWithGlob = reader.getRemaining().split(" ")[0];
        while (reader.canRead() && reader.peek() != ' ') {
            reader.skip();
        }

        if (packageNameWithGlob.endsWith(".*") || packageNameWithGlob.endsWith(".**")) {
            List<String> packageParts = Arrays.asList(packageNameWithGlob.split("\\."));
            GlobType globType = GlobType.ofString(packageParts.getLast());

            // We remove the glob part
            String packageName = String.join(".", packageParts.subList(0, packageParts.size() - 1));

            Predicate<String> packageFilter;
            if (globType == GlobType.PACKAGE) {
                packageFilter = pkg -> pkg.equals(packageName);
            } else /* globType == GlobType.RECURSIVE */ {
                packageFilter = pkg -> pkg.startsWith(packageName);
            }

            return Arrays.stream(ClassExecutioner.getLoadedClasses())
                    .filter(clazz -> packageFilter.test(clazz.getPackageName()))
                    .toList();
        } else {
            throw GLOB_SYNTAX_ERROR.createWithContext(reader);
        }
    }

    @Override
    public <S> CompletableFuture<Suggestions> listSuggestions(CommandContext<S> context, SuggestionsBuilder builder) {
        return SharedSuggestionProvider.suggest(
                Arrays.stream(ClassExecutioner.getLoadedClasses())
                        .map(Class::getPackageName)
                        .distinct()
                        .mapMulti((packageName, downStream) -> {
                            downStream.accept(packageName + ".");
                            downStream.accept(packageName + ".*");
                            downStream.accept(packageName + ".**");
                        }),
                builder
        );
    }

    public static PackageArgumentType pkg() {
        return new PackageArgumentType();
    }

    public static List<Class<?>> getPackageClasses(final CommandContext<?> context, final String name) {
        // noinspection unchecked
        return (List<Class<?>>) context.getArgument(name, List.class);
    }

    private enum GlobType {
        PACKAGE,
        RECURSIVE;

        public static GlobType ofString(String globStringType) throws CommandSyntaxException {
            if (globStringType.equals("*")) {
                return PACKAGE;
            } else if (globStringType.equals("**")) {
                return RECURSIVE;
            } else {
                throw GLOB_SYNTAX_ERROR.create();
            }
        }
    }
}
