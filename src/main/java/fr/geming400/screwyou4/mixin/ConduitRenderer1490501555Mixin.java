package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.blockentity.ConduitRenderer.class)
public class ConduitRenderer1490501555Mixin {
        @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/blockentity/state/ConduitRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit__1679112013(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1679112013L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/blockentity/state/BlockEntityRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit_1630468193(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1630468193L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/blockentity/state/ConduitRenderState;", cancellable = true)
    private void createRenderState__1457435541(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1457435541L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/blockentity/state/BlockEntityRenderState;", cancellable = true)
    private void createRenderState__1670493315(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1670493315L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/level/block/entity/BlockEntity;Lnet/minecraft/client/renderer/blockentity/state/BlockEntityRenderState;FLnet/minecraft/world/phys/Vec3;Lnet/minecraft/client/renderer/feature/ModelFeatureRenderer$CrumblingOverlay;)V", cancellable = true)
    private void extractRenderState__1787376879(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1787376879L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/level/block/entity/ConduitBlockEntity;Lnet/minecraft/client/renderer/blockentity/state/ConduitRenderState;FLnet/minecraft/world/phys/Vec3;Lnet/minecraft/client/renderer/feature/ModelFeatureRenderer$CrumblingOverlay;)V", cancellable = true)
    private void extractRenderState__519816359(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-519816359L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createEyeLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createEyeLayer_776369391(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(776369391L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createCageLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createCageLayer_776369391(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(776369391L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createWindLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createWindLayer_776369391(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(776369391L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createShellLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createShellLayer_776369391(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(776369391L))
            info.setReturnValue(null);
    }


}
