package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.BelowZeroRetrogen.class)
public class BelowZeroRetrogen_218982739Mixin {
        @Inject(at = @At("HEAD"), method = "hasBedrockHole(II)Z", cancellable = true)
    private void hasBedrockHole__776892887(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-776892887L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBiomeResolver(Lnet/minecraft/world/level/biome/BiomeResolver;Lnet/minecraft/world/level/chunk/ChunkAccess;)Lnet/minecraft/world/level/biome/BiomeResolver;", cancellable = true)
    private static void getBiomeResolver__1752012165(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1752012165L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "targetStatus()Lnet/minecraft/world/level/chunk/status/ChunkStatus;", cancellable = true)
    private void targetStatus_236262336(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(236262336L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasBedrockHoles()Z", cancellable = true)
    private void hasBedrockHoles_257261321(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(257261321L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "replaceOldBedrock(Lnet/minecraft/world/level/chunk/ProtoChunk;)V", cancellable = true)
    private static void replaceOldBedrock_1208036681(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1208036681L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "applyBedrockMask(Lnet/minecraft/world/level/chunk/ProtoChunk;)V", cancellable = true)
    private void applyBedrockMask_1208036433(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1208036433L))
            info.cancel();
    }


}
