package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ServerboundChatPacket.class)
public class ServerboundChatPacket2095185629Mixin {
        @Inject(at = @At("HEAD"), method = "signature()Lnet/minecraft/network/chat/MessageSignature;", cancellable = true)
    private void signature_850700846(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(850700846L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type_416160541(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(416160541L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__814269408(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-814269408L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_959725654(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(959725654L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2133448371(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2133448371L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "message()Ljava/lang/String;", cancellable = true)
    private void message_959725158(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(959725158L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle__1521712754(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1521712754L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ServerGamePacketListener;)V", cancellable = true)
    private void handle_226563635(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(226563635L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "salt()J", cancellable = true)
    private void salt_2133448836(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2133448836L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "timeStamp()Ljava/time/Instant;", cancellable = true)
    private void timeStamp__1102547467(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1102547467L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "lastSeenMessages()Lnet/minecraft/network/chat/LastSeenMessages$Update;", cancellable = true)
    private void lastSeenMessages_594614909(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(594614909L))
            info.setReturnValue(null);
    }


}
