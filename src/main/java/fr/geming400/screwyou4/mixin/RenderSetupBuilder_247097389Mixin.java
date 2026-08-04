package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.rendertype.RenderSetup.RenderSetupBuilder.class)
public class RenderSetupBuilder_247097389Mixin {
        @Inject(at = @At("HEAD"), method = "setOutline(Lnet/minecraft/client/renderer/rendertype/RenderSetup$OutlineProperty;)Lnet/minecraft/client/renderer/rendertype/RenderSetup$RenderSetupBuilder;", cancellable = true)
    private void setOutline__2086071212(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2086071212L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "useOverlay()Lnet/minecraft/client/renderer/rendertype/RenderSetup$RenderSetupBuilder;", cancellable = true)
    private void useOverlay_1140450684(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1140450684L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "affectsCrumbling()Lnet/minecraft/client/renderer/rendertype/RenderSetup$RenderSetupBuilder;", cancellable = true)
    private void affectsCrumbling_1140450684(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1140450684L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setLayeringTransform(Lnet/minecraft/client/renderer/rendertype/LayeringTransform;)Lnet/minecraft/client/renderer/rendertype/RenderSetup$RenderSetupBuilder;", cancellable = true)
    private void setLayeringTransform_2128256819(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2128256819L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setTextureTransform(Lnet/minecraft/client/renderer/rendertype/TextureTransform;)Lnet/minecraft/client/renderer/rendertype/RenderSetup$RenderSetupBuilder;", cancellable = true)
    private void setTextureTransform__783042433(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-783042433L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "useLightmap()Lnet/minecraft/client/renderer/rendertype/RenderSetup$RenderSetupBuilder;", cancellable = true)
    private void useLightmap_1140450684(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1140450684L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createRenderSetup()Lnet/minecraft/client/renderer/rendertype/RenderSetup;", cancellable = true)
    private void createRenderSetup_1621316054(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1621316054L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setOutputTarget(Lnet/minecraft/client/renderer/rendertype/OutputTarget;)Lnet/minecraft/client/renderer/rendertype/RenderSetup$RenderSetupBuilder;", cancellable = true)
    private void setOutputTarget_1498378558(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1498378558L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withTexture(Ljava/lang/String;Lnet/minecraft/resources/Identifier;)Lnet/minecraft/client/renderer/rendertype/RenderSetup$RenderSetupBuilder;", cancellable = true)
    private void withTexture__306372850(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-306372850L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withTexture(Ljava/lang/String;Lnet/minecraft/resources/Identifier;Ljava/util/function/Supplier;)Lnet/minecraft/client/renderer/rendertype/RenderSetup$RenderSetupBuilder;", cancellable = true)
    private void withTexture_1831202494(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1831202494L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sortOnUpload()Lnet/minecraft/client/renderer/rendertype/RenderSetup$RenderSetupBuilder;", cancellable = true)
    private void sortOnUpload_1140450684(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1140450684L))
            info.setReturnValue(null);
    }


}
