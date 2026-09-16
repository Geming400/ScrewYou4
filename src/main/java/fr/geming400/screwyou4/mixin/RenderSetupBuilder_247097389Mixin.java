package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.rendertype.RenderSetup.RenderSetupBuilder.class)
public class RenderSetupBuilder_247097389Mixin {
        @Inject(at = @At("HEAD"), method = "useLightmap()Lnet/minecraft/client/renderer/rendertype/RenderSetup$RenderSetupBuilder;", cancellable = true)
    private void useLightmap__1301537937(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1301537937L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withTexture(Ljava/lang/String;Lnet/minecraft/resources/Identifier;Ljava/util/function/Supplier;)Lnet/minecraft/client/renderer/rendertype/RenderSetup$RenderSetupBuilder;", cancellable = true)
    private void withTexture_1406139443(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1406139443L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withTexture(Ljava/lang/String;Lnet/minecraft/resources/Identifier;)Lnet/minecraft/client/renderer/rendertype/RenderSetup$RenderSetupBuilder;", cancellable = true)
    private void withTexture_1224576377(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1224576377L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setLayeringTransform(Lnet/minecraft/client/renderer/rendertype/LayeringTransform;)Lnet/minecraft/client/renderer/rendertype/RenderSetup$RenderSetupBuilder;", cancellable = true)
    private void setLayeringTransform_1315362330(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1315362330L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sortOnUpload()Lnet/minecraft/client/renderer/rendertype/RenderSetup$RenderSetupBuilder;", cancellable = true)
    private void sortOnUpload__2091429442(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2091429442L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setOutputTarget(Lnet/minecraft/client/renderer/rendertype/OutputTarget;)Lnet/minecraft/client/renderer/rendertype/RenderSetup$RenderSetupBuilder;", cancellable = true)
    private void setOutputTarget_1764677298(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1764677298L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setTextureTransform(Lnet/minecraft/client/renderer/rendertype/TextureTransform;)Lnet/minecraft/client/renderer/rendertype/RenderSetup$RenderSetupBuilder;", cancellable = true)
    private void setTextureTransform__269941102(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-269941102L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createRenderSetup()Lnet/minecraft/client/renderer/rendertype/RenderSetup;", cancellable = true)
    private void createRenderSetup_1230237185(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1230237185L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setOutline(Lnet/minecraft/client/renderer/rendertype/RenderSetup$OutlineProperty;)Lnet/minecraft/client/renderer/rendertype/RenderSetup$RenderSetupBuilder;", cancellable = true)
    private void setOutline_1384780500(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1384780500L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "useOverlay()Lnet/minecraft/client/renderer/rendertype/RenderSetup$RenderSetupBuilder;", cancellable = true)
    private void useOverlay__1759192237(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1759192237L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "affectsCrumbling()Lnet/minecraft/client/renderer/rendertype/RenderSetup$RenderSetupBuilder;", cancellable = true)
    private void affectsCrumbling_1730812489(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1730812489L))
            info.setReturnValue(null);
    }


}
