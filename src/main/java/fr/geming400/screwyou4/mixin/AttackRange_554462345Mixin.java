package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.component.AttackRange.class)
public class AttackRange_554462345Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1939974603(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1939974603L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__580997631(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-580997631L))
            info.setReturnValue("UN!&7)TA!J\"_鸵UDdEX|釽vI榟u}C氶-SW>J");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_592725086(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(592725086L))
            info.setReturnValue(-1307285202);
    }

    @Inject(at = @At("HEAD"), method = "isInRange(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/phys/AABB;D)Z", cancellable = true)
    private void isInRange_96581560(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(96581560L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isInRange(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/phys/Vec3;)Z", cancellable = true)
    private void isInRange__1791348837(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1791348837L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "defaultFor(Lnet/minecraft/world/entity/LivingEntity;)Lnet/minecraft/world/item/component/AttackRange;", cancellable = true)
    private static void defaultFor_898243494(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(898243494L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "effectiveMinRange(Lnet/minecraft/world/entity/Entity;)F", cancellable = true)
    private void effectiveMinRange_102722308(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(102722308L))
            info.setReturnValue(5.320701E8F);
    }

    @Inject(at = @At("HEAD"), method = "effectiveMaxRange(Lnet/minecraft/world/entity/Entity;)F", cancellable = true)
    private void effectiveMaxRange_102722308(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(102722308L))
            info.setReturnValue(5.320701E8F);
    }

    @Inject(at = @At("HEAD"), method = "minCreativeReach()F", cancellable = true)
    private void minCreativeReach_592721707(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(592721707L))
            info.setReturnValue(5.330716E8F);
    }

    @Inject(at = @At("HEAD"), method = "maxCreativeReach()F", cancellable = true)
    private void maxCreativeReach_592721707(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(592721707L))
            info.setReturnValue(5.330716E8F);
    }

    @Inject(at = @At("HEAD"), method = "getClosesetHit(Lnet/minecraft/world/entity/Entity;FLjava/util/function/Predicate;)Lnet/minecraft/world/phys/HitResult;", cancellable = true)
    private void getClosesetHit_551385926(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(551385926L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hitboxMargin()F", cancellable = true)
    private void hitboxMargin_592721707(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(592721707L))
            info.setReturnValue(5.330716E8F);
    }

    @Inject(at = @At("HEAD"), method = "minReach()F", cancellable = true)
    private void minReach_592721707(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(592721707L))
            info.setReturnValue(5.330716E8F);
    }

    @Inject(at = @At("HEAD"), method = "mobFactor()F", cancellable = true)
    private void mobFactor_592721707(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(592721707L))
            info.setReturnValue(5.330716E8F);
    }

    @Inject(at = @At("HEAD"), method = "maxReach()F", cancellable = true)
    private void maxReach_592721707(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(592721707L))
            info.setReturnValue(5.330716E8F);
    }


}
