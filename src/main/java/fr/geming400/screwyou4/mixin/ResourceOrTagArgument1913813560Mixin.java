package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.ResourceOrTagArgument.class)
public class ResourceOrTagArgument1913813560Mixin {
        @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Ljava/lang/Object;", cancellable = true)
    private void parse__1419893642(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1419893642L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Lnet/minecraft/commands/arguments/ResourceOrTagArgument$Result;", cancellable = true)
    private void parse__2070442126(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2070442126L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getExamples()Ljava/util/Collection;", cancellable = true)
    private void getExamples__656539737(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-656539737L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "listSuggestions(Lcom/mojang/brigadier/context/CommandContext;Lcom/mojang/brigadier/suggestion/SuggestionsBuilder;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void listSuggestions_1162255769(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1162255769L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }

    @Inject(at = @At("HEAD"), method = "getResourceOrTag(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;Lnet/minecraft/resources/ResourceKey;)Lnet/minecraft/commands/arguments/ResourceOrTagArgument$Result;", cancellable = true)
    private static void getResourceOrTag_1045846458(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1045846458L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "resourceOrTag(Lnet/minecraft/commands/CommandBuildContext;Lnet/minecraft/resources/ResourceKey;)Lnet/minecraft/commands/arguments/ResourceOrTagArgument;", cancellable = true)
    private static void resourceOrTag__491040659(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-491040659L))
            info.setReturnValue(null);
    }


}
