package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.LightningBoltRenderer.class)
public class LightningBoltRenderer1124826836Mixin {
        @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/entity/state/EntityRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit_47334016(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(47334016L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/entity/state/LightningBoltRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit__671134136(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-671134136L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/LightningBolt;Lnet/minecraft/client/renderer/entity/state/LightningBoltRenderState;F)V", cancellable = true)
    private void extractRenderState__900643551(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-900643551L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState_562605029(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(562605029L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/LightningBoltRenderState;", cancellable = true)
    private void createRenderState__142836913(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-142836913L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.LightningBoltRenderState());
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState_1377997815(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1377997815L))
            info.setReturnValue(null);
    }


}
