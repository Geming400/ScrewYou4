package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.LlamaSpitRenderer.class)
public class LlamaSpitRenderer772803186Mixin {
        @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/entity/state/EntityRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit__304689634(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-304689634L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/entity/state/LlamaSpitRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit_1915114504(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1915114504L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState_210581379(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(210581379L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/projectile/LlamaSpit;Lnet/minecraft/client/renderer/entity/state/LlamaSpitRenderState;F)V", cancellable = true)
    private void extractRenderState__38444913(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-38444913L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/LlamaSpitRenderState;", cancellable = true)
    private void createRenderState__659156213(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-659156213L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState_1025974165(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1025974165L))
            info.setReturnValue(null);
    }


}
