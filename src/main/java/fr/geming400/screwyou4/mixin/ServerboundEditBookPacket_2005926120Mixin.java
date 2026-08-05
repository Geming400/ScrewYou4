package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ServerboundEditBookPacket.class)
public class ServerboundEditBookPacket_2005926120Mixin {
        @Inject(at = @At("HEAD"), method = "slot()I", cancellable = true)
    private void slot_2044188365(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2044188365L))
            info.setReturnValue(-1166366821);
    }

    @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_326901031(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(326901031L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__903528918(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-903528918L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_870466144(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(870466144L))
            info.setReturnValue("xb jt\u924C?|rc\u825EdZ \u69017?$Z\u4217]\uCEF5\u76AD \u65D7\u430B_scS\uB066K{&8MK,dp\uBAD1bL3Y]XdOHr\u9770cf|\uAA0B|n'(<=(v$2LR2l_>byBtEY7A");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2044188861(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2044188861L))
            info.setReturnValue(231041184);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ServerGamePacketListener;)V", cancellable = true)
    private void handle_137304125(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(137304125L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle__1610972264(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1610972264L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "title()Ljava/util/Optional;", cancellable = true)
    private void title__2043579755(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2043579755L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pages()Ljava/util/List;", cancellable = true)
    private void pages__662704361(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-662704361L))
            info.setReturnValue(null);
    }


}
