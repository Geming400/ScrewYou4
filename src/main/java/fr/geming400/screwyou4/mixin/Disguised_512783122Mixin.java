package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.chat.OutgoingChatMessage.Disguised.class)
public class Disguised_512783122Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__395843147(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-395843147L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1283206646(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1283206646L))
            info.setReturnValue("?\uD7E2J3\u9B5B>:d1\u3140_FM\u0705b:2..fRPA6)Hl\u8A4EI')__\uA1AF>+\u1DDC7\uD5E6zvsV}2U");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1070135212(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1070135212L))
            info.setReturnValue(-1665917218);
    }

    @Inject(at = @At("HEAD"), method = "content()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void content__1489829667(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1489829667L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sendToPlayer(Lnet/minecraft/server/level/ServerPlayer;ZLnet/minecraft/network/chat/ChatType$Bound;)V", cancellable = true)
    private void sendToPlayer_2099594807(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2099594807L))
            info.cancel();
    }


}
