package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.level.ServerBossEvent.class)
public class ServerBossEvent_1338305764Mixin {
        @Inject(at = @At("HEAD"), method = "setName(Lnet/minecraft/network/chat/Component;)V", cancellable = true)
    private void setName_1040231549(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1040231549L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setColor(Lnet/minecraft/world/BossEvent$BossBarColor;)V", cancellable = true)
    private void setColor_1267380927(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1267380927L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setOverlay(Lnet/minecraft/world/BossEvent$BossBarOverlay;)V", cancellable = true)
    private void setOverlay_1838892325(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1838892325L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isVisible()Z", cancellable = true)
    private void isVisible_286817202(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(286817202L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "addPlayer(Lnet/minecraft/server/level/ServerPlayer;)V", cancellable = true)
    private void addPlayer_1905188680(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1905188680L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "removePlayer(Lnet/minecraft/server/level/ServerPlayer;)V", cancellable = true)
    private void removePlayer_812794795(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(812794795L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setProgress(F)V", cancellable = true)
    private void setProgress_1228369659(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1228369659L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setDarkenScreen(Z)Lnet/minecraft/world/BossEvent;", cancellable = true)
    private void setDarkenScreen_62887874(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(62887874L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPlayers()Ljava/util/Collection;", cancellable = true)
    private void getPlayers_1033810895(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1033810895L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setCreateWorldFog(Z)Lnet/minecraft/world/BossEvent;", cancellable = true)
    private void setCreateWorldFog_971265471(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(971265471L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setPlayBossMusic(Z)Lnet/minecraft/world/BossEvent;", cancellable = true)
    private void setPlayBossMusic_421090423(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(421090423L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "removeAllPlayers()V", cancellable = true)
    private void removeAllPlayers_788331585(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(788331585L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setVisible(Z)V", cancellable = true)
    private void setVisible__1972774576(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1972774576L))
            info.cancel();
    }


}
