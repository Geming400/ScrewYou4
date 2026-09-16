package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.vehicle.DismountHelper.class)
public class DismountHelper1307498473Mixin {
        @Inject(at = @At("HEAD"), method = "nonClimbableShape(Lnet/minecraft/world/level/BlockGetter;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/phys/shapes/VoxelShape;", cancellable = true)
    private static void nonClimbableShape_750551657(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(750551657L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "findCeilingFrom(Lnet/minecraft/core/BlockPos;ILjava/util/function/Function;)D", cancellable = true)
    private static void findCeilingFrom__1360562541(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1360562541L))
            info.setReturnValue(5.3158430014709514E8D);
    }

    @Inject(at = @At("HEAD"), method = "findSafeDismountLocation(Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/CollisionGetter;Lnet/minecraft/core/BlockPos;Z)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private static void findSafeDismountLocation_759716801(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(759716801L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isBlockFloorValid(D)Z", cancellable = true)
    private static void isBlockFloorValid_382275711(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(382275711L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "canDismountTo(Lnet/minecraft/world/level/CollisionGetter;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/entity/Pose;)Z", cancellable = true)
    private static void canDismountTo_1994270291(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1994270291L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "canDismountTo(Lnet/minecraft/world/level/CollisionGetter;Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/phys/AABB;)Z", cancellable = true)
    private static void canDismountTo_851973567(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(851973567L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "offsetsForDirection(Lnet/minecraft/core/Direction;)[[I", cancellable = true)
    private static void offsetsForDirection_1174192477(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1174192477L))
            info.setReturnValue(null);
    }


}
