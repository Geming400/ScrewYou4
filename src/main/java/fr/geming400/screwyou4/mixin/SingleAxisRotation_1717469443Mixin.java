package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.model.cuboid.CuboidRotation.SingleAxisRotation.class)
public class SingleAxisRotation_1717469443Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_808843174(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(808843174L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1807074329(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1807074329L))
            info.setReturnValue("'6q8wH+heI\uA1319\uA405&f,CYw`ds\u6E92JVVV5N\u60E9X.ECmE\u4DEE%9=q3J\u0F68bNAkD;cXCau^?E^O6");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__2020145763(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2020145763L))
            info.setReturnValue(-2118843955);
    }

    @Inject(at = @At("HEAD"), method = "transformation()Lorg/joml/Matrix4f;", cancellable = true)
    private void transformation_1250238058(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1250238058L))
            info.setReturnValue(new org.joml.Matrix4f());
    }

    @Inject(at = @At("HEAD"), method = "angle()F", cancellable = true)
    private void angle_1995792050(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1995792050L))
            info.setReturnValue(9.085481E8F);
    }

    @Inject(at = @At("HEAD"), method = "axis()Lnet/minecraft/core/Direction$Axis;", cancellable = true)
    private void axis__401394461(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-401394461L))
            info.setReturnValue(net.minecraft.core.Direction.Axis.Z);
    }


}
