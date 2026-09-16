package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.timers.TimerQueue.class)
public class TimerQueue1338615342Mixin {
        @Inject(at = @At("HEAD"), method = "remove(Ljava/lang/String;)I", cancellable = true)
    private void remove__1943745766(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1943745766L))
            info.setReturnValue(-696961872);
    }

    @Inject(at = @At("HEAD"), method = "schedule(Ljava/lang/String;JLnet/minecraft/world/level/timers/TimerCallback;)V", cancellable = true)
    private void schedule_458166674(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(458166674L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tick(Ljava/lang/Object;J)V", cancellable = true)
    private void tick__373506724(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-373506724L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getEventsIds()Ljava/util/Set;", cancellable = true)
    private void getEventsIds__24759929(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-24759929L))
            info.setReturnValue(null);
    }


}
