package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.util.RandomPos.class)
public class RandomPos_270368125Mixin {
        @Inject(at = @At("HEAD"), method = "generateRandomPos(Lnet/minecraft/world/entity/PathfinderMob;Ljava/util/function/Supplier;)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private static void generateRandomPos_151404556(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(151404556L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "generateRandomPos(Ljava/util/function/Supplier;Ljava/util/function/ToDoubleFunction;)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private static void generateRandomPos__1292667755(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1292667755L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "moveUpOutOfSolid(Lnet/minecraft/core/BlockPos;ILjava/util/function/Predicate;)Lnet/minecraft/core/BlockPos;", cancellable = true)
    private static void moveUpOutOfSolid__1428739095(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1428739095L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "generateRandomDirection(Lnet/minecraft/util/RandomSource;II)Lnet/minecraft/core/BlockPos;", cancellable = true)
    private static void generateRandomDirection__849594187(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-849594187L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "moveUpToAboveSolid(Lnet/minecraft/core/BlockPos;IILjava/util/function/Predicate;)Lnet/minecraft/core/BlockPos;", cancellable = true)
    private static void moveUpToAboveSolid__1731996168(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1731996168L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "generateRandomPosTowardDirection(Lnet/minecraft/world/entity/PathfinderMob;DLnet/minecraft/util/RandomSource;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/core/BlockPos;", cancellable = true)
    private static void generateRandomPosTowardDirection_1527284008(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1527284008L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "generateRandomDirectionWithinRadians(Lnet/minecraft/util/RandomSource;DDIIDDD)Lnet/minecraft/core/BlockPos;", cancellable = true)
    private static void generateRandomDirectionWithinRadians_1407366953(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1407366953L))
            info.setReturnValue(null);
    }


}
