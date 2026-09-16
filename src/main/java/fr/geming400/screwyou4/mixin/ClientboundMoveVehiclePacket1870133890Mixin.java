package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundMoveVehiclePacket.class)
public class ClientboundMoveVehiclePacket1870133890Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_2026001480(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2026001480L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_961507622(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(961507622L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1654409881(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1654409881L))
            info.setReturnValue("5t?bW|9*Poh\uF9FF(;0P\u20E8B>,a}*f.j!1\u92C8Su\uBC5E&c\u4869 /b53JO\u5A30\u54F3Ge$=8W&_/#\u046A+p\uBC2B:@h/:?]0a");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1867481315(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1867481315L))
            info.setReturnValue(1938393055);
    }

    @Inject(at = @At("HEAD"), method = "position()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void position__1847275854(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1847275854L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle_278656296(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(278656296L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1574422027(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1574422027L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "xRot()F", cancellable = true)
    private void xRot__306575802(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-306575802L))
            info.setReturnValue(1.668806E8F);
    }

    @Inject(at = @At("HEAD"), method = "yRot()F", cancellable = true)
    private void yRot__2114030265(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2114030265L))
            info.setReturnValue(1.668806E8F);
    }

    @Inject(at = @At("HEAD"), method = "fromEntity(Lnet/minecraft/world/entity/Entity;)Lnet/minecraft/network/protocol/game/ClientboundMoveVehiclePacket;", cancellable = true)
    private static void fromEntity_612130071(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(612130071L))
            info.setReturnValue(null);
    }


}
