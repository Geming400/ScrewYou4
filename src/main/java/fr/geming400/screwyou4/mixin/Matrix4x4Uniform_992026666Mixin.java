package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.UniformValue.Matrix4x4Uniform.class)
public class Matrix4x4Uniform_992026666Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/client/renderer/UniformValue$Type;", cancellable = true)
    private void type__1731009746(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1731009746L))
            info.setReturnValue(net.minecraft.client.renderer.UniformValue.Type.VEC4);
    }

    @Inject(at = @At("HEAD"), method = "value()Lorg/joml/Matrix4fc;", cancellable = true)
    private void value_446716856(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(446716856L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_83400397(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(83400397L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1762450190(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1762450190L))
            info.setReturnValue(")JMo\u7113v6cjd]=sSQ\u8F9D+vv-OC&,\uA191Q:\u52E9$o.uzB_@,`\uBF55w \uA329HY&Y;\u7B1D}{|2VDN;Q\u3C7CB");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1549378756(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1549378756L))
            info.setReturnValue(500130633);
    }

    @Inject(at = @At("HEAD"), method = "writeTo(Lcom/mojang/blaze3d/buffers/Std140Builder;)V", cancellable = true)
    private void writeTo_1712807207(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1712807207L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addSize(Lcom/mojang/blaze3d/buffers/Std140SizeCalculator;)V", cancellable = true)
    private void addSize_912753441(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(912753441L))
            info.cancel();
    }


}
