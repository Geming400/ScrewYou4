package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.clock.ServerClockManager.class)
public class ServerClockManager933216016Mixin {
        @Inject(at = @At("HEAD"), method = "init(Lnet/minecraft/server/MinecraftServer;)V", cancellable = true)
    private void init_1056978538(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1056978538L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_803532358(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(803532358L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createFullSyncPacket()Lnet/minecraft/network/protocol/game/ClientboundSetTimePacket;", cancellable = true)
    private void createFullSyncPacket_1884568397(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1884568397L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setTotalTicks(Lnet/minecraft/core/Holder;J)V", cancellable = true)
    private void setTotalTicks_1660822202(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1660822202L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addTicks(Lnet/minecraft/core/Holder;I)V", cancellable = true)
    private void addTicks__1664911208(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1664911208L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setPaused(Lnet/minecraft/core/Holder;Z)V", cancellable = true)
    private void setPaused_59291054(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(59291054L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setRate(Lnet/minecraft/core/Holder;F)V", cancellable = true)
    private void setRate__78765656(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-78765656L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getTotalTicks(Lnet/minecraft/core/Holder;)J", cancellable = true)
    private void getTotalTicks__1495662066(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1495662066L))
            info.setReturnValue(-1711959583096747423L);
    }

    @Inject(at = @At("HEAD"), method = "moveToTimeMarker(Lnet/minecraft/core/Holder;Lnet/minecraft/resources/ResourceKey;)Z", cancellable = true)
    private void moveToTimeMarker__2115682807(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2115682807L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "commandTimeMarkersForClock(Lnet/minecraft/core/Holder;)Ljava/util/stream/Stream;", cancellable = true)
    private void commandTimeMarkersForClock_1403376602(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1403376602L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isAtTimeMarker(Lnet/minecraft/core/Holder;Lnet/minecraft/resources/ResourceKey;)Z", cancellable = true)
    private void isAtTimeMarker__1280701160(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1280701160L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "packState()Lnet/minecraft/world/clock/PackedClockStates;", cancellable = true)
    private void packState_581181206(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(581181206L))
            info.setReturnValue(null);
    }


}
