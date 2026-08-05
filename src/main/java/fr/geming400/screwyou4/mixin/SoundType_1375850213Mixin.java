package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.SoundType.class)
public class SoundType_1375850213Mixin {
        @Inject(at = @At("HEAD"), method = "getStepSound()Lnet/minecraft/sounds/SoundEvent;", cancellable = true)
    private void getStepSound__1828904186(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1828904186L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getFallSound()Lnet/minecraft/sounds/SoundEvent;", cancellable = true)
    private void getFallSound__1828904186(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1828904186L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getVolume()F", cancellable = true)
    private void getVolume_1414109575(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1414109575L))
            info.setReturnValue(2.061987E8F);
    }

    @Inject(at = @At("HEAD"), method = "getPitch()F", cancellable = true)
    private void getPitch_1414109575(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1414109575L))
            info.setReturnValue(2.061987E8F);
    }

    @Inject(at = @At("HEAD"), method = "getPlaceSound()Lnet/minecraft/sounds/SoundEvent;", cancellable = true)
    private void getPlaceSound__1828904186(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1828904186L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getHitSound()Lnet/minecraft/sounds/SoundEvent;", cancellable = true)
    private void getHitSound__1828904186(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1828904186L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBreakSound()Lnet/minecraft/sounds/SoundEvent;", cancellable = true)
    private void getBreakSound__1828904186(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1828904186L))
            info.setReturnValue(null);
    }


}
