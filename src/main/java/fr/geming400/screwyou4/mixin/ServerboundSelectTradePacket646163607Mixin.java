package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ServerboundSelectTradePacket.class)
public class ServerboundSelectTradePacket646163607Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__1032861481(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1032861481L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1324232520(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1324232520L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ServerGamePacketListener;)V", cancellable = true)
    private void handle__1222458387(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1222458387L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getItem()I", cancellable = true)
    private void getItem_684425853(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(684425853L))
            info.setReturnValue(null);
    }


}
