package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.ticks.LevelChunkTicks.class)
public class LevelChunkTicks_118225857Mixin {
        @Inject(at = @At("HEAD"), method = "count()I", cancellable = true)
    private void count_156488102(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(156488102L))
            info.setReturnValue(1071847511);
    }

    @Inject(at = @At("HEAD"), method = "schedule(Lnet/minecraft/world/ticks/ScheduledTick;)V", cancellable = true)
    private void schedule_1981647754(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1981647754L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "peek()Lnet/minecraft/world/ticks/ScheduledTick;", cancellable = true)
    private void peek_1108260548(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1108260548L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "removeIf(Ljava/util/function/Predicate;)V", cancellable = true)
    private void removeIf_188582402(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(188582402L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "poll()Lnet/minecraft/world/ticks/ScheduledTick;", cancellable = true)
    private void poll_1108260548(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1108260548L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAll()Ljava/util/stream/Stream;", cancellable = true)
    private void getAll__92480459(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-92480459L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pack(J)Ljava/util/List;", cancellable = true)
    private void pack_593542838(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(593542838L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setOnTickAdded(Ljava/util/function/BiConsumer;)V", cancellable = true)
    private void setOnTickAdded__1619925034(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1619925034L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "unpack(J)V", cancellable = true)
    private void unpack_1333066349(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1333066349L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hasScheduledTick(Lnet/minecraft/core/BlockPos;Ljava/lang/Object;)Z", cancellable = true)
    private void hasScheduledTick__1897787417(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1897787417L))
            info.setReturnValue(false);
    }


}
