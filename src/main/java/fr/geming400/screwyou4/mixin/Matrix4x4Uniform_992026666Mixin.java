package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.UniformValue.Matrix4x4Uniform.class)
public class Matrix4x4Uniform_992026666Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/client/renderer/UniformValue$Type;", cancellable = true)
    private void type__1655479768(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1655479768L))
            info.setReturnValue(net.minecraft.client.renderer.UniformValue.Type.VEC4);
    }

    @Inject(at = @At("HEAD"), method = "value()Lorg/joml/Matrix4fc;", cancellable = true)
    private void value__1559966393(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1559966393L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1917428372(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1917428372L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__143433310(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-143433310L))
            info.setReturnValue("vSo+rk(%/Tl◜RPtGT'ak,8WRa7*W;:m@50䁍6%IVob&B|W =ᱵx=D.f沣&A|!I*/v");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1030289407(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1030289407L))
            info.setReturnValue(609976496);
    }

    @Inject(at = @At("HEAD"), method = "writeTo(Lcom/mojang/blaze3d/buffers/Std140Builder;)V", cancellable = true)
    private void writeTo__1235589343(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1235589343L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addSize(Lcom/mojang/blaze3d/buffers/Std140SizeCalculator;)V", cancellable = true)
    private void addSize__1298729889(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1298729889L))
            info.cancel();
    }


}
