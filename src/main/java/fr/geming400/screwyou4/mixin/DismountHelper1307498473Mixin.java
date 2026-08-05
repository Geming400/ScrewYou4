package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.vehicle.DismountHelper.class)
public class DismountHelper1307498473Mixin {
        @Inject(at = @At("HEAD"), method = "findSafeDismountLocation(Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/CollisionGetter;Lnet/minecraft/core/BlockPos;Z)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private static void findSafeDismountLocation__1788268633(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1788268633L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "findCeilingFrom(Lnet/minecraft/core/BlockPos;ILjava/util/function/Function;)D", cancellable = true)
    private static void findCeilingFrom_1547188229(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1547188229L))
            info.setReturnValue(8.040706005118282E8D);
    }

    @Inject(at = @At("HEAD"), method = "nonClimbableShape(Lnet/minecraft/world/level/BlockGetter;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/phys/shapes/VoxelShape;", cancellable = true)
    private static void nonClimbableShape__1322100630(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1322100630L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isBlockFloorValid(D)Z", cancellable = true)
    private static void isBlockFloorValid__1778165364(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1778165364L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "offsetsForDirection(Lnet/minecraft/core/Direction;)[[I", cancellable = true)
    private static void offsetsForDirection__1220871501(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1220871501L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canDismountTo(Lnet/minecraft/world/level/CollisionGetter;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/entity/Pose;)Z", cancellable = true)
    private static void canDismountTo_2065071529(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2065071529L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "canDismountTo(Lnet/minecraft/world/level/CollisionGetter;Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/phys/AABB;)Z", cancellable = true)
    private static void canDismountTo__144792663(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-144792663L))
            info.setReturnValue(false);
    }


}
