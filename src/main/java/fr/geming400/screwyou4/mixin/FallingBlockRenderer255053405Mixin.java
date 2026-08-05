package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.FallingBlockRenderer.class)
public class FallingBlockRenderer255053405Mixin {
        @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/entity/state/FallingBlockRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit_1753098054(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1753098054L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/entity/state/EntityRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit__822439415(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-822439415L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState__307168402(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-307168402L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/item/FallingBlockEntity;Lnet/minecraft/client/renderer/entity/state/FallingBlockRenderState;F)V", cancellable = true)
    private void extractRenderState__1587412813(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1587412813L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "shouldRender(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/culling/Frustum;DDD)Z", cancellable = true)
    private void shouldRender_2118069306(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2118069306L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "shouldRender(Lnet/minecraft/world/entity/item/FallingBlockEntity;Lnet/minecraft/client/renderer/culling/Frustum;DDD)Z", cancellable = true)
    private void shouldRender_1289580532(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1289580532L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState_508224384(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(508224384L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.EntityRenderState());
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/FallingBlockRenderState;", cancellable = true)
    private void createRenderState__553041053(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-553041053L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.FallingBlockRenderState());
    }


}
