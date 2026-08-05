package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.chunk.EmptyLevelChunk.class)
public class EmptyLevelChunk1687625256Mixin {
        @Inject(at = @At("HEAD"), method = "isEmpty()Z", cancellable = true)
    private void isEmpty_1725903839(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1725903839L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getFluidState(Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/material/FluidState;", cancellable = true)
    private void getFluidState__1161165267(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1161165267L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBlockEntity(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/chunk/LevelChunk$EntityCreationType;)Lnet/minecraft/world/level/block/entity/BlockEntity;", cancellable = true)
    private void getBlockEntity_1222200426(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1222200426L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getLightEmission(Lnet/minecraft/core/BlockPos;)I", cancellable = true)
    private void getLightEmission_1856379362(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1856379362L))
            info.setReturnValue(-1148210639);
    }

    @Inject(at = @At("HEAD"), method = "setBlockState(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;I)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void setBlockState_1749622784(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1749622784L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getFullStatus()Lnet/minecraft/server/level/FullChunkStatus;", cancellable = true)
    private void getFullStatus_234033513(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(234033513L))
            info.setReturnValue(net.minecraft.server.level.FullChunkStatus.FULL);
    }

    @Inject(at = @At("HEAD"), method = "addAndRegisterBlockEntity(Lnet/minecraft/world/level/block/entity/BlockEntity;)V", cancellable = true)
    private void addAndRegisterBlockEntity_1403928488(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1403928488L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setBlockEntity(Lnet/minecraft/world/level/block/entity/BlockEntity;)V", cancellable = true)
    private void setBlockEntity_1403928488(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1403928488L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "removeBlockEntity(Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void removeBlockEntity_1856391855(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1856391855L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getNoiseBiome(III)Lnet/minecraft/core/Holder;", cancellable = true)
    private void getNoiseBiome__1205313987(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1205313987L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBlockState(Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getBlockState_2086251202(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2086251202L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isYSpaceEmpty(II)Z", cancellable = true)
    private void isYSpaceEmpty_691749631(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(691749631L))
            info.setReturnValue(false);
    }


}
