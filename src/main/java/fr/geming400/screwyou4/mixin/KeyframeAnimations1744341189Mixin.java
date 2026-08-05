package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.animation.KeyframeAnimations.class)
public class KeyframeAnimations1744341189Mixin {
        @Inject(at = @At("HEAD"), method = "scaleVec(DDD)Lorg/joml/Vector3f;", cancellable = true)
    private static void scaleVec__1130562561(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1130562561L))
            info.setReturnValue(new org.joml.Vector3f());
    }

    @Inject(at = @At("HEAD"), method = "posVec(FFF)Lorg/joml/Vector3f;", cancellable = true)
    private static void posVec_1365501505(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1365501505L))
            info.setReturnValue(new org.joml.Vector3f());
    }

    @Inject(at = @At("HEAD"), method = "degreeVec(FFF)Lorg/joml/Vector3f;", cancellable = true)
    private static void degreeVec_1365501505(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1365501505L))
            info.setReturnValue(new org.joml.Vector3f());
    }


}
