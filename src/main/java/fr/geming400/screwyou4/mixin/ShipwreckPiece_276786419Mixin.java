package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.structures.ShipwreckPieces.ShipwreckPiece.class)
public class ShipwreckPiece_276786419Mixin {
        @Inject(at = @At("HEAD"), method = "adjustPositionHeight(I)V", cancellable = true)
    private void adjustPositionHeight_1490703390(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1490703390L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "calculateBeachedPosition(ILnet/minecraft/util/RandomSource;)I", cancellable = true)
    private void calculateBeachedPosition__1634921697(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1634921697L))
            info.setReturnValue(-109373131);
    }

    @Inject(at = @At("HEAD"), method = "isTooBigToFitInWorldGenRegion()Z", cancellable = true)
    private void isTooBigToFitInWorldGenRegion_315065001(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(315065001L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "postProcess(Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/StructureManager;Lnet/minecraft/world/level/chunk/ChunkGenerator;Lnet/minecraft/util/RandomSource;Lnet/minecraft/world/level/levelgen/structure/BoundingBox;Lnet/minecraft/world/level/ChunkPos;Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void postProcess__1943636525(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1943636525L))
            info.cancel();
    }


}
