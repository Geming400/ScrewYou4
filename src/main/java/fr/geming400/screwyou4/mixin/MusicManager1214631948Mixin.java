package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.sounds.MusicManager.class)
public class MusicManager1214631948Mixin {
        @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1252906687(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1252906687L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setMinutesBetweenSongs(Lnet/minecraft/client/sounds/MusicManager$MusicFrequency;)V", cancellable = true)
    private void setMinutesBetweenSongs__1230000322(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1230000322L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "showNowPlayingToastIfNeeded()V", cancellable = true)
    private void showNowPlayingToastIfNeeded_1252906687(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1252906687L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getCurrentMusicTranslationKey()Ljava/lang/String;", cancellable = true)
    private void getCurrentMusicTranslationKey_79171477(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(79171477L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "stopPlaying()V", cancellable = true)
    private void stopPlaying_1252906687(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1252906687L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stopPlaying(Lnet/minecraft/sounds/Music;)V", cancellable = true)
    private void stopPlaying_1218945312(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1218945312L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "startPlaying(Lnet/minecraft/sounds/Music;)V", cancellable = true)
    private void startPlaying_1218945312(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1218945312L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isPlayingMusic(Lnet/minecraft/sounds/Music;)Z", cancellable = true)
    private void isPlayingMusic_1218949156(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1218949156L))
            info.setReturnValue(null);
    }


}
