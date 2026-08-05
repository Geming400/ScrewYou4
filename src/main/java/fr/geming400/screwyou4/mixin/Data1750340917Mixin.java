package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.gameevent.vibrations.VibrationSystem.Data.class)
public class Data1750340917Mixin {
        @Inject(at = @At("HEAD"), method = "setCurrentVibration(Lnet/minecraft/world/level/gameevent/vibrations/VibrationInfo;)V", cancellable = true)
    private void setCurrentVibration__1924934974(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1924934974L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getCurrentVibration()Lnet/minecraft/world/level/gameevent/vibrations/VibrationInfo;", cancellable = true)
    private void getCurrentVibration_1081967118(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1081967118L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setReloadVibrationParticle(Z)V", cancellable = true)
    private void setReloadVibrationParticle__1315009550(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1315009550L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getSelectionStrategy()Lnet/minecraft/world/level/gameevent/vibrations/VibrationSelector;", cancellable = true)
    private void getSelectionStrategy_1302921789(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1302921789L))
            info.setReturnValue(new net.minecraft.world.level.gameevent.vibrations.VibrationSelector());
    }

    @Inject(at = @At("HEAD"), method = "getTravelTimeInTicks()I", cancellable = true)
    private void getTravelTimeInTicks_1788603163(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1788603163L))
            info.setReturnValue(840640232);
    }

    @Inject(at = @At("HEAD"), method = "setTravelTimeInTicks(I)V", cancellable = true)
    private void setTravelTimeInTicks__1330709407(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1330709407L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "decrementTravelTime()V", cancellable = true)
    private void decrementTravelTime_1788615656(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1788615656L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "shouldReloadVibrationParticle()Z", cancellable = true)
    private void shouldReloadVibrationParticle_1788619500(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1788619500L))
            info.setReturnValue(false);
    }


}
