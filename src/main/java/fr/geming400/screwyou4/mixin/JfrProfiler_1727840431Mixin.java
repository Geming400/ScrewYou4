package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.profiling.jfr.JfrProfiler.class)
public class JfrProfiler_1727840431Mixin {
        @Inject(at = @At("HEAD"), method = "getInstance()Lnet/minecraft/util/profiling/jfr/JfrProfiler;", cancellable = true)
    private static void getInstance_1102619579(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1102619579L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "start(Lnet/minecraft/util/profiling/jfr/Environment;)Z", cancellable = true)
    private void start__528463238(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-528463238L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "stop()Ljava/nio/file/Path;", cancellable = true)
    private void stop__329359730(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-329359730L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isRunning()Z", cancellable = true)
    private void isRunning_1753707088(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1753707088L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isAvailable()Z", cancellable = true)
    private void isAvailable__1877792506(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1877792506L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "onWorldLoadedStarted()Lnet/minecraft/util/profiling/jfr/callback/ProfiledDuration;", cancellable = true)
    private void onWorldLoadedStarted_541905703(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(541905703L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onServerTick(F)V", cancellable = true)
    private void onServerTick_1171787990(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1171787990L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onPacketReceived(Lnet/minecraft/network/ConnectionProtocol;Lnet/minecraft/network/protocol/PacketType;Ljava/net/SocketAddress;I)V", cancellable = true)
    private void onPacketReceived_2070619734(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2070619734L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onPacketSent(Lnet/minecraft/network/ConnectionProtocol;Lnet/minecraft/network/protocol/PacketType;Ljava/net/SocketAddress;I)V", cancellable = true)
    private void onPacketSent_734574527(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(734574527L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onClientTick(I)V", cancellable = true)
    private void onClientTick_1231884769(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1231884769L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onStructureGenerate(Lnet/minecraft/world/level/ChunkPos;Lnet/minecraft/resources/ResourceKey;Lnet/minecraft/core/Holder;)Lnet/minecraft/util/profiling/jfr/callback/ProfiledDuration;", cancellable = true)
    private void onStructureGenerate__733811984(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-733811984L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onChunkGenerate(Lnet/minecraft/world/level/ChunkPos;Lnet/minecraft/resources/ResourceKey;Ljava/lang/String;)Lnet/minecraft/util/profiling/jfr/callback/ProfiledDuration;", cancellable = true)
    private void onChunkGenerate_1667676665(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1667676665L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onRegionFileRead(Lnet/minecraft/world/level/chunk/storage/RegionStorageInfo;Lnet/minecraft/world/level/ChunkPos;Lnet/minecraft/world/level/chunk/storage/RegionFileVersion;I)V", cancellable = true)
    private void onRegionFileRead_1044503038(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1044503038L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onRegionFileWrite(Lnet/minecraft/world/level/chunk/storage/RegionStorageInfo;Lnet/minecraft/world/level/ChunkPos;Lnet/minecraft/world/level/chunk/storage/RegionFileVersion;I)V", cancellable = true)
    private void onRegionFileWrite__1723599543(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1723599543L))
            info.cancel();
    }


}
