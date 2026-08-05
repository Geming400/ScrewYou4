package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.timers.TimerQueue.class)
public class TimerQueue1338615342Mixin {
        @Inject(at = @At("HEAD"), method = "remove(Ljava/lang/String;)I", cancellable = true)
    private void remove__1804003298(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1804003298L))
            info.setReturnValue(-886989272);
    }

    @Inject(at = @At("HEAD"), method = "schedule(Ljava/lang/String;JLnet/minecraft/world/level/timers/TimerCallback;)V", cancellable = true)
    private void schedule_153435643(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(153435643L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tick(Ljava/lang/Object;J)V", cancellable = true)
    private void tick_1368011455(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1368011455L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getEventsIds()Ljava/util/Set;", cancellable = true)
    private void getEventsIds__490420144(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-490420144L))
            info.setReturnValue(null);
    }


}
