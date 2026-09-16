package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.model.cuboid.CuboidRotation.class)
public class CuboidRotation573599876Mixin {
        @Inject(at = @At("HEAD"), method = "value()Lnet/minecraft/client/resources/model/cuboid/CuboidRotation$RotationValue;", cancellable = true)
    private void value_378145959(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(378145959L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__335026392(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-335026392L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1344023401(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1344023401L))
            info.setReturnValue("W<[aev(x.q)rudLnn\u28A4xxS\u3CD7Bv\u4BCE\u6599n\u63B231#\u8C04.Lr?1jaIS2");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1130951967(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1130951967L))
            info.setReturnValue(1261370708);
    }

    @Inject(at = @At("HEAD"), method = "transform()Lorg/joml/Matrix4fc;", cancellable = true)
    private void transform__480115442(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-480115442L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "origin()Lorg/joml/Vector3fc;", cancellable = true)
    private void origin_1466630699(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1466630699L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "rescale()Z", cancellable = true)
    private void rescale__1123031644(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1123031644L))
            info.setReturnValue(true);
    }


}
