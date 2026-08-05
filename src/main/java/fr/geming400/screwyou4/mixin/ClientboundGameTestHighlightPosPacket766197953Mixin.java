package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ClientboundGameTestHighlightPosPacket.class)
public class ClientboundGameTestHighlightPosPacket766197953Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_922065543(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(922065543L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__142428315(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-142428315L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1536621478(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1536621478L))
            info.setReturnValue("o\uA543Z(\uFB9CrrKf>O\u910B!#jN! #+>]JA9!>-\u04A8\u80D7Yq|8C7#N|xZK-zn,DT0GB6jV");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1323550044(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1323550044L))
            info.setReturnValue(-1030939836);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_470486090(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(470486090L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ClientGamePacketListener;)V", cancellable = true)
    private void handle__825279641(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-825279641L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "absolutePos()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void absolutePos__2129383291(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2129383291L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "relativePos()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void relativePos_1301141338(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1301141338L))
            info.setReturnValue(null);
    }


}
