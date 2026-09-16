package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.BelowZeroRetrogen.class)
public class BelowZeroRetrogen_218982739Mixin {
        @Inject(at = @At("HEAD"), method = "targetStatus()Lnet/minecraft/world/level/chunk/status/ChunkStatus;", cancellable = true)
    private void targetStatus__1342895197(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1342895197L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBiomeResolver(Lnet/minecraft/world/level/biome/BiomeResolver;Lnet/minecraft/world/level/chunk/ChunkAccess;)Lnet/minecraft/world/level/biome/BiomeResolver;", cancellable = true)
    private static void getBiomeResolver__46333077(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-46333077L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasBedrockHole(II)Z", cancellable = true)
    private void hasBedrockHole_1895315037(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1895315037L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "applyBedrockMask(Lnet/minecraft/world/level/chunk/ProtoChunk;)V", cancellable = true)
    private void applyBedrockMask__826283603(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-826283603L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "replaceOldBedrock(Lnet/minecraft/world/level/chunk/ProtoChunk;)V", cancellable = true)
    private static void replaceOldBedrock__267186026(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-267186026L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hasBedrockHoles()Z", cancellable = true)
    private void hasBedrockHoles__243511358(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-243511358L))
            info.setReturnValue(false);
    }


}
