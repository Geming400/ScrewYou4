package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.blockentity.ChestRenderer.class)
public class ChestRenderer1459400438Mixin {
        @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/blockentity/state/ChestRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit__929681365(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-929681365L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/blockentity/state/BlockEntityRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit_1255956924(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1255956924L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/blockentity/state/BlockEntityRenderState;", cancellable = true)
    private void createRenderState_1842163263(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1842163263L))
            info.setReturnValue(new net.minecraft.client.renderer.blockentity.state.BlockEntityRenderState());
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/blockentity/state/ChestRenderState;", cancellable = true)
    private void createRenderState_1347153200(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1347153200L))
            info.setReturnValue(new net.minecraft.client.renderer.blockentity.state.ChestRenderState());
    }

    @Inject(at = @At("HEAD"), method = "modelTransformation(Lnet/minecraft/core/Direction;)Lcom/mojang/math/Transformation;", cancellable = true)
    private static void modelTransformation__672597983(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-672597983L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "xmasTextures()Z", cancellable = true)
    private static void xmasTextures_670299974(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(670299974L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/level/block/entity/BlockEntity;Lnet/minecraft/client/renderer/blockentity/state/ChestRenderState;FLnet/minecraft/world/phys/Vec3;Lnet/minecraft/client/renderer/feature/ModelFeatureRenderer$CrumblingOverlay;)V", cancellable = true)
    private void extractRenderState__1560421539(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1560421539L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/level/block/entity/BlockEntity;Lnet/minecraft/client/renderer/blockentity/state/BlockEntityRenderState;FLnet/minecraft/world/phys/Vec3;Lnet/minecraft/client/renderer/feature/ModelFeatureRenderer$CrumblingOverlay;)V", cancellable = true)
    private void extractRenderState__890356178(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-890356178L))
            info.cancel();
    }


}
