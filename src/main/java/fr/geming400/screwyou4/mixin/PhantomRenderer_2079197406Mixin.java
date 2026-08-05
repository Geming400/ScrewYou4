package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.PhantomRenderer.class)
public class PhantomRenderer_2079197406Mixin {
        @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/PhantomRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__1850255985(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1850255985L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__243255056(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-243255056L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState_1516975598(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1516975598L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;F)V", cancellable = true)
    private void extractRenderState_408723918(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(408723918L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/monster/Phantom;Lnet/minecraft/client/renderer/entity/state/PhantomRenderState;F)V", cancellable = true)
    private void extractRenderState_1943318947(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1943318947L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/PhantomRenderState;", cancellable = true)
    private void createRenderState_837832166(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(837832166L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.PhantomRenderState());
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState__1962598912(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1962598912L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.EntityRenderState());
    }


}
