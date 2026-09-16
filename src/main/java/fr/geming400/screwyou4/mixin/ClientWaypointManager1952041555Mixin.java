package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.waypoints.ClientWaypointManager.class)
public class ClientWaypointManager1952041555Mixin {
        @Inject(at = @At("HEAD"), method = "untrackWaypoint(Lnet/minecraft/world/waypoints/TrackedWaypoint;)V", cancellable = true)
    private void untrackWaypoint__1856881741(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1856881741L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "untrackWaypoint(Lnet/minecraft/world/waypoints/Waypoint;)V", cancellable = true)
    private void untrackWaypoint__1703254765(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1703254765L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "trackWaypoint(Lnet/minecraft/world/waypoints/TrackedWaypoint;)V", cancellable = true)
    private void trackWaypoint__2122830036(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2122830036L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "trackWaypoint(Lnet/minecraft/world/waypoints/Waypoint;)V", cancellable = true)
    private void trackWaypoint__1398769734(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1398769734L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "updateWaypoint(Lnet/minecraft/world/waypoints/Waypoint;)V", cancellable = true)
    private void updateWaypoint_803136252(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(803136252L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "updateWaypoint(Lnet/minecraft/world/waypoints/TrackedWaypoint;)V", cancellable = true)
    private void updateWaypoint_1648948650(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1648948650L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hasWaypoints()Z", cancellable = true)
    private void hasWaypoints_364854258(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(364854258L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "forEachWaypoint(Lnet/minecraft/world/entity/Entity;Ljava/util/function/Consumer;)V", cancellable = true)
    private void forEachWaypoint_474196940(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(474196940L))
            info.cancel();
    }


}
