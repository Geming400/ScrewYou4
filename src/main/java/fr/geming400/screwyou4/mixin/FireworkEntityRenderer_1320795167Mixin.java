package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.FireworkEntityRenderer.class)
public class FireworkEntityRenderer_1320795167Mixin {
        @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/entity/state/EntityRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit__146585678(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-146585678L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submit(Lnet/minecraft/client/renderer/entity/state/FireworkRocketRenderState;Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;Lnet/minecraft/client/renderer/state/level/CameraRenderState;)V", cancellable = true)
    private void submit_145848538(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(145848538L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState_732158722(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(732158722L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/FireworkRocketRenderState;", cancellable = true)
    private void createRenderState_931346010(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(931346010L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/projectile/FireworkRocketEntity;Lnet/minecraft/client/renderer/entity/state/FireworkRocketRenderState;F)V", cancellable = true)
    private void extractRenderState_830097316(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(830097316L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState_1547914185(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1547914185L))
            info.cancel();
    }


}
