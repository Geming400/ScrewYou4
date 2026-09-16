package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.chunk.EmptyLevelChunk.class)
public class EmptyLevelChunk1687625256Mixin {
        @Inject(at = @At("HEAD"), method = "isEmpty()Z", cancellable = true)
    private void isEmpty__1548225668(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1548225668L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getBlockState(Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getBlockState__1067459448(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1067459448L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getFluidState(Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/material/FluidState;", cancellable = true)
    private void getFluidState_519054602(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(519054602L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getLightEmission(Lnet/minecraft/core/BlockPos;)I", cancellable = true)
    private void getLightEmission_727526697(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(727526697L))
            info.setReturnValue(115409294);
    }

    @Inject(at = @At("HEAD"), method = "setBlockEntity(Lnet/minecraft/world/level/block/entity/BlockEntity;)V", cancellable = true)
    private void setBlockEntity__1647791526(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1647791526L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addAndRegisterBlockEntity(Lnet/minecraft/world/level/block/entity/BlockEntity;)V", cancellable = true)
    private void addAndRegisterBlockEntity__257396559(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-257396559L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "removeBlockEntity(Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void removeBlockEntity_2028964699(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2028964699L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getFullStatus()Lnet/minecraft/server/level/FullChunkStatus;", cancellable = true)
    private void getFullStatus_1511626432(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1511626432L))
            info.setReturnValue(net.minecraft.server.level.FullChunkStatus.BLOCK_TICKING);
    }

    @Inject(at = @At("HEAD"), method = "setBlockState(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;I)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void setBlockState__533296762(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-533296762L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getNoiseBiome(III)Lnet/minecraft/core/Holder;", cancellable = true)
    private void getNoiseBiome__313302823(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-313302823L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBlockEntity(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/chunk/LevelChunk$EntityCreationType;)Lnet/minecraft/world/level/block/entity/BlockEntity;", cancellable = true)
    private void getBlockEntity_389372164(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(389372164L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isYSpaceEmpty(II)Z", cancellable = true)
    private void isYSpaceEmpty__617661303(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-617661303L))
            info.setReturnValue(false);
    }


}
