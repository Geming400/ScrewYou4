package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.StriderRenderer.class)
public class StriderRenderer1249490382Mixin {
        @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__1042840281(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1042840281L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/StriderRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__683924914(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-683924914L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState_1476609401(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1476609401L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;F)V", cancellable = true)
    private void extractRenderState__2025612711(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2025612711L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/monster/Strider;Lnet/minecraft/client/renderer/entity/state/StriderRenderState;F)V", cancellable = true)
    private void extractRenderState__881551786(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-881551786L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/StriderRenderState;", cancellable = true)
    private void createRenderState__1495617054(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1495617054L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.StriderRenderState());
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState_660853938(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(660853938L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.EntityRenderState());
    }


}
