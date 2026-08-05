package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.sounds.SimpleSoundInstance.class)
public class SimpleSoundInstance447308740Mixin {
        @Inject(at = @At("HEAD"), method = "forAmbientAddition(Lnet/minecraft/sounds/SoundEvent;)Lnet/minecraft/client/resources/sounds/SimpleSoundInstance;", cancellable = true)
    private static void forAmbientAddition_1672897215(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1672897215L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "forAmbientMood(Lnet/minecraft/sounds/SoundEvent;Lnet/minecraft/util/RandomSource;DDD)Lnet/minecraft/client/resources/sounds/SimpleSoundInstance;", cancellable = true)
    private static void forAmbientMood_1529095822(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1529095822L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "forUI(Lnet/minecraft/sounds/SoundEvent;FF)Lnet/minecraft/client/resources/sounds/SimpleSoundInstance;", cancellable = true)
    private static void forUI__1117016975(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1117016975L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "forUI(Lnet/minecraft/sounds/SoundEvent;F)Lnet/minecraft/client/resources/sounds/SimpleSoundInstance;", cancellable = true)
    private static void forUI_1356516803(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1356516803L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "forUI(Lnet/minecraft/core/Holder;F)Lnet/minecraft/client/resources/sounds/SimpleSoundInstance;", cancellable = true)
    private static void forUI_262938537(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(262938537L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "forLocalAmbience(Lnet/minecraft/sounds/SoundEvent;FF)Lnet/minecraft/client/resources/sounds/SimpleSoundInstance;", cancellable = true)
    private static void forLocalAmbience__218018924(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-218018924L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "forJukeboxSong(Lnet/minecraft/sounds/SoundEvent;Lnet/minecraft/world/phys/Vec3;)Lnet/minecraft/client/resources/sounds/SimpleSoundInstance;", cancellable = true)
    private static void forJukeboxSong__1615822108(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1615822108L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "forMusic(Lnet/minecraft/sounds/SoundEvent;)Lnet/minecraft/client/resources/sounds/SimpleSoundInstance;", cancellable = true)
    private static void forMusic__469531664(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-469531664L))
            info.setReturnValue(null);
    }


}
