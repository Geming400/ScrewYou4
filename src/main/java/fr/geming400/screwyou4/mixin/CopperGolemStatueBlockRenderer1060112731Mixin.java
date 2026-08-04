package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.blockentity.CopperGolemStatueBlockRenderer.class)
public class CopperGolemStatueBlockRenderer1060112731Mixin {
        @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/blockentity/state/BlockEntityRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit_1200079369(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1200079369L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/blockentity/state/CopperGolemStatueRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit__832607390(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-832607390L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "modelTransformation(Lnet/minecraft/core/Direction;)Lcom/mojang/math/Transformation;", cancellable = true)
    private static void modelTransformation__428695436(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-428695436L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/level/block/entity/CopperGolemStatueBlockEntity;Lnet/minecraft/client/renderer/blockentity/state/CopperGolemStatueRenderState;FLnet/minecraft/world/phys/Vec3;Lnet/minecraft/client/renderer/feature/ModelFeatureRenderer$CrumblingOverlay;)V", cancellable = true)
    private void extractRenderState_413036879(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(413036879L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/level/block/entity/BlockEntity;Lnet/minecraft/client/renderer/blockentity/state/BlockEntityRenderState;FLnet/minecraft/world/phys/Vec3;Lnet/minecraft/client/renderer/feature/ModelFeatureRenderer$CrumblingOverlay;)V", cancellable = true)
    private void extractRenderState_2077201593(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2077201593L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/blockentity/state/CopperGolemStatueRenderState;", cancellable = true)
    private void createRenderState_820944300(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(820944300L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/blockentity/state/BlockEntityRenderState;", cancellable = true)
    private void createRenderState__2100882139(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2100882139L))
            info.setReturnValue(null);
    }


}
