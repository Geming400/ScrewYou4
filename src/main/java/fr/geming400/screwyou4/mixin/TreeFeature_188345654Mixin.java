package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.feature.TreeFeature.class)
public class TreeFeature_188345654Mixin {
        @Inject(at = @At("HEAD"), method = "place(Lnet/minecraft/world/level/levelgen/feature/FeaturePlaceContext;)Z", cancellable = true)
    private void place_903603885(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(903603885L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "validTreePos(Lnet/minecraft/world/level/LevelSimulatedReader;Lnet/minecraft/core/BlockPos;)Z", cancellable = true)
    private static void validTreePos__109628380(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-109628380L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isAirOrLeaves(Lnet/minecraft/world/level/LevelSimulatedReader;Lnet/minecraft/core/BlockPos;)Z", cancellable = true)
    private static void isAirOrLeaves__109628380(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-109628380L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isVine(Lnet/minecraft/world/level/LevelSimulatedReader;Lnet/minecraft/core/BlockPos;)Z", cancellable = true)
    private static void isVine__109628380(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-109628380L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getLowestTrunkOrRootOfTree(Lnet/minecraft/world/level/levelgen/feature/treedecorators/TreeDecorator$Context;)Ljava/util/List;", cancellable = true)
    private static void getLowestTrunkOrRootOfTree_1706024821(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1706024821L))
            info.setReturnValue(null);
    }


}
