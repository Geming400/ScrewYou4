package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.component.PiercingWeapon.class)
public class PiercingWeapon1646310751Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_737684483(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(737684483L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1878233020(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1878233020L))
            info.setReturnValue("\u1E5F\u74937GS AQZxtEKs%F4GN4i>s9`{DQjV\u4668_(\u1B81\u1C06>ZBucW!Dh=W1+8\u17D4jVQ0\u556EWu/rtl\u60AD\u2DB1ry\u82A3O'`<:Bp\u7B55B\u65D0sgxLI\u89A9");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__2091304454(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2091304454L))
            info.setReturnValue(-1767352779);
    }

    @Inject(at = @At("HEAD"), method = "dealsKnockback()Z", cancellable = true)
    private void dealsKnockback_1469157794(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1469157794L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "attack(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/entity/EquipmentSlot;)V", cancellable = true)
    private void attack_804579080(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(804579080L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "sound()Ljava/util/Optional;", cancellable = true)
    private void sound_177500956(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(177500956L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "dismounts()Z", cancellable = true)
    private void dismounts_1533466254(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1533466254L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "makeSound(Lnet/minecraft/world/entity/Entity;)V", cancellable = true)
    private void makeSound__899632468(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-899632468L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hitSound()Ljava/util/Optional;", cancellable = true)
    private void hitSound_367639625(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(367639625L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canHitEntity(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/entity/Entity;)Z", cancellable = true)
    private static void canHitEntity_908809800(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(908809800L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "makeHitSound(Lnet/minecraft/world/entity/Entity;)V", cancellable = true)
    private void makeHitSound_992969525(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(992969525L))
            info.cancel();
    }


}
