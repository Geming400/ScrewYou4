package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.UniformValue.IntUniform.class)
public class IntUniform1576652854Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/client/renderer/UniformValue$Type;", cancellable = true)
    private void type__1146383557(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1146383557L))
            info.setReturnValue(net.minecraft.client.renderer.UniformValue.Type.VEC2);
    }

    @Inject(at = @At("HEAD"), method = "value()I", cancellable = true)
    private void value__728018101(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-728018101L))
            info.setReturnValue(-1280028180);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_668026586(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(668026586L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1947890917(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1947890917L))
            info.setReturnValue("/oy$^7ZQ\uCB2A");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2134004945(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2134004945L))
            info.setReturnValue(-109958429);
    }

    @Inject(at = @At("HEAD"), method = "writeTo(Lcom/mojang/blaze3d/buffers/Std140Builder;)V", cancellable = true)
    private void writeTo__1997533900(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1997533900L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addSize(Lcom/mojang/blaze3d/buffers/Std140SizeCalculator;)V", cancellable = true)
    private void addSize_1497379630(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1497379630L))
            info.cancel();
    }


}
