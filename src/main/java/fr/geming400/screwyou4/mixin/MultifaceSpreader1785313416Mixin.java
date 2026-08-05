package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.MultifaceSpreader.class)
public class MultifaceSpreader1785313416Mixin {
        @Inject(at = @At("HEAD"), method = "spreadAll(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/core/BlockPos;Z)J", cancellable = true)
    private void spreadAll__1528734018(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1528734018L))
            info.setReturnValue(1034324236148040058L);
    }

    @Inject(at = @At("HEAD"), method = "spreadToFace(Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/world/level/block/MultifaceSpreader$SpreadPos;Z)Ljava/util/Optional;", cancellable = true)
    private void spreadToFace_1659443942(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1659443942L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canSpreadInAnyDirection(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/BlockGetter;Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/Direction;)Z", cancellable = true)
    private void canSpreadInAnyDirection_1952383923(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1952383923L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "spreadFromRandomFaceTowardRandomDirection(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/RandomSource;)Ljava/util/Optional;", cancellable = true)
    private void spreadFromRandomFaceTowardRandomDirection_516579313(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(516579313L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "spreadFromFaceTowardRandomDirection(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/Direction;Lnet/minecraft/util/RandomSource;Z)Ljava/util/Optional;", cancellable = true)
    private void spreadFromFaceTowardRandomDirection__839552443(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-839552443L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "spreadFromFaceTowardDirection(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/Direction;Lnet/minecraft/core/Direction;Z)Ljava/util/Optional;", cancellable = true)
    private void spreadFromFaceTowardDirection__1887562273(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1887562273L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSpreadFromFaceTowardDirection(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/BlockGetter;Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/Direction;Lnet/minecraft/core/Direction;Lnet/minecraft/world/level/block/MultifaceSpreader$SpreadPredicate;)Ljava/util/Optional;", cancellable = true)
    private void getSpreadFromFaceTowardDirection_1014193975(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1014193975L))
            info.setReturnValue(null);
    }


}
