package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.OminousItemSpawnerRenderer.class)
public class OminousItemSpawnerRenderer_1196383070Mixin {
        @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/entity/state/EntityRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit_118890249(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(118890249L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/entity/state/ItemClusterRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit__1676347031(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1676347031L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/OminousItemSpawner;Lnet/minecraft/client/renderer/entity/state/ItemClusterRenderState;F)V", cancellable = true)
    private void extractRenderState_1649711132(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1649711132L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState_634161262(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(634161262L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/ItemClusterRenderState;", cancellable = true)
    private void createRenderState_768591936(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(768591936L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.ItemClusterRenderState());
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState_1449554048(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1449554048L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.EntityRenderState());
    }


}
