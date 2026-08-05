package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.blockentity.DecoratedPotRenderer.class)
public class DecoratedPotRenderer_1752001853Mixin {
        @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/blockentity/state/DecoratedPotRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit_1855351874(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1855351874L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/blockentity/state/BlockEntityRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit_1891968490(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1891968490L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submit(Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;IILnet/minecraft/world/level/block/entity/PotDecorations;I)V", cancellable = true)
    private void submit_780565261(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(780565261L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/level/block/entity/DecoratedPotBlockEntity;Lnet/minecraft/client/renderer/blockentity/state/DecoratedPotRenderState;FLnet/minecraft/world/phys/Vec3;Lnet/minecraft/client/renderer/feature/ModelFeatureRenderer$CrumblingOverlay;)V", cancellable = true)
    private void extractRenderState__1421953750(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1421953750L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/level/block/entity/BlockEntity;Lnet/minecraft/client/renderer/blockentity/state/BlockEntityRenderState;FLnet/minecraft/world/phys/Vec3;Lnet/minecraft/client/renderer/feature/ModelFeatureRenderer$CrumblingOverlay;)V", cancellable = true)
    private void extractRenderState__1525876582(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1525876582L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "modelTransformation(Lnet/minecraft/core/Direction;)Lcom/mojang/math/Transformation;", cancellable = true)
    private static void modelTransformation_263193685(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(263193685L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/blockentity/state/DecoratedPotRenderState;", cancellable = true)
    private void createRenderState__1878430180(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1878430180L))
            info.setReturnValue(new net.minecraft.client.renderer.blockentity.state.DecoratedPotRenderState());
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/blockentity/state/BlockEntityRenderState;", cancellable = true)
    private void createRenderState__1408993018(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1408993018L))
            info.setReturnValue(new net.minecraft.client.renderer.blockentity.state.BlockEntityRenderState());
    }

    @Inject(at = @At("HEAD"), method = "createSidesLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createSidesLayer_1037869688(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1037869688L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createBaseLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBaseLayer_1037869688(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1037869688L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getExtents(Ljava/util/function/Consumer;)V", cancellable = true)
    private void getExtents__1861949031(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1861949031L))
            info.cancel();
    }


}
