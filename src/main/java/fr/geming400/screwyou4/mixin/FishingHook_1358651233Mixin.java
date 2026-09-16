package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.projectile.FishingHook.class)
public class FishingHook_1358651233Mixin {
        @Inject(at = @At("HEAD"), method = "remove(Lnet/minecraft/world/entity/Entity$RemovalReason;)V", cancellable = true)
    private void remove_198716644(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(198716644L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "retrieve(Lnet/minecraft/world/item/ItemStack;)I", cancellable = true)
    private void retrieve_226048687(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(226048687L))
            info.setReturnValue(-1231175827);
    }

    @Inject(at = @At("HEAD"), method = "setOwner(Lnet/minecraft/world/entity/Entity;)V", cancellable = true)
    private void setOwner__279820195(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-279820195L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1228967574(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1228967574L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handleEntityEvent(B)V", cancellable = true)
    private void handleEntityEvent_2112399348(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2112399348L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "shouldRenderAtSqrDistance(D)Z", cancellable = true)
    private void shouldRenderAtSqrDistance__1982074024(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1982074024L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "onClientRemoval()V", cancellable = true)
    private void onClientRemoval__604831407(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-604831407L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getAddEntityPacket(Lnet/minecraft/server/level/ServerEntity;)Lnet/minecraft/network/protocol/Packet;", cancellable = true)
    private void getAddEntityPacket_1205109790(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1205109790L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getInterpolation()Lnet/minecraft/world/entity/InterpolationHandler;", cancellable = true)
    private void getInterpolation_1098902965(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1098902965L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onSyncedDataUpdated(Lnet/minecraft/network/syncher/EntityDataAccessor;)V", cancellable = true)
    private void onSyncedDataUpdated_2065385580(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2065385580L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canUsePortal(Z)Z", cancellable = true)
    private void canUsePortal_499061188(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(499061188L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "recreateFromPacket(Lnet/minecraft/network/protocol/game/ClientboundAddEntityPacket;)V", cancellable = true)
    private void recreateFromPacket__1924655347(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1924655347L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getHookedIn()Lnet/minecraft/world/entity/Entity;", cancellable = true)
    private void getHookedIn__755781367(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-755781367L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isOpenWaterFishing()Z", cancellable = true)
    private void isOpenWaterFishing_471072592(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(471072592L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getPlayerOwner()Lnet/minecraft/world/entity/player/Player;", cancellable = true)
    private void getPlayerOwner_1832934582(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1832934582L))
            info.setReturnValue(null);
    }


}
