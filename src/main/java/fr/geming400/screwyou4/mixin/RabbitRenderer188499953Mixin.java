package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.RabbitRenderer.class)
public class RabbitRenderer188499953Mixin {
        @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/RabbitRenderState;", cancellable = true)
    private void createRenderState__227689141(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-227689141L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.RabbitRenderState());
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState_441670932(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(441670932L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.EntityRenderState());
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__2133952508(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2133952508L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/RabbitRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__1507387050(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1507387050L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;F)V", cancellable = true)
    private void extractRenderState__1481973534(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1481973534L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/animal/rabbit/Rabbit;Lnet/minecraft/client/renderer/entity/state/RabbitRenderState;F)V", cancellable = true)
    private void extractRenderState_1655918500(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1655918500L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState__373721854(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-373721854L))
            info.cancel();
    }


}
