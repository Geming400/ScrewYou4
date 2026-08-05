package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.multiplayer.chat.ChatTrustLevel.class)
public class ChatTrustLevel_337027384Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/multiplayer/chat/ChatTrustLevel;", cancellable = true)
    private static void values_1809065502(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1809065502L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/multiplayer/chat/ChatTrustLevel;", cancellable = true)
    private static void valueOf_136455781(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(136455781L))
            info.setReturnValue(net.minecraft.client.multiplayer.chat.ChatTrustLevel.NOT_SECURE);
    }

    @Inject(at = @At("HEAD"), method = "evaluate(Lnet/minecraft/network/chat/PlayerChatMessage;Lnet/minecraft/network/chat/Component;Ljava/time/Instant;)Lnet/minecraft/client/multiplayer/chat/ChatTrustLevel;", cancellable = true)
    private static void evaluate_121888282(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(121888282L))
            info.setReturnValue(net.minecraft.client.multiplayer.chat.ChatTrustLevel.MODIFIED);
    }

    @Inject(at = @At("HEAD"), method = "createTag(Lnet/minecraft/network/chat/PlayerChatMessage;)Lnet/minecraft/client/multiplayer/chat/GuiMessageTag;", cancellable = true)
    private void createTag_1495826948(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1495826948L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isNotSecure()Z", cancellable = true)
    private void isNotSecure_1678082254(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1678082254L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedName()Ljava/lang/String;", cancellable = true)
    private void getSerializedName_425236005(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(425236005L))
            info.setReturnValue("0f2S_z1CFqR%\u9A2FH\u6BD9\u7B04u,3\u7333k,hq^\u2E16\u62A6_\uFA0E\"\u1DB0\u6363+3RPG4^$|(%\u0305");
    }


}
