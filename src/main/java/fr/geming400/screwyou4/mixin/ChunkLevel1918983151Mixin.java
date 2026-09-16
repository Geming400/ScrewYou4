package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.level.ChunkLevel.class)
public class ChunkLevel1918983151Mixin {
        @Inject(at = @At("HEAD"), method = "isLoaded(I)Z", cancellable = true)
    private static void isLoaded_2076941734(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2076941734L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "byStatus(Lnet/minecraft/world/level/chunk/status/ChunkStatus;)I", cancellable = true)
    private static void byStatus_415400883(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(415400883L))
            info.setReturnValue(1494825738);
    }

    @Inject(at = @At("HEAD"), method = "byStatus(Lnet/minecraft/server/level/FullChunkStatus;)I", cancellable = true)
    private static void byStatus_1479795142(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1479795142L))
            info.setReturnValue(407037593);
    }

    @Inject(at = @At("HEAD"), method = "isEntityTicking(I)Z", cancellable = true)
    private static void isEntityTicking_961012687(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(961012687L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isBlockTicking(I)Z", cancellable = true)
    private static void isBlockTicking__1607683143(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1607683143L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getStatusAroundFullChunk(I)Lnet/minecraft/world/level/chunk/status/ChunkStatus;", cancellable = true)
    private static void getStatusAroundFullChunk_1316613267(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1316613267L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStatusAroundFullChunk(ILnet/minecraft/world/level/chunk/status/ChunkStatus;)Lnet/minecraft/world/level/chunk/status/ChunkStatus;", cancellable = true)
    private static void getStatusAroundFullChunk__1137245884(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1137245884L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "generationStatus(I)Lnet/minecraft/world/level/chunk/status/ChunkStatus;", cancellable = true)
    private static void generationStatus_1538135634(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1538135634L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fullStatus(I)Lnet/minecraft/server/level/FullChunkStatus;", cancellable = true)
    private static void fullStatus__595552050(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-595552050L))
            info.setReturnValue(net.minecraft.server.level.FullChunkStatus.FULL);
    }


}
