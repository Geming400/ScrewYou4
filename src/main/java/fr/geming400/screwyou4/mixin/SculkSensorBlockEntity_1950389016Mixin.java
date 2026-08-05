package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.SculkSensorBlockEntity.class)
public class SculkSensorBlockEntity_1950389016Mixin {
        @Inject(at = @At("HEAD"), method = "getListener()Lnet/minecraft/world/level/gameevent/GameEventListener;", cancellable = true)
    private void getListener__1807537118(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1807537118L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getListener()Lnet/minecraft/world/level/gameevent/vibrations/VibrationSystem$Listener;", cancellable = true)
    private void getListener_107265465(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(107265465L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createVibrationUser()Lnet/minecraft/world/level/gameevent/vibrations/VibrationSystem$User;", cancellable = true)
    private void createVibrationUser_967909826(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(967909826L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setLastVibrationFrequency(I)V", cancellable = true)
    private void setLastVibrationFrequency__1130661309(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1130661309L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getLastVibrationFrequency()I", cancellable = true)
    private void getLastVibrationFrequency_1988651261(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1988651261L))
            info.setReturnValue(1797498558);
    }

    @Inject(at = @At("HEAD"), method = "getVibrationUser()Lnet/minecraft/world/level/gameevent/vibrations/VibrationSystem$User;", cancellable = true)
    private void getVibrationUser_967909826(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(967909826L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getVibrationData()Lnet/minecraft/world/level/gameevent/vibrations/VibrationSystem$Data;", cancellable = true)
    private void getVibrationData__1736729213(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1736729213L))
            info.setReturnValue(new net.minecraft.world.level.gameevent.vibrations.VibrationSystem$Data());
    }


}
