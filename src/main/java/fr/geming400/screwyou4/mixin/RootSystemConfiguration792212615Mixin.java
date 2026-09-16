package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.feature.configurations.RootSystemConfiguration.class)
public class RootSystemConfiguration792212615Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__116413653(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-116413653L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1562636140(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1562636140L))
            info.setReturnValue("u{Y}K\"\"FXkmN;\uA527p\u6CBC\u2100JOF'#Y=\u3B15&E]\u1940U[)\"m +5;Lc)B+5h^R+r</]mo\uFD80N+?e%C_WV2\u47F4OnlES!m4D{Kf5UQB5*\u83E3");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1349564706(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1349564706L))
            info.setReturnValue(584171421);
    }

    @Inject(at = @At("HEAD"), method = "rootRadius()I", cancellable = true)
    private void rootRadius__1001337127(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1001337127L))
            info.setReturnValue(-2134755533);
    }

    @Inject(at = @At("HEAD"), method = "requiredVerticalSpaceForTree()I", cancellable = true)
    private void requiredVerticalSpaceForTree__1379196105(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1379196105L))
            info.setReturnValue(-1264391991);
    }

    @Inject(at = @At("HEAD"), method = "allowedVerticalWaterForTree()I", cancellable = true)
    private void allowedVerticalWaterForTree_1461074911(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1461074911L))
            info.setReturnValue(1129056682);
    }

    @Inject(at = @At("HEAD"), method = "hangingRootPlacementAttempts()I", cancellable = true)
    private void hangingRootPlacementAttempts_690371028(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(690371028L))
            info.setReturnValue(1305124225);
    }

    @Inject(at = @At("HEAD"), method = "allowedTreePosition()Lnet/minecraft/world/level/levelgen/blockpredicates/BlockPredicate;", cancellable = true)
    private void allowedTreePosition_643780421(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(643780421L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "rootPlacementAttempts()I", cancellable = true)
    private void rootPlacementAttempts__307146876(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-307146876L))
            info.setReturnValue(-538582808);
    }

    @Inject(at = @At("HEAD"), method = "treeFeature()Lnet/minecraft/core/Holder;", cancellable = true)
    private void treeFeature__377287669(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-377287669L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "levelTestDistance()I", cancellable = true)
    private void levelTestDistance__172378878(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-172378878L))
            info.setReturnValue(-2053409998);
    }

    @Inject(at = @At("HEAD"), method = "maxLevelDeviation()I", cancellable = true)
    private void maxLevelDeviation_1070853932(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1070853932L))
            info.setReturnValue(-62809433);
    }

    @Inject(at = @At("HEAD"), method = "rootColumnMaxHeight()I", cancellable = true)
    private void rootColumnMaxHeight__388229478(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-388229478L))
            info.setReturnValue(404392860);
    }

    @Inject(at = @At("HEAD"), method = "hangingRootsVerticalSpan()I", cancellable = true)
    private void hangingRootsVerticalSpan_1954152716(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1954152716L))
            info.setReturnValue(-246428639);
    }

    @Inject(at = @At("HEAD"), method = "rootReplaceable()Lnet/minecraft/core/HolderSet;", cancellable = true)
    private void rootReplaceable__1987790105(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1987790105L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hangingRootRadius()I", cancellable = true)
    private void hangingRootRadius_1187460745(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1187460745L))
            info.setReturnValue(-1743676136);
    }

    @Inject(at = @At("HEAD"), method = "hangingRootStateProvider()Lnet/minecraft/world/level/levelgen/feature/stateproviders/BlockStateProvider;", cancellable = true)
    private void hangingRootStateProvider_45163858(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(45163858L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "rootStateProvider()Lnet/minecraft/world/level/levelgen/feature/stateproviders/BlockStateProvider;", cancellable = true)
    private void rootStateProvider_1956705698(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1956705698L))
            info.setReturnValue(null);
    }


}
