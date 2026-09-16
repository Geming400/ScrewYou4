package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.chunk.LevelChunkSection.class)
public class LevelChunkSection1631846862Mixin {
        @Inject(at = @At("HEAD"), method = "copy()Lnet/minecraft/world/level/chunk/LevelChunkSection;", cancellable = true)
    private void copy__1334305441(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1334305441L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "write(Lnet/minecraft/network/FriendlyByteBuf;)V", cancellable = true)
    private void write_202860204(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(202860204L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "read(Lnet/minecraft/network/FriendlyByteBuf;)V", cancellable = true)
    private void read_246936035(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(246936035L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "release()V", cancellable = true)
    private void release__386544422(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-386544422L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "acquire()V", cancellable = true)
    private void acquire_1345961323(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1345961323L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getSerializedSize()I", cancellable = true)
    private void getSerializedSize__1410380807(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1410380807L))
            info.setReturnValue(-1877586629);
    }

    @Inject(at = @At("HEAD"), method = "isRandomlyTicking()Z", cancellable = true)
    private void isRandomlyTicking_1994052474(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1994052474L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getFluidState(III)Lnet/minecraft/world/level/material/FluidState;", cancellable = true)
    private void getFluidState_822645173(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(822645173L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setBlockState(IIILnet/minecraft/world/level/block/state/BlockState;Z)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void setBlockState_839449152(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(839449152L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setBlockState(IIILnet/minecraft/world/level/block/state/BlockState;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void setBlockState__415468370(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-415468370L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getNoiseBiome(III)Lnet/minecraft/core/Holder;", cancellable = true)
    private void getNoiseBiome__369081217(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-369081217L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBlockState(III)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getBlockState_122292937(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(122292937L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasOnlyAir()Z", cancellable = true)
    private void hasOnlyAir__249379839(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-249379839L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getBiomes()Lnet/minecraft/world/level/chunk/PalettedContainerRO;", cancellable = true)
    private void getBiomes_2126376146(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2126376146L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "maybeHas(Ljava/util/function/Predicate;)Z", cancellable = true)
    private void maybeHas__126844734(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-126844734L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "readBiomes(Lnet/minecraft/network/FriendlyByteBuf;)V", cancellable = true)
    private void readBiomes_963666134(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(963666134L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hasFluid()Z", cancellable = true)
    private void hasFluid_1170399797(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1170399797L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "recalcBlockCounts()V", cancellable = true)
    private void recalcBlockCounts_1566590488(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1566590488L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isRandomlyTickingBlocks()Z", cancellable = true)
    private void isRandomlyTickingBlocks__635197996(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-635197996L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isRandomlyTickingFluids()Z", cancellable = true)
    private void isRandomlyTickingFluids__1538492079(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1538492079L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getStates()Lnet/minecraft/world/level/chunk/PalettedContainer;", cancellable = true)
    private void getStates__501658848(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-501658848L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fillBiomesFromNoise(Lnet/minecraft/world/level/biome/BiomeResolver;Lnet/minecraft/world/level/biome/Climate$Sampler;III)V", cancellable = true)
    private void fillBiomesFromNoise_1030867383(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1030867383L))
            info.cancel();
    }


}
