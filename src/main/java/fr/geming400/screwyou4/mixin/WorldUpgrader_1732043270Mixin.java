package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.worldupdate.WorldUpgrader.class)
public class WorldUpgrader_1732043270Mixin {
        @Inject(at = @At("HEAD"), method = "cancel()V", cancellable = true)
    private void cancel_107394686(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(107394686L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close__382532160(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-382532160L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "levels()Ljava/util/Set;", cancellable = true)
    private void levels__821034408(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-821034408L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStatus()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getStatus__1772178560(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1772178560L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTotalProgress()F", cancellable = true)
    private void getTotalProgress_1831691181(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1831691181L))
            info.setReturnValue(8.525958E8F);
    }

    @Inject(at = @At("HEAD"), method = "getTotalChunks()I", cancellable = true)
    private void getTotalChunks__1327487593(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1327487593L))
            info.setReturnValue(-1997840814);
    }

    @Inject(at = @At("HEAD"), method = "getConverted()I", cancellable = true)
    private void getConverted_241575567(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(241575567L))
            info.setReturnValue(-968895217);
    }

    @Inject(at = @At("HEAD"), method = "getSkipped()I", cancellable = true)
    private void getSkipped__2031558351(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2031558351L))
            info.setReturnValue(-496943749);
    }

    @Inject(at = @At("HEAD"), method = "isFinished()Z", cancellable = true)
    private void isFinished__1628699264(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1628699264L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "dimensionProgress(Lnet/minecraft/resources/ResourceKey;)F", cancellable = true)
    private void dimensionProgress_1510883103(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1510883103L))
            info.setReturnValue(8.525958E8F);
    }

    @Inject(at = @At("HEAD"), method = "verifyChunkPosAndEraseCache(Lnet/minecraft/world/level/ChunkPos;Lnet/minecraft/nbt/CompoundTag;)Z", cancellable = true)
    private static void verifyChunkPosAndEraseCache_1328123046(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1328123046L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "verifyChunkPos(Lnet/minecraft/world/level/ChunkPos;Lnet/minecraft/nbt/CompoundTag;)Z", cancellable = true)
    private static void verifyChunkPos__2026092909(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2026092909L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getDataFixContextTag(Lnet/minecraft/core/Registry;Lnet/minecraft/resources/ResourceKey;)Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private static void getDataFixContextTag_583020923(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(583020923L))
            info.setReturnValue(new net.minecraft.nbt.CompoundTag());
    }


}
