package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.level.ChunkLevel.class)
public class ChunkLevel1918983151Mixin {
        @Inject(at = @At("HEAD"), method = "isLoaded(I)Z", cancellable = true)
    private static void isLoaded__1162063081(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1162063081L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "fullStatus(I)Lnet/minecraft/server/level/FullChunkStatus;", cancellable = true)
    private static void fullStatus_2086419983(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2086419983L))
            info.setReturnValue(net.minecraft.server.level.FullChunkStatus.BLOCK_TICKING);
    }

    @Inject(at = @At("HEAD"), method = "byStatus(Lnet/minecraft/server/level/FullChunkStatus;)I", cancellable = true)
    private static void byStatus_1893781967(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1893781967L))
            info.setReturnValue(1361559447);
    }

    @Inject(at = @At("HEAD"), method = "byStatus(Lnet/minecraft/world/level/chunk/status/ChunkStatus;)I", cancellable = true)
    private static void byStatus_602364604(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(602364604L))
            info.setReturnValue(-1690600097);
    }

    @Inject(at = @At("HEAD"), method = "generationStatus(I)Lnet/minecraft/world/level/chunk/status/ChunkStatus;", cancellable = true)
    private static void generationStatus_2055937596(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2055937596L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isEntityTicking(I)Z", cancellable = true)
    private static void isEntityTicking__1162063081(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1162063081L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getStatusAroundFullChunk(I)Lnet/minecraft/world/level/chunk/status/ChunkStatus;", cancellable = true)
    private static void getStatusAroundFullChunk_2055937596(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2055937596L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStatusAroundFullChunk(ILnet/minecraft/world/level/chunk/status/ChunkStatus;)Lnet/minecraft/world/level/chunk/status/ChunkStatus;", cancellable = true)
    private static void getStatusAroundFullChunk_696311917(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(696311917L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isBlockTicking(I)Z", cancellable = true)
    private static void isBlockTicking__1162063081(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1162063081L))
            info.setReturnValue(true);
    }


}
