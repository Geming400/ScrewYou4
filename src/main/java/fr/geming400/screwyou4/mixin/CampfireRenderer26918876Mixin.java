package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.blockentity.CampfireRenderer.class)
public class CampfireRenderer26918876Mixin {
        @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/blockentity/state/BlockEntityRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit__176524638(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-176524638L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/blockentity/state/CampfireRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit_2096856209(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2096856209L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/level/block/entity/BlockEntity;Lnet/minecraft/client/renderer/blockentity/state/BlockEntityRenderState;FLnet/minecraft/world/phys/Vec3;Lnet/minecraft/client/renderer/feature/ModelFeatureRenderer$CrumblingOverlay;)V", cancellable = true)
    private void extractRenderState_1972129556(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1972129556L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/level/block/entity/CampfireBlockEntity;Lnet/minecraft/client/renderer/blockentity/state/CampfireRenderState;FLnet/minecraft/world/phys/Vec3;Lnet/minecraft/client/renderer/feature/ModelFeatureRenderer$CrumblingOverlay;)V", cancellable = true)
    private void extractRenderState_1221768336(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1221768336L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/blockentity/state/CampfireRenderState;", cancellable = true)
    private void createRenderState__401910730(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-401910730L))
            info.setReturnValue(new net.minecraft.client.renderer.blockentity.state.CampfireRenderState());
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/blockentity/state/BlockEntityRenderState;", cancellable = true)
    private void createRenderState_409681701(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(409681701L))
            info.setReturnValue(null);
    }


}
