package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.ResourceOrIdArgument.class)
public class ResourceOrIdArgument_1131012013Mixin {
        @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Lnet/minecraft/core/Holder;", cancellable = true)
    private void parse_291764773(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(291764773L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Ljava/lang/Object;", cancellable = true)
    private void parse_2092272106(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2092272106L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "getLootTable(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;)Lnet/minecraft/core/Holder;", cancellable = true)
    private static void getLootTable__770248268(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-770248268L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "lootTable(Lnet/minecraft/commands/CommandBuildContext;)Lnet/minecraft/commands/arguments/ResourceOrIdArgument$LootTableArgument;", cancellable = true)
    private static void lootTable__1847921276(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1847921276L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDialog(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;)Lnet/minecraft/core/Holder;", cancellable = true)
    private static void getDialog_1667624482(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1667624482L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "dialog(Lnet/minecraft/commands/CommandBuildContext;)Lnet/minecraft/commands/arguments/ResourceOrIdArgument$DialogArgument;", cancellable = true)
    private static void dialog_1354365360(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1354365360L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "lootPredicate(Lnet/minecraft/commands/CommandBuildContext;)Lnet/minecraft/commands/arguments/ResourceOrIdArgument$LootPredicateArgument;", cancellable = true)
    private static void lootPredicate_1268404658(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1268404658L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "lootModifier(Lnet/minecraft/commands/CommandBuildContext;)Lnet/minecraft/commands/arguments/ResourceOrIdArgument$LootModifierArgument;", cancellable = true)
    private static void lootModifier_1723211472(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1723211472L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "listSuggestions(Lcom/mojang/brigadier/context/CommandContext;Lcom/mojang/brigadier/suggestion/SuggestionsBuilder;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void listSuggestions_379454221(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(379454221L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getExamples()Ljava/util/Collection;", cancellable = true)
    private void getExamples__1439341285(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1439341285L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createGrammar(Lnet/minecraft/resources/ResourceKey;Lcom/mojang/serialization/DynamicOps;)Lnet/minecraft/util/parsing/packrat/commands/Grammar;", cancellable = true)
    private static void createGrammar__433789228(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-433789228L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getLootPredicate(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;)Lnet/minecraft/core/Holder;", cancellable = true)
    private static void getLootPredicate__822916899(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-822916899L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getLootModifier(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;)Lnet/minecraft/core/Holder;", cancellable = true)
    private static void getLootModifier_166009785(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(166009785L))
            info.setReturnValue(null);
    }


}
