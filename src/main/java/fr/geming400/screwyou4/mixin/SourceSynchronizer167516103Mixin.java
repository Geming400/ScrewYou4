package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.debug.TrackingDebugSynchronizer.SourceSynchronizer.class)
public class SourceSynchronizer167516103Mixin {
        @Inject(at = @At("HEAD"), method = "registerEntity(Ljava/util/UUID;Lnet/minecraft/util/debug/DebugValueSource$ValueGetter;)V", cancellable = true)
    private void registerEntity__1882572489(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1882572489L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "dropBlockEntity(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void dropBlockEntity__1219731427(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1219731427L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "dropChunk(Lnet/minecraft/world/level/ChunkPos;)V", cancellable = true)
    private void dropChunk_1682398310(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1682398310L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "registerBlockEntity(Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/debug/DebugValueSource$ValueGetter;)V", cancellable = true)
    private void registerBlockEntity__580014793(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-580014793L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "dropEntity(Lnet/minecraft/world/entity/Entity;)V", cancellable = true)
    private void dropEntity__284208557(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-284208557L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "registerChunk(Lnet/minecraft/world/level/ChunkPos;Lnet/minecraft/util/debug/DebugValueSource$ValueGetter;)V", cancellable = true)
    private void registerChunk_781081119(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(781081119L))
            info.cancel();
    }


}
