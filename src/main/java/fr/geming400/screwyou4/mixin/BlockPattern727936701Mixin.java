package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.state.pattern.BlockPattern.class)
public class BlockPattern727936701Mixin {
        @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/level/LevelReader;Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/Direction;Lnet/minecraft/core/Direction;)Lnet/minecraft/world/level/block/state/pattern/BlockPattern$BlockPatternMatch;", cancellable = true)
    private void matches_1355633218(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1355633218L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "find(Lnet/minecraft/world/level/LevelReader;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/state/pattern/BlockPattern$BlockPatternMatch;", cancellable = true)
    private void find_1211224288(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1211224288L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDepth()I", cancellable = true)
    private void getDepth_602567606(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(602567606L))
            info.setReturnValue(1321762464);
    }

    @Inject(at = @At("HEAD"), method = "getPattern()[[[Ljava/util/function/Predicate;", cancellable = true)
    private void getPattern_327436746(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(327436746L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getWidth()I", cancellable = true)
    private void getWidth__1209959789(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1209959789L))
            info.setReturnValue(-1253917620);
    }

    @Inject(at = @At("HEAD"), method = "getHeight()I", cancellable = true)
    private void getHeight__997680474(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-997680474L))
            info.setReturnValue(-1616879017);
    }

    @Inject(at = @At("HEAD"), method = "createLevelCache(Lnet/minecraft/world/level/LevelReader;Z)Lcom/google/common/cache/LoadingCache;", cancellable = true)
    private static void createLevelCache_1158015056(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1158015056L))
            info.setReturnValue(null);
    }


}
