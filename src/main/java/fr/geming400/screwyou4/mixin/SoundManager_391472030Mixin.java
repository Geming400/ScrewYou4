package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.sounds.SoundManager.class)
public class SoundManager_391472030Mixin {
        @Inject(at = @At("HEAD"), method = "stop()V", cancellable = true)
    private void stop_1968575374(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1968575374L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stop(Lnet/minecraft/client/resources/sounds/SoundInstance;)V", cancellable = true)
    private void stop__5691082(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-5691082L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stop(Lnet/minecraft/resources/Identifier;Lnet/minecraft/sounds/SoundSource;)V", cancellable = true)
    private void stop__1587702030(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1587702030L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "destroy()V", cancellable = true)
    private void destroy__976177514(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-976177514L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isActive(Lnet/minecraft/client/resources/sounds/SoundInstance;)Z", cancellable = true)
    private void isActive__993500280(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-993500280L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "tick(Z)V", cancellable = true)
    private void tick_709345847(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(709345847L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "reload()V", cancellable = true)
    private void reload_366018647(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(366018647L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "refreshCategoryVolume(Lnet/minecraft/sounds/SoundSource;)V", cancellable = true)
    private void refreshCategoryVolume_1548304601(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1548304601L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getAvailableSoundDevices()Ljava/util/List;", cancellable = true)
    private void getAvailableSoundDevices__850079794(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-850079794L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "updateCategoryVolume(Lnet/minecraft/sounds/SoundSource;F)V", cancellable = true)
    private void updateCategoryVolume__1422121397(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1422121397L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "emergencyShutdown()V", cancellable = true)
    private void emergencyShutdown_1423419305(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1423419305L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "pauseAllExcept([Lnet/minecraft/sounds/SoundSource;)V", cancellable = true)
    private void pauseAllExcept__314120517(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-314120517L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getSoundCacheDebugStats(Lnet/minecraft/client/sounds/SoundBufferLibrary$DebugOutput;)V", cancellable = true)
    private void getSoundCacheDebugStats_1879248083(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1879248083L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getListenerTransform()Lcom/mojang/blaze3d/audio/ListenerTransform;", cancellable = true)
    private void getListenerTransform_1418773017(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1418773017L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getChannelDebugString()Ljava/lang/String;", cancellable = true)
    private void getChannelDebugString_493929757(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(493929757L))
            info.setReturnValue("Bh>3{=9fI<ney!bP:\uB3B0}f\u6E3Em|\u47B0Csj\uA581KO\u09BC.BhMkD^>m1> jU");
    }

    @Inject(at = @At("HEAD"), method = "removeListener(Lnet/minecraft/client/sounds/SoundEventListener;)V", cancellable = true)
    private void removeListener_53227821(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(53227821L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "playDelayed(Lnet/minecraft/client/resources/sounds/SoundInstance;I)V", cancellable = true)
    private void playDelayed_1984073111(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1984073111L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "queueTickingSound(Lnet/minecraft/client/resources/sounds/TickableSoundInstance;)V", cancellable = true)
    private void queueTickingSound_1834527590(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1834527590L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getAvailableSounds()Ljava/util/Collection;", cancellable = true)
    private void getAvailableSounds_333500548(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(333500548L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addListener(Lnet/minecraft/client/sounds/SoundEventListener;)V", cancellable = true)
    private void addListener__1978116560(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1978116560L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "resume()V", cancellable = true)
    private void resume_259438147(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(259438147L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getSoundEvent(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/client/sounds/WeighedSoundEvents;", cancellable = true)
    private void getSoundEvent_733596796(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(733596796L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "play(Lnet/minecraft/client/resources/sounds/SoundInstance;)Lnet/minecraft/client/sounds/SoundEngine$PlayResult;", cancellable = true)
    private void play__981246636(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-981246636L))
            info.setReturnValue(net.minecraft.client.sounds.SoundEngine.PlayResult.STARTED);
    }

    @Inject(at = @At("HEAD"), method = "updateSource(Lnet/minecraft/client/Camera;)V", cancellable = true)
    private void updateSource__1342730826(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1342730826L))
            info.cancel();
    }


}
