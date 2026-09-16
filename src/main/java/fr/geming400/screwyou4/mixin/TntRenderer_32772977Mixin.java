package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.TntRenderer.class)
public class TntRenderer_32772977Mixin {
        @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/entity/state/EntityRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit__1044719844(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1044719844L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/entity/state/TntRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit_237473161(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(237473161L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/item/PrimedTnt;Lnet/minecraft/client/renderer/entity/state/TntRenderState;F)V", cancellable = true)
    private void extractRenderState_2144238990(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2144238990L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState__529448831(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-529448831L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isLit(F)Z", cancellable = true)
    private static void isLit__1326507166(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1326507166L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getSwellAmount(F)F", cancellable = true)
    private static void getSwellAmount__1265854204(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1265854204L))
            info.setReturnValue(7.459442E8F);
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/TntRenderState;", cancellable = true)
    private void createRenderState_1646194406(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1646194406L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.TntRenderState());
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState_285943955(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(285943955L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.EntityRenderState());
    }


}
