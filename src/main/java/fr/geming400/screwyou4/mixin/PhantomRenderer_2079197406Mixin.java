package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.PhantomRenderer.class)
public class PhantomRenderer_2079197406Mixin {
        @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState_1490560961(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1490560961L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/PhantomRenderState;", cancellable = true)
    private void createRenderState_511605829(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(511605829L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState__1988650872(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1988650872L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/monster/Phantom;Lnet/minecraft/client/renderer/entity/state/PhantomRenderState;F)V", cancellable = true)
    private void extractRenderState_1642208189(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1642208189L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;F)V", cancellable = true)
    private void extractRenderState__1195905688(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1195905688L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/PhantomRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__1714765175(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1714765175L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__213133258(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-213133258L))
            info.setReturnValue(null);
    }


}
