package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.projectile.FishingHook.class)
public class FishingHook_1358651233Mixin {
        @Inject(at = @At("HEAD"), method = "remove(Lnet/minecraft/world/entity/Entity$RemovalReason;)V", cancellable = true)
    private void remove__1661255840(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1661255840L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "retrieve(Lnet/minecraft/world/item/ItemStack;)I", cancellable = true)
    private void retrieve__1201797269(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1201797269L))
            info.setReturnValue(710421217);
    }

    @Inject(at = @At("HEAD"), method = "setOwner(Lnet/minecraft/world/entity/Entity;)V", cancellable = true)
    private void setOwner_906926572(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(906926572L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1396925971(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1396925971L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "shouldRenderAtSqrDistance(D)Z", cancellable = true)
    private void shouldRenderAtSqrDistance__1727012853(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1727012853L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getInterpolation()Lnet/minecraft/world/entity/InterpolationHandler;", cancellable = true)
    private void getInterpolation__2079880477(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2079880477L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canUsePortal(Z)Z", cancellable = true)
    private void canUsePortal__1706695391(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1706695391L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "handleEntityEvent(B)V", cancellable = true)
    private void handleEntityEvent__1728863739(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1728863739L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onSyncedDataUpdated(Lnet/minecraft/network/syncher/EntityDataAccessor;)V", cancellable = true)
    private void onSyncedDataUpdated__1290566620(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1290566620L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getAddEntityPacket(Lnet/minecraft/server/level/ServerEntity;)Lnet/minecraft/network/protocol/Packet;", cancellable = true)
    private void getAddEntityPacket_1738678216(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1738678216L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "recreateFromPacket(Lnet/minecraft/network/protocol/game/ClientboundAddEntityPacket;)V", cancellable = true)
    private void recreateFromPacket_169862542(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(169862542L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onClientRemoval()V", cancellable = true)
    private void onClientRemoval_1396925971(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1396925971L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getPlayerOwner()Lnet/minecraft/world/entity/player/Player;", cancellable = true)
    private void getPlayerOwner_311564954(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(311564954L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isOpenWaterFishing()Z", cancellable = true)
    private void isOpenWaterFishing_1396929815(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1396929815L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getHookedIn()Lnet/minecraft/world/entity/Entity;", cancellable = true)
    private void getHookedIn__1107427610(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1107427610L))
            info.setReturnValue(null);
    }


}
