package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.blockentity.BlockEntityWithBoundingBoxRenderer.class)
public class BlockEntityWithBoundingBoxRenderer_953232106Mixin {
        @Inject(at = @At("HEAD"), method = "extract(Lnet/minecraft/world/level/block/entity/BlockEntity;Lnet/minecraft/client/renderer/blockentity/state/BlockEntityWithBoundingBoxRenderState;)V", cancellable = true)
    private static void extract_1668044909(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1668044909L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/blockentity/state/BlockEntityWithBoundingBoxRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit__1819791236(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1819791236L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/blockentity/state/BlockEntityRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit_1093198743(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1093198743L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getViewDistance()I", cancellable = true)
    private void getViewDistance_991494351(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(991494351L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "shouldRenderOffScreen()Z", cancellable = true)
    private void shouldRenderOffScreen_991510688(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(991510688L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/level/block/entity/BlockEntity;Lnet/minecraft/client/renderer/blockentity/state/BlockEntityWithBoundingBoxRenderState;FLnet/minecraft/world/phys/Vec3;Lnet/minecraft/client/renderer/feature/ModelFeatureRenderer$CrumblingOverlay;)V", cancellable = true)
    private void extractRenderState__694409946(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-694409946L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/level/block/entity/BlockEntity;Lnet/minecraft/client/renderer/blockentity/state/BlockEntityRenderState;FLnet/minecraft/world/phys/Vec3;Lnet/minecraft/client/renderer/feature/ModelFeatureRenderer$CrumblingOverlay;)V", cancellable = true)
    private void extractRenderState_1970320967(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1970320967L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/blockentity/state/BlockEntityWithBoundingBoxRenderState;", cancellable = true)
    private void createRenderState_5617564(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(5617564L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/blockentity/state/BlockEntityRenderState;", cancellable = true)
    private void createRenderState_2087204531(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2087204531L))
            info.setReturnValue(null);
    }


}
