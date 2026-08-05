package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.enchantment.effects.DamageEntity.class)
public class DamageEntity1194748724Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_286122456(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(286122456L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1965172249(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1965172249L))
            info.setReturnValue("^9A/`\u27B6-SWH\u060EHSp8\uA9B1w5\uAC69-r0\uB0A0Az$\u70B3\u04D2\u3A56O\u5382JbhW@\u4094hUS&/'x8t=]");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1752100815(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1752100815L))
            info.setReturnValue(1852592081);
    }

    @Inject(at = @At("HEAD"), method = "apply(Lnet/minecraft/server/level/ServerLevel;ILnet/minecraft/world/item/enchantment/EnchantedItemInUse;Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/phys/Vec3;)V", cancellable = true)
    private void apply_869554721(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(869554721L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "minDamage()Lnet/minecraft/world/item/enchantment/LevelBasedValue;", cancellable = true)
    private void minDamage_2043279428(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2043279428L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "damageType()Lnet/minecraft/core/Holder;", cancellable = true)
    private void damageType_1009613511(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1009613511L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__2033773318(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2033773318L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "maxDamage()Lnet/minecraft/world/item/enchantment/LevelBasedValue;", cancellable = true)
    private void maxDamage_835217238(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(835217238L))
            info.setReturnValue(null);
    }


}
