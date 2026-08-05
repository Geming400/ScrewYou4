package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.clock.ServerClockManager.class)
public class ServerClockManager933216016Mixin {
        @Inject(at = @At("HEAD"), method = "init(Lnet/minecraft/server/MinecraftServer;)V", cancellable = true)
    private void init__1619516038(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1619516038L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_971490755(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(971490755L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isAtTimeMarker(Lnet/minecraft/core/Holder;Lnet/minecraft/resources/ResourceKey;)Z", cancellable = true)
    private void isAtTimeMarker__735306020(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-735306020L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getTotalTicks(Lnet/minecraft/core/Holder;)J", cancellable = true)
    private void getTotalTicks__1815287674(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1815287674L))
            info.setReturnValue(1149032192583448169L);
    }

    @Inject(at = @At("HEAD"), method = "moveToTimeMarker(Lnet/minecraft/core/Holder;Lnet/minecraft/resources/ResourceKey;)Z", cancellable = true)
    private void moveToTimeMarker__735306020(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-735306020L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "createFullSyncPacket()Lnet/minecraft/network/protocol/game/ClientboundSetTimePacket;", cancellable = true)
    private void createFullSyncPacket_151332799(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(151332799L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "commandTimeMarkersForClock(Lnet/minecraft/core/Holder;)Ljava/util/stream/Stream;", cancellable = true)
    private void commandTimeMarkersForClock_818360916(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(818360916L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "packState()Lnet/minecraft/world/clock/PackedClockStates;", cancellable = true)
    private void packState__1207703026(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1207703026L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setPaused(Lnet/minecraft/core/Holder;Z)V", cancellable = true)
    private void setPaused_1672404958(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1672404958L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setRate(Lnet/minecraft/core/Holder;F)V", cancellable = true)
    private void setRate_1653934538(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1653934538L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addTicks(Lnet/minecraft/core/Holder;I)V", cancellable = true)
    private void addTicks_1656705101(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1656705101L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setTotalTicks(Lnet/minecraft/core/Holder;J)V", cancellable = true)
    private void setTotalTicks_1657628622(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1657628622L))
            info.cancel();
    }


}
