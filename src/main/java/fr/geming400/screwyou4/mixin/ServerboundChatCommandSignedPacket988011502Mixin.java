package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ServerboundChatCommandSignedPacket.class)
public class ServerboundChatCommandSignedPacket988011502Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_1143879092(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1143879092L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_79385234(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(79385234L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1758435027(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1758435027L))
            info.setReturnValue("G{+");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1545363593(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1545363593L))
            info.setReturnValue(-197077934);
    }

    @Inject(at = @At("HEAD"), method = "command()Ljava/lang/String;", cancellable = true)
    private void command__417161086(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-417161086L))
            info.setReturnValue("\u589D/.z\uD20C,E#\u57C8d\"0|$'H\uAC1C?58|;<LbE\u9C04P+m ,Mza1}HsTz@XAC#H\uAE5BqO5gq");
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ServerGamePacketListener;)V", cancellable = true)
    private void handle_1625371676(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1625371676L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_692299639(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(692299639L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "salt()J", cancellable = true)
    private void salt_1263450879(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1263450879L))
            info.setReturnValue(-7809655291402349909L);
    }

    @Inject(at = @At("HEAD"), method = "timeStamp()Ljava/time/Instant;", cancellable = true)
    private void timeStamp__1530632880(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1530632880L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "lastSeenMessages()Lnet/minecraft/network/chat/LastSeenMessages$Update;", cancellable = true)
    private void lastSeenMessages_2073803563(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2073803563L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "argumentSignatures()Lnet/minecraft/commands/arguments/ArgumentSignatures;", cancellable = true)
    private void argumentSignatures_168391830(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(168391830L))
            info.setReturnValue(null);
    }


}
