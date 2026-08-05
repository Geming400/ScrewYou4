package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.animation.Keyframe.class)
public class Keyframe1119010374Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1790444663(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1790444663L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__16449601(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-16449601L))
            info.setReturnValue("H!'f\u9F45%5),B:W*v{o\uAEF4@kz@T;\u32FE!$/hE`\u4C54(r\uD3D2q`B");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1157273116(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1157273116L))
            info.setReturnValue(-482860561);
    }

    @Inject(at = @At("HEAD"), method = "timestamp()F", cancellable = true)
    private void timestamp_1157269737(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1157269737L))
            info.setReturnValue(6.038956E8F);
    }

    @Inject(at = @At("HEAD"), method = "interpolation()Lnet/minecraft/client/animation/AnimationChannel$Interpolation;", cancellable = true)
    private void interpolation_1801131888(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1801131888L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "postTarget()Lorg/joml/Vector3fc;", cancellable = true)
    private void postTarget_1664955079(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1664955079L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "preTarget()Lorg/joml/Vector3fc;", cancellable = true)
    private void preTarget_1664955079(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1664955079L))
            info.setReturnValue(null);
    }


}
