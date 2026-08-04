package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.chunk.LevelChunkSection.class)
public class LevelChunkSection1631846862Mixin {
        @Inject(at = @At("HEAD"), method = "copy()Lnet/minecraft/world/level/chunk/LevelChunkSection;", cancellable = true)
    private void copy_468438132(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(468438132L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "write(Lnet/minecraft/network/FriendlyByteBuf;)V", cancellable = true)
    private void write_1278353741(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1278353741L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "read(Lnet/minecraft/network/FriendlyByteBuf;)V", cancellable = true)
    private void read_1278353741(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1278353741L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "release()V", cancellable = true)
    private void release_1670121601(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1670121601L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "acquire()V", cancellable = true)
    private void acquire_1670121601(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1670121601L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "readBiomes(Lnet/minecraft/network/FriendlyByteBuf;)V", cancellable = true)
    private void readBiomes_1278353741(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1278353741L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getFluidState(III)Lnet/minecraft/world/level/material/FluidState;", cancellable = true)
    private void getFluidState_1694242968(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1694242968L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBlockState(III)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getBlockState_916729219(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(916729219L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSerializedSize()I", cancellable = true)
    private void getSerializedSize_1670109108(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1670109108L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setBlockState(IIILnet/minecraft/world/level/block/state/BlockState;Z)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void setBlockState_1304802618(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1304802618L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setBlockState(IIILnet/minecraft/world/level/block/state/BlockState;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void setBlockState__539004300(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-539004300L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getNoiseBiome(III)Lnet/minecraft/core/Holder;", cancellable = true)
    private void getNoiseBiome__1261092381(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1261092381L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasOnlyAir()Z", cancellable = true)
    private void hasOnlyAir_1670125445(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1670125445L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStates()Lnet/minecraft/world/level/chunk/PalettedContainer;", cancellable = true)
    private void getStates_137098008(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(137098008L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBiomes()Lnet/minecraft/world/level/chunk/PalettedContainerRO;", cancellable = true)
    private void getBiomes__307702917(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-307702917L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fillBiomesFromNoise(Lnet/minecraft/world/level/biome/BiomeResolver;Lnet/minecraft/world/level/biome/Climate$Sampler;III)V", cancellable = true)
    private void fillBiomesFromNoise__1718975299(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1718975299L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isRandomlyTicking()Z", cancellable = true)
    private void isRandomlyTicking_1670125445(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1670125445L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "maybeHas(Ljava/util/function/Predicate;)Z", cancellable = true)
    private void maybeHas_1702207252(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1702207252L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasFluid()Z", cancellable = true)
    private void hasFluid_1670125445(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1670125445L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isRandomlyTickingBlocks()Z", cancellable = true)
    private void isRandomlyTickingBlocks_1670125445(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1670125445L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "recalcBlockCounts()V", cancellable = true)
    private void recalcBlockCounts_1670121601(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1670121601L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isRandomlyTickingFluids()Z", cancellable = true)
    private void isRandomlyTickingFluids_1670125445(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1670125445L))
            info.setReturnValue(null);
    }


}
