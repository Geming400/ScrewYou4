package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.model.cuboid.CuboidRotation.EulerXYZRotation.class)
public class EulerXYZRotation_1841319580Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1068135458(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1068135458L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_705859604(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(705859604L))
            info.setReturnValue("oEi+T멪8!ꈨUHdTKⱲ찝귑%=L.DdMlK(unmQ<*1=珔px蠴cdtU,-:-cIaJU4c_KO㶋zugl/1UႫeC膃\"瓡CL>(S櫦(Y>7");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1879582321(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1879582321L))
            info.setReturnValue(-1956231822);
    }

    @Inject(at = @At("HEAD"), method = "x()F", cancellable = true)
    private void x_1879578942(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1879578942L))
            info.setReturnValue(3.326545E8F);
    }

    @Inject(at = @At("HEAD"), method = "z()F", cancellable = true)
    private void z_1879578942(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1879578942L))
            info.setReturnValue(3.326545E8F);
    }

    @Inject(at = @At("HEAD"), method = "y()F", cancellable = true)
    private void y_1879578942(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1879578942L))
            info.setReturnValue(3.326545E8F);
    }

    @Inject(at = @At("HEAD"), method = "transformation()Lorg/joml/Matrix4f;", cancellable = true)
    private void transformation_373512492(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(373512492L))
            info.setReturnValue(new org.joml.Matrix4f());
    }


}
