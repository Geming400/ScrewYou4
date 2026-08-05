package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.blockentity.ChestRenderer.class)
public class ChestRenderer1459400438Mixin {
        @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/blockentity/state/ChestRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit__2124233709(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2124233709L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/blockentity/state/BlockEntityRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit_1599367076(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1599367076L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "modelTransformation(Lnet/minecraft/core/Direction;)Lcom/mojang/math/Transformation;", cancellable = true)
    private static void modelTransformation__29407729(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-29407729L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "xmasTextures()Z", cancellable = true)
    private static void xmasTextures_1497679269(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1497679269L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/level/block/entity/BlockEntity;Lnet/minecraft/client/renderer/blockentity/state/ChestRenderState;FLnet/minecraft/world/phys/Vec3;Lnet/minecraft/client/renderer/feature/ModelFeatureRenderer$CrumblingOverlay;)V", cancellable = true)
    private void extractRenderState_340618243(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(340618243L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/level/block/entity/BlockEntity;Lnet/minecraft/client/renderer/blockentity/state/BlockEntityRenderState;FLnet/minecraft/world/phys/Vec3;Lnet/minecraft/client/renderer/feature/ModelFeatureRenderer$CrumblingOverlay;)V", cancellable = true)
    private void extractRenderState__1818477996(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1818477996L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/blockentity/state/ChestRenderState;", cancellable = true)
    private void createRenderState__2045628815(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2045628815L))
            info.setReturnValue(new net.minecraft.client.renderer.blockentity.state.ChestRenderState());
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/blockentity/state/BlockEntityRenderState;", cancellable = true)
    private void createRenderState__1701594432(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1701594432L))
            info.setReturnValue(null);
    }


}
