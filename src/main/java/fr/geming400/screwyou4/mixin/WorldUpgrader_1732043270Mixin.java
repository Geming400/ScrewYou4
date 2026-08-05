package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.worldupdate.WorldUpgrader.class)
public class WorldUpgrader_1732043270Mixin {
        @Inject(at = @At("HEAD"), method = "cancel()V", cancellable = true)
    private void cancel_1770318008(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1770318008L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "close()V", cancellable = true)
    private void close_1770318008(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1770318008L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "levels()Ljava/util/Set;", cancellable = true)
    private void levels__96992217(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-96992217L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStatus()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getStatus__444865896(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-444865896L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "verifyChunkPos(Lnet/minecraft/world/level/ChunkPos;Lnet/minecraft/nbt/CompoundTag;)Z", cancellable = true)
    private static void verifyChunkPos__67387821(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-67387821L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getDataFixContextTag(Lnet/minecraft/core/Registry;Lnet/minecraft/resources/ResourceKey;)Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private static void getDataFixContextTag__1875436901(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1875436901L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "verifyChunkPosAndEraseCache(Lnet/minecraft/world/level/ChunkPos;Lnet/minecraft/nbt/CompoundTag;)Z", cancellable = true)
    private static void verifyChunkPosAndEraseCache__67387821(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-67387821L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getTotalProgress()F", cancellable = true)
    private void getTotalProgress_1770302632(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1770302632L))
            info.setReturnValue(9.914474E8F);
    }

    @Inject(at = @At("HEAD"), method = "getTotalChunks()I", cancellable = true)
    private void getTotalChunks_1770305515(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1770305515L))
            info.setReturnValue(-2100660839);
    }

    @Inject(at = @At("HEAD"), method = "getConverted()I", cancellable = true)
    private void getConverted_1770305515(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1770305515L))
            info.setReturnValue(-2100660839);
    }

    @Inject(at = @At("HEAD"), method = "getSkipped()I", cancellable = true)
    private void getSkipped_1770305515(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1770305515L))
            info.setReturnValue(-2100660839);
    }

    @Inject(at = @At("HEAD"), method = "isFinished()Z", cancellable = true)
    private void isFinished_1770321852(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1770321852L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "dimensionProgress(Lnet/minecraft/resources/ResourceKey;)F", cancellable = true)
    private void dimensionProgress_1919697196(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1919697196L))
            info.setReturnValue(9.914474E8F);
    }


}
