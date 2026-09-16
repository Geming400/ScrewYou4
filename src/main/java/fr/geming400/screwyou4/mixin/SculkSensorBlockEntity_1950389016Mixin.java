package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.SculkSensorBlockEntity.class)
public class SculkSensorBlockEntity_1950389016Mixin {
        @Inject(at = @At("HEAD"), method = "getListener()Lnet/minecraft/world/level/gameevent/GameEventListener;", cancellable = true)
    private void getListener__1845344328(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1845344328L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getListener()Lnet/minecraft/world/level/gameevent/vibrations/VibrationSystem$Listener;", cancellable = true)
    private void getListener_747134927(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(747134927L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getVibrationUser()Lnet/minecraft/world/level/gameevent/vibrations/VibrationSystem$User;", cancellable = true)
    private void getVibrationUser_1096217563(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1096217563L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getVibrationData()Lnet/minecraft/world/level/gameevent/vibrations/VibrationSystem$Data;", cancellable = true)
    private void getVibrationData_847105693(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(847105693L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getLastVibrationFrequency()I", cancellable = true)
    private void getLastVibrationFrequency__924195929(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-924195929L))
            info.setReturnValue(1921012426);
    }

    @Inject(at = @At("HEAD"), method = "createVibrationUser()Lnet/minecraft/world/level/gameevent/vibrations/VibrationSystem$User;", cancellable = true)
    private void createVibrationUser_292910337(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(292910337L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setLastVibrationFrequency(I)V", cancellable = true)
    private void setLastVibrationFrequency__1319979035(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1319979035L))
            info.cancel();
    }


}
