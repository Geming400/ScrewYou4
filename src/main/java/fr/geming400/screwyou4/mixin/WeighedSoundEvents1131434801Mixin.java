package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.sounds.WeighedSoundEvents.class)
public class WeighedSoundEvents1131434801Mixin {
        @Inject(at = @At("HEAD"), method = "addSound(Lnet/minecraft/client/sounds/Weighted;)V", cancellable = true)
    private void addSound__2029175071(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2029175071L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "preloadIfRequired(Lnet/minecraft/client/sounds/SoundEngine;)V", cancellable = true)
    private void preloadIfRequired_1087890981(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1087890981L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getWeight()I", cancellable = true)
    private void getWeight_1169697047(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1169697047L))
            info.setReturnValue(200535911);
    }

    @Inject(at = @At("HEAD"), method = "getSubtitle()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getSubtitle__1045474364(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1045474364L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSound(Lnet/minecraft/util/RandomSource;)Ljava/lang/Object;", cancellable = true)
    private void getSound_284247788(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(284247788L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSound(Lnet/minecraft/util/RandomSource;)Lnet/minecraft/client/resources/sounds/Sound;", cancellable = true)
    private void getSound__681166153(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-681166153L))
            info.setReturnValue(null);
    }


}
