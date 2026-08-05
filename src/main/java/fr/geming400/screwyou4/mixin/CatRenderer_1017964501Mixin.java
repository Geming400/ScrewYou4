package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.CatRenderer.class)
public class CatRenderer_1017964501Mixin {
        @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/animal/feline/Cat;Lnet/minecraft/client/renderer/entity/state/CatRenderState;F)V", cancellable = true)
    private void extractRenderState__1061529898(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1061529898L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;F)V", cancellable = true)
    private void extractRenderState_2037828703(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2037828703L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState_1245083519(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1245083519L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState_429328056(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(429328056L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.EntityRenderState());
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/CatRenderState;", cancellable = true)
    private void createRenderState_127006405(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(127006405L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.CatRenderState());
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/CatRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation_2006500119(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2006500119L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__1274366163(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1274366163L))
            info.setReturnValue(null);
    }


}
