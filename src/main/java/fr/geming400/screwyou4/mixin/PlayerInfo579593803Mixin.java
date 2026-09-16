package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.multiplayer.PlayerInfo.class)
public class PlayerInfo579593803Mixin {
        @Inject(at = @At("HEAD"), method = "getLatency()I", cancellable = true)
    private void getLatency_1173057641(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1173057641L))
            info.setReturnValue(-1757527330);
    }

    @Inject(at = @At("HEAD"), method = "getMessageValidator()Lnet/minecraft/network/chat/SignedMessageValidator;", cancellable = true)
    private void getMessageValidator__1435029083(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1435029083L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setTabListOrder(I)V", cancellable = true)
    private void setTabListOrder_882068084(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(882068084L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setTabListDisplayName(Lnet/minecraft/network/chat/Component;)V", cancellable = true)
    private void setTabListDisplayName_72723958(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(72723958L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getTeam()Lnet/minecraft/world/scores/PlayerTeam;", cancellable = true)
    private void getTeam_1697037825(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1697037825L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getProfile()Lcom/mojang/authlib/GameProfile;", cancellable = true)
    private void getProfile_358648534(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(358648534L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTabListDisplayName()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getTabListDisplayName_259305326(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(259305326L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTabListOrder()I", cancellable = true)
    private void getTabListOrder_1337925408(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1337925408L))
            info.setReturnValue(-881551388);
    }

    @Inject(at = @At("HEAD"), method = "getChatSession()Lnet/minecraft/network/chat/RemoteChatSession;", cancellable = true)
    private void getChatSession__1115517973(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1115517973L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getGameMode()Lnet/minecraft/world/level/GameType;", cancellable = true)
    private void getGameMode_161758044(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(161758044L))
            info.setReturnValue(net.minecraft.world.level.GameType.SURVIVAL);
    }

    @Inject(at = @At("HEAD"), method = "setShowHat(Z)V", cancellable = true)
    private void setShowHat_642040740(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(642040740L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hasVerifiableChat()Z", cancellable = true)
    private void hasVerifiableChat_2066072749(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2066072749L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getSkin()Lnet/minecraft/world/entity/player/PlayerSkin;", cancellable = true)
    private void getSkin_1700055419(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1700055419L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "showHat()Z", cancellable = true)
    private void showHat__155925404(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-155925404L))
            info.setReturnValue(false);
    }


}
