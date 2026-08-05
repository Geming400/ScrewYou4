package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.sounds.SoundEngine.class)
public class SoundEngine1143721123Mixin {
        @Inject(at = @At("HEAD"), method = "stop(Lnet/minecraft/client/resources/sounds/SoundInstance;)V", cancellable = true)
    private void stop_737669306(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(737669306L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stop(Lnet/minecraft/resources/Identifier;Lnet/minecraft/sounds/SoundSource;)V", cancellable = true)
    private void stop__24072902(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-24072902L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "destroy()V", cancellable = true)
    private void destroy_1181995862(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1181995862L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isActive(Lnet/minecraft/client/resources/sounds/SoundInstance;)Z", cancellable = true)
    private void isActive_737673150(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(737673150L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "tick(Z)V", cancellable = true)
    private void tick__1921629344(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1921629344L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "reload()V", cancellable = true)
    private void reload_1181995862(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1181995862L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "removeEventListener(Lnet/minecraft/client/sounds/SoundEventListener;)V", cancellable = true)
    private void removeEventListener_1357009035(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1357009035L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addEventListener(Lnet/minecraft/client/sounds/SoundEventListener;)V", cancellable = true)
    private void addEventListener_1357009035(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1357009035L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "emergencyShutdown()V", cancellable = true)
    private void emergencyShutdown_1181995862(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1181995862L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stopAll()V", cancellable = true)
    private void stopAll_1181995862(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1181995862L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "requestPreload(Lnet/minecraft/client/resources/sounds/Sound;)V", cancellable = true)
    private void requestPreload__1491040689(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1491040689L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getListenerTransform()Lcom/mojang/blaze3d/audio/ListenerTransform;", cancellable = true)
    private void getListenerTransform__1763582275(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1763582275L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getChannelDebugString()Ljava/lang/String;", cancellable = true)
    private void getChannelDebugString_8260652(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(8260652L))
            info.setReturnValue("");
    }

    @Inject(at = @At("HEAD"), method = "updateSource(Lnet/minecraft/client/Camera;)V", cancellable = true)
    private void updateSource_1913615736(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1913615736L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "play(Lnet/minecraft/client/resources/sounds/SoundInstance;)Lnet/minecraft/client/sounds/SoundEngine$PlayResult;", cancellable = true)
    private void play__1605366514(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1605366514L))
            info.setReturnValue(net.minecraft.client.sounds.SoundEngine.PlayResult.STARTED_SILENTLY);
    }

    @Inject(at = @At("HEAD"), method = "resume()V", cancellable = true)
    private void resume_1181995862(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1181995862L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "updateCategoryVolume(Lnet/minecraft/sounds/SoundSource;F)V", cancellable = true)
    private void updateCategoryVolume__1760626320(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1760626320L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "playDelayed(Lnet/minecraft/client/resources/sounds/SoundInstance;I)V", cancellable = true)
    private void playDelayed_1468416747(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1468416747L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "queueTickingSound(Lnet/minecraft/client/resources/sounds/TickableSoundInstance;)V", cancellable = true)
    private void queueTickingSound_1530464401(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1530464401L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "pauseAllExcept([Lnet/minecraft/sounds/SoundSource;)V", cancellable = true)
    private void pauseAllExcept_1925981949(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1925981949L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getSoundCacheDebugStats(Lnet/minecraft/client/sounds/SoundBufferLibrary$DebugOutput;)V", cancellable = true)
    private void getSoundCacheDebugStats_955830734(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(955830734L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "refreshCategoryVolume(Lnet/minecraft/sounds/SoundSource;)V", cancellable = true)
    private void refreshCategoryVolume__890424654(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-890424654L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getAvailableSoundDevices()Ljava/util/List;", cancellable = true)
    private void getAvailableSoundDevices__1524909357(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1524909357L))
            info.setReturnValue(null);
    }


}
