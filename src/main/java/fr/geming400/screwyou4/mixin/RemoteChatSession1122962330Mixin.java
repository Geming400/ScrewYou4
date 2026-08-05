package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.chat.RemoteChatSession.class)
public class RemoteChatSession1122962330Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_214336062(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(214336062L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1893385855(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1893385855L))
            info.setReturnValue("z?\u830FqvxM68A;\u78B1\u7019/Y\u236De:]+`+C1)m8u^}2;iDY)n'AW3Rpp}@e,y\u7F56>0AhT\u011AYo\uFB2A(\u0ABCr\u601Df=\u302D3nBwn5CDJWU\u8BA1,vsX:wQ");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1680314421(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1680314421L))
            info.setReturnValue(902572892);
    }

    @Inject(at = @At("HEAD"), method = "sessionId()Ljava/util/UUID;", cancellable = true)
    private void sessionId_646275454(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(646275454L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createMessageDecoder(Ljava/util/UUID;)Lnet/minecraft/network/chat/SignedMessageChain$Decoder;", cancellable = true)
    private void createMessageDecoder_592773921(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(592773921L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "profilePublicKey()Lnet/minecraft/world/entity/player/ProfilePublicKey;", cancellable = true)
    private void profilePublicKey__1543684939(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1543684939L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createMessageValidator(Ljava/time/Duration;)Lnet/minecraft/network/chat/SignedMessageValidator;", cancellable = true)
    private void createMessageValidator_1932461972(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1932461972L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasExpired()Z", cancellable = true)
    private void hasExpired__632817402(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-632817402L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "asData()Lnet/minecraft/network/chat/RemoteChatSession$Data;", cancellable = true)
    private void asData__2087327990(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2087327990L))
            info.setReturnValue(null);
    }


}
