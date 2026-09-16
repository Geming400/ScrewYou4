package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.component.AttackRange.class)
public class AttackRange_554462345Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__354163924(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-354163924L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1324885869(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1324885869L))
            info.setReturnValue("\u03A7yL\u35B1TzzQ^\u728ES6!E(WH\uC332PH\"dM'NM:)Z@\u55C7ez9({\uC055_Q.{oVd");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1111814435(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1111814435L))
            info.setReturnValue(-434787982);
    }

    @Inject(at = @At("HEAD"), method = "isInRange(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/phys/AABB;D)Z", cancellable = true)
    private void isInRange__271210042(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-271210042L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isInRange(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/phys/Vec3;)Z", cancellable = true)
    private void isInRange_1660470221(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1660470221L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "defaultFor(Lnet/minecraft/world/entity/LivingEntity;)Lnet/minecraft/world/item/component/AttackRange;", cancellable = true)
    private static void defaultFor_237217246(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(237217246L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "effectiveMinRange(Lnet/minecraft/world/entity/Entity;)F", cancellable = true)
    private void effectiveMinRange_59207126(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(59207126L))
            info.setReturnValue(8.935058E8F);
    }

    @Inject(at = @At("HEAD"), method = "effectiveMaxRange(Lnet/minecraft/world/entity/Entity;)F", cancellable = true)
    private void effectiveMaxRange__1771977724(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1771977724L))
            info.setReturnValue(8.935058E8F);
    }

    @Inject(at = @At("HEAD"), method = "getClosesetHit(Lnet/minecraft/world/entity/Entity;FLjava/util/function/Predicate;)Lnet/minecraft/world/phys/HitResult;", cancellable = true)
    private void getClosesetHit_1721414169(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1721414169L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hitboxMargin()F", cancellable = true)
    private void hitboxMargin_979800517(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(979800517L))
            info.setReturnValue(8.935058E8F);
    }

    @Inject(at = @At("HEAD"), method = "minCreativeReach()F", cancellable = true)
    private void minCreativeReach_21052569(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(21052569L))
            info.setReturnValue(8.935058E8F);
    }

    @Inject(at = @At("HEAD"), method = "maxCreativeReach()F", cancellable = true)
    private void maxCreativeReach__858105045(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-858105045L))
            info.setReturnValue(8.935058E8F);
    }

    @Inject(at = @At("HEAD"), method = "mobFactor()F", cancellable = true)
    private void mobFactor_214718492(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(214718492L))
            info.setReturnValue(8.935058E8F);
    }

    @Inject(at = @At("HEAD"), method = "maxReach()F", cancellable = true)
    private void maxReach__1476763108(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1476763108L))
            info.setReturnValue(8.935058E8F);
    }

    @Inject(at = @At("HEAD"), method = "minReach()F", cancellable = true)
    private void minReach_345543050(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(345543050L))
            info.setReturnValue(8.935058E8F);
    }


}
