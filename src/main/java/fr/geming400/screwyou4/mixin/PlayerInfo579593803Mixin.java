package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.multiplayer.PlayerInfo.class)
public class PlayerInfo579593803Mixin {
        @Inject(at = @At("HEAD"), method = "getTeam()Lnet/minecraft/world/scores/PlayerTeam;", cancellable = true)
    private void getTeam__621293900(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-621293900L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getProfile()Lcom/mojang/authlib/GameProfile;", cancellable = true)
    private void getProfile_1096762083(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1096762083L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getLatency()I", cancellable = true)
    private void getLatency_617856049(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(617856049L))
            info.setReturnValue(-852173020);
    }

    @Inject(at = @At("HEAD"), method = "getGameMode()Lnet/minecraft/world/level/GameType;", cancellable = true)
    private void getGameMode__815852495(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-815852495L))
            info.setReturnValue(net.minecraft.world.level.GameType.SPECTATOR);
    }

    @Inject(at = @At("HEAD"), method = "setShowHat(Z)V", cancellable = true)
    private void setShowHat_1809210632(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1809210632L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getSkin()Lnet/minecraft/world/entity/player/PlayerSkin;", cancellable = true)
    private void getSkin__1072726456(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1072726456L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "showHat()Z", cancellable = true)
    private void showHat_617872386(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(617872386L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getTabListOrder()I", cancellable = true)
    private void getTabListOrder_617856049(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(617856049L))
            info.setReturnValue(-852173020);
    }

    @Inject(at = @At("HEAD"), method = "getTabListDisplayName()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getTabListDisplayName__1597315362(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1597315362L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getChatSession()Lnet/minecraft/network/chat/RemoteChatSession;", cancellable = true)
    private void getChatSession_1769814787(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1769814787L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasVerifiableChat()Z", cancellable = true)
    private void hasVerifiableChat_617872386(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(617872386L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getMessageValidator()Lnet/minecraft/network/chat/SignedMessageValidator;", cancellable = true)
    private void getMessageValidator_940202310(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(940202310L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setTabListOrder(I)V", cancellable = true)
    private void setTabListOrder_1793510775(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1793510775L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setTabListDisplayName(Lnet/minecraft/network/chat/Component;)V", cancellable = true)
    private void setTabListDisplayName__1321585134(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1321585134L))
            info.cancel();
    }


}
