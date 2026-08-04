package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.profiling.jfr.JfrProfiler.class)
public class JfrProfiler_1727840431Mixin {
        @Inject(at = @At("HEAD"), method = "getInstance()Lnet/minecraft/util/profiling/jfr/JfrProfiler;", cancellable = true)
    private static void getInstance__1150940560(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1150940560L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "start(Lnet/minecraft/util/profiling/jfr/Environment;)Z", cancellable = true)
    private void start_204371484(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(204371484L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "stop()Ljava/nio/file/Path;", cancellable = true)
    private void stop_593476748(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(593476748L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isRunning()Z", cancellable = true)
    private void isRunning_1766119013(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1766119013L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isAvailable()Z", cancellable = true)
    private void isAvailable_1766119013(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1766119013L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onClientTick(I)V", cancellable = true)
    private void onClientTick__1353209894(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1353209894L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onPacketSent(Lnet/minecraft/network/ConnectionProtocol;Lnet/minecraft/network/protocol/PacketType;Ljava/net/SocketAddress;I)V", cancellable = true)
    private void onPacketSent_1697576350(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1697576350L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onPacketReceived(Lnet/minecraft/network/ConnectionProtocol;Lnet/minecraft/network/protocol/PacketType;Ljava/net/SocketAddress;I)V", cancellable = true)
    private void onPacketReceived_1697576350(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1697576350L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onWorldLoadedStarted()Lnet/minecraft/util/profiling/jfr/callback/ProfiledDuration;", cancellable = true)
    private void onWorldLoadedStarted__2046660450(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2046660450L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onServerTick(F)V", cancellable = true)
    private void onServerTick__1355980457(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1355980457L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onChunkGenerate(Lnet/minecraft/world/level/ChunkPos;Lnet/minecraft/resources/ResourceKey;Ljava/lang/String;)Lnet/minecraft/util/profiling/jfr/callback/ProfiledDuration;", cancellable = true)
    private void onChunkGenerate_1903317820(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1903317820L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onRegionFileWrite(Lnet/minecraft/world/level/chunk/storage/RegionStorageInfo;Lnet/minecraft/world/level/ChunkPos;Lnet/minecraft/world/level/chunk/storage/RegionFileVersion;I)V", cancellable = true)
    private void onRegionFileWrite_34920953(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(34920953L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onStructureGenerate(Lnet/minecraft/world/level/ChunkPos;Lnet/minecraft/resources/ResourceKey;Lnet/minecraft/core/Holder;)Lnet/minecraft/util/profiling/jfr/callback/ProfiledDuration;", cancellable = true)
    private void onStructureGenerate_2129275783(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2129275783L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onRegionFileRead(Lnet/minecraft/world/level/chunk/storage/RegionStorageInfo;Lnet/minecraft/world/level/ChunkPos;Lnet/minecraft/world/level/chunk/storage/RegionFileVersion;I)V", cancellable = true)
    private void onRegionFileRead_34920953(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(34920953L))
            info.cancel();
    }


}
