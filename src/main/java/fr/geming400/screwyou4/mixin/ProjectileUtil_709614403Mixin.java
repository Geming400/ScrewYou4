package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.projectile.ProjectileUtil.class)
public class ProjectileUtil_709614403Mixin {
        @Inject(at = @At("HEAD"), method = "getHitResultOnViewVector(Lnet/minecraft/world/entity/Entity;Ljava/util/function/Predicate;D)Lnet/minecraft/world/phys/HitResult;", cancellable = true)
    private static void getHitResultOnViewVector_175783096(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(175783096L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getEntityHitResult(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/AABB;Ljava/util/function/Predicate;F)Lnet/minecraft/world/phys/EntityHitResult;", cancellable = true)
    private static void getEntityHitResult__1697850463(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1697850463L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getEntityHitResult(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/AABB;Ljava/util/function/Predicate;D)Lnet/minecraft/world/phys/EntityHitResult;", cancellable = true)
    private static void getEntityHitResult__1555381900(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1555381900L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getEntityHitResult(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/projectile/Projectile;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/AABB;Ljava/util/function/Predicate;)Lnet/minecraft/world/phys/EntityHitResult;", cancellable = true)
    private static void getEntityHitResult__489575465(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-489575465L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getManyEntityHitResult(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/AABB;Ljava/util/function/Predicate;FLnet/minecraft/world/level/ClipContext$Block;Z)Ljava/util/Collection;", cancellable = true)
    private static void getManyEntityHitResult_113727141(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(113727141L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getManyEntityHitResult(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/phys/AABB;Ljava/util/function/Predicate;Z)Ljava/util/Collection;", cancellable = true)
    private static void getManyEntityHitResult__372875664(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-372875664L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getWeaponHoldingHand(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/item/Item;)Lnet/minecraft/world/InteractionHand;", cancellable = true)
    private static void getWeaponHoldingHand_504706519(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(504706519L))
            info.setReturnValue(net.minecraft.world.InteractionHand.OFF_HAND);
    }

    @Inject(at = @At("HEAD"), method = "getMobArrow(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/item/ItemStack;FLnet/minecraft/world/item/ItemStack;)Lnet/minecraft/world/entity/projectile/arrow/AbstractArrow;", cancellable = true)
    private static void getMobArrow_1732445806(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1732445806L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getHitResultOnMoveVector(Lnet/minecraft/world/entity/Entity;Ljava/util/function/Predicate;)Lnet/minecraft/world/phys/HitResult;", cancellable = true)
    private static void getHitResultOnMoveVector_1934019548(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1934019548L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getHitResultOnMoveVector(Lnet/minecraft/world/entity/Entity;Ljava/util/function/Predicate;Lnet/minecraft/world/level/ClipContext$Block;)Lnet/minecraft/world/phys/HitResult;", cancellable = true)
    private static void getHitResultOnMoveVector__1901683679(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1901683679L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "rotateTowardsMovement(Lnet/minecraft/world/entity/Entity;F)V", cancellable = true)
    private static void rotateTowardsMovement__384318422(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-384318422L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getHitEntitiesAlong(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/item/component/AttackRange;Ljava/util/function/Predicate;Lnet/minecraft/world/level/ClipContext$Block;)Lcom/mojang/datafixers/util/Either;", cancellable = true)
    private static void getHitEntitiesAlong__1914409059(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1914409059L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "computeMargin(Lnet/minecraft/world/entity/Entity;)F", cancellable = true)
    private static void computeMargin_257874614(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(257874614L))
            info.setReturnValue(7.748295E8F);
    }


}
