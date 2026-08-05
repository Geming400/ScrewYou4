package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.component.KineticWeapon.class)
public class KineticWeapon1411754871Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1497700166(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1497700166L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_276294896(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(276294896L))
            info.setReturnValue("3<`\u161BC(MN:\u499A^'K}L^#},t *jy|</b[\u92E0?rCw dRe`\u2F71CWL^R%/C");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1450017613(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1450017613L))
            info.setReturnValue(458614758);
    }

    @Inject(at = @At("HEAD"), method = "sound()Ljava/util/Optional;", cancellable = true)
    private void sound_1657216293(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1657216293L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "makeSound(Lnet/minecraft/world/entity/Entity;)V", cancellable = true)
    private void makeSound_960030211(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(960030211L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "makeLocalHitSound(Lnet/minecraft/world/entity/Entity;)V", cancellable = true)
    private void makeLocalHitSound_960030211(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(960030211L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "damageMultiplier()F", cancellable = true)
    private void damageMultiplier_1450014234(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1450014234L))
            info.setReturnValue(4.317221E8F);
    }

    @Inject(at = @At("HEAD"), method = "damageEntities(Lnet/minecraft/world/item/ItemStack;ILnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/entity/EquipmentSlot;)V", cancellable = true)
    private void damageEntities_1049880420(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1049880420L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hitSound()Ljava/util/Optional;", cancellable = true)
    private void hitSound_1657216293(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1657216293L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "forwardMovement()F", cancellable = true)
    private void forwardMovement_1450014234(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1450014234L))
            info.setReturnValue(4.317221E8F);
    }

    @Inject(at = @At("HEAD"), method = "knockbackConditions()Ljava/util/Optional;", cancellable = true)
    private void knockbackConditions_1657216293(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1657216293L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "damageConditions()Ljava/util/Optional;", cancellable = true)
    private void damageConditions_1657216293(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1657216293L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "computeDamageUseDuration()I", cancellable = true)
    private void computeDamageUseDuration_1450017117(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1450017117L))
            info.setReturnValue(661762178);
    }

    @Inject(at = @At("HEAD"), method = "dismountConditions()Ljava/util/Optional;", cancellable = true)
    private void dismountConditions_1657216293(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1657216293L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "contactCooldownTicks()I", cancellable = true)
    private void contactCooldownTicks_1450017117(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1450017117L))
            info.setReturnValue(661762178);
    }

    @Inject(at = @At("HEAD"), method = "delayTicks()I", cancellable = true)
    private void delayTicks_1450017117(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1450017117L))
            info.setReturnValue(661762178);
    }

    @Inject(at = @At("HEAD"), method = "getMotion(Lnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private static void getMotion__598383487(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-598383487L))
            info.setReturnValue(null);
    }


}
