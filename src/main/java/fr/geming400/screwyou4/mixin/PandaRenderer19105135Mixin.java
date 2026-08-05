package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.PandaRenderer.class)
public class PandaRenderer19105135Mixin {
        @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState_246224154(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(246224154L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/animal/panda/Panda;Lnet/minecraft/client/renderer/entity/state/PandaRenderState;F)V", cancellable = true)
    private void extractRenderState__1156185702(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1156185702L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;F)V", cancellable = true)
    private void extractRenderState_1038969338(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1038969338L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState__569531309(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-569531309L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/PandaRenderState;", cancellable = true)
    private void createRenderState_1436072996(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1436072996L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/PandaRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__762133074(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-762133074L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation_2021741768(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2021741768L))
            info.setReturnValue(null);
    }


}
