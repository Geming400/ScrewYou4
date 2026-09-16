package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.projectile.ProjectileUtil.class)
public class ProjectileUtil_709614403Mixin {
        @Inject(at = @At("HEAD"), method = "getEntityHitResult(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/AABB;Ljava/util/function/Predicate;D)Lnet/minecraft/world/phys/EntityHitResult;", cancellable = true)
    private static void getEntityHitResult_2107506717(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2107506717L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getEntityHitResult(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/projectile/Projectile;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/AABB;Ljava/util/function/Predicate;)Lnet/minecraft/world/phys/EntityHitResult;", cancellable = true)
    private static void getEntityHitResult_2115471886(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2115471886L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getEntityHitResult(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/AABB;Ljava/util/function/Predicate;F)Lnet/minecraft/world/phys/EntityHitResult;", cancellable = true)
    private static void getEntityHitResult__1571695080(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1571695080L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getWeaponHoldingHand(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/item/Item;)Lnet/minecraft/world/InteractionHand;", cancellable = true)
    private static void getWeaponHoldingHand_1119865975(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1119865975L))
            info.setReturnValue(net.minecraft.world.InteractionHand.MAIN_HAND);
    }

    @Inject(at = @At("HEAD"), method = "getMobArrow(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/item/ItemStack;FLnet/minecraft/world/item/ItemStack;)Lnet/minecraft/world/entity/projectile/arrow/AbstractArrow;", cancellable = true)
    private static void getMobArrow_1016553967(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1016553967L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getHitResultOnMoveVector(Lnet/minecraft/world/entity/Entity;Ljava/util/function/Predicate;Lnet/minecraft/world/level/ClipContext$Block;)Lnet/minecraft/world/phys/HitResult;", cancellable = true)
    private static void getHitResultOnMoveVector__16908274(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-16908274L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getHitResultOnMoveVector(Lnet/minecraft/world/entity/Entity;Ljava/util/function/Predicate;)Lnet/minecraft/world/phys/HitResult;", cancellable = true)
    private static void getHitResultOnMoveVector_1591416527(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1591416527L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "rotateTowardsMovement(Lnet/minecraft/world/entity/Entity;F)V", cancellable = true)
    private static void rotateTowardsMovement__1372837798(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1372837798L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "computeMargin(Lnet/minecraft/world/entity/Entity;)F", cancellable = true)
    private static void computeMargin_1025877627(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1025877627L))
            info.setReturnValue(5.376386E8F);
    }

    @Inject(at = @At("HEAD"), method = "getHitResultOnViewVector(Lnet/minecraft/world/entity/Entity;Ljava/util/function/Predicate;D)Lnet/minecraft/world/phys/HitResult;", cancellable = true)
    private static void getHitResultOnViewVector__2020460807(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2020460807L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getManyEntityHitResult(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/AABB;Ljava/util/function/Predicate;FLnet/minecraft/world/level/ClipContext$Block;Z)Ljava/util/Collection;", cancellable = true)
    private static void getManyEntityHitResult_1713019901(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1713019901L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getManyEntityHitResult(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/AABB;Ljava/util/function/Predicate;Z)Ljava/util/Collection;", cancellable = true)
    private static void getManyEntityHitResult_837467592(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(837467592L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getHitEntitiesAlong(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/item/component/AttackRange;Ljava/util/function/Predicate;Lnet/minecraft/world/level/ClipContext$Block;)Lcom/mojang/datafixers/util/Either;", cancellable = true)
    private static void getHitEntitiesAlong_1675511102(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1675511102L))
            info.setReturnValue(null);
    }


}
