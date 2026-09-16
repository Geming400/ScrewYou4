package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.rendertype.PreparedRenderType.Texture.class)
public class Texture2087095830Mixin {
        @Inject(at = @At("HEAD"), method = "name()Ljava/lang/String;", cancellable = true)
    private void name__1398604310(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1398604310L))
            info.setReturnValue("H\"y[\u6412rYc(\u1D48 VkPFQzP4QlM*xV\u154A\uD647R`%{96#8j");
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1178469562(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1178469562L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1437447941(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1437447941L))
            info.setReturnValue("}'t6-.0-=0=\u855F,6&Zx\u103FJb8r\u48B9zE\u9B65axA'B485.42=Iz`\u29BC|");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1650519375(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1650519375L))
            info.setReturnValue(-2010392644);
    }

    @Inject(at = @At("HEAD"), method = "sampler()Lcom/mojang/blaze3d/textures/GpuSampler;", cancellable = true)
    private void sampler__32999132(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-32999132L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "textureView()Lcom/mojang/blaze3d/textures/GpuTextureView;", cancellable = true)
    private void textureView__1159310428(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1159310428L))
            info.setReturnValue(null);
    }


}
