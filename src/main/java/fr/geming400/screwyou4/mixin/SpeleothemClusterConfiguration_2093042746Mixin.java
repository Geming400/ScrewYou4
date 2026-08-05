package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.feature.configurations.SpeleothemClusterConfiguration.class)
public class SpeleothemClusterConfiguration_2093042746Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__816412292(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-816412292L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_957582770(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(957582770L))
            info.setReturnValue("s}pYWZ7g8h|2(Qmk롺LO⩫棎@#Kz9NwBa?籮y볛WS\"r<\"fpM*vnSr7&4TzፔOBOsOLB\"[8b1XVJAoW92WH'");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2131305487(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2131305487L))
            info.setReturnValue(1633413947);
    }

    @Inject(at = @At("HEAD"), method = "speleothemBlockLayerThickness()Lnet/minecraft/util/valueproviders/IntProvider;", cancellable = true)
    private void speleothemBlockLayerThickness__376644158(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-376644158L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "maxStalagmiteStalactiteHeightDiff()I", cancellable = true)
    private void maxStalagmiteStalactiteHeightDiff_2131304991(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2131304991L))
            info.setReturnValue(1836561367);
    }

    @Inject(at = @At("HEAD"), method = "maxDistanceFromCenterAffectingHeightBias()I", cancellable = true)
    private void maxDistanceFromCenterAffectingHeightBias_2131304991(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2131304991L))
            info.setReturnValue(1836561367);
    }

    @Inject(at = @At("HEAD"), method = "chanceOfSpeleothemAtMaxDistanceFromCenter()F", cancellable = true)
    private void chanceOfSpeleothemAtMaxDistanceFromCenter_2131302108(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2131302108L))
            info.setReturnValue(8.75155E7F);
    }

    @Inject(at = @At("HEAD"), method = "height()Lnet/minecraft/util/valueproviders/IntProvider;", cancellable = true)
    private void height__376644158(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-376644158L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "density()Lnet/minecraft/util/valueproviders/FloatProvider;", cancellable = true)
    private void density__1268704971(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1268704971L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "radius()Lnet/minecraft/util/valueproviders/IntProvider;", cancellable = true)
    private void radius__376644158(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-376644158L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "maxDistanceFromEdgeAffectingChanceOfSpeleothem()I", cancellable = true)
    private void maxDistanceFromEdgeAffectingChanceOfSpeleothem_2131304991(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2131304991L))
            info.setReturnValue(1836561367);
    }

    @Inject(at = @At("HEAD"), method = "floorToCeilingSearchRange()I", cancellable = true)
    private void floorToCeilingSearchRange_2131304991(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2131304991L))
            info.setReturnValue(1836561367);
    }

    @Inject(at = @At("HEAD"), method = "pointedBlock()Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void pointedBlock__202716121(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-202716121L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "heightDeviation()I", cancellable = true)
    private void heightDeviation_2131304991(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2131304991L))
            info.setReturnValue(1836561367);
    }

    @Inject(at = @At("HEAD"), method = "replaceableBlocks()Lnet/minecraft/core/HolderSet;", cancellable = true)
    private void replaceableBlocks__581971507(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-581971507L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "baseBlock()Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void baseBlock__202716121(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-202716121L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "wetness()Lnet/minecraft/util/valueproviders/FloatProvider;", cancellable = true)
    private void wetness__1268704971(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1268704971L))
            info.setReturnValue(null);
    }


}
