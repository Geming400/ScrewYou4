package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.chat.RemoteChatSession.Data.class)
public class Data1643888744Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1265566293(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1265566293L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_508428769(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(508428769L))
            info.setReturnValue("33\u35ADgC4\uFCCAo/O=Q\u5C1Bp?H6L-v'+tN0udG*{/XG#QE/RVR\u4063[fx8qr/'uW\u372BTM]vN/`$`(8MJhWAFWE_");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1682151486(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1682151486L))
            info.setReturnValue(464238063);
    }

    @Inject(at = @At("HEAD"), method = "validate(Lcom/mojang/authlib/GameProfile;Lnet/minecraft/util/SignatureValidator;)Lnet/minecraft/network/chat/RemoteChatSession;", cancellable = true)
    private void validate_986049045(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(986049045L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "write(Lnet/minecraft/network/FriendlyByteBuf;Lnet/minecraft/network/chat/RemoteChatSession$Data;)V", cancellable = true)
    private static void write__1833155962(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1833155962L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "read(Lnet/minecraft/network/FriendlyByteBuf;)Lnet/minecraft/network/chat/RemoteChatSession$Data;", cancellable = true)
    private static void read_106863896(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(106863896L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sessionId()Ljava/util/UUID;", cancellable = true)
    private void sessionId_2055023227(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2055023227L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "profilePublicKey()Lnet/minecraft/world/entity/player/ProfilePublicKey$Data;", cancellable = true)
    private void profilePublicKey_1946300478(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1946300478L))
            info.setReturnValue(null);
    }


}
