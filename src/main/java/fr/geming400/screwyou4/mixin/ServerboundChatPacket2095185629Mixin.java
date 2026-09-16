package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.protocol.game.ServerboundChatPacket.class)
public class ServerboundChatPacket2095185629Mixin {
        @Inject(at = @At("HEAD"), method = "signature()Lnet/minecraft/network/chat/MessageSignature;", cancellable = true)
    private void signature_1827240054(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1827240054L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/network/protocol/PacketType;", cancellable = true)
    private void type__2043914077(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2043914077L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1186559361(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1186559361L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1429358142(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1429358142L))
            info.setReturnValue("7),?009Owqq\u5DA7W;!MtynK&g\u44E2Qu\u91A4kk\uD7B1LMf&q\"GT+RhKq4U!AF,S[qYtL[AWW1}'Rf'6qAgC<})P-!^'0{EyQ,i+\u3EAAT\"LIl.J");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1642429576(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1642429576L))
            info.setReturnValue(-1881553011);
    }

    @Inject(at = @At("HEAD"), method = "message()Ljava/lang/String;", cancellable = true)
    private void message_658140973(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(658140973L))
            info.setReturnValue("9O\uB2E9Mh4NdM0;\uAF14\uD046fGs\u2632y\u9A5C, k\u7B61f\u91C8BQA{4OZGH3\uC4D0\u0EAB\u7B9ERnsYBTr+%Y3WIrI\u12DF S!I\u9CB9#");
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/PacketListener;)V", cancellable = true)
    private void handle_1799473766(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1799473766L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "handle(Lnet/minecraft/network/protocol/game/ServerGamePacketListener;)V", cancellable = true)
    private void handle__1562421493(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1562421493L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "salt()J", cancellable = true)
    private void salt__1924342290(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1924342290L))
            info.setReturnValue(1844513722018032337L);
    }

    @Inject(at = @At("HEAD"), method = "lastSeenMessages()Lnet/minecraft/network/chat/LastSeenMessages$Update;", cancellable = true)
    private void lastSeenMessages__1113989606(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1113989606L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "timeStamp()Ljava/time/Instant;", cancellable = true)
    private void timeStamp__423458753(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-423458753L))
            info.setReturnValue(null);
    }


}
