package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundTrackedWaypointPacket.class)
public class ClientboundTrackedWaypointPacket1046006578Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_1201874168(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1201874168L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_137380310(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(137380310L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1816430103(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1816430103L))
            info.setReturnValue("o%\u5232jn7OkWP[yQtDa\u3623wH[[FsM\u2428tx>$#\u67E2\uBE90E]zvl\"{ Wb@\u8C44cnIkj\u5718t+,\uBB63\u8CB3_;");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1603358669(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1603358669L))
            info.setReturnValue(-1151403230);
    }

    @Inject(at = @At("HEAD"), method = "apply(Lnet/minecraft/world/waypoints/TrackedWaypointManager;)V", cancellable = true)
    private void apply_1928999894(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1928999894L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle__545471016(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-545471016L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_750294715(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(750294715L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "operation()Lnet/minecraft/network/protocol/game/ClientboundTrackedWaypointPacket$Operation;", cancellable = true)
    private void operation__108217783(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-108217783L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "waypoint()Lnet/minecraft/world/waypoints/TrackedWaypoint;", cancellable = true)
    private void waypoint__656706376(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-656706376L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addWaypointPosition(Ljava/util/UUID;Lnet/minecraft/world/waypoints/Waypoint$Icon;Lnet/minecraft/core/Vec3i;)Lnet/minecraft/network/protocol/game/ClientboundTrackedWaypointPacket;", cancellable = true)
    private static void addWaypointPosition__1750914052(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1750914052L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "updateWaypointChunk(Ljava/util/UUID;Lnet/minecraft/world/waypoints/Waypoint$Icon;Lnet/minecraft/world/level/ChunkPos;)Lnet/minecraft/network/protocol/game/ClientboundTrackedWaypointPacket;", cancellable = true)
    private static void updateWaypointChunk__99332199(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-99332199L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "updateWaypointPosition(Ljava/util/UUID;Lnet/minecraft/world/waypoints/Waypoint$Icon;Lnet/minecraft/core/Vec3i;)Lnet/minecraft/network/protocol/game/ClientboundTrackedWaypointPacket;", cancellable = true)
    private static void updateWaypointPosition_2119753940(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2119753940L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addWaypointChunk(Ljava/util/UUID;Lnet/minecraft/world/waypoints/Waypoint$Icon;Lnet/minecraft/world/level/ChunkPos;)Lnet/minecraft/network/protocol/game/ClientboundTrackedWaypointPacket;", cancellable = true)
    private static void addWaypointChunk__320952463(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-320952463L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "updateWaypointAzimuth(Ljava/util/UUID;Lnet/minecraft/world/waypoints/Waypoint$Icon;F)Lnet/minecraft/network/protocol/game/ClientboundTrackedWaypointPacket;", cancellable = true)
    private static void updateWaypointAzimuth__1834258946(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1834258946L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "removeWaypoint(Ljava/util/UUID;)Lnet/minecraft/network/protocol/game/ClientboundTrackedWaypointPacket;", cancellable = true)
    private static void removeWaypoint_1837402990(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1837402990L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addWaypointAzimuth(Ljava/util/UUID;Lnet/minecraft/world/waypoints/Waypoint$Icon;F)Lnet/minecraft/network/protocol/game/ClientboundTrackedWaypointPacket;", cancellable = true)
    private static void addWaypointAzimuth_352934694(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(352934694L))
            info.setReturnValue(null);
    }


}
