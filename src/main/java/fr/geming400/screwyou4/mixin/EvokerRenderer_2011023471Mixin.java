package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.EvokerRenderer.class)
public class EvokerRenderer_2011023471Mixin {
        @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState__2056824807(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2056824807L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/monster/illager/AbstractIllager;Lnet/minecraft/client/renderer/entity/state/IllagerRenderState;F)V", cancellable = true)
    private void extractRenderState__1050155931(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1050155931L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/monster/illager/SpellcasterIllager;Lnet/minecraft/client/renderer/entity/state/EvokerRenderState;F)V", cancellable = true)
    private void extractRenderState_78012623(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(78012623L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;F)V", cancellable = true)
    private void extractRenderState__1264079623(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1264079623L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState_1422387026(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1422387026L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.EntityRenderState());
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EvokerRenderState;", cancellable = true)
    private void createRenderState__536385751(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-536385751L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.EvokerRenderState());
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/EvokerRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation_1695205881(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1695205881L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__281307193(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-281307193L))
            info.setReturnValue(null);
    }


}
