package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundSetBorderSizePacket.class)
public class ClientboundSetBorderSizePacket_1077877914Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__601147175(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-601147175L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSize()D", cancellable = true)
    private void getSize_1116135354(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1116135354L))
            info.setReturnValue(2.0014570049297795E8D);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1755946826(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1755946826L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle_1275385447(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1275385447L))
            info.cancel();
    }


}
