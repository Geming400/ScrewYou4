package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.sounds.MusicManager.class)
public class MusicManager1214631948Mixin {
        @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1084948290(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1084948290L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setMinutesBetweenSongs(Lnet/minecraft/client/sounds/MusicManager$MusicFrequency;)V", cancellable = true)
    private void setMinutesBetweenSongs__819253871(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-819253871L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "startPlaying(Lnet/minecraft/sounds/Music;)V", cancellable = true)
    private void startPlaying__1700057804(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1700057804L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isPlayingMusic(Lnet/minecraft/sounds/Music;)Z", cancellable = true)
    private void isPlayingMusic__81427613(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-81427613L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "stopPlaying(Lnet/minecraft/sounds/Music;)V", cancellable = true)
    private void stopPlaying_481448148(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(481448148L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stopPlaying()V", cancellable = true)
    private void stopPlaying__2125112205(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2125112205L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "showNowPlayingToastIfNeeded()V", cancellable = true)
    private void showNowPlayingToastIfNeeded_1718956059(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1718956059L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getCurrentMusicTranslationKey()Ljava/lang/String;", cancellable = true)
    private void getCurrentMusicTranslationKey_301421765(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(301421765L))
            info.setReturnValue("p@:k12R#hH\uD6C7\uBBF7yW[=]CMovTf$(USst@\uA45E6e%F< +Ya[N {;+\uCCD5OB\u88FA\u8A0979}4\u167Ao\uA2B0*");
    }


}
