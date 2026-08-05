package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.WitherBossRenderer.class)
public class WitherBossRenderer1234004439Mixin {
        @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState_1461123458(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1461123458L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;F)V", cancellable = true)
    private void extractRenderState__2041098654(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2041098654L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/boss/wither/WitherBoss;Lnet/minecraft/client/renderer/entity/state/WitherRenderState;F)V", cancellable = true)
    private void extractRenderState__1212887607(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1212887607L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState_645367995(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(645367995L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.EntityRenderState());
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/WitherRenderState;", cancellable = true)
    private void createRenderState_1850537227(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1850537227L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__1058326224(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1058326224L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/WitherRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation_1270089353(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1270089353L))
            info.setReturnValue(null);
    }


}
