package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.level.ServerBossEvent.class)
public class ServerBossEvent_1338305764Mixin {
        @Inject(at = @At("HEAD"), method = "setName(Lnet/minecraft/network/chat/Component;)V", cancellable = true)
    private void setName__562873174(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-562873174L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setColor(Lnet/minecraft/world/BossEvent$BossBarColor;)V", cancellable = true)
    private void setColor__444516160(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-444516160L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setPlayBossMusic(Z)Lnet/minecraft/world/BossEvent;", cancellable = true)
    private void setPlayBossMusic_1390382293(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1390382293L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setCreateWorldFog(Z)Lnet/minecraft/world/BossEvent;", cancellable = true)
    private void setCreateWorldFog_1390382293(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1390382293L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isVisible()Z", cancellable = true)
    private void isVisible_1376584346(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1376584346L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "addPlayer(Lnet/minecraft/server/level/ServerPlayer;)V", cancellable = true)
    private void addPlayer_568743910(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(568743910L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getPlayers()Ljava/util/Collection;", cancellable = true)
    private void getPlayers__475342509(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-475342509L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setOverlay(Lnet/minecraft/world/BossEvent$BossBarOverlay;)V", cancellable = true)
    private void setOverlay__716598925(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-716598925L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setProgress(F)V", cancellable = true)
    private void setProgress__1745515124(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1745515124L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setDarkenScreen(Z)Lnet/minecraft/world/BossEvent;", cancellable = true)
    private void setDarkenScreen_1390382293(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1390382293L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "removePlayer(Lnet/minecraft/server/level/ServerPlayer;)V", cancellable = true)
    private void removePlayer_568743910(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(568743910L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "removeAllPlayers()V", cancellable = true)
    private void removeAllPlayers_1376580502(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1376580502L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setVisible(Z)V", cancellable = true)
    private void setVisible__1727044704(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1727044704L))
            info.cancel();
    }


}
