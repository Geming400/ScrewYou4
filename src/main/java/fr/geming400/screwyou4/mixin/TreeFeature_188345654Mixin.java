package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.feature.TreeFeature.class)
public class TreeFeature_188345654Mixin {
        @Inject(at = @At("HEAD"), method = "place(Lnet/minecraft/world/level/levelgen/feature/FeaturePlaceContext;)Z", cancellable = true)
    private void place_1762218502(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1762218502L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isAirOrLeaves(Lnet/minecraft/world/level/LevelSimulatedReader;Lnet/minecraft/core/BlockPos;)Z", cancellable = true)
    private static void isAirOrLeaves__1401379165(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1401379165L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "validTreePos(Lnet/minecraft/world/level/LevelSimulatedReader;Lnet/minecraft/core/BlockPos;)Z", cancellable = true)
    private static void validTreePos__854714402(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-854714402L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isVine(Lnet/minecraft/world/level/LevelSimulatedReader;Lnet/minecraft/core/BlockPos;)Z", cancellable = true)
    private static void isVine__818079976(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-818079976L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getLowestTrunkOrRootOfTree(Lnet/minecraft/world/level/levelgen/feature/treedecorators/TreeDecorator$Context;)Ljava/util/List;", cancellable = true)
    private static void getLowestTrunkOrRootOfTree_777330511(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(777330511L))
            info.setReturnValue(null);
    }


}
