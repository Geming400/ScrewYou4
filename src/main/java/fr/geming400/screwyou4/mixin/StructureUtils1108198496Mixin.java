package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.gametest.framework.StructureUtils.class)
public class StructureUtils1108198496Mixin {
        @Inject(at = @At("HEAD"), method = "findTestBlocks(Lnet/minecraft/core/BlockPos;ILnet/minecraft/server/level/ServerLevel;)Ljava/util/stream/Stream;", cancellable = true)
    private static void findTestBlocks_1752560067(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1752560067L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStructureBoundingBox(Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/Vec3i;Lnet/minecraft/world/level/block/Rotation;)Lnet/minecraft/world/level/levelgen/structure/BoundingBox;", cancellable = true)
    private static void getStructureBoundingBox__1772708646(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1772708646L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "clearSpaceForStructure(Lnet/minecraft/world/level/levelgen/structure/BoundingBox;Lnet/minecraft/server/level/ServerLevel;)V", cancellable = true)
    private static void clearSpaceForStructure__1011899417(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1011899417L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getRotationForRotationSteps(I)Lnet/minecraft/world/level/block/Rotation;", cancellable = true)
    private static void getRotationForRotationSteps_742289201(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(742289201L))
            info.setReturnValue(net.minecraft.world.level.block.Rotation.CLOCKWISE_90);
    }

    @Inject(at = @At("HEAD"), method = "getRotationStepsForRotation(Lnet/minecraft/world/level/block/Rotation;)I", cancellable = true)
    private static void getRotationStepsForRotation__2091394383(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2091394383L))
            info.setReturnValue(-273938582);
    }

    @Inject(at = @At("HEAD"), method = "getTransformedFarCorner(Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/Vec3i;Lnet/minecraft/world/level/block/Rotation;)Lnet/minecraft/core/BlockPos;", cancellable = true)
    private static void getTransformedFarCorner__1420965855(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1420965855L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "findNearestTest(Lnet/minecraft/core/BlockPos;ILnet/minecraft/server/level/ServerLevel;)Ljava/util/Optional;", cancellable = true)
    private static void findNearestTest_533317968(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(533317968L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "lookedAtTestPos(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/entity/Entity;Lnet/minecraft/server/level/ServerLevel;)Ljava/util/stream/Stream;", cancellable = true)
    private static void lookedAtTestPos_1492589091(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1492589091L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createNewEmptyTest(Lnet/minecraft/resources/Identifier;Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/Vec3i;Lnet/minecraft/world/level/block/Rotation;Lnet/minecraft/server/level/ServerLevel;)Lnet/minecraft/world/level/block/entity/TestInstanceBlockEntity;", cancellable = true)
    private static void createNewEmptyTest__460404966(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-460404966L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "findTestContainingPos(Lnet/minecraft/core/BlockPos;ILnet/minecraft/server/level/ServerLevel;)Ljava/util/Optional;", cancellable = true)
    private static void findTestContainingPos_533317968(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(533317968L))
            info.setReturnValue(null);
    }


}
