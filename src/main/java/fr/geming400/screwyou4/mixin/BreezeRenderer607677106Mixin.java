package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.BreezeRenderer.class)
public class BreezeRenderer607677106Mixin {
        @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/BreezeRenderState;", cancellable = true)
    private void createRenderState_807713357(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(807713357L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState_860848085(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(860848085L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__1714775355(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1714775355L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/BreezeRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__167614858(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-167614858L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;F)V", cancellable = true)
    private void extractRenderState__1062796381(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1062796381L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/monster/breeze/Breeze;Lnet/minecraft/client/renderer/entity/state/BreezeRenderState;F)V", cancellable = true)
    private void extractRenderState_492801832(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(492801832L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState_45455299(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(45455299L))
            info.cancel();
    }


}
