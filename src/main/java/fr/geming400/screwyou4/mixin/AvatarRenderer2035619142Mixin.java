package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.entity.player.AvatarRenderer.class)
public class AvatarRenderer2035619142Mixin {
        @Inject(at = @At("HEAD"), method = "getRenderOffset(Lnet/minecraft/client/renderer/entity/state/EntityRenderState;)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getRenderOffset_1968152228(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1968152228L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRenderOffset(Lnet/minecraft/client/renderer/entity/state/AvatarRenderState;)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getRenderOffset_1697998298(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1697998298L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isEntityUpsideDown(Lnet/minecraft/world/entity/LivingEntity;)Z", cancellable = true)
    private void isEntityUpsideDown__1937552019(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1937552019L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isEntityUpsideDown(Lnet/minecraft/world/entity/Avatar;)Z", cancellable = true)
    private void isEntityUpsideDown_699497248(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(699497248L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/AvatarRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation_1134687954(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1134687954L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTextureLocation(Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getTextureLocation__256711521(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-256711521L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "renderRightHand(Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;ILnet/minecraft/resources/Identifier;Z)V", cancellable = true)
    private void renderRightHand__828330590(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-828330590L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "renderLeftHand(Lcom/mojang/blaze3d/vertex/PoseStack;Lnet/minecraft/client/renderer/SubmitNodeCollector;ILnet/minecraft/resources/Identifier;Z)V", cancellable = true)
    private void renderLeftHand__828330590(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-828330590L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/client/renderer/entity/state/EntityRenderState;F)V", cancellable = true)
    private void extractRenderState__2032229135(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2032229135L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/Avatar;Lnet/minecraft/client/renderer/entity/state/AvatarRenderState;F)V", cancellable = true)
    private void extractRenderState_122301681(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(122301681L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/client/renderer/entity/state/LivingEntityRenderState;F)V", cancellable = true)
    private void extractRenderState__1239483951(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1239483951L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/AvatarRenderState;", cancellable = true)
    private void createRenderState__760327328(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-760327328L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createRenderState()Lnet/minecraft/client/renderer/entity/state/EntityRenderState;", cancellable = true)
    private void createRenderState_1446982698(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1446982698L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isPlayerUpsideDown(Lnet/minecraft/world/entity/player/Player;)Z", cancellable = true)
    private static void isPlayerUpsideDown__1318742416(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1318742416L))
            info.setReturnValue(null);
    }


}
