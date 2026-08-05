package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.CopperGolemRenderer.class)
public class CopperGolemRenderer1614996392Mixin {
        @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/CopperGolemRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation_1909455630(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1909455630L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__677334271(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-677334271L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState_1842115411(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1842115411L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;F)V", cancellable = true)
    private void extractRenderState__1660106701(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1660106701L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/animal/golem/CopperGolem;Lnet/minecraft/client/renderer/entity/state/CopperGolemRenderState;F)V", cancellable = true)
    private void extractRenderState__1363934001(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1363934001L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/CopperGolemRenderState;", cancellable = true)
    private void createRenderState_1424812438(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1424812438L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.CopperGolemRenderState());
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState_1026359948(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1026359948L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.EntityRenderState());
    }


}
