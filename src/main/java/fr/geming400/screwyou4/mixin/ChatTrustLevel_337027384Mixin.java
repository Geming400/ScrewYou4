package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.multiplayer.chat.ChatTrustLevel.class)
public class ChatTrustLevel_337027384Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/multiplayer/chat/ChatTrustLevel;", cancellable = true)
    private static void values__308354944(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-308354944L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/multiplayer/chat/ChatTrustLevel;", cancellable = true)
    private static void valueOf_596959037(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(596959037L))
            info.setReturnValue(net.minecraft.client.multiplayer.chat.ChatTrustLevel.MODIFIED);
    }

    @Inject(at = @At("HEAD"), method = "evaluate(Lnet/minecraft/network/chat/PlayerChatMessage;Lnet/minecraft/network/chat/Component;Ljava/time/Instant;)Lnet/minecraft/client/multiplayer/chat/ChatTrustLevel;", cancellable = true)
    private static void evaluate__1382661229(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1382661229L))
            info.setReturnValue(net.minecraft.client.multiplayer.chat.ChatTrustLevel.MODIFIED);
    }

    @Inject(at = @At("HEAD"), method = "createTag(Lnet/minecraft/network/chat/PlayerChatMessage;)Lnet/minecraft/client/multiplayer/chat/GuiMessageTag;", cancellable = true)
    private void createTag_2128300226(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2128300226L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isNotSecure()Z", cancellable = true)
    private void isNotSecure_375305966(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(375305966L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName__798433088(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-798433088L))
            info.setReturnValue("(Z\u5477dufP4AL\u8690Q\uCA4DWoVG'>+J3\u7D0Cw(IX[q");
    }


}
