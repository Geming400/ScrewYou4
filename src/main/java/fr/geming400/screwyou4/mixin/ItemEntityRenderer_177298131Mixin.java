package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.ItemEntityRenderer.class)
public class ItemEntityRenderer_177298131Mixin {
        @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/entity/state/EntityRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit__1290082714(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1290082714L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/entity/state/ItemEntityRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit_1168339603(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1168339603L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submitMultipleFromCount(Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;ILnet/minecraft/client/renderer/entity/state/ItemClusterRenderState;Lnet/minecraft/util/RandomSource;Lnet/minecraft/world/phys/AABB;)V", cancellable = true)
    private static void submitMultipleFromCount__784714140(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-784714140L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submitMultipleFromCount(Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;ILnet/minecraft/client/renderer/entity/state/ItemClusterRenderState;Lnet/minecraft/util/RandomSource;)V", cancellable = true)
    private static void submitMultipleFromCount__1655882847(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1655882847L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/item/ItemEntity;Lnet/minecraft/client/renderer/entity/state/ItemEntityRenderState;F)V", cancellable = true)
    private void extractRenderState__997426165(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-997426165L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState_404417149(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(404417149L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "renderMultipleFromCount(Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;ILnet/minecraft/client/renderer/entity/state/ItemClusterRenderState;Lnet/minecraft/util/RandomSource;)V", cancellable = true)
    private static void renderMultipleFromCount__1655882847(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1655882847L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState__411338314(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-411338314L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.EntityRenderState());
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/ItemEntityRenderState;", cancellable = true)
    private void createRenderState_135381033(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(135381033L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.ItemEntityRenderState());
    }


}
