package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.chat.OutgoingChatMessage.Player.class)
public class Player1876066996Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_967440728(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(967440728L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1648476775(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1648476775L))
            info.setReturnValue("c9f0f[#p--/dG");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1861548209(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1861548209L))
            info.setReturnValue(983967667);
    }

    @Inject(at = @At("HEAD"), method = "message()Lnet/minecraft/network/chat/PlayerChatMessage;", cancellable = true)
    private void message_1756487677(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1756487677L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "content()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void content__126545792(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-126545792L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sendToPlayer(Lnet/minecraft/server/level/ServerPlayer;ZLnet/minecraft/network/chat/ChatType$Bound;)V", cancellable = true)
    private void sendToPlayer__832088614(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-832088614L))
            info.cancel();
    }


}
