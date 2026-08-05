package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.WitherSkullRenderer.class)
public class WitherSkullRenderer_1293327489Mixin {
        @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/entity/state/EntityRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit__174053356(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-174053356L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/entity/state/WitherSkullRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit__2000207423(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2000207423L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/projectile/hurtingprojectile/WitherSkull;Lnet/minecraft/client/renderer/entity/state/WitherSkullRenderState;F)V", cancellable = true)
    private void extractRenderState__639184196(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-639184196L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState_1520446507(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1520446507L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState_704691044(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(704691044L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.EntityRenderState());
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/WitherSkullRenderState;", cancellable = true)
    private void createRenderState__622502203(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-622502203L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.WitherSkullRenderState());
    }

    @Inject(at = @At("HEAD"), method = "createSkullLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createSkullLayer_579195324(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(579195324L))
            info.setReturnValue(null);
    }


}
