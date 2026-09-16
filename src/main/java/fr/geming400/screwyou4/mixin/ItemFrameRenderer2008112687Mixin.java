package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.ItemFrameRenderer.class)
public class ItemFrameRenderer2008112687Mixin {
        @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/entity/state/ItemFrameRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit_376944104(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(376944104L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/entity/state/EntityRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit_930619867(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(930619867L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getRenderOffset(Lnet/minecraft/client/renderer/entity/state/ItemFrameRenderState;)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getRenderOffset_1865009711(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1865009711L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRenderOffset(Lnet/minecraft/client/renderer/entity/state/EntityRenderState;)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getRenderOffset_1620510510(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1620510510L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/decoration/ItemFrame;Lnet/minecraft/client/renderer/entity/state/ItemFrameRenderState;F)V", cancellable = true)
    private void extractRenderState__1910347925(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1910347925L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState_1445890880(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1445890880L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/ItemFrameRenderState;", cancellable = true)
    private void createRenderState_1333695493(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1333695493L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.ItemFrameRenderState());
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState__2033683630(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2033683630L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.EntityRenderState());
    }


}
