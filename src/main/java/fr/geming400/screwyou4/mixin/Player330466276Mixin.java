package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.multiplayer.chat.LoggedChatMessage.Player.class)
public class Player330466276Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/client/multiplayer/chat/LoggedChatEvent$Type;", cancellable = true)
    private void type_1651405058(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1651405058L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "profile()Lcom/mojang/authlib/GameProfile;", cancellable = true)
    private void profile_847634556(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(847634556L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1715978535(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1715978535L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__804993699(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-804993699L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_368729018(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(368729018L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "message()Lnet/minecraft/network/chat/PlayerChatMessage;", cancellable = true)
    private void message__1416032026(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1416032026L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toHeadingComponent()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void toHeadingComponent__1846442889(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1846442889L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toNarrationComponent()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void toNarrationComponent__1846442889(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1846442889L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toContentComponent()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void toContentComponent__1846442889(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1846442889L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "trustLevel()Lnet/minecraft/client/multiplayer/chat/ChatTrustLevel;", cancellable = true)
    private void trustLevel_1828448956(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1828448956L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canReport(Ljava/util/UUID;)Z", cancellable = true)
    private void canReport__27085969(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-27085969L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "profileId()Ljava/util/UUID;", cancellable = true)
    private void profileId_741600759(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(741600759L))
            info.setReturnValue(null);
    }


}
