package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.WitherBossRenderer.class)
public class WitherBossRenderer1234004439Mixin {
        @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__1088448022(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1088448022L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/WitherRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__1643775293(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1643775293L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;F)V", cancellable = true)
    private void extractRenderState__436469048(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-436469048L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState_671782632(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(671782632L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/boss/wither/WitherBoss;Lnet/minecraft/client/renderer/entity/state/WitherRenderState;F)V", cancellable = true)
    private void extractRenderState__1820532945(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1820532945L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/WitherRenderState;", cancellable = true)
    private void createRenderState__1602622646(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1602622646L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState_1487175418(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1487175418L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.EntityRenderState());
    }


}
