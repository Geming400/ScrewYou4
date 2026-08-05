package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.DynamicUniforms.Transform.class)
public class Transform_1580220624Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_671594355(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(671594355L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1944323148(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1944323148L))
            info.setReturnValue("\u4973\u8EDF*y:s}!\u5C47+SJ\u8774prZijT1BX(uvB@6e\uC6CAp6\u1CB5VqQm%?^c4n$>hDDvZy'KNc<x{");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2137572714(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2137572714L))
            info.setReturnValue(1656959727);
    }

    @Inject(at = @At("HEAD"), method = "write(Ljava/nio/ByteBuffer;)V", cancellable = true)
    private void write__329840024(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-329840024L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "modelView()Lorg/joml/Matrix4fc;", cancellable = true)
    private void modelView__632884901(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-632884901L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "colorModulator()Lorg/joml/Vector4fc;", cancellable = true)
    private void colorModulator_888937403(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(888937403L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "modelOffset()Lorg/joml/Vector3fc;", cancellable = true)
    private void modelOffset_2109713004(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2109713004L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "textureMatrix()Lorg/joml/Matrix4fc;", cancellable = true)
    private void textureMatrix_348738217(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(348738217L))
            info.setReturnValue(null);
    }


}
