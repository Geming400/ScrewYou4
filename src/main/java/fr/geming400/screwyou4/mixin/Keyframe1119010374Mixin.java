package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.animation.Keyframe.class)
public class Keyframe1119010374Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_210384106(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(210384106L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1889433899(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1889433899L))
            info.setReturnValue("YGT/\uB7B1CI\uB9FFA#\u63BBMi(0fm2$sr\u670Cse\uC2F9TS$fU$aHV`@LD\u68D9_\u913631:l\",F");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1676362465(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1676362465L))
            info.setReturnValue(2052895242);
    }

    @Inject(at = @At("HEAD"), method = "timestamp()F", cancellable = true)
    private void timestamp_59612563(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(59612563L))
            info.setReturnValue(8.994977E8F);
    }

    @Inject(at = @At("HEAD"), method = "postTarget()Lorg/joml/Vector3fc;", cancellable = true)
    private void postTarget_639012376(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(639012376L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "preTarget()Lorg/joml/Vector3fc;", cancellable = true)
    private void preTarget_607420635(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(607420635L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "interpolation()Lnet/minecraft/client/animation/AnimationChannel$Interpolation;", cancellable = true)
    private void interpolation_605776716(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(605776716L))
            info.setReturnValue(null);
    }


}
