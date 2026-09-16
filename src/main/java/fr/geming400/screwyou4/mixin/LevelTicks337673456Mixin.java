package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.ticks.LevelTicks.class)
public class LevelTicks337673456Mixin {
        @Inject(at = @At("HEAD"), method = "count()I", cancellable = true)
    private void count__750496985(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-750496985L))
            info.setReturnValue(404030653);
    }

    @Inject(at = @At("HEAD"), method = "schedule(Lnet/minecraft/world/ticks/ScheduledTick;)V", cancellable = true)
    private void schedule_200650513(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(200650513L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tick(JILjava/util/function/BiConsumer;)V", cancellable = true)
    private void tick_1201765700(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1201765700L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "copyArea(Lnet/minecraft/world/level/levelgen/structure/BoundingBox;Lnet/minecraft/core/Vec3i;)V", cancellable = true)
    private void copyArea__1684086579(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1684086579L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hasScheduledTick(Lnet/minecraft/core/BlockPos;Ljava/lang/Object;)Z", cancellable = true)
    private void hasScheduledTick_120211591(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(120211591L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "willTickThisTick(Lnet/minecraft/core/BlockPos;Ljava/lang/Object;)Z", cancellable = true)
    private void willTickThisTick__1699399903(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1699399903L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "clearArea(Lnet/minecraft/world/level/levelgen/structure/BoundingBox;)V", cancellable = true)
    private void clearArea__651285260(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-651285260L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "copyAreaFrom(Lnet/minecraft/world/ticks/LevelTicks;Lnet/minecraft/world/level/levelgen/structure/BoundingBox;Lnet/minecraft/core/Vec3i;)V", cancellable = true)
    private void copyAreaFrom_1889727958(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1889727958L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "removeContainer(Lnet/minecraft/world/level/ChunkPos;)V", cancellable = true)
    private void removeContainer__1225570862(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1225570862L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addContainer(Lnet/minecraft/world/level/ChunkPos;Lnet/minecraft/world/ticks/LevelChunkTicks;)V", cancellable = true)
    private void addContainer__858823733(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-858823733L))
            info.cancel();
    }


}
