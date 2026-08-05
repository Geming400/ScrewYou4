package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundMoveVehiclePacket.class)
public class ClientboundMoveVehiclePacket1870133890Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_191108802(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(191108802L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1039321147(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1039321147L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_734673915(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(734673915L))
            info.setReturnValue("K=[^");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1908396632(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1908396632L))
            info.setReturnValue(153231200);
    }

    @Inject(at = @At("HEAD"), method = "position()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void position__1327103877(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1327103877L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle_2067641424(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2067641424L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle__1746764493(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1746764493L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "yRot()F", cancellable = true)
    private void yRot_1908393253(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1908393253L))
            info.setReturnValue(5.063724E8F);
    }

    @Inject(at = @At("HEAD"), method = "xRot()F", cancellable = true)
    private void xRot_1908393253(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1908393253L))
            info.setReturnValue(5.063724E8F);
    }

    @Inject(at = @At("HEAD"), method = "fromEntity(Lnet/minecraft/world/entity/Entity;)Lnet/minecraft/network/protocol/game/ClientboundMoveVehiclePacket;", cancellable = true)
    private static void fromEntity__1096278364(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1096278364L))
            info.setReturnValue(null);
    }


}
