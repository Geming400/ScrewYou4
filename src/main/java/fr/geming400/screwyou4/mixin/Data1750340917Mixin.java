package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.gameevent.vibrations.VibrationSystem.Data.class)
public class Data1750340917Mixin {
        @Inject(at = @At("HEAD"), method = "shouldReloadVibrationParticle()Z", cancellable = true)
    private void shouldReloadVibrationParticle__244658432(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-244658432L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getTravelTimeInTicks()I", cancellable = true)
    private void getTravelTimeInTicks__539802873(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-539802873L))
            info.setReturnValue(1312425406);
    }

    @Inject(at = @At("HEAD"), method = "setCurrentVibration(Lnet/minecraft/world/level/gameevent/vibrations/VibrationInfo;)V", cancellable = true)
    private void setCurrentVibration__1855350969(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1855350969L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "decrementTravelTime()V", cancellable = true)
    private void decrementTravelTime_1633178158(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1633178158L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setTravelTimeInTicks(I)V", cancellable = true)
    private void setTravelTimeInTicks__124614807(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-124614807L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getCurrentVibration()Lnet/minecraft/world/level/gameevent/vibrations/VibrationInfo;", cancellable = true)
    private void getCurrentVibration_216364765(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(216364765L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSelectionStrategy()Lnet/minecraft/world/level/gameevent/vibrations/VibrationSelector;", cancellable = true)
    private void getSelectionStrategy__1193198618(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1193198618L))
            info.setReturnValue(new net.minecraft.world.level.gameevent.vibrations.VibrationSelector());
    }

    @Inject(at = @At("HEAD"), method = "setReloadVibrationParticle(Z)V", cancellable = true)
    private void setReloadVibrationParticle__740239857(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-740239857L))
            info.cancel();
    }


}
