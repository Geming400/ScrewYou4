package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.UniformValue.IVec3Uniform.class)
public class IVec3Uniform_1874039331Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/client/renderer/UniformValue$Type;", cancellable = true)
    private void type__773467103(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-773467103L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "value()Lorg/joml/Vector3ic;", cancellable = true)
    private void value__1872212698(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1872212698L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1035415707(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1035415707L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_738579355(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(738579355L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1912302072(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1912302072L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeTo(Lcom/mojang/blaze3d/buffers/Std140Builder;)V", cancellable = true)
    private void writeTo__353576678(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-353576678L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addSize(Lcom/mojang/blaze3d/buffers/Std140SizeCalculator;)V", cancellable = true)
    private void addSize__416717224(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-416717224L))
            info.cancel();
    }


}
