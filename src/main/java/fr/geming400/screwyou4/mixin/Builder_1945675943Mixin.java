package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.gametest.framework.TestFinder.Builder.class)
public class Builder_1945675943Mixin {
        @Inject(at = @At("HEAD"), method = "radius(Lcom/mojang/brigadier/context/CommandContext;I)Lnet/minecraft/gametest/framework/TestFinder;", cancellable = true)
    private void radius__949298103(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-949298103L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "nearest(Lcom/mojang/brigadier/context/CommandContext;)Lnet/minecraft/gametest/framework/TestFinder;", cancellable = true)
    private void nearest_179571332(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(179571332L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "failedTests(Lcom/mojang/brigadier/context/CommandContext;Z)Lnet/minecraft/gametest/framework/TestFinder;", cancellable = true)
    private void failedTests__1081207206(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1081207206L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "failedTests(Lcom/mojang/brigadier/context/CommandContext;)Lnet/minecraft/gametest/framework/TestFinder;", cancellable = true)
    private void failedTests_179571332(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(179571332L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "byResourceSelection(Lcom/mojang/brigadier/context/CommandContext;Ljava/util/Collection;)Lnet/minecraft/gametest/framework/TestFinder;", cancellable = true)
    private void byResourceSelection_1138269493(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1138269493L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createMultipleCopies(I)Lnet/minecraft/gametest/framework/TestFinder$Builder;", cancellable = true)
    private void createMultipleCopies_2129328396(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2129328396L))
            info.setReturnValue(new net.minecraft.gametest.framework.TestFinder$Builder());
    }

    @Inject(at = @At("HEAD"), method = "lookedAt(Lcom/mojang/brigadier/context/CommandContext;)Lnet/minecraft/gametest/framework/TestFinder;", cancellable = true)
    private void lookedAt_179571332(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(179571332L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "allNearby(Lcom/mojang/brigadier/context/CommandContext;)Lnet/minecraft/gametest/framework/TestFinder;", cancellable = true)
    private void allNearby_179571332(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(179571332L))
            info.setReturnValue(null);
    }


}
