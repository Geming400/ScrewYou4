package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.ticks.LevelTicks.class)
public class LevelTicks337673456Mixin {
        @Inject(at = @At("HEAD"), method = "count()I", cancellable = true)
    private void count_375935702(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(375935702L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "schedule(Lnet/minecraft/world/ticks/ScheduledTick;)V", cancellable = true)
    private void schedule__2093871942(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2093871942L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tick(JILjava/util/function/BiConsumer;)V", cancellable = true)
    private void tick__1944565401(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1944565401L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "copyArea(Lnet/minecraft/world/level/levelgen/structure/BoundingBox;Lnet/minecraft/core/Vec3i;)V", cancellable = true)
    private void copyArea__1372436433(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1372436433L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "clearArea(Lnet/minecraft/world/level/levelgen/structure/BoundingBox;)V", cancellable = true)
    private void clearArea_1910169774(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1910169774L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "copyAreaFrom(Lnet/minecraft/world/ticks/LevelTicks;Lnet/minecraft/world/level/levelgen/structure/BoundingBox;Lnet/minecraft/core/Vec3i;)V", cancellable = true)
    private void copyAreaFrom__658599998(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-658599998L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addContainer(Lnet/minecraft/world/level/ChunkPos;Lnet/minecraft/world/ticks/LevelChunkTicks;)V", cancellable = true)
    private void addContainer_451050219(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(451050219L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hasScheduledTick(Lnet/minecraft/core/BlockPos;Ljava/lang/Object;)Z", cancellable = true)
    private void hasScheduledTick__1678339817(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1678339817L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "willTickThisTick(Lnet/minecraft/core/BlockPos;Ljava/lang/Object;)Z", cancellable = true)
    private void willTickThisTick__1678339817(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1678339817L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "removeContainer(Lnet/minecraft/world/level/ChunkPos;)V", cancellable = true)
    private void removeContainer_1852555663(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1852555663L))
            info.cancel();
    }


}
