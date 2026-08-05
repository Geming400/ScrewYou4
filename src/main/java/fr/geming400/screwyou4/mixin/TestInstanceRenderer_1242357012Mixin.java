package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.blockentity.TestInstanceRenderer.class)
public class TestInstanceRenderer_1242357012Mixin {
        @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/blockentity/state/BlockEntityRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit_1382323649(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1382323649L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/blockentity/state/TestInstanceRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit_832244304(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(832244304L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getViewDistance()I", cancellable = true)
    private void getViewDistance_1280619257(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1280619257L))
            info.setReturnValue(-710398220);
    }

    @Inject(at = @At("HEAD"), method = "shouldRender(Lnet/minecraft/world/level/block/entity/TestInstanceBlockEntity;Lnet/minecraft/world/phys/Vec3;)Z", cancellable = true)
    private void shouldRender__1693696734(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1693696734L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "shouldRender(Lnet/minecraft/world/level/block/entity/BlockEntity;Lnet/minecraft/world/phys/Vec3;)Z", cancellable = true)
    private void shouldRender__1905597399(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1905597399L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/level/block/entity/TestInstanceBlockEntity;Lnet/minecraft/client/renderer/blockentity/state/TestInstanceRenderState;FLnet/minecraft/world/phys/Vec3;Lnet/minecraft/client/renderer/feature/ModelFeatureRenderer$CrumblingOverlay;)V", cancellable = true)
    private void extractRenderState_1705691873(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1705691873L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/level/block/entity/BlockEntity;Lnet/minecraft/client/renderer/blockentity/state/BlockEntityRenderState;FLnet/minecraft/world/phys/Vec3;Lnet/minecraft/client/renderer/feature/ModelFeatureRenderer$CrumblingOverlay;)V", cancellable = true)
    private void extractRenderState__2035521423(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2035521423L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "shouldRenderOffScreen()Z", cancellable = true)
    private void shouldRenderOffScreen_1280635594(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1280635594L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/blockentity/state/TestInstanceRenderState;", cancellable = true)
    private void createRenderState_1333997980(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1333997980L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/blockentity/state/BlockEntityRenderState;", cancellable = true)
    private void createRenderState__1918637859(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1918637859L))
            info.setReturnValue(new net.minecraft.client.renderer.blockentity.state.BlockEntityRenderState());
    }


}
