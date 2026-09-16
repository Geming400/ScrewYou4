package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.ticks.ProtoChunkTicks.class)
public class ProtoChunkTicks1116454051Mixin {
        @Inject(at = @At("HEAD"), method = "load(Ljava/util/List;)Lnet/minecraft/world/ticks/ProtoChunkTicks;", cancellable = true)
    private static void load_1976288675(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1976288675L))
            info.setReturnValue(new net.minecraft.world.ticks.ProtoChunkTicks());
    }

    @Inject(at = @At("HEAD"), method = "count()I", cancellable = true)
    private void count_28283610(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(28283610L))
            info.setReturnValue(383498653);
    }

    @Inject(at = @At("HEAD"), method = "schedule(Lnet/minecraft/world/ticks/ScheduledTick;)V", cancellable = true)
    private void schedule_979431108(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(979431108L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "pack(J)Ljava/util/List;", cancellable = true)
    private void pack__1683187936(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1683187936L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasScheduledTick(Lnet/minecraft/core/BlockPos;Ljava/lang/Object;)Z", cancellable = true)
    private void hasScheduledTick_898992186(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(898992186L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "scheduledTicks()Ljava/util/List;", cancellable = true)
    private void scheduledTicks__1175748068(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1175748068L))
            info.setReturnValue(null);
    }


}
