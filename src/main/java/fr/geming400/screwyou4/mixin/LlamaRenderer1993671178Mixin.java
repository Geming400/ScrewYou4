package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.LlamaRenderer.class)
public class LlamaRenderer1993671178Mixin {
        @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState__2074177099(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2074177099L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/animal/equine/Llama;Lnet/minecraft/client/renderer/entity/state/LlamaRenderState;F)V", cancellable = true)
    private void extractRenderState_1239848906(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1239848906L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;F)V", cancellable = true)
    private void extractRenderState__1281431915(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1281431915L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState_1405034734(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1405034734L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.EntityRenderState());
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/LlamaRenderState;", cancellable = true)
    private void createRenderState__597299238(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-597299238L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.LlamaRenderState());
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/LlamaRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__1380618226(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1380618226L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__298659485(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-298659485L))
            info.setReturnValue(null);
    }


}
