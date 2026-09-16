package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundTakeItemEntityPacket.class)
public class ClientboundTakeItemEntityPacket_1718996502Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_1874864091(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1874864091L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle_127518907(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(127518907L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1423284638(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1423284638L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getItemId()I", cancellable = true)
    private void getItemId_2144593911(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2144593911L))
            info.setReturnValue(1917666792);
    }

    @Inject(at = @At("HEAD"), method = "getAmount()I", cancellable = true)
    private void getAmount__185200275(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-185200275L))
            info.setReturnValue(-722216943);
    }

    @Inject(at = @At("HEAD"), method = "getPlayerId()I", cancellable = true)
    private void getPlayerId_558987753(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(558987753L))
            info.setReturnValue(-963132567);
    }


}
