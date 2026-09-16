package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.blockentity.DecoratedPotRenderer.class)
public class DecoratedPotRenderer_1752001853Mixin {
        @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/blockentity/state/BlockEntityRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit_1548558338(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1548558338L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/blockentity/state/DecoratedPotRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit__200428246(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-200428246L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submit(Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;IILnet/minecraft/world/level/block/entity/PotDecorations;I)V", cancellable = true)
    private void submit_517021685(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(517021685L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createSidesLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createSidesLayer_417137033(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(417137033L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createBaseLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createBaseLayer__975151396(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-975151396L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/level/block/entity/BlockEntity;Lnet/minecraft/client/renderer/blockentity/state/BlockEntityRenderState;FLnet/minecraft/world/phys/Vec3;Lnet/minecraft/client/renderer/feature/ModelFeatureRenderer$CrumblingOverlay;)V", cancellable = true)
    private void extractRenderState__597754764(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-597754764L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/level/block/entity/DecoratedPotBlockEntity;Lnet/minecraft/client/renderer/blockentity/state/DecoratedPotRenderState;FLnet/minecraft/world/phys/Vec3;Lnet/minecraft/client/renderer/feature/ModelFeatureRenderer$CrumblingOverlay;)V", cancellable = true)
    private void extractRenderState_1499939728(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1499939728L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getExtents(Ljava/util/function/Consumer;)V", cancellable = true)
    private void getExtents_1412233004(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1412233004L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "modelTransformation(Lnet/minecraft/core/Direction;)Lcom/mojang/math/Transformation;", cancellable = true)
    private static void modelTransformation__379996569(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-379996569L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/blockentity/state/DecoratedPotRenderState;", cancellable = true)
    private void createRenderState_603875965(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(603875965L))
            info.setReturnValue(new net.minecraft.client.renderer.blockentity.state.DecoratedPotRenderState());
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/blockentity/state/BlockEntityRenderState;", cancellable = true)
    private void createRenderState_2134764677(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2134764677L))
            info.setReturnValue(new net.minecraft.client.renderer.blockentity.state.BlockEntityRenderState());
    }


}
