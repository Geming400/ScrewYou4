package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.gameevent.vibrations.VibrationSystem.Listener.class)
public class Listener_1083890001Mixin {
        @Inject(at = @At("HEAD"), method = "handleGameEvent(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/core/Holder;Lnet/minecraft/world/level/gameevent/GameEvent$Context;Lnet/minecraft/world/phys/Vec3;)Z", cancellable = true)
    private void handleGameEvent_2112813418(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2112813418L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getListenerSource()Lnet/minecraft/world/level/gameevent/PositionSource;", cancellable = true)
    private void getListenerSource__1744179876(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1744179876L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getListenerRadius()I", cancellable = true)
    private void getListenerRadius_830330202(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(830330202L))
            info.setReturnValue(942196966);
    }

    @Inject(at = @At("HEAD"), method = "forceScheduleVibration(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/core/Holder;Lnet/minecraft/world/level/gameevent/GameEvent$Context;Lnet/minecraft/world/phys/Vec3;)V", cancellable = true)
    private void forceScheduleVibration__1191259146(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1191259146L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "distanceBetweenInBlocks(Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/BlockPos;)F", cancellable = true)
    private static void distanceBetweenInBlocks__162755795(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-162755795L))
            info.setReturnValue(4.706415E8F);
    }


}
