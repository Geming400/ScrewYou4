package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ServerboundMoveVehiclePacket.class)
public class ServerboundMoveVehiclePacket_2050339334Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_371314245(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(371314245L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__859115704(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-859115704L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_914879358(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(914879358L))
            info.setReturnValue("0?=\u8AA2FY.{XdPw<1^98\u2FBB\"pq\u9BE7BL\u23D2Y&$w|kkZ(1x:ojpq(l^}|0M\u531B1Pz*R[ORy\u553Bp(q4M*o\u5B0BZaQCX0IV=S\u5E22n");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2088602075(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2088602075L))
            info.setReturnValue(1930933482);
    }

    @Inject(at = @At("HEAD"), method = "position()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void position__1146898434(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1146898434L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ServerGamePacketListener;)V", cancellable = true)
    private void handle_181717339(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(181717339L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle__1566559050(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1566559050L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "yRot()F", cancellable = true)
    private void yRot_2088598696(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2088598696L))
            info.setReturnValue(8.914214E8F);
    }

    @Inject(at = @At("HEAD"), method = "xRot()F", cancellable = true)
    private void xRot_2088598696(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2088598696L))
            info.setReturnValue(8.914214E8F);
    }

    @Inject(at = @At("HEAD"), method = "onGround()Z", cancellable = true)
    private void onGround_2088617916(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2088617916L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "fromEntity(Lnet/minecraft/world/entity/Entity;)Lnet/minecraft/network/protocol/game/ServerboundMoveVehiclePacket;", cancellable = true)
    private static void fromEntity_2103308719(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2103308719L))
            info.setReturnValue(null);
    }


}
