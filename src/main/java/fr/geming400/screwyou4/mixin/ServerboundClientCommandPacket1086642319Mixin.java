package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ServerboundClientCommandPacket.class)
public class ServerboundClientCommandPacket1086642319Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__592382769(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-592382769L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1764711232(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1764711232L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ServerGamePacketListener;)V", cancellable = true)
    private void handle__781979675(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-781979675L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getAction()Lnet/minecraft/network/protocol/game/ServerboundClientCommandPacket$Action;", cancellable = true)
    private void getAction_990439745(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(990439745L))
            info.setReturnValue(null);
    }


}
