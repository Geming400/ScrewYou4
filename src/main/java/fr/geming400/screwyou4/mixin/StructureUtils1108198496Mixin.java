package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.gametest.framework.StructureUtils.class)
public class StructureUtils1108198496Mixin {
        @Inject(at = @At("HEAD"), method = "getTransformedFarCorner(Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/Vec3i;Lnet/minecraft/world/level/block/Rotation;)Lnet/minecraft/core/BlockPos;", cancellable = true)
    private static void getTransformedFarCorner_1376730712(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1376730712L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "lookedAtTestPos(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/entity/Entity;Lnet/minecraft/server/level/ServerLevel;)Ljava/util/stream/Stream;", cancellable = true)
    private static void lookedAtTestPos__394793486(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-394793486L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "findTestContainingPos(Lnet/minecraft/core/BlockPos;ILnet/minecraft/server/level/ServerLevel;)Ljava/util/Optional;", cancellable = true)
    private static void findTestContainingPos_1156884683(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1156884683L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "findNearestTest(Lnet/minecraft/core/BlockPos;ILnet/minecraft/server/level/ServerLevel;)Ljava/util/Optional;", cancellable = true)
    private static void findNearestTest_1743768999(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1743768999L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createNewEmptyTest(Lnet/minecraft/resources/Identifier;Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/Vec3i;Lnet/minecraft/world/level/block/Rotation;Lnet/minecraft/server/level/ServerLevel;)Lnet/minecraft/world/level/block/entity/TestInstanceBlockEntity;", cancellable = true)
    private static void createNewEmptyTest__87754849(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-87754849L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "findTestBlocks(Lnet/minecraft/core/BlockPos;ILnet/minecraft/server/level/ServerLevel;)Ljava/util/stream/Stream;", cancellable = true)
    private static void findTestBlocks_133294290(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(133294290L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "clearSpaceForStructure(Lnet/minecraft/world/level/levelgen/structure/BoundingBox;Lnet/minecraft/server/level/ServerLevel;)V", cancellable = true)
    private static void clearSpaceForStructure_1219248772(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1219248772L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getStructureBoundingBox(Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/Vec3i;Lnet/minecraft/world/level/block/Rotation;)Lnet/minecraft/world/level/levelgen/structure/BoundingBox;", cancellable = true)
    private static void getStructureBoundingBox__1270342384(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1270342384L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRotationForRotationSteps(I)Lnet/minecraft/world/level/block/Rotation;", cancellable = true)
    private static void getRotationForRotationSteps__753858659(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-753858659L))
            info.setReturnValue(net.minecraft.world.level.block.Rotation.NONE);
    }

    @Inject(at = @At("HEAD"), method = "getRotationStepsForRotation(Lnet/minecraft/world/level/block/Rotation;)I", cancellable = true)
    private static void getRotationStepsForRotation_1725608285(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1725608285L))
            info.setReturnValue(-104727996);
    }


}
