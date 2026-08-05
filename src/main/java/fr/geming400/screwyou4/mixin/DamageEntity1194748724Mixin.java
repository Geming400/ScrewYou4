package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.enchantment.effects.DamageEntity.class)
public class DamageEntity1194748724Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1714706313(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1714706313L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_59288749(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(59288749L))
            info.setReturnValue("{CSk伄oF?{f");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1233011466(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1233011466L))
            info.setReturnValue(1368622258);
    }

    @Inject(at = @At("HEAD"), method = "apply(Lnet/minecraft/server/level/ServerLevel;ILnet/minecraft/world/item/enchantment/EnchantedItemInUse;Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/phys/Vec3;)V", cancellable = true)
    private void apply__1859466801(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1859466801L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "damageType()Lnet/minecraft/core/Holder;", cancellable = true)
    private void damageType__1551342800(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1551342800L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1364364848(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1364364848L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "maxDamage()Lnet/minecraft/world/item/enchantment/LevelBasedValue;", cancellable = true)
    private void maxDamage_1326828323(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1326828323L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "minDamage()Lnet/minecraft/world/item/enchantment/LevelBasedValue;", cancellable = true)
    private void minDamage_1326828323(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1326828323L))
            info.setReturnValue(null);
    }


}
