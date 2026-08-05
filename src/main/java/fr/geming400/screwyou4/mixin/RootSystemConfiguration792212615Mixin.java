package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.feature.configurations.RootSystemConfiguration.class)
public class RootSystemConfiguration792212615Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__2117242422(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2117242422L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__343247360(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-343247360L))
            info.setReturnValue("KvGN8꺦g'R wpthI@w*r;d::?a>F7u┈sB'斝Dﭔ툊t9Oa态ud)+EyUᏰP뭨QyL௩嫆#牎qk;=$YMO䦘$Czd綱D@/");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_830475357(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(830475357L))
            info.setReturnValue(433522314);
    }

    @Inject(at = @At("HEAD"), method = "allowedVerticalWaterForTree()I", cancellable = true)
    private void allowedVerticalWaterForTree_830474861(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(830474861L))
            info.setReturnValue(612045804);
    }

    @Inject(at = @At("HEAD"), method = "hangingRootPlacementAttempts()I", cancellable = true)
    private void hangingRootPlacementAttempts_830474861(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(830474861L))
            info.setReturnValue(612045804);
    }

    @Inject(at = @At("HEAD"), method = "requiredVerticalSpaceForTree()I", cancellable = true)
    private void requiredVerticalSpaceForTree_830474861(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(830474861L))
            info.setReturnValue(612045804);
    }

    @Inject(at = @At("HEAD"), method = "maxLevelDeviation()I", cancellable = true)
    private void maxLevelDeviation_830474861(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(830474861L))
            info.setReturnValue(612045804);
    }

    @Inject(at = @At("HEAD"), method = "rootPlacementAttempts()I", cancellable = true)
    private void rootPlacementAttempts_830474861(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(830474861L))
            info.setReturnValue(612045804);
    }

    @Inject(at = @At("HEAD"), method = "rootStateProvider()Lnet/minecraft/world/level/levelgen/feature/stateproviders/BlockStateProvider;", cancellable = true)
    private void rootStateProvider__1140493886(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1140493886L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hangingRootsVerticalSpan()I", cancellable = true)
    private void hangingRootsVerticalSpan_830474861(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(830474861L))
            info.setReturnValue(612045804);
    }

    @Inject(at = @At("HEAD"), method = "rootReplaceable()Lnet/minecraft/core/HolderSet;", cancellable = true)
    private void rootReplaceable__1882801637(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1882801637L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "levelTestDistance()I", cancellable = true)
    private void levelTestDistance_830474861(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(830474861L))
            info.setReturnValue(612045804);
    }

    @Inject(at = @At("HEAD"), method = "treeFeature()Lnet/minecraft/core/Holder;", cancellable = true)
    private void treeFeature__1953878909(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1953878909L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "allowedTreePosition()Lnet/minecraft/world/level/levelgen/blockpredicates/BlockPredicate;", cancellable = true)
    private void allowedTreePosition_824981204(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(824981204L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hangingRootStateProvider()Lnet/minecraft/world/level/levelgen/feature/stateproviders/BlockStateProvider;", cancellable = true)
    private void hangingRootStateProvider__1140493886(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1140493886L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "rootColumnMaxHeight()I", cancellable = true)
    private void rootColumnMaxHeight_830474861(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(830474861L))
            info.setReturnValue(612045804);
    }

    @Inject(at = @At("HEAD"), method = "hangingRootRadius()I", cancellable = true)
    private void hangingRootRadius_830474861(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(830474861L))
            info.setReturnValue(612045804);
    }

    @Inject(at = @At("HEAD"), method = "rootRadius()I", cancellable = true)
    private void rootRadius_830474861(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(830474861L))
            info.setReturnValue(612045804);
    }


}
