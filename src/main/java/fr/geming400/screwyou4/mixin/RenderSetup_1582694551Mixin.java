package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.rendertype.RenderSetup.class)
public class RenderSetup_1582694551Mixin {
        @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_447234079(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(447234079L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "builder(Lcom/mojang/blaze3d/pipeline/RenderPipeline;)Lnet/minecraft/client/renderer/rendertype/RenderSetup$RenderSetupBuilder;", cancellable = true)
    private static void builder_303252147(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(303252147L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "prepareTextures(Lnet/minecraft/client/renderer/texture/TextureManager;Lcom/mojang/blaze3d/systems/SamplerCache;Lcom/mojang/blaze3d/textures/GpuTextureView;Lcom/mojang/blaze3d/textures/GpuTextureView;)Ljava/util/List;", cancellable = true)
    private void prepareTextures_172474510(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(172474510L))
            info.setReturnValue(null);
    }


}
