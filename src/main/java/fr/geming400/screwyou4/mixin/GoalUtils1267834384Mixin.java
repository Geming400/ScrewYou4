package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.util.GoalUtils.class)
public class GoalUtils1267834384Mixin {
        @Inject(at = @At("HEAD"), method = "isRestricted(ZLnet/minecraft/world/entity/PathfinderMob;Lnet/minecraft/world/phys/Vec3;)Z", cancellable = true)
    private static void isRestricted_1002975687(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1002975687L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isRestricted(ZLnet/minecraft/world/entity/PathfinderMob;Lnet/minecraft/core/BlockPos;)Z", cancellable = true)
    private static void isRestricted_1730918543(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1730918543L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isWater(Lnet/minecraft/world/entity/PathfinderMob;Lnet/minecraft/core/BlockPos;)Z", cancellable = true)
    private static void isWater_1302663019(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1302663019L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "hasGroundPathNavigation(Lnet/minecraft/world/entity/Mob;)Z", cancellable = true)
    private static void hasGroundPathNavigation__1708093777(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1708093777L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isSolid(Lnet/minecraft/world/entity/PathfinderMob;Lnet/minecraft/core/BlockPos;)Z", cancellable = true)
    private static void isSolid_243438335(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(243438335L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "hasMalus(Lnet/minecraft/world/entity/PathfinderMob;Lnet/minecraft/core/BlockPos;)Z", cancellable = true)
    private static void hasMalus__463224230(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-463224230L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "mobRestricted(Lnet/minecraft/world/entity/PathfinderMob;D)Z", cancellable = true)
    private static void mobRestricted__1060106759(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1060106759L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isNotStable(Lnet/minecraft/world/entity/ai/navigation/PathNavigation;Lnet/minecraft/core/BlockPos;)Z", cancellable = true)
    private static void isNotStable__1760689760(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1760689760L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isOutsideLimits(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/entity/PathfinderMob;)Z", cancellable = true)
    private static void isOutsideLimits__1878269957(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1878269957L))
            info.setReturnValue(false);
    }


}
