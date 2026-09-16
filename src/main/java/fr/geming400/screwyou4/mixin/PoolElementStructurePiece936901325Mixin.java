package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.PoolElementStructurePiece.class)
public class PoolElementStructurePiece936901325Mixin {
        @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1707324354(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1707324354L))
            info.setReturnValue("`eR0w[\uFCF0Ve.HtHACBiz,Xp\u92FD\u724C&h,>Bm56\u4446,\u982E4\u3254CM\u83A97wFame{\"^9@o\u5730z\u7AFAxgy\u6DFD9`{B)(c4 \"M|@%\uD448\u3BA1$(\u3E42Jp&\u636E\u9EC6kU");
    }

    @Inject(at = @At("HEAD"), method = "move(III)V", cancellable = true)
    private void move__134245974(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-134245974L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getElement()Lnet/minecraft/world/level/levelgen/structure/pools/StructurePoolElement;", cancellable = true)
    private void getElement_592350947(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(592350947L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPosition()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void getPosition_1623058831(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1623058831L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRotation()Lnet/minecraft/world/level/block/Rotation;", cancellable = true)
    private void getRotation_42216179(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(42216179L))
            info.setReturnValue(net.minecraft.world.level.block.Rotation.CLOCKWISE_90);
    }

    @Inject(at = @At("HEAD"), method = "postProcess(Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/StructureManager;Lnet/minecraft/world/level/chunk/ChunkGenerator;Lnet/minecraft/util/RandomSource;Lnet/minecraft/world/level/levelgen/structure/BoundingBox;Lnet/minecraft/world/level/ChunkPos;Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void postProcess_260543005(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(260543005L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addJunction(Lnet/minecraft/world/level/levelgen/structure/pools/JigsawJunction;)V", cancellable = true)
    private void addJunction_1521518076(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1521518076L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getGroundLevelDelta()I", cancellable = true)
    private void getGroundLevelDelta__1377756062(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1377756062L))
            info.setReturnValue(809505068);
    }

    @Inject(at = @At("HEAD"), method = "getJunctions()Ljava/util/List;", cancellable = true)
    private void getJunctions_788238182(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(788238182L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "place(Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/StructureManager;Lnet/minecraft/world/level/chunk/ChunkGenerator;Lnet/minecraft/util/RandomSource;Lnet/minecraft/world/level/levelgen/structure/BoundingBox;Lnet/minecraft/core/BlockPos;Z)V", cancellable = true)
    private void place_1716496073(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1716496073L))
            info.cancel();
    }


}
