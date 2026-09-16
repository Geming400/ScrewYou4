package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.DisplayRenderer.ItemDisplayRenderer.class)
public class ItemDisplayRenderer_1475585427Mixin {
        @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/entity/state/EntityRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit_398092606(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(398092606L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState_1728756405(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1728756405L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/ItemDisplayEntityRenderState;", cancellable = true)
    private void createRenderState__373871552(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-373871552L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.ItemDisplayEntityRenderState());
    }

    @Inject(at = @At("HEAD"), method = "submitInner(Lnet/minecraft/client/renderer/entity/state/ItemDisplayEntityRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;IF)V", cancellable = true)
    private void submitInner_661598240(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(661598240L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submitInner(Lnet/minecraft/client/renderer/entity/state/DisplayEntityRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;IF)V", cancellable = true)
    private void submitInner_1107326579(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1107326579L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState_913363619(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(913363619L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Display$ItemDisplay;Lnet/minecraft/client/renderer/entity/state/ItemDisplayEntityRenderState;F)V", cancellable = true)
    private void extractRenderState_457247774(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(457247774L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Display;Lnet/minecraft/client/renderer/entity/state/DisplayEntityRenderState;F)V", cancellable = true)
    private void extractRenderState_14273334(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(14273334L))
            info.cancel();
    }


}
