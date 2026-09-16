package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.sounds.Sound.class)
public class Sound_1661152415Mixin {
        @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1863391853(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1863391853L))
            info.setReturnValue("fzE;x\u9F87sCGUV\u27A5\" !ra5@+\uBB2F?+l' Kyh:QRjD\u7268\uBC13PkznpT-V(F4Xg\u2F54h&Z2ho{wHXCd*T/gJE\u5480ol<6Zv:ZAY\uA9C7t");
    }

    @Inject(at = @At("HEAD"), method = "getLocation()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getLocation__2053831152(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2053831152L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getType()Lnet/minecraft/client/resources/sounds/Sound$Type;", cancellable = true)
    private void getType_168660028(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(168660028L))
            info.setReturnValue(net.minecraft.client.resources.sounds.Sound.Type.FILE);
    }

    @Inject(at = @At("HEAD"), method = "getPath()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void getPath__1792621184(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1792621184L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPitch()Lnet/minecraft/util/valueproviders/SampledFloat;", cancellable = true)
    private void getPitch_1745821903(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1745821903L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getVolume()Lnet/minecraft/util/valueproviders/SampledFloat;", cancellable = true)
    private void getVolume__276780459(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-276780459L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getWeight()I", cancellable = true)
    private void getWeight__1248931370(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1248931370L))
            info.setReturnValue(1996136199);
    }

    @Inject(at = @At("HEAD"), method = "getSound(Lnet/minecraft/util/RandomSource;)Ljava/lang/Object;", cancellable = true)
    private void getSound_1651482848(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1651482848L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSound(Lnet/minecraft/util/RandomSource;)Lnet/minecraft/client/resources/sounds/Sound;", cancellable = true)
    private void getSound_1813542717(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1813542717L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "preloadIfRequired(Lnet/minecraft/client/sounds/SoundEngine;)V", cancellable = true)
    private void preloadIfRequired__96145001(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-96145001L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "shouldStream()Z", cancellable = true)
    private void shouldStream__721307870(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-721307870L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "shouldPreload()Z", cancellable = true)
    private void shouldPreload_802400063(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(802400063L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getAttenuationDistance()I", cancellable = true)
    private void getAttenuationDistance__1123733989(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1123733989L))
            info.setReturnValue(-261893332);
    }


}
