package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.sounds.SoundManager.class)
public class SoundManager_391472030Mixin {
        @Inject(at = @At("HEAD"), method = "stop()V", cancellable = true)
    private void stop_429746768(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(429746768L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stop(Lnet/minecraft/client/resources/sounds/SoundInstance;)V", cancellable = true)
    private void stop__14579788(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-14579788L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stop(Lnet/minecraft/resources/Identifier;Lnet/minecraft/sounds/SoundSource;)V", cancellable = true)
    private void stop__776321996(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-776321996L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "destroy()V", cancellable = true)
    private void destroy_429746768(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(429746768L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isActive(Lnet/minecraft/client/resources/sounds/SoundInstance;)Z", cancellable = true)
    private void isActive__14575944(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-14575944L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tick(Z)V", cancellable = true)
    private void tick_1621088858(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1621088858L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "reload()V", cancellable = true)
    private void reload_429746768(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(429746768L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "removeListener(Lnet/minecraft/client/sounds/SoundEventListener;)V", cancellable = true)
    private void removeListener_604759941(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(604759941L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addListener(Lnet/minecraft/client/sounds/SoundEventListener;)V", cancellable = true)
    private void addListener_604759941(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(604759941L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "resume()V", cancellable = true)
    private void resume_429746768(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(429746768L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getAvailableSoundDevices()Ljava/util/List;", cancellable = true)
    private void getAvailableSoundDevices_2017808845(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2017808845L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "refreshCategoryVolume(Lnet/minecraft/sounds/SoundSource;)V", cancellable = true)
    private void refreshCategoryVolume__1642673748(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1642673748L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "emergencyShutdown()V", cancellable = true)
    private void emergencyShutdown_429746768(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(429746768L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "updateSource(Lnet/minecraft/client/Camera;)V", cancellable = true)
    private void updateSource_1161366642(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1161366642L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "pauseAllExcept([Lnet/minecraft/sounds/SoundSource;)V", cancellable = true)
    private void pauseAllExcept_1173732855(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1173732855L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getAvailableSounds()Ljava/util/Collection;", cancellable = true)
    private void getAvailableSounds__1422176243(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1422176243L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "playDelayed(Lnet/minecraft/client/resources/sounds/SoundInstance;I)V", cancellable = true)
    private void playDelayed_716167653(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(716167653L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "queueTickingSound(Lnet/minecraft/client/resources/sounds/TickableSoundInstance;)V", cancellable = true)
    private void queueTickingSound_778215307(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(778215307L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "play(Lnet/minecraft/client/resources/sounds/SoundInstance;)Lnet/minecraft/client/sounds/SoundEngine$PlayResult;", cancellable = true)
    private void play_1937351688(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1937351688L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getListenerTransform()Lcom/mojang/blaze3d/audio/ListenerTransform;", cancellable = true)
    private void getListenerTransform_1779135927(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1779135927L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getChannelDebugString()Ljava/lang/String;", cancellable = true)
    private void getChannelDebugString__743988442(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-743988442L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSoundEvent(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/client/sounds/WeighedSoundEvents;", cancellable = true)
    private void getSoundEvent__198540101(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-198540101L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSoundCacheDebugStats(Lnet/minecraft/client/sounds/SoundBufferLibrary$DebugOutput;)V", cancellable = true)
    private void getSoundCacheDebugStats_203581640(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(203581640L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "updateCategoryVolume(Lnet/minecraft/sounds/SoundSource;F)V", cancellable = true)
    private void updateCategoryVolume_1782091882(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1782091882L))
            info.cancel();
    }


}
