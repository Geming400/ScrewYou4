package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.WitchRenderer.class)
public class WitchRenderer649273116Mixin {
        @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/WitchRenderState;", cancellable = true)
    private void createRenderState_1846875871(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1846875871L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.WitchRenderState());
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState_902444095(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(902444095L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.EntityRenderState());
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__1673179345(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1673179345L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/WitchRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__2055640876(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2055640876L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;F)V", cancellable = true)
    private void extractRenderState__1021200371(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1021200371L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/monster/Witch;Lnet/minecraft/client/renderer/entity/state/WitchRenderState;F)V", cancellable = true)
    private void extractRenderState_1261106286(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1261106286L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState_87051309(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(87051309L))
            info.cancel();
    }


}
