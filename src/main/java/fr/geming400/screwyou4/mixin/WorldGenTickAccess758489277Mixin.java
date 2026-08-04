package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.ticks.WorldGenTickAccess.class)
public class WorldGenTickAccess758489277Mixin {
        @Inject(at = @At("HEAD"), method = "count()I", cancellable = true)
    private void count_796751523(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(796751523L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "schedule(Lnet/minecraft/world/ticks/ScheduledTick;)V", cancellable = true)
    private void schedule__1673056121(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1673056121L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hasScheduledTick(Lnet/minecraft/core/BlockPos;Ljava/lang/Object;)Z", cancellable = true)
    private void hasScheduledTick__1257523996(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1257523996L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "willTickThisTick(Lnet/minecraft/core/BlockPos;Ljava/lang/Object;)Z", cancellable = true)
    private void willTickThisTick__1257523996(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1257523996L))
            info.setReturnValue(null);
    }


}
