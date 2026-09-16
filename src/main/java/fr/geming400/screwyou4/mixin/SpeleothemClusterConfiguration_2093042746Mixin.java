package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.feature.configurations.SpeleothemClusterConfiguration.class)
public class SpeleothemClusterConfiguration_2093042746Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1184416477(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1184416477L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1431501026(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1431501026L))
            info.setReturnValue("\uBE64(1I\u10DA:i5Pi\u6D2Ar93\u5605\u8818k\uA5BBti0zYZ\uAEBFzWx53)");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1644572460(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1644572460L))
            info.setReturnValue(1258754318);
    }

    @Inject(at = @At("HEAD"), method = "height()Lnet/minecraft/util/valueproviders/IntProvider;", cancellable = true)
    private void height_1120153915(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1120153915L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "density()Lnet/minecraft/util/valueproviders/FloatProvider;", cancellable = true)
    private void density__1519139507(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1519139507L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "radius()Lnet/minecraft/util/valueproviders/IntProvider;", cancellable = true)
    private void radius_426179568(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(426179568L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "replaceableBlocks()Lnet/minecraft/core/HolderSet;", cancellable = true)
    private void replaceableBlocks__973485567(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-973485567L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "wetness()Lnet/minecraft/util/valueproviders/FloatProvider;", cancellable = true)
    private void wetness__560749928(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-560749928L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "baseBlock()Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void baseBlock_1261449059(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1261449059L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "maxStalagmiteStalactiteHeightDiff()I", cancellable = true)
    private void maxStalagmiteStalactiteHeightDiff_716711516(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(716711516L))
            info.setReturnValue(6383933);
    }

    @Inject(at = @At("HEAD"), method = "speleothemBlockLayerThickness()Lnet/minecraft/util/valueproviders/IntProvider;", cancellable = true)
    private void speleothemBlockLayerThickness_1632696284(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1632696284L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "maxDistanceFromCenterAffectingHeightBias()I", cancellable = true)
    private void maxDistanceFromCenterAffectingHeightBias__1525735350(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1525735350L))
            info.setReturnValue(-904105146);
    }

    @Inject(at = @At("HEAD"), method = "chanceOfSpeleothemAtMaxDistanceFromCenter()F", cancellable = true)
    private void chanceOfSpeleothemAtMaxDistanceFromCenter_1846582572(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1846582572L))
            info.setReturnValue(6.472052E8F);
    }

    @Inject(at = @At("HEAD"), method = "maxDistanceFromEdgeAffectingChanceOfSpeleothem()I", cancellable = true)
    private void maxDistanceFromEdgeAffectingChanceOfSpeleothem__1838098435(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1838098435L))
            info.setReturnValue(264443160);
    }

    @Inject(at = @At("HEAD"), method = "floorToCeilingSearchRange()I", cancellable = true)
    private void floorToCeilingSearchRange_1901372928(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1901372928L))
            info.setReturnValue(1287247649);
    }

    @Inject(at = @At("HEAD"), method = "pointedBlock()Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void pointedBlock_2125808965(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2125808965L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "heightDeviation()I", cancellable = true)
    private void heightDeviation__404610235(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-404610235L))
            info.setReturnValue(901747355);
    }


}
