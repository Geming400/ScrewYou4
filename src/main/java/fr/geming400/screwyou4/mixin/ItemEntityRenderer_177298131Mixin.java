package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.ItemEntityRenderer.class)
public class ItemEntityRenderer_177298131Mixin {
        @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/entity/state/EntityRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit__900194690(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-900194690L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/entity/state/ItemEntityRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit__1932075349(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1932075349L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "renderMultipleFromCount(Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;ILnet/minecraft/client/renderer/entity/state/ItemClusterRenderState;Lnet/minecraft/util/RandomSource;)V", cancellable = true)
    private static void renderMultipleFromCount__233724864(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-233724864L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState__384923677(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-384923677L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/item/ItemEntity;Lnet/minecraft/client/renderer/entity/state/ItemEntityRenderState;F)V", cancellable = true)
    private void extractRenderState_1501451365(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1501451365L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submitMultipleFromCount(Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;ILnet/minecraft/client/renderer/entity/state/ItemClusterRenderState;Lnet/minecraft/util/RandomSource;Lnet/minecraft/world/phys/AABB;)V", cancellable = true)
    private static void submitMultipleFromCount__987241497(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-987241497L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submitMultipleFromCount(Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;ILnet/minecraft/client/renderer/entity/state/ItemClusterRenderState;Lnet/minecraft/util/RandomSource;)V", cancellable = true)
    private static void submitMultipleFromCount_741339774(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(741339774L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/ItemEntityRenderState;", cancellable = true)
    private void createRenderState__766804248(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-766804248L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.ItemEntityRenderState());
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState_430469109(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(430469109L))
            info.setReturnValue(null);
    }


}
