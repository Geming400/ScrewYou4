package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.blockentity.TestInstanceRenderer.class)
public class TestInstanceRenderer_1242357012Mixin {
        @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/blockentity/state/TestInstanceRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit__1223535816(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1223535816L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/blockentity/state/BlockEntityRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit_1038913497(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1038913497L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "shouldRenderOffScreen()Z", cancellable = true)
    private void shouldRenderOffScreen_658974328(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(658974328L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "shouldRender(Lnet/minecraft/world/level/block/entity/TestInstanceBlockEntity;Lnet/minecraft/world/phys/Vec3;)Z", cancellable = true)
    private void shouldRender_1315030475(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1315030475L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "shouldRender(Lnet/minecraft/world/level/block/entity/BlockEntity;Lnet/minecraft/world/phys/Vec3;)Z", cancellable = true)
    private void shouldRender__1701748142(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1701748142L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getViewDistance()I", cancellable = true)
    private void getViewDistance__854390583(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-854390583L))
            info.setReturnValue(-436035185);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/level/block/entity/BlockEntity;Lnet/minecraft/client/renderer/blockentity/state/BlockEntityRenderState;FLnet/minecraft/world/phys/Vec3;Lnet/minecraft/client/renderer/feature/ModelFeatureRenderer$CrumblingOverlay;)V", cancellable = true)
    private void extractRenderState__1107399605(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1107399605L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/level/block/entity/TestInstanceBlockEntity;Lnet/minecraft/client/renderer/blockentity/state/TestInstanceRenderState;FLnet/minecraft/world/phys/Vec3;Lnet/minecraft/client/renderer/feature/ModelFeatureRenderer$CrumblingOverlay;)V", cancellable = true)
    private void extractRenderState_332618055(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(332618055L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/blockentity/state/BlockEntityRenderState;", cancellable = true)
    private void createRenderState_1625119836(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1625119836L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/blockentity/state/TestInstanceRenderState;", cancellable = true)
    private void createRenderState__478663171(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-478663171L))
            info.setReturnValue(new net.minecraft.client.renderer.blockentity.state.TestInstanceRenderState());
    }


}
