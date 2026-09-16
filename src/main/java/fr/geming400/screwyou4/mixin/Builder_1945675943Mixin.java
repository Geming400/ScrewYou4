package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.gametest.framework.TestFinder.Builder.class)
public class Builder_1945675943Mixin {
        @Inject(at = @At("HEAD"), method = "radius(Lcom/mojang/brigadier/context/CommandContext;I)Lnet/minecraft/gametest/framework/TestFinder;", cancellable = true)
    private void radius__1208816265(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1208816265L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "nearest(Lcom/mojang/brigadier/context/CommandContext;)Lnet/minecraft/gametest/framework/TestFinder;", cancellable = true)
    private void nearest_1646187106(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1646187106L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "allNearby(Lcom/mojang/brigadier/context/CommandContext;)Lnet/minecraft/gametest/framework/TestFinder;", cancellable = true)
    private void allNearby__1161953788(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1161953788L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "lookedAt(Lcom/mojang/brigadier/context/CommandContext;)Lnet/minecraft/gametest/framework/TestFinder;", cancellable = true)
    private void lookedAt__2060441835(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2060441835L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "byResourceSelection(Lcom/mojang/brigadier/context/CommandContext;Ljava/util/Collection;)Lnet/minecraft/gametest/framework/TestFinder;", cancellable = true)
    private void byResourceSelection__535361220(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-535361220L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createMultipleCopies(I)Lnet/minecraft/gametest/framework/TestFinder$Builder;", cancellable = true)
    private void createMultipleCopies__1205222037(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1205222037L))
            info.setReturnValue(new net.minecraft.gametest.framework.TestFinder.Builder());
    }

    @Inject(at = @At("HEAD"), method = "failedTests(Lcom/mojang/brigadier/context/CommandContext;)Lnet/minecraft/gametest/framework/TestFinder;", cancellable = true)
    private void failedTests_1955326824(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1955326824L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "failedTests(Lcom/mojang/brigadier/context/CommandContext;Z)Lnet/minecraft/gametest/framework/TestFinder;", cancellable = true)
    private void failedTests__1867361802(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1867361802L))
            info.setReturnValue(null);
    }


}
