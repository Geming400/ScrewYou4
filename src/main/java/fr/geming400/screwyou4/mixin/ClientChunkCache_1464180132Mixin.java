package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.multiplayer.ClientChunkCache.class)
public class ClientChunkCache_1464180132Mixin {
        @Inject(at = @At("HEAD"), method = "drop(Lnet/minecraft/world/level/ChunkPos;)V", cancellable = true)
    private void drop__1991635917(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1991635917L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tick(Ljava/util/function/BooleanSupplier;Z)V", cancellable = true)
    private void tick_1513028843(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1513028843L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getLevel()Lnet/minecraft/world/level/BlockGetter;", cancellable = true)
    private void getLevel_1129668029(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1129668029L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onSectionEmptinessChanged(IIIZ)V", cancellable = true)
    private void onSectionEmptinessChanged__1325659711(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1325659711L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getChunk(IILnet/minecraft/world/level/chunk/status/ChunkStatus;Z)Lnet/minecraft/world/level/chunk/LevelChunk;", cancellable = true)
    private void getChunk__1197406216(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1197406216L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getChunk(IILnet/minecraft/world/level/chunk/status/ChunkStatus;Z)Lnet/minecraft/world/level/chunk/ChunkAccess;", cancellable = true)
    private void getChunk_1160283622(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1160283622L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getLightEngine()Lnet/minecraft/world/level/lighting/LevelLightEngine;", cancellable = true)
    private void getLightEngine__2142691734(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2142691734L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "gatherStats()Ljava/lang/String;", cancellable = true)
    private void gatherStats__1611434608(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1611434608L))
            info.setReturnValue("|j.ITPF[$$x+&ZtEq\u808FMM");
    }

    @Inject(at = @At("HEAD"), method = "replaceWithPacketData(IILnet/minecraft/network/FriendlyByteBuf;Ljava/util/Map;Ljava/util/function/Consumer;)Lnet/minecraft/world/level/chunk/LevelChunk;", cancellable = true)
    private void replaceWithPacketData__233157789(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-233157789L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "replaceBiomes(IILnet/minecraft/network/FriendlyByteBuf;)V", cancellable = true)
    private void replaceBiomes__1677913751(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1677913751L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "updateViewCenter(II)V", cancellable = true)
    private void updateViewCenter_1068239123(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1068239123L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "removedEmptySections()Lit/unimi/dsi/fastutil/longs/LongOpenHashSet;", cancellable = true)
    private void removedEmptySections__1852394325(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1852394325L))
            info.setReturnValue(new it.unimi.dsi.fastutil.longs.LongOpenHashSet());
    }

    @Inject(at = @At("HEAD"), method = "addedLoadedChunks()Lit/unimi/dsi/fastutil/longs/LongOpenHashSet;", cancellable = true)
    private void addedLoadedChunks__21876837(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-21876837L))
            info.setReturnValue(new it.unimi.dsi.fastutil.longs.LongOpenHashSet());
    }

    @Inject(at = @At("HEAD"), method = "removedLoadedChunks()Lit/unimi/dsi/fastutil/longs/LongOpenHashSet;", cancellable = true)
    private void removedLoadedChunks__1891027909(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1891027909L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getLoadedChunksCount()I", cancellable = true)
    private void getLoadedChunksCount__1283005125(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1283005125L))
            info.setReturnValue(-506509950);
    }

    @Inject(at = @At("HEAD"), method = "flipUpdateTrackingSets()V", cancellable = true)
    private void flipUpdateTrackingSets__1837613896(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1837613896L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addedEmptySections()Lit/unimi/dsi/fastutil/longs/LongOpenHashSet;", cancellable = true)
    private void addedEmptySections_256714059(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(256714059L))
            info.setReturnValue(new it.unimi.dsi.fastutil.longs.LongOpenHashSet());
    }

    @Inject(at = @At("HEAD"), method = "updateViewRadius(I)V", cancellable = true)
    private void updateViewRadius__459389425(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-459389425L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onLightUpdate(Lnet/minecraft/world/level/LightLayer;Lnet/minecraft/core/SectionPos;)V", cancellable = true)
    private void onLightUpdate__439553942(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-439553942L))
            info.cancel();
    }


}
