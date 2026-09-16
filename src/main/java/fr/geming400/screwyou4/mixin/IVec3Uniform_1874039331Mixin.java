package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.UniformValue.IVec3Uniform.class)
public class IVec3Uniform_1874039331Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/client/renderer/UniformValue$Type;", cancellable = true)
    private void type__848997081(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-848997081L))
            info.setReturnValue(net.minecraft.client.renderer.UniformValue.Type.FLOAT);
    }

    @Inject(at = @At("HEAD"), method = "value()Lorg/joml/Vector3ic;", cancellable = true)
    private void value_134470551(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(134470551L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_965413062(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(965413062L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1650504441(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1650504441L))
            info.setReturnValue("%W\uA644N7Mc\u1FE68l6|");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1863575875(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1863575875L))
            info.setReturnValue(2076718037);
    }

    @Inject(at = @At("HEAD"), method = "writeTo(Lcom/mojang/blaze3d/buffers/Std140Builder;)V", cancellable = true)
    private void writeTo__1700147424(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1700147424L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addSize(Lcom/mojang/blaze3d/buffers/Std140SizeCalculator;)V", cancellable = true)
    private void addSize_1794766106(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1794766106L))
            info.cancel();
    }


}
