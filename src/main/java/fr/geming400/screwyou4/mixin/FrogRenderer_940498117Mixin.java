package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.FrogRenderer.class)
public class FrogRenderer_940498117Mixin {
        @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState_1193669095(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1193669095L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.EntityRenderState());
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/FrogRenderState;", cancellable = true)
    private void createRenderState__551982936(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-551982936L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__1381954345(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1381954345L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/FrogRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation_141341279(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(141341279L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState_378276309(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(378276309L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;F)V", cancellable = true)
    private void extractRenderState__729975371(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-729975371L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/animal/frog/Frog;Lnet/minecraft/client/renderer/entity/state/FrogRenderState;F)V", cancellable = true)
    private void extractRenderState__1020451411(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1020451411L))
            info.cancel();
    }


}
