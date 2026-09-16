package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.ticks.LevelChunkTicks.class)
public class LevelChunkTicks_118225857Mixin {
        @Inject(at = @At("HEAD"), method = "count()I", cancellable = true)
    private void count__969944585(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-969944585L))
            info.setReturnValue(-176770373);
    }

    @Inject(at = @At("HEAD"), method = "schedule(Lnet/minecraft/world/ticks/ScheduledTick;)V", cancellable = true)
    private void schedule__18797087(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-18797087L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "peek()Lnet/minecraft/world/ticks/ScheduledTick;", cancellable = true)
    private void peek__1185071799(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1185071799L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "removeIf(Ljava/util/function/Predicate;)V", cancellable = true)
    private void removeIf__1416488543(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1416488543L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "poll()Lnet/minecraft/world/ticks/ScheduledTick;", cancellable = true)
    private void poll__350869147(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-350869147L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAll()Ljava/util/stream/Stream;", cancellable = true)
    private void getAll_776514986(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(776514986L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pack(J)Ljava/util/List;", cancellable = true)
    private void pack_1613551165(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1613551165L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "unpack(J)V", cancellable = true)
    private void unpack_608766239(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(608766239L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hasScheduledTick(Lnet/minecraft/core/BlockPos;Ljava/lang/Object;)Z", cancellable = true)
    private void hasScheduledTick__99236009(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-99236009L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "setOnTickAdded(Ljava/util/function/BiConsumer;)V", cancellable = true)
    private void setOnTickAdded__452370600(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-452370600L))
            info.cancel();
    }


}
