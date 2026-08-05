package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.multiplayer.ClientChunkCache.class)
public class ClientChunkCache_1464180132Mixin {
        @Inject(at = @At("HEAD"), method = "drop(Lnet/minecraft/world/level/ChunkPos;)V", cancellable = true)
    private void drop__1315904958(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1315904958L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tick(Ljava/util/function/BooleanSupplier;Z)V", cancellable = true)
    private void tick__1337131122(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1337131122L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getLevel()Lnet/minecraft/world/level/BlockGetter;", cancellable = true)
    private void getLevel__1200196533(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1200196533L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onSectionEmptinessChanged(IIIZ)V", cancellable = true)
    private void onSectionEmptinessChanged__1200747993(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1200747993L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "replaceWithPacketData(IILnet/minecraft/network/FriendlyByteBuf;Ljava/util/Map;Ljava/util/function/Consumer;)Lnet/minecraft/world/level/chunk/LevelChunk;", cancellable = true)
    private void replaceWithPacketData__147283601(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-147283601L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "replaceBiomes(IILnet/minecraft/network/FriendlyByteBuf;)V", cancellable = true)
    private void replaceBiomes_1966270978(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1966270978L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getChunk(IILnet/minecraft/world/level/chunk/status/ChunkStatus;Z)Lnet/minecraft/world/level/chunk/ChunkAccess;", cancellable = true)
    private void getChunk__258394065(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-258394065L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getChunk(IILnet/minecraft/world/level/chunk/status/ChunkStatus;Z)Lnet/minecraft/world/level/chunk/LevelChunk;", cancellable = true)
    private void getChunk__1935906673(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1935906673L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getLightEngine()Lnet/minecraft/world/level/lighting/LevelLightEngine;", cancellable = true)
    private void getLightEngine__1924451860(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1924451860L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "gatherStats()Ljava/lang/String;", cancellable = true)
    private void gatherStats_328719660(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(328719660L))
            info.setReturnValue("o?>^\u8E00\u09EF{58!Yt)#$B9\uB14DU+ \u30D6eXR;\uC3C6w`.-xB((6X\uA3C76@v*\u22ACc\uFBE203fmA.\u3D63=Dc/Wu:n\u7BAA& Dye:oHE");
    }

    @Inject(at = @At("HEAD"), method = "flipUpdateTrackingSets()V", cancellable = true)
    private void flipUpdateTrackingSets_1502454870(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1502454870L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "removedLoadedChunks()Lit/unimi/dsi/fastutil/longs/LongOpenHashSet;", cancellable = true)
    private void removedLoadedChunks__338834074(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-338834074L))
            info.setReturnValue(new it.unimi.dsi.fastutil.longs.LongOpenHashSet());
    }

    @Inject(at = @At("HEAD"), method = "onLightUpdate(Lnet/minecraft/world/level/LightLayer;Lnet/minecraft/core/SectionPos;)V", cancellable = true)
    private void onLightUpdate__1653350838(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1653350838L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addedEmptySections()Lit/unimi/dsi/fastutil/longs/LongOpenHashSet;", cancellable = true)
    private void addedEmptySections__338834074(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-338834074L))
            info.setReturnValue(new it.unimi.dsi.fastutil.longs.LongOpenHashSet());
    }

    @Inject(at = @At("HEAD"), method = "updateViewCenter(II)V", cancellable = true)
    private void updateViewCenter_468300662(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(468300662L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "updateViewRadius(I)V", cancellable = true)
    private void updateViewRadius__1616870193(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1616870193L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getLoadedChunksCount()I", cancellable = true)
    private void getLoadedChunksCount_1502442377(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1502442377L))
            info.setReturnValue(1982265571);
    }

    @Inject(at = @At("HEAD"), method = "removedEmptySections()Lit/unimi/dsi/fastutil/longs/LongOpenHashSet;", cancellable = true)
    private void removedEmptySections__338834074(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-338834074L))
            info.setReturnValue(new it.unimi.dsi.fastutil.longs.LongOpenHashSet());
    }

    @Inject(at = @At("HEAD"), method = "addedLoadedChunks()Lit/unimi/dsi/fastutil/longs/LongOpenHashSet;", cancellable = true)
    private void addedLoadedChunks__338834074(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-338834074L))
            info.setReturnValue(new it.unimi.dsi.fastutil.longs.LongOpenHashSet());
    }


}
