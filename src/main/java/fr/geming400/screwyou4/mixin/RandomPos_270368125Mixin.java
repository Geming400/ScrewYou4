package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.util.RandomPos.class)
public class RandomPos_270368125Mixin {
        @Inject(at = @At("HEAD"), method = "generateRandomPosTowardDirection(Lnet/minecraft/world/entity/PathfinderMob;DLnet/minecraft/util/RandomSource;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/core/BlockPos;", cancellable = true)
    private static void generateRandomPosTowardDirection__40400972(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-40400972L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "generateRandomDirectionWithinRadians(Lnet/minecraft/util/RandomSource;DDIIDDD)Lnet/minecraft/core/BlockPos;", cancellable = true)
    private static void generateRandomDirectionWithinRadians__181070807(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-181070807L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "generateRandomPos(Ljava/util/function/Supplier;Ljava/util/function/ToDoubleFunction;)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private static void generateRandomPos__1326846599(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1326846599L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "generateRandomPos(Lnet/minecraft/world/entity/PathfinderMob;Ljava/util/function/Supplier;)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private static void generateRandomPos__1620331096(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1620331096L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "generateRandomDirection(Lnet/minecraft/util/RandomSource;II)Lnet/minecraft/core/BlockPos;", cancellable = true)
    private static void generateRandomDirection_1887476988(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1887476988L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "moveUpToAboveSolid(Lnet/minecraft/core/BlockPos;IILjava/util/function/Predicate;)Lnet/minecraft/core/BlockPos;", cancellable = true)
    private static void moveUpToAboveSolid_447290765(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(447290765L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "moveUpOutOfSolid(Lnet/minecraft/core/BlockPos;ILjava/util/function/Predicate;)Lnet/minecraft/core/BlockPos;", cancellable = true)
    private static void moveUpOutOfSolid__1736727081(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1736727081L))
            info.setReturnValue(null);
    }


}
