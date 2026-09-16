package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.WitherSkullRenderer.class)
public class WitherSkullRenderer_1293327489Mixin {
        @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/entity/state/EntityRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit_215834668(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(215834668L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/entity/state/WitherSkullRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit_671176873(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(671176873L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/WitherSkullRenderState;", cancellable = true)
    private void createRenderState_1474525158(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1474525158L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.WitherSkullRenderState());
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState_1546498467(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1546498467L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.EntityRenderState());
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/projectile/hurtingprojectile/WitherSkull;Lnet/minecraft/client/renderer/entity/state/WitherSkullRenderState;F)V", cancellable = true)
    private void extractRenderState__1069904234(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1069904234L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState_731105681(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(731105681L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createSkullLayer()Lnet/minecraft/client/model/geom/builders/LayerDefinition;", cancellable = true)
    private static void createSkullLayer__587397172(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-587397172L))
            info.setReturnValue(null);
    }


}
