package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ServerboundClientTickEndPacket.class)
public class ServerboundClientTickEndPacket1134498898Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__544526190(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-544526190L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1774956139(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1774956139L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__961077(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-961077L))
            info.setReturnValue("2!CQD.h\uBCC5+\u080FU.HIEQ\"\u4AD1(1FD\uAE8C-z6\uBE1B\"44");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1172761640(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1172761640L))
            info.setReturnValue(143225976);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1812567811(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1812567811L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ServerGamePacketListener;)V", cancellable = true)
    private void handle__734123096(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-734123096L))
            info.cancel();
    }


}
