package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.waypoints.ClientWaypointManager.class)
public class ClientWaypointManager1952041555Mixin {
        @Inject(at = @At("HEAD"), method = "updateWaypoint(Lnet/minecraft/world/waypoints/TrackedWaypoint;)V", cancellable = true)
    private void updateWaypoint_1430481600(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1430481600L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "updateWaypoint(Lnet/minecraft/world/waypoints/Waypoint;)V", cancellable = true)
    private void updateWaypoint__1339532634(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1339532634L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hasWaypoints()Z", cancellable = true)
    private void hasWaypoints_1990320138(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1990320138L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "forEachWaypoint(Lnet/minecraft/world/entity/Entity;Ljava/util/function/Consumer;)V", cancellable = true)
    private void forEachWaypoint_177499511(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(177499511L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "untrackWaypoint(Lnet/minecraft/world/waypoints/TrackedWaypoint;)V", cancellable = true)
    private void untrackWaypoint_1430481600(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1430481600L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "untrackWaypoint(Lnet/minecraft/world/waypoints/Waypoint;)V", cancellable = true)
    private void untrackWaypoint__1339532634(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1339532634L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "trackWaypoint(Lnet/minecraft/world/waypoints/Waypoint;)V", cancellable = true)
    private void trackWaypoint__1339532634(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1339532634L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "trackWaypoint(Lnet/minecraft/world/waypoints/TrackedWaypoint;)V", cancellable = true)
    private void trackWaypoint_1430481600(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1430481600L))
            info.cancel();
    }


}
