package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.rendertype.PreparedRenderType.Texture.class)
public class Texture2087095830Mixin {
        @Inject(at = @At("HEAD"), method = "name()Ljava/lang/String;", cancellable = true)
    private void name_951635359(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(951635359L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__822359207(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-822359207L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_951635855(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(951635855L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2125358572(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2125358572L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "textureView()Lcom/mojang/blaze3d/textures/GpuTextureView;", cancellable = true)
    private void textureView__313518780(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-313518780L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sampler()Lcom/mojang/blaze3d/textures/GpuSampler;", cancellable = true)
    private void sampler_1740317980(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1740317980L))
            info.setReturnValue(null);
    }


}
