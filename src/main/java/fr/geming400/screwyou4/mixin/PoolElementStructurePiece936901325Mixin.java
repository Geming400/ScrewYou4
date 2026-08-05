package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.structure.PoolElementStructurePiece.class)
public class PoolElementStructurePiece936901325Mixin {
        @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__198559146(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-198559146L))
            info.setReturnValue("Sg8`W튵-凉㳖:)Al?-Z&W;R}S迎KRN0<T+Ssm||H洍b,@[Z酉h&r");
    }

    @Inject(at = @At("HEAD"), method = "move(III)V", cancellable = true)
    private void move_156808921(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(156808921L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getElement()Lnet/minecraft/world/level/levelgen/structure/pools/StructurePoolElement;", cancellable = true)
    private void getElement__767064087(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-767064087L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPosition()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void getPosition__956485554(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-956485554L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "place(Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/StructureManager;Lnet/minecraft/world/level/chunk/ChunkGenerator;Lnet/minecraft/util/RandomSource;Lnet/minecraft/world/level/levelgen/structure/BoundingBox;Lnet/minecraft/core/BlockPos;Z)V", cancellable = true)
    private void place_1692995888(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1692995888L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getRotation()Lnet/minecraft/world/level/block/Rotation;", cancellable = true)
    private void getRotation__561420033(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-561420033L))
            info.setReturnValue(net.minecraft.world.level.block.Rotation.COUNTERCLOCKWISE_90);
    }

    @Inject(at = @At("HEAD"), method = "postProcess(Lnet/minecraft/world/level/WorldGenLevel;Lnet/minecraft/world/level/StructureManager;Lnet/minecraft/world/level/chunk/ChunkGenerator;Lnet/minecraft/util/RandomSource;Lnet/minecraft/world/level/levelgen/structure/BoundingBox;Lnet/minecraft/world/level/ChunkPos;Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void postProcess__1283521618(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1283521618L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getJunctions()Ljava/util/List;", cancellable = true)
    private void getJunctions__1731729155(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1731729155L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getGroundLevelDelta()I", cancellable = true)
    private void getGroundLevelDelta_975163571(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(975163571L))
            info.setReturnValue(1788440953);
    }

    @Inject(at = @At("HEAD"), method = "addJunction(Lnet/minecraft/world/level/levelgen/structure/pools/JigsawJunction;)V", cancellable = true)
    private void addJunction_1485815783(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1485815783L))
            info.cancel();
    }


}
