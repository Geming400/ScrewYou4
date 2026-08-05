package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.LlamaRenderer.class)
public class LlamaRenderer1993671178Mixin {
        @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/LlamaRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__1751708524(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1751708524L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__328781283(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-328781283L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState_1431449371(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1431449371L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;F)V", cancellable = true)
    private void extractRenderState_323197691(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(323197691L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/animal/equine/Llama;Lnet/minecraft/client/renderer/entity/state/LlamaRenderState;F)V", cancellable = true)
    private void extractRenderState__1450488784(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1450488784L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState__2048125139(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2048125139L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.EntityRenderState());
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/LlamaRenderState;", cancellable = true)
    private void createRenderState__1817070149(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1817070149L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.LlamaRenderState());
    }


}
