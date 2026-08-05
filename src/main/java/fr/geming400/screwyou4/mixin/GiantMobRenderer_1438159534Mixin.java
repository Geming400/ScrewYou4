package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.GiantMobRenderer.class)
public class GiantMobRenderer_1438159534Mixin {
        @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/ZombieRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__220668340(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-220668340L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__854171130(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-854171130L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState_1665278552(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1665278552L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;F)V", cancellable = true)
    private void extractRenderState__1836943560(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1836943560L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/monster/Giant;Lnet/minecraft/client/renderer/entity/state/ZombieRenderState;F)V", cancellable = true)
    private void extractRenderState_1150447764(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1150447764L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState_849523089(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(849523089L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.EntityRenderState());
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/ZombieRenderState;", cancellable = true)
    private void createRenderState__1249469740(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1249469740L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.ZombieRenderState());
    }


}
