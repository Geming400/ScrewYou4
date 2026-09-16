package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ServerboundChatAckPacket.class)
public class ServerboundChatAckPacket_1569366416Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_1725234005(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1725234005L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_660740147(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(660740147L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1955177356(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1955177356L))
            info.setReturnValue("RiV*:m`Y:0r\uBD95QD;#gMtS)\uAC8DFL&2Qg4\u92C42OsFih!f}P(hKX_/\u7BC7z Lx`\uB61FkE\u06D0<m;8$O\u9C331{\u47B3\uC96E_(+fc");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2126718506(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2126718506L))
            info.setReturnValue(-184507840);
    }

    @Inject(at = @At("HEAD"), method = "offset()I", cancellable = true)
    private void offset__1502480702(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1502480702L))
            info.setReturnValue(-851751191);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1273654552(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1273654552L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ServerGamePacketListener;)V", cancellable = true)
    private void handle__2088240707(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2088240707L))
            info.cancel();
    }


}
