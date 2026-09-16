package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ServerboundSelectTradePacket.class)
public class ServerboundSelectTradePacket646163607Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_802031197(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(802031197L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_350451744(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(350451744L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ServerGamePacketListener;)V", cancellable = true)
    private void handle_1283523781(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1283523781L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getItem()I", cancellable = true)
    private void getItem__1557631852(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1557631852L))
            info.setReturnValue(709017182);
    }


}
