package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.multiplayer.chat.LoggedChatMessage.Player.class)
public class Player330466276Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/client/multiplayer/chat/LoggedChatEvent$Type;", cancellable = true)
    private void type_1141780540(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1141780540L))
            info.setReturnValue(net.minecraft.client.multiplayer.chat.LoggedChatEvent.Type.SYSTEM);
    }

    @Inject(at = @At("HEAD"), method = "profile()Lcom/mojang/authlib/GameProfile;", cancellable = true)
    private void profile__1156675163(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1156675163L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__578159992(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-578159992L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1100889801(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1100889801L))
            info.setReturnValue("Q\u2AC4)3#>J@:3\u5579R\uD1ADxiS-3,\u8863\"-G*'\u0D12w'qH\uA033!9H|>6RS^xP\u71160@J");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_887818367(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(887818367L))
            info.setReturnValue(-1690643884);
    }

    @Inject(at = @At("HEAD"), method = "message()Lnet/minecraft/network/chat/PlayerChatMessage;", cancellable = true)
    private void message_210886957(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(210886957L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "profileId()Ljava/util/UUID;", cancellable = true)
    private void profileId_686162075(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(686162075L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "trustLevel()Lnet/minecraft/client/multiplayer/chat/ChatTrustLevel;", cancellable = true)
    private void trustLevel_223619016(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(223619016L))
            info.setReturnValue(net.minecraft.client.multiplayer.chat.ChatTrustLevel.MODIFIED);
    }

    @Inject(at = @At("HEAD"), method = "canReport(Ljava/util/UUID;)Z", cancellable = true)
    private void canReport__1854772021(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1854772021L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toNarrationComponent()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void toNarrationComponent__443374003(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-443374003L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toContentComponent()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void toContentComponent__1951225130(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1951225130L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toHeadingComponent()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void toHeadingComponent_1139957421(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1139957421L))
            info.setReturnValue(null);
    }


}
