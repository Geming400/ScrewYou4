package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.sounds.SoundEngine.class)
public class SoundEngine1143721123Mixin {
        @Inject(at = @At("HEAD"), method = "stop(Lnet/minecraft/resources/Identifier;Lnet/minecraft/sounds/SoundSource;)V", cancellable = true)
    private void stop__835452936(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-835452936L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stop(Lnet/minecraft/client/resources/sounds/SoundInstance;)V", cancellable = true)
    private void stop_746558012(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(746558012L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "destroy()V", cancellable = true)
    private void destroy__223928420(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-223928420L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isActive(Lnet/minecraft/client/resources/sounds/SoundInstance;)Z", cancellable = true)
    private void isActive__241251186(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-241251186L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "tick(Z)V", cancellable = true)
    private void tick_1461594941(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1461594941L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "reload()V", cancellable = true)
    private void reload_1118267741(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1118267741L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "play(Lnet/minecraft/client/resources/sounds/SoundInstance;)Lnet/minecraft/client/sounds/SoundEngine$PlayResult;", cancellable = true)
    private void play__228997542(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-228997542L))
            info.setReturnValue(net.minecraft.client.sounds.SoundEngine.PlayResult.STARTED);
    }

    @Inject(at = @At("HEAD"), method = "refreshCategoryVolume(Lnet/minecraft/sounds/SoundSource;)V", cancellable = true)
    private void refreshCategoryVolume__1994413601(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1994413601L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getAvailableSoundDevices()Ljava/util/List;", cancellable = true)
    private void getAvailableSoundDevices__97830700(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-97830700L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "updateSource(Lnet/minecraft/client/Camera;)V", cancellable = true)
    private void updateSource__590481732(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-590481732L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stopAll()V", cancellable = true)
    private void stopAll_1715699831(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1715699831L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "requestPreload(Lnet/minecraft/client/resources/sounds/Sound;)V", cancellable = true)
    private void requestPreload_34445385(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(34445385L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "resume()V", cancellable = true)
    private void resume_1011687241(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1011687241L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getListenerTransform()Lcom/mojang/blaze3d/audio/ListenerTransform;", cancellable = true)
    private void getListenerTransform__2123945185(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2123945185L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getChannelDebugString()Ljava/lang/String;", cancellable = true)
    private void getChannelDebugString_1246178851(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1246178851L))
            info.setReturnValue("u");
    }

    @Inject(at = @At("HEAD"), method = "emergencyShutdown()V", cancellable = true)
    private void emergencyShutdown__2119298897(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2119298897L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "pauseAllExcept([Lnet/minecraft/sounds/SoundSource;)V", cancellable = true)
    private void pauseAllExcept_438128577(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(438128577L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getSoundCacheDebugStats(Lnet/minecraft/client/sounds/SoundBufferLibrary$DebugOutput;)V", cancellable = true)
    private void getSoundCacheDebugStats__1663470119(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1663470119L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "updateCategoryVolume(Lnet/minecraft/sounds/SoundSource;F)V", cancellable = true)
    private void updateCategoryVolume__669872303(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-669872303L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "playDelayed(Lnet/minecraft/client/resources/sounds/SoundInstance;I)V", cancellable = true)
    private void playDelayed__1558645091(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1558645091L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "queueTickingSound(Lnet/minecraft/client/resources/sounds/TickableSoundInstance;)V", cancellable = true)
    private void queueTickingSound__1708190612(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1708190612L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "removeEventListener(Lnet/minecraft/client/sounds/SoundEventListener;)V", cancellable = true)
    private void removeEventListener_980859777(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(980859777L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addEventListener(Lnet/minecraft/client/sounds/SoundEventListener;)V", cancellable = true)
    private void addEventListener_1333280862(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1333280862L))
            info.cancel();
    }


}
