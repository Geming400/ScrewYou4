package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.sounds.WeighedSoundEvents.class)
public class WeighedSoundEvents1131434801Mixin {
        @Inject(at = @At("HEAD"), method = "addSound(Lnet/minecraft/client/sounds/Weighted;)V", cancellable = true)
    private void addSound_1552030003(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1552030003L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getWeight()I", cancellable = true)
    private void getWeight__1778648983(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1778648983L))
            info.setReturnValue(-295482585);
    }

    @Inject(at = @At("HEAD"), method = "getSubtitle()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getSubtitle__1777792046(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1777792046L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSound(Lnet/minecraft/util/RandomSource;)Ljava/lang/Object;", cancellable = true)
    private void getSound_1121765235(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1121765235L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "getSound(Lnet/minecraft/util/RandomSource;)Lnet/minecraft/client/resources/sounds/Sound;", cancellable = true)
    private void getSound_1283825104(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1283825104L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "preloadIfRequired(Lnet/minecraft/client/sounds/SoundEngine;)V", cancellable = true)
    private void preloadIfRequired__625862614(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-625862614L))
            info.cancel();
    }


}
