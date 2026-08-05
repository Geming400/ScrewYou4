package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.util.GoalUtils.class)
public class GoalUtils1267834384Mixin {
        @Inject(at = @At("HEAD"), method = "isRestricted(ZLnet/minecraft/world/entity/PathfinderMob;Lnet/minecraft/world/phys/Vec3;)Z", cancellable = true)
    private static void isRestricted__1917510260(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1917510260L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isRestricted(ZLnet/minecraft/world/entity/PathfinderMob;Lnet/minecraft/core/BlockPos;)Z", cancellable = true)
    private static void isRestricted__797257324(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-797257324L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "mobRestricted(Lnet/minecraft/world/entity/PathfinderMob;D)Z", cancellable = true)
    private static void mobRestricted_297354366(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(297354366L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isOutsideLimits(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/entity/PathfinderMob;)Z", cancellable = true)
    private static void isOutsideLimits_972154728(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(972154728L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isNotStable(Lnet/minecraft/world/entity/ai/navigation/PathNavigation;Lnet/minecraft/core/BlockPos;)Z", cancellable = true)
    private static void isNotStable_224832004(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(224832004L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isSolid(Lnet/minecraft/world/entity/PathfinderMob;Lnet/minecraft/core/BlockPos;)Z", cancellable = true)
    private static void isSolid__944754466(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-944754466L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "hasGroundPathNavigation(Lnet/minecraft/world/entity/Mob;)Z", cancellable = true)
    private static void hasGroundPathNavigation_1771550121(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1771550121L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isWater(Lnet/minecraft/world/entity/PathfinderMob;Lnet/minecraft/core/BlockPos;)Z", cancellable = true)
    private static void isWater__944754466(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-944754466L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "hasMalus(Lnet/minecraft/world/entity/PathfinderMob;Lnet/minecraft/core/BlockPos;)Z", cancellable = true)
    private static void hasMalus__944754466(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-944754466L))
            info.setReturnValue(true);
    }


}
