package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.UniformValue.Vec3Uniform.class)
public class Vec3Uniform1391167692Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/client/renderer/UniformValue$Type;", cancellable = true)
    private void type__1256338741(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1256338741L))
            info.setReturnValue(net.minecraft.client.renderer.UniformValue.Type.MATRIX4X4);
    }

    @Inject(at = @At("HEAD"), method = "value()Lorg/joml/Vector3fc;", cancellable = true)
    private void value_1937112397(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1937112397L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1518287345(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1518287345L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_255707717(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(255707717L))
            info.setReturnValue("`Z,\u4F6DXT)xM3^\uC539(SA^.*l\uBC63<!vk_\u7794=+/ef$x/v67F]JEA+,0\uD607#'=n2@Y6dq`c:YZ\u976F@|pz,4W$1BjP|,2\u473F4'Qx");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1429430434(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1429430434L))
            info.setReturnValue(1774985522);
    }

    @Inject(at = @At("HEAD"), method = "writeTo(Lcom/mojang/blaze3d/buffers/Std140Builder;)V", cancellable = true)
    private void writeTo__836448316(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-836448316L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addSize(Lcom/mojang/blaze3d/buffers/Std140SizeCalculator;)V", cancellable = true)
    private void addSize__899588862(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-899588862L))
            info.cancel();
    }


}
