package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ServerboundMoveVehiclePacket.class)
public class ServerboundMoveVehiclePacket_2050339334Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__2088760373(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2088760373L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1141713065(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1141713065L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1474204438(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1474204438L))
            info.setReturnValue("Oi4^j\u27C0Ee-_+ZX'lZZ\u1F84w/W8_sh)\uC63FmNAXL*\u8FD2F^L{ @<kr<a^SJkXFC\u15A7]\u8C6C=%kFg");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1687275872(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1687275872L))
            info.setReturnValue(1937401687);
    }

    @Inject(at = @At("HEAD"), method = "position()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void position__1667070411(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1667070411L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ServerGamePacketListener;)V", cancellable = true)
    private void handle__1607267789(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1607267789L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1754627470(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1754627470L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onGround()Z", cancellable = true)
    private void onGround_1928090422(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1928090422L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "yRot()F", cancellable = true)
    private void yRot__1933824822(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1933824822L))
            info.setReturnValue(3.01476E7F);
    }

    @Inject(at = @At("HEAD"), method = "xRot()F", cancellable = true)
    private void xRot__126370359(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-126370359L))
            info.setReturnValue(3.01476E7F);
    }

    @Inject(at = @At("HEAD"), method = "fromEntity(Lnet/minecraft/world/entity/Entity;)Lnet/minecraft/network/protocol/game/ServerboundMoveVehiclePacket;", cancellable = true)
    private static void fromEntity__483250142(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-483250142L))
            info.setReturnValue(null);
    }


}
