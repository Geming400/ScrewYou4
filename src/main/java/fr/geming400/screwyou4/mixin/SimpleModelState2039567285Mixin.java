package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.block.dispatch.Variant.SimpleModelState.class)
public class SimpleModelState2039567285Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1130941017(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1130941017L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1484976486(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1484976486L))
            info.setReturnValue("w\u8F10oP\u29FE\u8D8EVF\u23F3S\uBFB0s>uq-QIxq]\u62A6\uFE68\u7507Vq:9mDmee7y nxyiW`}R5t's.[&l");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1698047920(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1698047920L))
            info.setReturnValue(1399216414);
    }

    @Inject(at = @At("HEAD"), method = "x()Lcom/mojang/math/Quadrant;", cancellable = true)
    private void x__1434210873(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1434210873L))
            info.setReturnValue(com.mojang.math.Quadrant.R90);
    }

    @Inject(at = @At("HEAD"), method = "z()Lcom/mojang/math/Quadrant;", cancellable = true)
    private void z__732610999(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-732610999L))
            info.setReturnValue(com.mojang.math.Quadrant.R270);
    }

    @Inject(at = @At("HEAD"), method = "y()Lcom/mojang/math/Quadrant;", cancellable = true)
    private void y__1083410936(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1083410936L))
            info.setReturnValue(com.mojang.math.Quadrant.R0);
    }

    @Inject(at = @At("HEAD"), method = "asModelState()Lnet/minecraft/client/renderer/block/dispatch/ModelState;", cancellable = true)
    private void asModelState__1430938080(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1430938080L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withUvLock(Z)Lnet/minecraft/client/renderer/block/dispatch/Variant$SimpleModelState;", cancellable = true)
    private void withUvLock_386157477(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(386157477L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withZ(Lcom/mojang/math/Quadrant;)Lnet/minecraft/client/renderer/block/dispatch/Variant$SimpleModelState;", cancellable = true)
    private void withZ_755518224(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(755518224L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withX(Lcom/mojang/math/Quadrant;)Lnet/minecraft/client/renderer/block/dispatch/Variant$SimpleModelState;", cancellable = true)
    private void withX__1672740398(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1672740398L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withY(Lcom/mojang/math/Quadrant;)Lnet/minecraft/client/renderer/block/dispatch/Variant$SimpleModelState;", cancellable = true)
    private void withY_1688872561(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1688872561L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "uvLock()Z", cancellable = true)
    private void uvLock_1556880768(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1556880768L))
            info.setReturnValue(false);
    }


}
