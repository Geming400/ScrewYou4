package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundTrackedWaypointPacket.class)
public class ClientboundTrackedWaypointPacket1046006578Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__633018510(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-633018510L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1863448459(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1863448459L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__89453397(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-89453397L))
            info.setReturnValue("\u18B7\uC8F9ld\uD3E0Bsx7X*\uB9F9a\u0E30y\uBF9D");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1084269320(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1084269320L))
            info.setReturnValue(-1570179702);
    }

    @Inject(at = @At("HEAD"), method = "apply(Lnet/minecraft/world/waypoints/TrackedWaypointManager;)V", cancellable = true)
    private void apply__1531825148(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1531825148L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle_1243514112(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1243514112L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1724075491(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1724075491L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "operation()Lnet/minecraft/network/protocol/game/ClientboundTrackedWaypointPacket$Operation;", cancellable = true)
    private void operation_1077302882(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1077302882L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "waypoint()Lnet/minecraft/world/waypoints/TrackedWaypoint;", cancellable = true)
    private void waypoint_1301340761(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1301340761L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "updateWaypointAzimuth(Ljava/util/UUID;Lnet/minecraft/world/waypoints/Waypoint$Icon;F)Lnet/minecraft/network/protocol/game/ClientboundTrackedWaypointPacket;", cancellable = true)
    private static void updateWaypointAzimuth_1866840540(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1866840540L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addWaypointChunk(Ljava/util/UUID;Lnet/minecraft/world/waypoints/Waypoint$Icon;Lnet/minecraft/world/level/ChunkPos;)Lnet/minecraft/network/protocol/game/ClientboundTrackedWaypointPacket;", cancellable = true)
    private static void addWaypointChunk__535408612(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-535408612L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "updateWaypointChunk(Ljava/util/UUID;Lnet/minecraft/world/waypoints/Waypoint$Icon;Lnet/minecraft/world/level/ChunkPos;)Lnet/minecraft/network/protocol/game/ClientboundTrackedWaypointPacket;", cancellable = true)
    private static void updateWaypointChunk__535408612(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-535408612L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addWaypointAzimuth(Ljava/util/UUID;Lnet/minecraft/world/waypoints/Waypoint$Icon;F)Lnet/minecraft/network/protocol/game/ClientboundTrackedWaypointPacket;", cancellable = true)
    private static void addWaypointAzimuth_1866840540(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1866840540L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "removeWaypoint(Ljava/util/UUID;)Lnet/minecraft/network/protocol/game/ClientboundTrackedWaypointPacket;", cancellable = true)
    private static void removeWaypoint_313181961(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(313181961L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addWaypointPosition(Ljava/util/UUID;Lnet/minecraft/world/waypoints/Waypoint$Icon;Lnet/minecraft/core/Vec3i;)Lnet/minecraft/network/protocol/game/ClientboundTrackedWaypointPacket;", cancellable = true)
    private static void addWaypointPosition_339672487(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(339672487L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "updateWaypointPosition(Ljava/util/UUID;Lnet/minecraft/world/waypoints/Waypoint$Icon;Lnet/minecraft/core/Vec3i;)Lnet/minecraft/network/protocol/game/ClientboundTrackedWaypointPacket;", cancellable = true)
    private static void updateWaypointPosition_339672487(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(339672487L))
            info.setReturnValue(null);
    }


}
