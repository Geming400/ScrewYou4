package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.UniformValue.Vec3Uniform.class)
public class Vec3Uniform1391167692Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/client/renderer/UniformValue$Type;", cancellable = true)
    private void type__1331868719(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1331868719L))
            info.setReturnValue(net.minecraft.client.renderer.UniformValue.Type.IVEC3);
    }

    @Inject(at = @At("HEAD"), method = "value()Lorg/joml/Vector3fc;", cancellable = true)
    private void value__351171650(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-351171650L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_482541424(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(482541424L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__2133376079(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2133376079L))
            info.setReturnValue("qB#k|IsBY8e.qY6_+oe'");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1948519783(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1948519783L))
            info.setReturnValue(2065681303);
    }

    @Inject(at = @At("HEAD"), method = "writeTo(Lcom/mojang/blaze3d/buffers/Std140Builder;)V", cancellable = true)
    private void writeTo_2111948234(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2111948234L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addSize(Lcom/mojang/blaze3d/buffers/Std140SizeCalculator;)V", cancellable = true)
    private void addSize_1311894468(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1311894468L))
            info.cancel();
    }


}
