package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.TntRenderer.class)
public class TntRenderer_32772977Mixin {
        @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/entity/state/TntRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit_949227169(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(949227169L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/entity/state/EntityRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit__1434607868(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1434607868L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isLit(F)Z", cancellable = true)
    private static void isLit_1243923477(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1243923477L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/item/PrimedTnt;Lnet/minecraft/client/renderer/entity/state/TntRenderState;F)V", cancellable = true)
    private void extractRenderState_435792692(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(435792692L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState_259891995(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(259891995L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getSwellAmount(F)F", cancellable = true)
    private static void getSwellAmount_1243904257(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1243904257L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState__555863468(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-555863468L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/TntRenderState;", cancellable = true)
    private void createRenderState__1668733755(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1668733755L))
            info.setReturnValue(null);
    }


}
