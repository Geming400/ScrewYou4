package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.IronGolemRenderer.class)
public class IronGolemRenderer1413342169Mixin {
        @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/IronGolemRenderState;", cancellable = true)
    private void createRenderState_1042856537(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1042856537L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.IronGolemRenderState());
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState_1666513148(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1666513148L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.EntityRenderState());
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__909110292(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-909110292L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/IronGolemRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__528004620(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-528004620L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;F)V", cancellable = true)
    private void extractRenderState__257131318(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-257131318L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/animal/golem/IronGolem;Lnet/minecraft/client/renderer/entity/state/IronGolemRenderState;F)V", cancellable = true)
    private void extractRenderState__439443592(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-439443592L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState_851120362(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(851120362L))
            info.cancel();
    }


}
