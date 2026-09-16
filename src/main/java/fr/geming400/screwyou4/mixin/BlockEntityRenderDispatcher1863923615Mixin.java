package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.blockentity.BlockEntityRenderDispatcher.class)
public class BlockEntityRenderDispatcher1863923615Mixin {
        @Inject(at = @At("HEAD"), method = "prepare(Lnet/minecraft/world/phys/Vec3;)V", cancellable = true)
    private void prepare__161562139(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-161562139L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/blockentity/state/BlockEntityRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit_1660351141(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1660351141L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getRenderer(Lnet/minecraft/world/level/block/entity/BlockEntity;)Lnet/minecraft/client/renderer/blockentity/BlockEntityRenderer;", cancellable = true)
    private void getRenderer_1761361375(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1761361375L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRenderer(Lnet/minecraft/client/renderer/blockentity/state/BlockEntityRenderState;)Lnet/minecraft/client/renderer/blockentity/BlockEntityRenderer;", cancellable = true)
    private void getRenderer_1897681437(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1897681437L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tryExtractRenderState(Lnet/minecraft/world/level/block/entity/BlockEntity;FLnet/minecraft/client/renderer/feature/ModelFeatureRenderer$CrumblingOverlay;Z)Lnet/minecraft/client/renderer/blockentity/state/BlockEntityRenderState;", cancellable = true)
    private void tryExtractRenderState__1484906118(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1484906118L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onResourceManagerReload(Lnet/minecraft/server/packs/resources/ResourceManager;)V", cancellable = true)
    private void onResourceManagerReload_2117167776(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2117167776L))
            info.cancel();
    }


}
