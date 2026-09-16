package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.blockentity.BlockEntityWithBoundingBoxRenderer.class)
public class BlockEntityWithBoundingBoxRenderer_953232106Mixin {
        @Inject(at = @At("HEAD"), method = "extract(Lnet/minecraft/world/level/block/entity/BlockEntity;Lnet/minecraft/client/renderer/blockentity/state/BlockEntityWithBoundingBoxRenderState;)V", cancellable = true)
    private static void extract_1603732206(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1603732206L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/blockentity/state/BlockEntityWithBoundingBoxRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit__512113820(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-512113820L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/blockentity/state/BlockEntityRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit_749788591(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(749788591L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "shouldRenderOffScreen()Z", cancellable = true)
    private void shouldRenderOffScreen_369849422(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(369849422L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getViewDistance()I", cancellable = true)
    private void getViewDistance__1143515489(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1143515489L))
            info.setReturnValue(-1514468429);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/level/block/entity/BlockEntity;Lnet/minecraft/client/renderer/blockentity/state/BlockEntityWithBoundingBoxRenderState;FLnet/minecraft/world/phys/Vec3;Lnet/minecraft/client/renderer/feature/ModelFeatureRenderer$CrumblingOverlay;)V", cancellable = true)
    private void extractRenderState__1663389172(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1663389172L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/level/block/entity/BlockEntity;Lnet/minecraft/client/renderer/blockentity/state/BlockEntityRenderState;FLnet/minecraft/world/phys/Vec3;Lnet/minecraft/client/renderer/feature/ModelFeatureRenderer$CrumblingOverlay;)V", cancellable = true)
    private void extractRenderState__1396524511(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1396524511L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/blockentity/state/BlockEntityWithBoundingBoxRenderState;", cancellable = true)
    private void createRenderState__1576733123(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1576733123L))
            info.setReturnValue(new net.minecraft.client.renderer.blockentity.state.BlockEntityWithBoundingBoxRenderState());
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/blockentity/state/BlockEntityRenderState;", cancellable = true)
    private void createRenderState_1335994930(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1335994930L))
            info.setReturnValue(new net.minecraft.client.renderer.blockentity.state.BlockEntityRenderState());
    }


}
