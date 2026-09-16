package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.player.AvatarRenderer.class)
public class AvatarRenderer2035619142Mixin {
        @Inject(at = @At("HEAD"), method = "isEntityUpsideDown(Lnet/minecraft/world/entity/Avatar;)Z", cancellable = true)
    private void isEntityUpsideDown_277961185(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(277961185L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isEntityUpsideDown(Lnet/minecraft/world/entity/LivingEntity;)Z", cancellable = true)
    private void isEntityUpsideDown_420960110(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(420960110L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getRenderOffset(Lnet/minecraft/client/renderer/entity/state/AvatarRenderState;)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getRenderOffset_1377863035(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1377863035L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRenderOffset(Lnet/minecraft/client/renderer/entity/state/EntityRenderState;)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getRenderOffset_1648016965(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1648016965L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__286833319(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-286833319L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/AvatarRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__1779176692(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1779176692L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "renderRightHand(Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;ILnet/minecraft/resources/Identifier;Z)V", cancellable = true)
    private void renderRightHand_1476597197(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1476597197L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "renderLeftHand(Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;ILnet/minecraft/resources/Identifier;Z)V", cancellable = true)
    private void renderLeftHand__1018691242(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1018691242L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isPlayerUpsideDown(Lnet/minecraft/world/entity/player/Player;)Z", cancellable = true)
    private static void isPlayerUpsideDown__1168128175(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1168128175L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState_1473397335(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1473397335L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Avatar;Lnet/minecraft/client/renderer/entity/state/AvatarRenderState;F)V", cancellable = true)
    private void extractRenderState__667039145(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-667039145L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;F)V", cancellable = true)
    private void extractRenderState_365145655(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(365145655L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/AvatarRenderState;", cancellable = true)
    private void createRenderState_81480095(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(81480095L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState__2006177175(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2006177175L))
            info.setReturnValue(new net.minecraft.client.renderer.entity.state.EntityRenderState());
    }


}
