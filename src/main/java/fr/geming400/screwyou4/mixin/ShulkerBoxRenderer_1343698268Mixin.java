package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.blockentity.ShulkerBoxRenderer.class)
public class ShulkerBoxRenderer_1343698268Mixin {
        @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/blockentity/state/BlockEntityRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit_1483664905(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1483664905L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/blockentity/state/ShulkerBoxRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit_1157182112(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1157182112L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submit(Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;IIFLnet/minecraft/client/renderer/feature/ModelFeatureRenderer$CrumblingOverlay;Lnet/minecraft/client/resources/model/sprite/SpriteId;I)V", cancellable = true)
    private void submit_842819199(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(842819199L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "modelTransform(Lnet/minecraft/core/Direction;)Lcom/mojang/math/Transformation;", cancellable = true)
    private static void modelTransform__145109900(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-145109900L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getExtents(FLjava/util/function/Consumer;)V", cancellable = true)
    private void getExtents__1270504574(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1270504574L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/level/block/entity/BlockEntity;Lnet/minecraft/client/renderer/blockentity/state/BlockEntityRenderState;FLnet/minecraft/world/phys/Vec3;Lnet/minecraft/client/renderer/feature/ModelFeatureRenderer$CrumblingOverlay;)V", cancellable = true)
    private void extractRenderState__1934180167(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1934180167L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/level/block/entity/ShulkerBoxBlockEntity;Lnet/minecraft/client/renderer/blockentity/state/ShulkerBoxRenderState;FLnet/minecraft/world/phys/Vec3;Lnet/minecraft/client/renderer/feature/ModelFeatureRenderer$CrumblingOverlay;)V", cancellable = true)
    private void extractRenderState_984350313(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(984350313L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/blockentity/state/BlockEntityRenderState;", cancellable = true)
    private void createRenderState__1817296603(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1817296603L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/blockentity/state/ShulkerBoxRenderState;", cancellable = true)
    private void createRenderState_587552924(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(587552924L))
            info.setReturnValue(null);
    }


}
