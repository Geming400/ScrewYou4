package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.blockentity.BeaconRenderer.class)
public class BeaconRenderer_555827799Mixin {
        @Inject(at = @At("HEAD"), method = "extract(Lnet/minecraft/world/level/block/entity/BlockEntity;Lnet/minecraft/client/renderer/blockentity/state/BeaconRenderState;FLnet/minecraft/world/phys/Vec3;)V", cancellable = true)
    private static void extract__1446256765(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1446256765L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/blockentity/state/BlockEntityRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit_695794436(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(695794436L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/blockentity/state/BeaconRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit_942868214(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(942868214L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getViewDistance()I", cancellable = true)
    private void getViewDistance_594090044(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(594090044L))
            info.setReturnValue(1919981602);
    }

    @Inject(at = @At("HEAD"), method = "shouldRender(Lnet/minecraft/world/level/block/entity/BlockEntity;Lnet/minecraft/world/phys/Vec3;)Z", cancellable = true)
    private void shouldRender_1702711724(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1702711724L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/level/block/entity/BlockEntity;Lnet/minecraft/client/renderer/blockentity/state/BeaconRenderState;FLnet/minecraft/world/phys/Vec3;Lnet/minecraft/client/renderer/feature/ModelFeatureRenderer$CrumblingOverlay;)V", cancellable = true)
    private void extractRenderState__648137440(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-648137440L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/level/block/entity/BlockEntity;Lnet/minecraft/client/renderer/blockentity/state/BlockEntityRenderState;FLnet/minecraft/world/phys/Vec3;Lnet/minecraft/client/renderer/feature/ModelFeatureRenderer$CrumblingOverlay;)V", cancellable = true)
    private void extractRenderState_1572916660(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1572916660L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "shouldRenderOffScreen()Z", cancellable = true)
    private void shouldRenderOffScreen_594106381(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(594106381L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "submitBeaconBeam(Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/resources/Identifier;FFIIIFF)V", cancellable = true)
    private static void submitBeaconBeam__797066862(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-797066862L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/blockentity/state/BeaconRenderState;", cancellable = true)
    private void createRenderState_1533154332(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1533154332L))
            info.setReturnValue(new net.minecraft.client.renderer.blockentity.state.BeaconRenderState());
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/blockentity/state/BlockEntityRenderState;", cancellable = true)
    private void createRenderState_1689800224(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1689800224L))
            info.setReturnValue(new net.minecraft.client.renderer.blockentity.state.BlockEntityRenderState());
    }


}
