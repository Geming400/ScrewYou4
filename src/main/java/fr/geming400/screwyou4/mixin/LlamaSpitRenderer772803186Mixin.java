package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.LlamaSpitRenderer.class)
public class LlamaSpitRenderer772803186Mixin {
        @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/entity/state/EntityRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit__694577658(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-694577658L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/entity/state/LlamaSpitRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit_352559904(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(352559904L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState_999922205(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(999922205L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/projectile/LlamaSpit;Lnet/minecraft/client/renderer/entity/state/LlamaSpitRenderState;F)V", cancellable = true)
    private void extractRenderState_1618691381(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1618691381L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/LlamaSpitRenderState;", cancellable = true)
    private void createRenderState__630053462(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-630053462L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.LlamaSpitRenderState());
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState_184166742(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(184166742L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.EntityRenderState());
    }


}
