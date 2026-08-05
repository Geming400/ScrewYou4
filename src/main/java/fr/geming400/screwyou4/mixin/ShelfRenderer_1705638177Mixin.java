package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.blockentity.ShelfRenderer.class)
public class ShelfRenderer_1705638177Mixin {
        @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/blockentity/state/ShelfRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit_347708596(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(347708596L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/blockentity/state/BlockEntityRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit_1845604814(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1845604814L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/level/block/entity/BlockEntity;Lnet/minecraft/client/renderer/blockentity/state/BlockEntityRenderState;FLnet/minecraft/world/phys/Vec3;Lnet/minecraft/client/renderer/feature/ModelFeatureRenderer$CrumblingOverlay;)V", cancellable = true)
    private void extractRenderState__1572240258(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1572240258L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/level/block/entity/ShelfBlockEntity;Lnet/minecraft/client/renderer/blockentity/state/ShelfRenderState;FLnet/minecraft/world/phys/Vec3;Lnet/minecraft/client/renderer/feature/ModelFeatureRenderer$CrumblingOverlay;)V", cancellable = true)
    private void extractRenderState_913408622(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(913408622L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/blockentity/state/ShelfRenderState;", cancellable = true)
    private void createRenderState_1516811268(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1516811268L))
            info.setReturnValue(new net.minecraft.client.renderer.blockentity.state.ShelfRenderState());
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/blockentity/state/BlockEntityRenderState;", cancellable = true)
    private void createRenderState__1455356694(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1455356694L))
            info.setReturnValue(new net.minecraft.client.renderer.blockentity.state.BlockEntityRenderState());
    }


}
