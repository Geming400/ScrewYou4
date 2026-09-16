package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.chat.LocalChatSession.class)
public class LocalChatSession_557692195Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__350934074(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-350934074L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1328115719(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1328115719L))
            info.setReturnValue("3\u57BArc5z<4A;q4T\u3E43HF]3ff\uD744_;fHyWK#&5(7ad%^8 \uD5ED_B#I_=7U-5_`{^");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1115044285(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1115044285L))
            info.setReturnValue(1060046410);
    }

    @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/world/entity/player/ProfileKeyPair;)Lnet/minecraft/network/chat/LocalChatSession;", cancellable = true)
    private static void create_1160631353(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1160631353L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sessionId()Ljava/util/UUID;", cancellable = true)
    private void sessionId_81005318(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(81005318L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "keyPair()Lnet/minecraft/world/entity/player/ProfileKeyPair;", cancellable = true)
    private void keyPair__1362145274(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1362145274L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createMessageEncoder(Ljava/util/UUID;)Lnet/minecraft/network/chat/SignedMessageChain$Encoder;", cancellable = true)
    private void createMessageEncoder_1061844217(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1061844217L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "asRemote()Lnet/minecraft/network/chat/RemoteChatSession;", cancellable = true)
    private void asRemote_660707058(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(660707058L))
            info.setReturnValue(null);
    }


}
