package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.MultifaceSpreader.class)
public class MultifaceSpreader1785313416Mixin {
        @Inject(at = @At("HEAD"), method = "spreadAll(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/core/BlockPos;Z)J", cancellable = true)
    private void spreadAll__1196480148(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1196480148L))
            info.setReturnValue(1479759884889003431L);
    }

    @Inject(at = @At("HEAD"), method = "spreadFromFaceTowardDirection(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/Direction;Lnet/minecraft/core/Direction;Z)Ljava/util/Optional;", cancellable = true)
    private void spreadFromFaceTowardDirection__296574479(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-296574479L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "spreadFromFaceTowardRandomDirection(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/Direction;Lnet/minecraft/util/RandomSource;Z)Ljava/util/Optional;", cancellable = true)
    private void spreadFromFaceTowardRandomDirection_1133824560(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1133824560L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSpreadFromFaceTowardDirection(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/BlockGetter;Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/Direction;Lnet/minecraft/core/Direction;Lnet/minecraft/world/level/block/MultifaceSpreader$SpreadPredicate;)Ljava/util/Optional;", cancellable = true)
    private void getSpreadFromFaceTowardDirection__93914305(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-93914305L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "spreadFromRandomFaceTowardRandomDirection(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/RandomSource;)Ljava/util/Optional;", cancellable = true)
    private void spreadFromRandomFaceTowardRandomDirection_1810256073(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1810256073L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canSpreadInAnyDirection(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/BlockGetter;Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/Direction;)Z", cancellable = true)
    private void canSpreadInAnyDirection__536516840(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-536516840L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "spreadToFace(Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/world/level/block/MultifaceSpreader$SpreadPos;Z)Ljava/util/Optional;", cancellable = true)
    private void spreadToFace__1821055301(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1821055301L))
            info.setReturnValue(null);
    }


}
