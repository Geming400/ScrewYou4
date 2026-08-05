package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.waypoints.ServerWaypointManager.class)
public class ServerWaypointManager_673729317Mixin {
        @Inject(at = @At("HEAD"), method = "addPlayer(Lnet/minecraft/server/level/ServerPlayer;)V", cancellable = true)
    private void addPlayer__95832537(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-95832537L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "untrackWaypoint(Lnet/minecraft/world/waypoints/WaypointTransmitter;)V", cancellable = true)
    private void untrackWaypoint_995995212(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(995995212L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "untrackWaypoint(Lnet/minecraft/world/waypoints/Waypoint;)V", cancellable = true)
    private void untrackWaypoint_1677122423(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1677122423L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "updateWaypoint(Lnet/minecraft/world/waypoints/Waypoint;)V", cancellable = true)
    private void updateWaypoint_1677122423(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1677122423L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "updateWaypoint(Lnet/minecraft/world/waypoints/WaypointTransmitter;)V", cancellable = true)
    private void updateWaypoint_995995212(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(995995212L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "updatePlayer(Lnet/minecraft/server/level/ServerPlayer;)V", cancellable = true)
    private void updatePlayer__95832537(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-95832537L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "trackWaypoint(Lnet/minecraft/world/waypoints/WaypointTransmitter;)V", cancellable = true)
    private void trackWaypoint_995995212(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(995995212L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "trackWaypoint(Lnet/minecraft/world/waypoints/Waypoint;)V", cancellable = true)
    private void trackWaypoint_1677122423(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1677122423L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "remakeConnections(Lnet/minecraft/world/waypoints/WaypointTransmitter;)V", cancellable = true)
    private void remakeConnections_995995212(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(995995212L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "removePlayer(Lnet/minecraft/server/level/ServerPlayer;)V", cancellable = true)
    private void removePlayer__95832537(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-95832537L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "transmitters()Ljava/util/Set;", cancellable = true)
    private void transmitters__1155306170(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1155306170L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "breakAllConnections()V", cancellable = true)
    private void breakAllConnections_712004055(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(712004055L))
            info.cancel();
    }


}
