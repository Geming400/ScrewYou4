package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.chat.RemoteChatSession.class)
public class RemoteChatSession1122962330Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1786492707(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1786492707L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__12497645(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-12497645L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1161225072(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1161225072L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sessionId()Ljava/util/UUID;", cancellable = true)
    private void sessionId_1534096813(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1534096813L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createMessageDecoder(Ljava/util/UUID;)Lnet/minecraft/network/chat/SignedMessageChain$Decoder;", cancellable = true)
    private void createMessageDecoder__363725030(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-363725030L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "profilePublicKey()Lnet/minecraft/world/entity/player/ProfilePublicKey;", cancellable = true)
    private void profilePublicKey_27391016(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(27391016L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasExpired()Z", cancellable = true)
    private void hasExpired_1161240913(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1161240913L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createMessageValidator(Ljava/time/Duration;)Lnet/minecraft/network/chat/SignedMessageValidator;", cancellable = true)
    private void createMessageValidator__1103573477(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1103573477L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "asData()Lnet/minecraft/network/chat/RemoteChatSession$Data;", cancellable = true)
    private void asData__695854714(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-695854714L))
            info.setReturnValue(null);
    }


}
