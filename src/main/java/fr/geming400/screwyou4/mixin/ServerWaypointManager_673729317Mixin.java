package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.waypoints.ServerWaypointManager.class)
public class ServerWaypointManager_673729317Mixin {
        @Inject(at = @At("HEAD"), method = "untrackWaypoint(Lnet/minecraft/world/waypoints/WaypointTransmitter;)V", cancellable = true)
    private void untrackWaypoint_1088736703(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1088736703L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "untrackWaypoint(Lnet/minecraft/world/waypoints/Waypoint;)V", cancellable = true)
    private void untrackWaypoint_1313400292(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1313400292L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "trackWaypoint(Lnet/minecraft/world/waypoints/WaypointTransmitter;)V", cancellable = true)
    private void trackWaypoint__41788232(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-41788232L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "trackWaypoint(Lnet/minecraft/world/waypoints/Waypoint;)V", cancellable = true)
    private void trackWaypoint_1617885323(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1617885323L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "updatePlayer(Lnet/minecraft/server/level/ServerPlayer;)V", cancellable = true)
    private void updatePlayer__885212751(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-885212751L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "updateWaypoint(Lnet/minecraft/world/waypoints/Waypoint;)V", cancellable = true)
    private void updateWaypoint__475175987(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-475175987L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "updateWaypoint(Lnet/minecraft/world/waypoints/WaypointTransmitter;)V", cancellable = true)
    private void updateWaypoint__479218634(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-479218634L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "removePlayer(Lnet/minecraft/server/level/ServerPlayer;)V", cancellable = true)
    private void removePlayer_148218348(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(148218348L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addPlayer(Lnet/minecraft/server/level/ServerPlayer;)V", cancellable = true)
    private void addPlayer_1240612233(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1240612233L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "remakeConnections(Lnet/minecraft/world/waypoints/WaypointTransmitter;)V", cancellable = true)
    private void remakeConnections_1950828096(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1950828096L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "breakAllConnections()V", cancellable = true)
    private void breakAllConnections__1249225244(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1249225244L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "transmitters()Ljava/util/Set;", cancellable = true)
    private void transmitters__283293980(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-283293980L))
            info.setReturnValue(null);
    }


}
