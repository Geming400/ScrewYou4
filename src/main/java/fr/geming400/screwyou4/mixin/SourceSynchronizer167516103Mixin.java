package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.debug.TrackingDebugSynchronizer.SourceSynchronizer.class)
public class SourceSynchronizer167516103Mixin {
        @Inject(at = @At("HEAD"), method = "dropBlockEntity(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void dropBlockEntity_671278910(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(671278910L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "dropChunk(Lnet/minecraft/world/level/ChunkPos;)V", cancellable = true)
    private void dropChunk_355453288(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(355453288L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "registerBlockEntity(Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/debug/DebugValueSource$ValueGetter;)V", cancellable = true)
    private void registerBlockEntity__1768393302(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1768393302L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "dropEntity(Lnet/minecraft/world/entity/Entity;)V", cancellable = true)
    private void dropEntity_800786437(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(800786437L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "registerChunk(Lnet/minecraft/world/level/ChunkPos;Lnet/minecraft/util/debug/DebugValueSource$ValueGetter;)V", cancellable = true)
    private void registerChunk__371453015(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-371453015L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "registerEntity(Ljava/util/UUID;Lnet/minecraft/util/debug/DebugValueSource$ValueGetter;)V", cancellable = true)
    private void registerEntity_785963165(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(785963165L))
            info.cancel();
    }


}
