package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.RabbitRenderer.class)
public class RabbitRenderer188499953Mixin {
        @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/RabbitRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation_1406477596(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1406477596L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__2103830710(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2103830710L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState_415618972(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(415618972L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;F)V", cancellable = true)
    private void extractRenderState_1208364156(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1208364156L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/animal/rabbit/Rabbit;Lnet/minecraft/client/renderer/entity/state/RabbitRenderState;F)V", cancellable = true)
    private void extractRenderState_1500126398(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1500126398L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState__400136491(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-400136491L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.EntityRenderState());
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/RabbitRenderState;", cancellable = true)
    private void createRenderState__1069496564(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1069496564L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.RabbitRenderState());
    }


}
