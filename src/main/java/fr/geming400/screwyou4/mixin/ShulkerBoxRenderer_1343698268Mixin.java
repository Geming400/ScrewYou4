package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.blockentity.ShulkerBoxRenderer.class)
public class ShulkerBoxRenderer_1343698268Mixin {
        @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/blockentity/state/BlockEntityRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit_1140254753(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1140254753L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/blockentity/state/ShulkerBoxRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit__100821624(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-100821624L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submit(Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;IIFLnet/minecraft/client/renderer/feature/ModelFeatureRenderer$CrumblingOverlay;Lnet/minecraft/client/resources/model/sprite/SpriteId;I)V", cancellable = true)
    private void submit_1538144919(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1538144919L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "modelTransform(Lnet/minecraft/core/Direction;)Lcom/mojang/math/Transformation;", cancellable = true)
    private static void modelTransform_1078705655(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1078705655L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/level/block/entity/ShulkerBoxBlockEntity;Lnet/minecraft/client/renderer/blockentity/state/ShulkerBoxRenderState;FLnet/minecraft/world/phys/Vec3;Lnet/minecraft/client/renderer/feature/ModelFeatureRenderer$CrumblingOverlay;)V", cancellable = true)
    private void extractRenderState_41398223(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(41398223L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/level/block/entity/BlockEntity;Lnet/minecraft/client/renderer/blockentity/state/BlockEntityRenderState;FLnet/minecraft/world/phys/Vec3;Lnet/minecraft/client/renderer/feature/ModelFeatureRenderer$CrumblingOverlay;)V", cancellable = true)
    private void extractRenderState__1006058349(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1006058349L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getExtents(FLjava/util/function/Consumer;)V", cancellable = true)
    private void getExtents_1444890703(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1444890703L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/blockentity/state/BlockEntityRenderState;", cancellable = true)
    private void createRenderState_1726461092(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1726461092L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/blockentity/state/ShulkerBoxRenderState;", cancellable = true)
    private void createRenderState_1394604349(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1394604349L))
            info.setReturnValue(new net.minecraft.client.renderer.blockentity.state.ShulkerBoxRenderState());
    }


}
