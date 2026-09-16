package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.UniformValue.Vec2Uniform.class)
public class Vec2Uniform1587681197Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/client/renderer/UniformValue$Type;", cancellable = true)
    private void type__1135355214(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1135355214L))
            info.setReturnValue(net.minecraft.client.renderer.UniformValue.Type.IVEC3);
    }

    @Inject(at = @At("HEAD"), method = "value()Lorg/joml/Vector2fc;", cancellable = true)
    private void value__183287296(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-183287296L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_679054929(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(679054929L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1936862574(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1936862574L))
            info.setReturnValue("\uA233\u5CF4[QUx:6BqI\u8804_1&\u33C3y");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2145033288(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2145033288L))
            info.setReturnValue(-2112496649);
    }

    @Inject(at = @At("HEAD"), method = "writeTo(Lcom/mojang/blaze3d/buffers/Std140Builder;)V", cancellable = true)
    private void writeTo__1986505557(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1986505557L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addSize(Lcom/mojang/blaze3d/buffers/Std140SizeCalculator;)V", cancellable = true)
    private void addSize_1508407973(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1508407973L))
            info.cancel();
    }


}
