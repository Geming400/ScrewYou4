package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.PostPass.TargetInput.class)
public class TargetInput1997438372Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__912016665(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-912016665L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_861978397(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(861978397L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2035701114(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2035701114L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "targetId()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void targetId__445628181(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-445628181L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bilinear()Z", cancellable = true)
    private void bilinear_2035716955(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2035716955L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addToPass(Lcom/mojang/blaze3d/framegraph/FramePass;Ljava/util/Map;)V", cancellable = true)
    private void addToPass__970553546(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-970553546L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "samplerName()Ljava/lang/String;", cancellable = true)
    private void samplerName_861977901(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(861977901L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "depthBuffer()Z", cancellable = true)
    private void depthBuffer_2035716955(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2035716955L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "texture(Ljava/util/Map;)Lcom/mojang/blaze3d/textures/GpuTextureView;", cancellable = true)
    private void texture_1779963063(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1779963063L))
            info.setReturnValue(null);
    }


}
