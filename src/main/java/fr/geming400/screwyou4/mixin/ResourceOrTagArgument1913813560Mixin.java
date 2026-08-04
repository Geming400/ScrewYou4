package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.ResourceOrTagArgument.class)
public class ResourceOrTagArgument1913813560Mixin {
        @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Ljava/lang/Object;", cancellable = true)
    private void parse_1620431817(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1620431817L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Lnet/minecraft/commands/arguments/ResourceOrTagArgument$Result;", cancellable = true)
    private void parse_944974591(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(944974591L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "listSuggestions(Lcom/mojang/brigadier/context/CommandContext;Lcom/mojang/brigadier/suggestion/SuggestionsBuilder;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void listSuggestions__2140230294(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2140230294L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getExamples()Ljava/util/Collection;", cancellable = true)
    private void getExamples_100165288(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(100165288L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "resourceOrTag(Lnet/minecraft/commands/CommandBuildContext;Lnet/minecraft/resources/ResourceKey;)Lnet/minecraft/commands/arguments/ResourceOrTagArgument;", cancellable = true)
    private static void resourceOrTag_483250454(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(483250454L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getResourceOrTag(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;Lnet/minecraft/resources/ResourceKey;)Lnet/minecraft/commands/arguments/ResourceOrTagArgument$Result;", cancellable = true)
    private static void getResourceOrTag__2084707155(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2084707155L))
            info.setReturnValue(null);
    }


}
