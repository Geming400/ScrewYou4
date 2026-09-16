package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.enchantment.effects.ApplyExhaustion.class)
public class ApplyExhaustion_1332939826Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_424313557(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(424313557L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_2103363350(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2103363350L))
            info.setReturnValue("\u95AF\u3625U\uB7AFyp.m\uAD85SYNR?d\u0D5Bi}}I\u9D974FW\u071DY\u7D47}Bxz%[}y7E&26gko]*CJ$:VLH\uB2A7\u18C6JL\u2398yQ%%Jm\u93CB${:");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1890291916(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1890291916L))
            info.setReturnValue(1197235954);
    }

    @Inject(at = @At("HEAD"), method = "apply(Lnet/minecraft/server/level/ServerLevel;ILnet/minecraft/world/item/enchantment/EnchantedItemInUse;Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/phys/Vec3;)V", cancellable = true)
    private void apply_1007745822(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1007745822L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "amount()Lnet/minecraft/world/item/enchantment/LevelBasedValue;", cancellable = true)
    private void amount__1794695560(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1794695560L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1895582217(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1895582217L))
            info.setReturnValue(null);
    }


}
