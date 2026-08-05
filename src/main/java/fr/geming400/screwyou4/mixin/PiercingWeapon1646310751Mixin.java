package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.component.PiercingWeapon.class)
public class PiercingWeapon1646310751Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1263144286(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1263144286L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_510850776(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(510850776L))
            info.setReturnValue("\u8B74/,lp");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1684573493(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1684573493L))
            info.setReturnValue(597493214);
    }

    @Inject(at = @At("HEAD"), method = "attack(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/entity/EquipmentSlot;)V", cancellable = true)
    private void attack__1434414912(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1434414912L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "sound()Ljava/util/Optional;", cancellable = true)
    private void sound_1891772173(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1891772173L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "dismounts()Z", cancellable = true)
    private void dismounts_1684589334(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1684589334L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "makeSound(Lnet/minecraft/world/entity/Entity;)V", cancellable = true)
    private void makeSound_1194586091(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1194586091L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "dealsKnockback()Z", cancellable = true)
    private void dealsKnockback_1684589334(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1684589334L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "canHitEntity(Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/entity/Entity;)Z", cancellable = true)
    private static void canHitEntity__94718610(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-94718610L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "hitSound()Ljava/util/Optional;", cancellable = true)
    private void hitSound_1891772173(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1891772173L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "makeHitSound(Lnet/minecraft/world/entity/Entity;)V", cancellable = true)
    private void makeHitSound_1194586091(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1194586091L))
            info.cancel();
    }


}
