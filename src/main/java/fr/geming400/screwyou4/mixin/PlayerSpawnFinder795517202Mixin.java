package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.level.PlayerSpawnFinder.class)
public class PlayerSpawnFinder795517202Mixin {
        @Inject(at = @At("HEAD"), method = "findSpawn(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/core/BlockPos;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private static void findSpawn_599500580(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(599500580L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }

    @Inject(at = @At("HEAD"), method = "getSpawnPosInChunk(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/level/ChunkPos;)Lnet/minecraft/core/BlockPos;", cancellable = true)
    private static void getSpawnPosInChunk_1515967816(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1515967816L))
            info.setReturnValue(null);
    }


}
