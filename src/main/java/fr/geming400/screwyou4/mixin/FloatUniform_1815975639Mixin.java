package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.UniformValue.FloatUniform.class)
public class FloatUniform_1815975639Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/client/renderer/UniformValue$Type;", cancellable = true)
    private void type__907060773(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-907060773L))
            info.setReturnValue(net.minecraft.client.renderer.UniformValue.Type.INT);
    }

    @Inject(at = @At("HEAD"), method = "value()F", cancellable = true)
    private void value__488698200(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-488698200L))
            info.setReturnValue(7.271919E8F);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_907349370(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(907349370L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1708568133(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1708568133L))
            info.setReturnValue("\u43C7($!mIJNj\u3D42<WYV3;6l$\"Jcu$+\u3A8E6f+ {}c\"O5_);|vM?27>LFRwkF\uA7AA@\u45E9\uF9CE");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1921639567(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1921639567L))
            info.setReturnValue(2079754128);
    }

    @Inject(at = @At("HEAD"), method = "writeTo(Lcom/mojang/blaze3d/buffers/Std140Builder;)V", cancellable = true)
    private void writeTo__1758211116(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1758211116L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addSize(Lcom/mojang/blaze3d/buffers/Std140SizeCalculator;)V", cancellable = true)
    private void addSize_1736702414(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1736702414L))
            info.cancel();
    }


}
