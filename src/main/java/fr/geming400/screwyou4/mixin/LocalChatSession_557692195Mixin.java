package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.chat.LocalChatSession.class)
public class LocalChatSession_557692195Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1943204453(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1943204453L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__577767781(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-577767781L))
            info.setReturnValue("Z!బᘮlD@n\"*zfGgPk8%V+lꕣ`/濌RQ$Ll떡!*/?^㽺");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_595954936(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(595954936L))
            info.setReturnValue(-2089275644);
    }

    @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/world/entity/player/ProfileKeyPair;)Lnet/minecraft/network/chat/LocalChatSession;", cancellable = true)
    private static void create__873851211(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-873851211L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sessionId()Ljava/util/UUID;", cancellable = true)
    private void sessionId_968826677(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(968826677L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "keyPair()Lnet/minecraft/world/entity/player/ProfileKeyPair;", cancellable = true)
    private void keyPair_1278451437(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1278451437L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "asRemote()Lnet/minecraft/network/chat/RemoteChatSession;", cancellable = true)
    private void asRemote_1747913178(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1747913178L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createMessageEncoder(Ljava/util/UUID;)Lnet/minecraft/network/chat/SignedMessageChain$Encoder;", cancellable = true)
    private void createMessageEncoder__212729654(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-212729654L))
            info.setReturnValue(null);
    }


}
