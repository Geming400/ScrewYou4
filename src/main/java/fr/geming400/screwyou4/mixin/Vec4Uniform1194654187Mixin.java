package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.UniformValue.Vec4Uniform.class)
public class Vec4Uniform1194654187Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/client/renderer/UniformValue$Type;", cancellable = true)
    private void type__1528382224(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1528382224L))
            info.setReturnValue(net.minecraft.client.renderer.UniformValue.Type.MATRIX4X4);
    }

    @Inject(at = @At("HEAD"), method = "value()Lorg/joml/Vector4fc;", cancellable = true)
    private void value__519056004(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-519056004L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_286027919(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(286027919L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1965077712(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1965077712L))
            info.setReturnValue("=ICWEPr*J3?,w*f>\u90F7X1S(w89");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1752006278(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1752006278L))
            info.setReturnValue(-261202439);
    }

    @Inject(at = @At("HEAD"), method = "writeTo(Lcom/mojang/blaze3d/buffers/Std140Builder;)V", cancellable = true)
    private void writeTo_1915434729(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1915434729L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addSize(Lcom/mojang/blaze3d/buffers/Std140SizeCalculator;)V", cancellable = true)
    private void addSize_1115380963(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1115380963L))
            info.cancel();
    }


}
