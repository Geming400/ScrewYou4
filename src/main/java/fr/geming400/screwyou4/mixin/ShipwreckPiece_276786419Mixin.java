package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.structures.ShipwreckPieces.ShipwreckPiece.class)
public class ShipwreckPiece_276786419Mixin {
        @Inject(at = @At("HEAD"), method = "postProcess(Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/StructureManager;Lnet/minecraft/world/level/chunk/ChunkGenerator;Lnet/minecraft/util/RandomSource;Lnet/minecraft/world/level/levelgen/structure/BoundingBox;Lnet/minecraft/world/level/ChunkPos;Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void postProcess__399571902(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-399571902L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "calculateBeachedPosition(ILnet/minecraft/util/RandomSource;)I", cancellable = true)
    private void calculateBeachedPosition__2046294214(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2046294214L))
            info.setReturnValue(-979070788);
    }

    @Inject(at = @At("HEAD"), method = "adjustPositionHeight(I)V", cancellable = true)
    private void adjustPositionHeight_1889513981(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1889513981L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isTooBigToFitInWorldGenRegion()Z", cancellable = true)
    private void isTooBigToFitInWorldGenRegion__414118638(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-414118638L))
            info.setReturnValue(false);
    }


}
