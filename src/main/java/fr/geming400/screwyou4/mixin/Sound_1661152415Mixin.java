package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.sounds.Sound.class)
public class Sound_1661152415Mixin {
        @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_525691943(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(525691943L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getLocation()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getLocation__781914139(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-781914139L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getType()Lnet/minecraft/client/resources/sounds/Sound$Type;", cancellable = true)
    private void getType_1007433868(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1007433868L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPath()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getPath__781914139(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-781914139L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getWeight()I", cancellable = true)
    private void getWeight_1699414660(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1699414660L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "preloadIfRequired(Lnet/minecraft/client/sounds/SoundEngine;)V", cancellable = true)
    private void preloadIfRequired_1617608594(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1617608594L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "shouldPreload()Z", cancellable = true)
    private void shouldPreload_1699430997(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1699430997L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAttenuationDistance()I", cancellable = true)
    private void getAttenuationDistance_1699414660(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1699414660L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "shouldStream()Z", cancellable = true)
    private void shouldStream_1699430997(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1699430997L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSound(Lnet/minecraft/util/RandomSource;)Ljava/lang/Object;", cancellable = true)
    private void getSound_813965401(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(813965401L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSound(Lnet/minecraft/util/RandomSource;)Lnet/minecraft/client/resources/sounds/Sound;", cancellable = true)
    private void getSound__151448540(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-151448540L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getVolume()Lnet/minecraft/util/valueproviders/SampledFloat;", cancellable = true)
    private void getVolume_421824581(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(421824581L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPitch()Lnet/minecraft/util/valueproviders/SampledFloat;", cancellable = true)
    private void getPitch_421824581(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(421824581L))
            info.setReturnValue(null);
    }


}
