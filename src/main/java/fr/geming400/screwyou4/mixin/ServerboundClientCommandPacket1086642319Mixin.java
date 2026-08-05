package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ServerboundClientCommandPacket.class)
public class ServerboundClientCommandPacket1086642319Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_1242509909(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1242509909L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_790930456(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(790930456L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ServerGamePacketListener;)V", cancellable = true)
    private void handle_1724002493(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1724002493L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getAction()Lnet/minecraft/network/protocol/game/ServerboundClientCommandPacket$Action;", cancellable = true)
    private void getAction_1055500949(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1055500949L))
            info.setReturnValue(net.minecraft.network.protocol.game.ServerboundClientCommandPacket.Action.PERFORM_RESPAWN);
    }


}
