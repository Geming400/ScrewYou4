package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundSectionBlocksUpdatePacket.class)
public class ClientboundSectionBlocksUpdatePacket_2116818997Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__2022280710(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2022280710L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1821107133(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1821107133L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle_525341402(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(525341402L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "runUpdates(Ljava/util/function/BiConsumer;)V", cancellable = true)
    private void runUpdates__1254937463(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1254937463L))
            info.cancel();
    }


}
