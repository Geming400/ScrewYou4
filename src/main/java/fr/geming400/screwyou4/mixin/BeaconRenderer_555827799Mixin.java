package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.blockentity.BeaconRenderer.class)
public class BeaconRenderer_555827799Mixin {
        @Inject(at = @At("HEAD"), method = "extract(Lnet/minecraft/world/level/block/entity/BlockEntity;Lnet/minecraft/client/renderer/blockentity/state/BeaconRenderState;FLnet/minecraft/world/phys/Vec3;)V", cancellable = true)
    private static void extract__380776316(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-380776316L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/blockentity/state/BeaconRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit__680714786(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-680714786L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/blockentity/state/BlockEntityRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit_352384284(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(352384284L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "shouldRender(Lnet/minecraft/world/level/block/entity/BlockEntity;Lnet/minecraft/world/phys/Vec3;)Z", cancellable = true)
    private void shouldRender_1906560981(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1906560981L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/blockentity/state/BeaconRenderState;", cancellable = true)
    private void createRenderState__664785603(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-664785603L))
            info.setReturnValue(new net.minecraft.client.renderer.blockentity.state.BeaconRenderState());
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/blockentity/state/BlockEntityRenderState;", cancellable = true)
    private void createRenderState_938590623(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(938590623L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getViewDistance()I", cancellable = true)
    private void getViewDistance__1540919796(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1540919796L))
            info.setReturnValue(-1688929892);
    }

    @Inject(at = @At("HEAD"), method = "submitBeaconBeam(Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/resources/Identifier;FFIIIFF)V", cancellable = true)
    private static void submitBeaconBeam_1620639453(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1620639453L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/level/block/entity/BlockEntity;Lnet/minecraft/client/renderer/blockentity/state/BlockEntityRenderState;FLnet/minecraft/world/phys/Vec3;Lnet/minecraft/client/renderer/feature/ModelFeatureRenderer$CrumblingOverlay;)V", cancellable = true)
    private void extractRenderState__1793928818(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1793928818L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/level/block/entity/BlockEntity;Lnet/minecraft/client/renderer/blockentity/state/BeaconRenderState;FLnet/minecraft/world/phys/Vec3;Lnet/minecraft/client/renderer/feature/ModelFeatureRenderer$CrumblingOverlay;)V", cancellable = true)
    private void extractRenderState_549171462(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(549171462L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "shouldRenderOffScreen()Z", cancellable = true)
    private void shouldRenderOffScreen__27554885(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-27554885L))
            info.setReturnValue(false);
    }


}
