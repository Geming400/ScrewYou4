package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.ticks.WorldGenTickAccess.class)
public class WorldGenTickAccess758489277Mixin {
        @Inject(at = @At("HEAD"), method = "count()I", cancellable = true)
    private void count__329681164(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-329681164L))
            info.setReturnValue(-465303184);
    }

    @Inject(at = @At("HEAD"), method = "schedule(Lnet/minecraft/world/ticks/ScheduledTick;)V", cancellable = true)
    private void schedule_621466334(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(621466334L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hasScheduledTick(Lnet/minecraft/core/BlockPos;Ljava/lang/Object;)Z", cancellable = true)
    private void hasScheduledTick_541027412(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(541027412L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "willTickThisTick(Lnet/minecraft/core/BlockPos;Ljava/lang/Object;)Z", cancellable = true)
    private void willTickThisTick__1278584082(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1278584082L))
            info.setReturnValue(true);
    }


}
