package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.state.pattern.BlockPattern.class)
public class BlockPattern727936701Mixin {
        @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/level/LevelReader;Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/Direction;Lnet/minecraft/core/Direction;)Lnet/minecraft/world/level/block/state/pattern/BlockPattern$BlockPatternMatch;", cancellable = true)
    private void matches_2060769231(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2060769231L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "find(Lnet/minecraft/world/level/LevelReader;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/state/pattern/BlockPattern$BlockPatternMatch;", cancellable = true)
    private void find__1639420953(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1639420953L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDepth()I", cancellable = true)
    private void getDepth_766198947(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(766198947L))
            info.setReturnValue(370807465);
    }

    @Inject(at = @At("HEAD"), method = "getPattern()[[[Ljava/util/function/Predicate;", cancellable = true)
    private void getPattern_92471524(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(92471524L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getWidth()I", cancellable = true)
    private void getWidth_766198947(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(766198947L))
            info.setReturnValue(370807465);
    }

    @Inject(at = @At("HEAD"), method = "getHeight()I", cancellable = true)
    private void getHeight_766198947(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(766198947L))
            info.setReturnValue(370807465);
    }

    @Inject(at = @At("HEAD"), method = "createLevelCache(Lnet/minecraft/world/level/LevelReader;Z)Lcom/google/common/cache/LoadingCache;", cancellable = true)
    private static void createLevelCache_2137389654(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2137389654L))
            info.setReturnValue(null);
    }


}
