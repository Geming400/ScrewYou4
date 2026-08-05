package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.util.LandRandomPos.class)
public class LandRandomPos959762712Mixin {
        @Inject(at = @At("HEAD"), method = "movePosUpOutOfSolid(Lnet/minecraft/world/entity/PathfinderMob;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/core/BlockPos;", cancellable = true)
    private static void movePosUpOutOfSolid_2022387504(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2022387504L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPos(Lnet/minecraft/world/entity/PathfinderMob;IILjava/util/function/ToDoubleFunction;)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private static void getPos_1262109296(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1262109296L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPos(Lnet/minecraft/world/entity/PathfinderMob;II)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private static void getPos_1000255742(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1000255742L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPosAway(Lnet/minecraft/world/entity/PathfinderMob;IILnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private static void getPosAway__1985924736(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1985924736L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPosAway(Lnet/minecraft/world/entity/PathfinderMob;DDILnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private static void getPosAway__697550959(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-697550959L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPosTowards(Lnet/minecraft/world/entity/PathfinderMob;IILnet/minecraft/world/phys/Vec3;)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private static void getPosTowards__1985924736(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1985924736L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "generateRandomPosTowardDirection(Lnet/minecraft/world/entity/PathfinderMob;DZLnet/minecraft/core/BlockPos;)Lnet/minecraft/core/BlockPos;", cancellable = true)
    private static void generateRandomPosTowardDirection_412217754(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(412217754L))
            info.setReturnValue(null);
    }


}
