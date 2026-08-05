package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.rendertype.RenderSetup.class)
public class RenderSetup_1582694551Mixin {
        @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1941849717(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1941849717L))
            info.setReturnValue("S)}8W_G}T:.(L\uD499\u18C48ZFHchAt)\u1537JQ\uC9B4\"'>Ay4WufF+:(w\u2622K &\u4940\u987D]bgZ6=8\u094AsLSuC1B;RQwi\u12E4\uB0C3v'VL]2&s+nq&");
    }

    @Inject(at = @At("HEAD"), method = "builder(Lcom/mojang/blaze3d/pipeline/RenderPipeline;)Lnet/minecraft/client/renderer/rendertype/RenderSetup$RenderSetupBuilder;", cancellable = true)
    private static void builder__894792840(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-894792840L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "prepareTextures(Lnet/minecraft/client/renderer/texture/TextureManager;Lcom/mojang/blaze3d/systems/SamplerCache;Lcom/mojang/blaze3d/textures/GpuTextureView;Lcom/mojang/blaze3d/textures/GpuTextureView;)Ljava/util/List;", cancellable = true)
    private void prepareTextures__1419841969(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1419841969L))
            info.setReturnValue(null);
    }


}
