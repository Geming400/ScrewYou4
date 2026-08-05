package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.UniformValue.Vec2Uniform.class)
public class Vec2Uniform1587681197Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/client/renderer/UniformValue$Type;", cancellable = true)
    private void type__1059825236(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1059825236L))
            info.setReturnValue(net.minecraft.client.renderer.UniformValue.Type.FLOAT);
    }

    @Inject(at = @At("HEAD"), method = "value()Lorg/joml/Vector2fc;", cancellable = true)
    private void value_2104996751(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2104996751L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1321773840(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1321773840L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_452221222(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(452221222L))
            info.setReturnValue("<\u86B1\u7959Xl|Y_fF0ucN)y\u0526_m\uCC2EQOjt-N?A,Y4\u9CA6\u7691\uFEF5(;dn] \uD231KevcV");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1625943939(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1625943939L))
            info.setReturnValue(247662049);
    }

    @Inject(at = @At("HEAD"), method = "writeTo(Lcom/mojang/blaze3d/buffers/Std140Builder;)V", cancellable = true)
    private void writeTo__639934811(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-639934811L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addSize(Lcom/mojang/blaze3d/buffers/Std140SizeCalculator;)V", cancellable = true)
    private void addSize__703075357(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-703075357L))
            info.cancel();
    }


}
