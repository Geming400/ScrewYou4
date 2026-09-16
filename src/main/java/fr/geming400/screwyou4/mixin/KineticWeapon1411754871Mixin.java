package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.component.KineticWeapon.class)
public class KineticWeapon1411754871Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_503128603(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(503128603L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__2112788900(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2112788900L))
            info.setReturnValue(" AGm3\u0CA2ov=a(?P\u2C95[>\uCE42KIY5>**\uBAD1\"\uCCE0u\uFBB6x\u841BL&GDu)A\u413Bs>3\u684D85on!\u24B9\u4DF2C>w\"bKX\u11A4");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1969106962(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1969106962L))
            info.setReturnValue(-1440285489);
    }

    @Inject(at = @At("HEAD"), method = "sound()Ljava/util/Optional;", cancellable = true)
    private void sound__57054924(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-57054924L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "makeSound(Lnet/minecraft/world/entity/Entity;)V", cancellable = true)
    private void makeSound__1134188348(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1134188348L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "makeLocalHitSound(Lnet/minecraft/world/entity/Entity;)V", cancellable = true)
    private void makeLocalHitSound__1841223812(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1841223812L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "damageEntities(Lnet/minecraft/world/item/ItemStack;ILnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/entity/EquipmentSlot;)V", cancellable = true)
    private void damageEntities_1600254228(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1600254228L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "damageMultiplier()F", cancellable = true)
    private void damageMultiplier__1629525622(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1629525622L))
            info.setReturnValue(3052300.5F);
    }

    @Inject(at = @At("HEAD"), method = "hitSound()Ljava/util/Optional;", cancellable = true)
    private void hitSound_133083745(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(133083745L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getMotion(Lnet/minecraft/world/entity/Entity;)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private static void getMotion__57002451(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-57002451L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "delayTicks()I", cancellable = true)
    private void delayTicks_2064221834(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2064221834L))
            info.setReturnValue(-744296007);
    }

    @Inject(at = @At("HEAD"), method = "dismountConditions()Ljava/util/Optional;", cancellable = true)
    private void dismountConditions_1933948296(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1933948296L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "computeDamageUseDuration()I", cancellable = true)
    private void computeDamageUseDuration_1553965224(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1553965224L))
            info.setReturnValue(-1858616494);
    }

    @Inject(at = @At("HEAD"), method = "contactCooldownTicks()I", cancellable = true)
    private void contactCooldownTicks_1964485298(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1964485298L))
            info.setReturnValue(333125904);
    }

    @Inject(at = @At("HEAD"), method = "knockbackConditions()Ljava/util/Optional;", cancellable = true)
    private void knockbackConditions__1060211464(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1060211464L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "forwardMovement()F", cancellable = true)
    private void forwardMovement_1073778694(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1073778694L))
            info.setReturnValue(4053101.0F);
    }

    @Inject(at = @At("HEAD"), method = "damageConditions()Ljava/util/Optional;", cancellable = true)
    private void damageConditions__619767892(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-619767892L))
            info.setReturnValue(null);
    }


}
