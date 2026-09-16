package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.blockentity.EnchantTableRenderer.class)
public class EnchantTableRenderer1380984090Mixin {
        @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/blockentity/state/BlockEntityRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit_1177540576(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1177540576L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/blockentity/state/EnchantTableRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit__640447407(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-640447407L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/blockentity/state/BlockEntityRenderState;", cancellable = true)
    private void createRenderState_1763746915(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1763746915L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/blockentity/state/EnchantTableRenderState;", cancellable = true)
    private void createRenderState_810529074(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(810529074L))
            info.setReturnValue(new net.minecraft.client.renderer.blockentity.state.EnchantTableRenderState());
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/level/block/entity/EnchantingTableBlockEntity;Lnet/minecraft/client/renderer/blockentity/state/EnchantTableRenderState;FLnet/minecraft/world/phys/Vec3;Lnet/minecraft/client/renderer/feature/ModelFeatureRenderer$CrumblingOverlay;)V", cancellable = true)
    private void extractRenderState__2020309218(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2020309218L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/level/block/entity/BlockEntity;Lnet/minecraft/client/renderer/blockentity/state/BlockEntityRenderState;FLnet/minecraft/world/phys/Vec3;Lnet/minecraft/client/renderer/feature/ModelFeatureRenderer$CrumblingOverlay;)V", cancellable = true)
    private void extractRenderState__968772526(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-968772526L))
            info.cancel();
    }


}
