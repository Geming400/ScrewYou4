package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.ResourceSelectorArgument.class)
public class ResourceSelectorArgument_591163500Mixin {
        @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;Lnet/minecraft/core/HolderLookup;)Ljava/util/Collection;", cancellable = true)
    private static void parse_2004693115(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2004693115L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Ljava/lang/Object;", cancellable = true)
    private void parse_1552423593(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1552423593L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Ljava/util/Collection;", cancellable = true)
    private void parse_165929022(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(165929022L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "listSuggestions(Lcom/mojang/brigadier/context/CommandContext;Lcom/mojang/brigadier/suggestion/SuggestionsBuilder;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void listSuggestions__160394292(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-160394292L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getExamples()Ljava/util/Collection;", cancellable = true)
    private void getExamples__1979189798(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1979189798L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSelectedResources(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;)Ljava/util/Collection;", cancellable = true)
    private static void getSelectedResources__1245545733(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1245545733L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "resourceSelector(Lnet/minecraft/commands/CommandBuildContext;Lnet/minecraft/resources/ResourceKey;)Lnet/minecraft/commands/arguments/ResourceSelectorArgument;", cancellable = true)
    private static void resourceSelector__1516910708(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1516910708L))
            info.setReturnValue(null);
    }


}
