package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.LightningBoltRenderer.class)
public class LightningBoltRenderer1124826836Mixin {
        @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/entity/state/EntityRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit__342554008(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-342554008L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/entity/state/LightningBoltRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit_519000416(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(519000416L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState_536190392(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(536190392L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/LightningBoltRenderState;", cancellable = true)
    private void createRenderState__1046469010(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1046469010L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState_1351945855(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1351945855L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/LightningBolt;Lnet/minecraft/client/renderer/entity/state/LightningBoltRenderState;F)V", cancellable = true)
    private void extractRenderState__1056435653(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1056435653L))
            info.cancel();
    }


}
