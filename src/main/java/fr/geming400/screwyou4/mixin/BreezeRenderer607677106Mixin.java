package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.BreezeRenderer.class)
public class BreezeRenderer607677106Mixin {
        @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/BreezeRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__1548717508(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1548717508L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__1684653557(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1684653557L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState_834796125(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(834796125L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;F)V", cancellable = true)
    private void extractRenderState_1627541309(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1627541309L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/monster/breeze/Breeze;Lnet/minecraft/client/renderer/entity/state/BreezeRenderState;F)V", cancellable = true)
    private void extractRenderState__41786034(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-41786034L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState_19040662(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(19040662L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/BreezeRenderState;", cancellable = true)
    private void createRenderState__34094066(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-34094066L))
            info.setReturnValue(null);
    }


}
