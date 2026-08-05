package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.profiling.jfr.JvmProfiler.NoOpProfiler.class)
public class NoOpProfiler_1956476109Mixin {
        @Inject(at = @At("HEAD"), method = "start(Lnet/minecraft/util/profiling/jfr/Environment;)Z", cancellable = true)
    private void start_433007162(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(433007162L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "stop()Ljava/nio/file/Path;", cancellable = true)
    private void stop_822112426(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(822112426L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isRunning()Z", cancellable = true)
    private void isRunning_1994754691(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1994754691L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isAvailable()Z", cancellable = true)
    private void isAvailable_1994754691(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1994754691L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "onServerTick(F)V", cancellable = true)
    private void onServerTick__1127344779(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1127344779L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onPacketSent(Lnet/minecraft/network/ConnectionProtocol;Lnet/minecraft/network/protocol/PacketType;Ljava/net/SocketAddress;I)V", cancellable = true)
    private void onPacketSent_1926212028(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1926212028L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onPacketReceived(Lnet/minecraft/network/ConnectionProtocol;Lnet/minecraft/network/protocol/PacketType;Ljava/net/SocketAddress;I)V", cancellable = true)
    private void onPacketReceived_1926212028(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1926212028L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onRegionFileRead(Lnet/minecraft/world/level/chunk/storage/RegionStorageInfo;Lnet/minecraft/world/level/ChunkPos;Lnet/minecraft/world/level/chunk/storage/RegionFileVersion;I)V", cancellable = true)
    private void onRegionFileRead_263556631(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(263556631L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onChunkGenerate(Lnet/minecraft/world/level/ChunkPos;Lnet/minecraft/resources/ResourceKey;Ljava/lang/String;)Lnet/minecraft/util/profiling/jfr/callback/ProfiledDuration;", cancellable = true)
    private void onChunkGenerate_2131953498(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2131953498L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onRegionFileWrite(Lnet/minecraft/world/level/chunk/storage/RegionStorageInfo;Lnet/minecraft/world/level/ChunkPos;Lnet/minecraft/world/level/chunk/storage/RegionFileVersion;I)V", cancellable = true)
    private void onRegionFileWrite_263556631(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(263556631L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onStructureGenerate(Lnet/minecraft/world/level/ChunkPos;Lnet/minecraft/resources/ResourceKey;Lnet/minecraft/core/Holder;)Lnet/minecraft/util/profiling/jfr/callback/ProfiledDuration;", cancellable = true)
    private void onStructureGenerate__1937055835(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1937055835L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onWorldLoadedStarted()Lnet/minecraft/util/profiling/jfr/callback/ProfiledDuration;", cancellable = true)
    private void onWorldLoadedStarted__1818024772(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1818024772L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onClientTick(I)V", cancellable = true)
    private void onClientTick__1124574216(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1124574216L))
            info.cancel();
    }


}
