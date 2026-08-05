package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.blockentity.TheEndPortalRenderer.class)
public class TheEndPortalRenderer_1300294501Mixin {
        @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/blockentity/state/BlockEntityRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit_1440261138(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1440261138L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/blockentity/state/EndPortalRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit__878304357(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-878304357L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/blockentity/state/EndPortalRenderState;", cancellable = true)
    private void createRenderState__1702836091(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1702836091L))
            info.setReturnValue(new net.minecraft.client.renderer.blockentity.state.EndPortalRenderState());
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/blockentity/state/BlockEntityRenderState;", cancellable = true)
    private void createRenderState__1860700370(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1860700370L))
            info.setReturnValue(new net.minecraft.client.renderer.blockentity.state.BlockEntityRenderState());
    }


}
