package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.EvokerRenderer.class)
public class EvokerRenderer_2011023471Mixin {
        @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/EvokerRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__1218658765(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1218658765L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__311428991(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-311428991L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState_1448801663(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1448801663L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;F)V", cancellable = true)
    private void extractRenderState_340549983(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(340549983L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/monster/illager/AbstractIllager;Lnet/minecraft/client/renderer/entity/state/IllagerRenderState;F)V", cancellable = true)
    private void extractRenderState_103673419(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(103673419L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/monster/illager/SpellcasterIllager;Lnet/minecraft/client/renderer/entity/state/EvokerRenderState;F)V", cancellable = true)
    private void extractRenderState_806455605(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(806455605L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EvokerRenderState;", cancellable = true)
    private void createRenderState_305421672(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(305421672L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.EvokerRenderState());
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState__2030772847(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2030772847L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.EntityRenderState());
    }


}
