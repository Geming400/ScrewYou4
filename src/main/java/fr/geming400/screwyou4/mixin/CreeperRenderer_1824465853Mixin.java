package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.CreeperRenderer.class)
public class CreeperRenderer_1824465853Mixin {
        @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/CreeperRenderState;", cancellable = true)
    private void createRenderState_1951728581(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1951728581L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState_1235829408(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1235829408L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;F)V", cancellable = true)
    private void extractRenderState__1450637241(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1450637241L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState_2051584871(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2051584871L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/monster/Creeper;Lnet/minecraft/client/renderer/entity/state/CreeperRenderState;F)V", cancellable = true)
    private void extractRenderState__1939166054(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1939166054L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/CreeperRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation_1673425255(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1673425255L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__467864811(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-467864811L))
            info.setReturnValue(null);
    }


}
