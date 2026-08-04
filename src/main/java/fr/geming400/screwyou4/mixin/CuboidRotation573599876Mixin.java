package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.model.cuboid.CuboidRotation.class)
public class CuboidRotation573599876Mixin {
        @Inject(at = @At("HEAD"), method = "value()Lnet/minecraft/client/resources/model/cuboid/CuboidRotation$RotationValue;", cancellable = true)
    private void value_1001086198(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1001086198L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1959112135(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1959112135L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__561860099(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-561860099L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_611862618(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(611862618L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "transform()Lorg/joml/Matrix4fc;", cancellable = true)
    private void transform__1978393182(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1978393182L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "origin()Lorg/joml/Vector3fc;", cancellable = true)
    private void origin_1119544581(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1119544581L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "rescale()Z", cancellable = true)
    private void rescale_611878459(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(611878459L))
            info.setReturnValue(null);
    }


}
