package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.chat.OutgoingChatMessage.Player.class)
public class Player1876066996Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1033388041(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1033388041L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_740607021(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(740607021L))
            info.setReturnValue("1DeMy%g.0,y.XlrR\uC041Ox[P.QGH9S\u2512d*\"\uACB9\uD441/}29P|?%I/$%Id S\u9678t\u3571HX");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1914329738(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1914329738L))
            info.setReturnValue(1356088529);
    }

    @Inject(at = @At("HEAD"), method = "message()Lnet/minecraft/network/chat/PlayerChatMessage;", cancellable = true)
    private void message_129568694(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(129568694L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "content()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void content__300842169(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-300842169L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sendToPlayer(Lnet/minecraft/server/level/ServerPlayer;ZLnet/minecraft/network/chat/ChatType$Bound;)V", cancellable = true)
    private void sendToPlayer__61877770(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-61877770L))
            info.cancel();
    }


}
