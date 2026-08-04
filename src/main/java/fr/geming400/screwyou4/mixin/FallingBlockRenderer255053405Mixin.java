package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.FallingBlockRenderer.class)
public class FallingBlockRenderer255053405Mixin {
        @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/entity/state/FallingBlockRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit_544563502(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(544563502L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/entity/state/EntityRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit__1212327439(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1212327439L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/FallingBlockRenderState;", cancellable = true)
    private void createRenderState__1136379804(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1136379804L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState__333583039(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-333583039L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "shouldRender(Lnet/minecraft/world/entity/item/FallingBlockEntity;Lnet/minecraft/client/renderer/culling/Frustum;DDD)Z", cancellable = true)
    private void shouldRender_1179998397(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1179998397L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "shouldRender(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/culling/Frustum;DDD)Z", cancellable = true)
    private void shouldRender__507538351(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-507538351L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/item/FallingBlockEntity;Lnet/minecraft/client/renderer/entity/state/FallingBlockRenderState;F)V", cancellable = true)
    private void extractRenderState_1987530969(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1987530969L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState_482172424(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(482172424L))
            info.cancel();
    }


}
