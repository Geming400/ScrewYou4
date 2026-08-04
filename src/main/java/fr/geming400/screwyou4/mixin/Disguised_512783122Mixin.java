package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.chat.OutgoingChatMessage.Disguised.class)
public class Disguised_512783122Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1898295380(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1898295380L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__622676854(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-622676854L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_551045863(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(551045863L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "content()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void content__1664126044(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1664126044L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sendToPlayer(Lnet/minecraft/server/level/ServerPlayer;ZLnet/minecraft/network/chat/ChatType$Bound;)V", cancellable = true)
    private void sendToPlayer__1425161645(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1425161645L))
            info.cancel();
    }


}
