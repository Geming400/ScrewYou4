package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.blockentity.ConduitRenderer.class)
public class ConduitRenderer1490501555Mixin {
        @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/blockentity/state/ConduitRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit__470577461(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-470577461L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/blockentity/state/BlockEntityRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit_1287058041(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1287058041L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/blockentity/state/ConduitRenderState;", cancellable = true)
    private void createRenderState__874096790(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-874096790L))
            info.setReturnValue(new net.minecraft.client.renderer.blockentity.state.ConduitRenderState());
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/blockentity/state/BlockEntityRenderState;", cancellable = true)
    private void createRenderState_1873264380(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1873264380L))
            info.setReturnValue(new net.minecraft.client.renderer.blockentity.state.BlockEntityRenderState());
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/level/block/entity/BlockEntity;Lnet/minecraft/client/renderer/blockentity/state/BlockEntityRenderState;FLnet/minecraft/world/phys/Vec3;Lnet/minecraft/client/renderer/feature/ModelFeatureRenderer$CrumblingOverlay;)V", cancellable = true)
    private void extractRenderState__859255061(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-859255061L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/level/block/entity/ConduitBlockEntity;Lnet/minecraft/client/renderer/blockentity/state/ConduitRenderState;FLnet/minecraft/world/phys/Vec3;Lnet/minecraft/client/renderer/feature/ModelFeatureRenderer$CrumblingOverlay;)V", cancellable = true)
    private void extractRenderState__1842187969(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1842187969L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createWindLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createWindLayer__857923396(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-857923396L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createEyeLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createEyeLayer__343511381(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-343511381L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createShellLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createShellLayer__1321957556(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1321957556L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createCageLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createCageLayer_1235430024(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1235430024L))
            info.setReturnValue(null);
    }


}
