package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.UniformValue.Vec4Uniform.class)
public class Vec4Uniform1194654187Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/client/renderer/UniformValue$Type;", cancellable = true)
    private void type__1452852246(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1452852246L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "value()Lorg/joml/Vector4fc;", cancellable = true)
    private void value_1769228043(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1769228043L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1714800850(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1714800850L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_59194212(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(59194212L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1232916929(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1232916929L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeTo(Lcom/mojang/blaze3d/buffers/Std140Builder;)V", cancellable = true)
    private void writeTo__1032961821(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1032961821L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addSize(Lcom/mojang/blaze3d/buffers/Std140SizeCalculator;)V", cancellable = true)
    private void addSize__1096102367(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1096102367L))
            info.cancel();
    }


}
