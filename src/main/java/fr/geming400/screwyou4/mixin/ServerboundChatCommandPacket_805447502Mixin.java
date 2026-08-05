package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ServerboundChatCommandPacket.class)
public class ServerboundChatCommandPacket_805447502Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__873577587(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-873577587L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__2104007536(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2104007536L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__330012474(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-330012474L))
            info.setReturnValue("*㔾zQL`W85!t?䦼㗦DEw5oEA9/莂Jv|LRZe%䦛ij`6");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_843710243(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(843710243L))
            info.setReturnValue(770286127);
    }

    @Inject(at = @At("HEAD"), method = "command()Ljava/lang/String;", cancellable = true)
    private void command__330012970(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-330012970L))
            info.setReturnValue("q");
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1483516414(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1483516414L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ServerGamePacketListener;)V", cancellable = true)
    private void handle__1063174493(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1063174493L))
            info.cancel();
    }


}
