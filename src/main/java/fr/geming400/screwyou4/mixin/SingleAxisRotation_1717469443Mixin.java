package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.model.cuboid.CuboidRotation.SingleAxisRotation.class)
public class SingleAxisRotation_1717469443Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1191985595(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1191985595L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_582009467(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(582009467L))
            info.setReturnValue("N/*'\u37A9N)oHT.7rGkmE\u6BE1lg\u56A3-\u5C4D");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1755732184(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1755732184L))
            info.setReturnValue(-919087103);
    }

    @Inject(at = @At("HEAD"), method = "transformation()Lorg/joml/Matrix4f;", cancellable = true)
    private void transformation_249662355(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(249662355L))
            info.setReturnValue(new org.joml.Matrix4f());
    }

    @Inject(at = @At("HEAD"), method = "angle()F", cancellable = true)
    private void angle_1755728805(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1755728805L))
            info.setReturnValue(2.212695E8F);
    }

    @Inject(at = @At("HEAD"), method = "axis()Lnet/minecraft/core/Direction$Axis;", cancellable = true)
    private void axis__1028489308(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1028489308L))
            info.setReturnValue(net.minecraft.core.Direction.Axis.Z);
    }


}
