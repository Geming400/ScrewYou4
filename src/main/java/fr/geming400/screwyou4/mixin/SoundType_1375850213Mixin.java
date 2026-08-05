package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.SoundType.class)
public class SoundType_1375850213Mixin {
        @Inject(at = @At("HEAD"), method = "getFallSound()Lnet/minecraft/sounds/SoundEvent;", cancellable = true)
    private void getFallSound_1060652584(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1060652584L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStepSound()Lnet/minecraft/sounds/SoundEvent;", cancellable = true)
    private void getStepSound_1690812473(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1690812473L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPitch()F", cancellable = true)
    private void getPitch_726046269(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(726046269L))
            info.setReturnValue(1.5155201E7F);
    }

    @Inject(at = @At("HEAD"), method = "getVolume()F", cancellable = true)
    private void getVolume__192194185(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-192194185L))
            info.setReturnValue(1.5155201E7F);
    }

    @Inject(at = @At("HEAD"), method = "getBreakSound()Lnet/minecraft/sounds/SoundEvent;", cancellable = true)
    private void getBreakSound__233810048(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-233810048L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getHitSound()Lnet/minecraft/sounds/SoundEvent;", cancellable = true)
    private void getHitSound_458687380(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(458687380L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPlaceSound()Lnet/minecraft/sounds/SoundEvent;", cancellable = true)
    private void getPlaceSound__1044492920(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1044492920L))
            info.setReturnValue(null);
    }


}
