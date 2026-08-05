package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.ItemFrameRenderer.class)
public class ItemFrameRenderer2008112687Mixin {
        @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/entity/state/EntityRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit_540731843(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(540731843L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/entity/state/ItemFrameRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit__1185610496(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1185610496L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getRenderOffset(Lnet/minecraft/client/renderer/entity/state/ItemFrameRenderState;)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getRenderOffset__107734672(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-107734672L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRenderOffset(Lnet/minecraft/client/renderer/entity/state/EntityRenderState;)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getRenderOffset_1940645773(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1940645773L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/decoration/ItemFrame;Lnet/minecraft/client/renderer/entity/state/ItemFrameRenderState;F)V", cancellable = true)
    private void extractRenderState__253211631(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-253211631L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState__2059735590(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2059735590L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState_1419476243(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1419476243L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.EntityRenderState());
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/ItemFrameRenderState;", cancellable = true)
    private void createRenderState_1362798244(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1362798244L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.ItemFrameRenderState());
    }


}
