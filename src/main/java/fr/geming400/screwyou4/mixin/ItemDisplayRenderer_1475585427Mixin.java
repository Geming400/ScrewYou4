package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.DisplayRenderer.ItemDisplayRenderer.class)
public class ItemDisplayRenderer_1475585427Mixin {
        @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/entity/state/EntityRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit_8204582(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(8204582L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submitInner(Lnet/minecraft/client/renderer/entity/state/ItemDisplayEntityRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;IF)V", cancellable = true)
    private void submitInner_510826754(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(510826754L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submitInner(Lnet/minecraft/client/renderer/entity/state/DisplayEntityRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;IF)V", cancellable = true)
    private void submitInner__1437622187(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1437622187L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Display;Lnet/minecraft/client/renderer/entity/state/DisplayEntityRenderState;F)V", cancellable = true)
    private void extractRenderState__946932784(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-946932784L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Display$ItemDisplay;Lnet/minecraft/client/renderer/entity/state/ItemDisplayEntityRenderState;F)V", cancellable = true)
    private void extractRenderState__388644680(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-388644680L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState_1702704445(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1702704445L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/ItemDisplayEntityRenderState;", cancellable = true)
    private void createRenderState_1438789599(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1438789599L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.ItemDisplayEntityRenderState());
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState_886948982(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(886948982L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.EntityRenderState());
    }


}
