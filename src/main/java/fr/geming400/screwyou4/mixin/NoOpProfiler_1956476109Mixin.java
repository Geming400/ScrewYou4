package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.profiling.jfr.JvmProfiler.NoOpProfiler.class)
public class NoOpProfiler_1956476109Mixin {
        @Inject(at = @At("HEAD"), method = "start(Lnet/minecraft/util/profiling/jfr/Environment;)Z", cancellable = true)
    private void start__299827560(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-299827560L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "stop()Ljava/nio/file/Path;", cancellable = true)
    private void stop__100724052(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-100724052L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isRunning()Z", cancellable = true)
    private void isRunning_1982342766(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1982342766L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isAvailable()Z", cancellable = true)
    private void isAvailable__1649156828(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1649156828L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "onWorldLoadedStarted()Lnet/minecraft/util/profiling/jfr/callback/ProfiledDuration;", cancellable = true)
    private void onWorldLoadedStarted_770541381(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(770541381L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onServerTick(F)V", cancellable = true)
    private void onServerTick_1400423668(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1400423668L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onPacketReceived(Lnet/minecraft/network/ConnectionProtocol;Lnet/minecraft/network/protocol/PacketType;Ljava/net/SocketAddress;I)V", cancellable = true)
    private void onPacketReceived__1995711884(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1995711884L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onPacketSent(Lnet/minecraft/network/ConnectionProtocol;Lnet/minecraft/network/protocol/PacketType;Ljava/net/SocketAddress;I)V", cancellable = true)
    private void onPacketSent_963210205(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(963210205L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onClientTick(I)V", cancellable = true)
    private void onClientTick_1460520447(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1460520447L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onStructureGenerate(Lnet/minecraft/world/level/ChunkPos;Lnet/minecraft/resources/ResourceKey;Lnet/minecraft/core/Holder;)Lnet/minecraft/util/profiling/jfr/callback/ProfiledDuration;", cancellable = true)
    private void onStructureGenerate__505176306(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-505176306L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onChunkGenerate(Lnet/minecraft/world/level/ChunkPos;Lnet/minecraft/resources/ResourceKey;Ljava/lang/String;)Lnet/minecraft/util/profiling/jfr/callback/ProfiledDuration;", cancellable = true)
    private void onChunkGenerate_1896312343(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1896312343L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onRegionFileRead(Lnet/minecraft/world/level/chunk/storage/RegionStorageInfo;Lnet/minecraft/world/level/ChunkPos;Lnet/minecraft/world/level/chunk/storage/RegionFileVersion;I)V", cancellable = true)
    private void onRegionFileRead_1273138716(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1273138716L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onRegionFileWrite(Lnet/minecraft/world/level/chunk/storage/RegionStorageInfo;Lnet/minecraft/world/level/ChunkPos;Lnet/minecraft/world/level/chunk/storage/RegionFileVersion;I)V", cancellable = true)
    private void onRegionFileWrite__1494963865(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1494963865L))
            info.cancel();
    }


}
