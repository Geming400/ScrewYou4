package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.DynamicUniforms.Transform.class)
public class Transform_1580220624Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1329234414(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1329234414L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_444760648(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(444760648L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1618483365(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1618483365L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "write(Ljava/nio/ByteBuffer;)V", cancellable = true)
    private void write_969268041(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(969268041L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "modelView()Lorg/joml/Matrix4fc;", cancellable = true)
    private void modelView__971772435(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-971772435L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "colorModulator()Lorg/joml/Vector4fc;", cancellable = true)
    private void colorModulator__2140172817(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2140172817L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "textureMatrix()Lorg/joml/Matrix4fc;", cancellable = true)
    private void textureMatrix__971772435(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-971772435L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "modelOffset()Lorg/joml/Vector3fc;", cancellable = true)
    private void modelOffset_2126165328(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2126165328L))
            info.setReturnValue(null);
    }


}
