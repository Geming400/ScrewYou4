package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.chat.RemoteChatSession.Data.class)
public class Data1643888744Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_735262476(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(735262476L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1880655027(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1880655027L))
            info.setReturnValue("X\uC013/%f$Zj2\uABAD`rIx");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__2093726461(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2093726461L))
            info.setReturnValue(-1608949578);
    }

    @Inject(at = @At("HEAD"), method = "validate(Lcom/mojang/authlib/GameProfile;Lnet/minecraft/util/SignatureValidator;)Lnet/minecraft/network/chat/RemoteChatSession;", cancellable = true)
    private void validate_1657576895(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1657576895L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "write(Lnet/minecraft/network/FriendlyByteBuf;Lnet/minecraft/network/chat/RemoteChatSession$Data;)V", cancellable = true)
    private static void write__273406265(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-273406265L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "read(Lnet/minecraft/network/FriendlyByteBuf;)Lnet/minecraft/network/chat/RemoteChatSession$Data;", cancellable = true)
    private static void read_1498668078(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1498668078L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sessionId()Ljava/util/UUID;", cancellable = true)
    private void sessionId_1167201868(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1167201868L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "profilePublicKey()Lnet/minecraft/world/entity/player/ProfilePublicKey$Data;", cancellable = true)
    private void profilePublicKey__535873583(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-535873583L))
            info.setReturnValue(null);
    }


}
