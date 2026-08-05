package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.commands.arguments.ResourceSelectorArgument.class)
public class ResourceSelectorArgument_591163500Mixin {
        @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;Lnet/minecraft/core/HolderLookup;)Ljava/util/Collection;", cancellable = true)
    private static void parse__1887459064(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1887459064L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Ljava/util/Collection;", cancellable = true)
    private void parse__230838767(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-230838767L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "parse(Lcom/mojang/brigadier/StringReader;)Ljava/lang/Object;", cancellable = true)
    private void parse_297781756(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(297781756L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "listSuggestions(Lcom/mojang/brigadier/context/CommandContext;Lcom/mojang/brigadier/suggestion/SuggestionsBuilder;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void listSuggestions_832086941(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(832086941L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getExamples()Ljava/util/Collection;", cancellable = true)
    private void getExamples__1222484773(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1222484773L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSelectedResources(Lcom/mojang/brigadier/context/CommandContext;Ljava/lang/String;)Ljava/util/Collection;", cancellable = true)
    private static void getSelectedResources__1881838193(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1881838193L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "resourceSelector(Lnet/minecraft/commands/CommandBuildContext;Lnet/minecraft/resources/ResourceKey;)Lnet/minecraft/commands/arguments/ResourceSelectorArgument;", cancellable = true)
    private static void resourceSelector_22619007(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(22619007L))
            info.setReturnValue(null);
    }


}
