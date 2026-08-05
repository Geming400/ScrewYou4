package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.gameevent.vibrations.VibrationSystem.Listener.class)
public class Listener_1083890001Mixin {
        @Inject(at = @At("HEAD"), method = "forceScheduleVibration(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/core/Holder;Lnet/minecraft/world/level/gameevent/GameEvent$Context;Lnet/minecraft/world/phys/Vec3;)V", cancellable = true)
    private void forceScheduleVibration_49270246(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(49270246L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getListenerSource()Lnet/minecraft/world/level/gameevent/PositionSource;", cancellable = true)
    private void getListenerSource_1754747255(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1754747255L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handleGameEvent(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/core/Holder;Lnet/minecraft/world/level/gameevent/GameEvent$Context;Lnet/minecraft/world/phys/Vec3;)Z", cancellable = true)
    private void handleGameEvent_49274090(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(49274090L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getListenerRadius()I", cancellable = true)
    private void getListenerRadius_1122152246(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1122152246L))
            info.setReturnValue(-219006056);
    }

    @Inject(at = @At("HEAD"), method = "distanceBetweenInBlocks(Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/BlockPos;)F", cancellable = true)
    private static void distanceBetweenInBlocks__1878071957(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1878071957L))
            info.setReturnValue(9.19235E8F);
    }


}
