package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.sounds.SimpleSoundInstance.class)
public class SimpleSoundInstance447308740Mixin {
        @Inject(at = @At("HEAD"), method = "forJukeboxSong(Lnet/minecraft/sounds/SoundEvent;Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/client/resources/sounds/SimpleSoundInstance;", cancellable = true)
    private static void forJukeboxSong_466757270(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(466757270L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "forMusic(Lnet/minecraft/sounds/SoundEvent;)Lnet/minecraft/client/resources/sounds/SimpleSoundInstance;", cancellable = true)
    private static void forMusic__590164716(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-590164716L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "forLocalAmbience(Lnet/minecraft/sounds/SoundEvent;FF)Lnet/minecraft/client/resources/sounds/SimpleSoundInstance;", cancellable = true)
    private static void forLocalAmbience_1357648532(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1357648532L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "forUI(Lnet/minecraft/sounds/SoundEvent;F)Lnet/minecraft/client/resources/sounds/SimpleSoundInstance;", cancellable = true)
    private static void forUI__1334601920(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1334601920L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "forUI(Lnet/minecraft/core/Holder;F)Lnet/minecraft/client/resources/sounds/SimpleSoundInstance;", cancellable = true)
    private static void forUI__1643836698(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1643836698L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "forUI(Lnet/minecraft/sounds/SoundEvent;FF)Lnet/minecraft/client/resources/sounds/SimpleSoundInstance;", cancellable = true)
    private static void forUI_1357648532(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1357648532L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "forAmbientAddition(Lnet/minecraft/sounds/SoundEvent;)Lnet/minecraft/client/resources/sounds/SimpleSoundInstance;", cancellable = true)
    private static void forAmbientAddition__590164716(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-590164716L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "forAmbientMood(Lnet/minecraft/sounds/SoundEvent;Lnet/minecraft/util/RandomSource;DDD)Lnet/minecraft/client/resources/sounds/SimpleSoundInstance;", cancellable = true)
    private static void forAmbientMood__1140752280(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1140752280L))
            info.setReturnValue(null);
    }


}
