package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.enchantment.effects.Ignite.class)
public class Ignite_1069181812Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1840273226(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1840273226L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__66278164(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-66278164L))
            info.setReturnValue("OzXW{x^G㾭퍝'ULBꤜmfNჩss3p33KH0s疂Y酾\"u#0F{Jv)'엁*S%*'ｲJ惙qW:<1QF1rPu((+qkVe姤MrvDM@U㫑읬");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1107444553(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1107444553L))
            info.setReturnValue(19429326);
    }

    @Inject(at = @At("HEAD"), method = "apply(Lnet/minecraft/server/level/ServerLevel;ILnet/minecraft/world/item/enchantment/EnchantedItemInUse;Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/phys/Vec3;)V", cancellable = true)
    private void apply__1985033714(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1985033714L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "duration()Lnet/minecraft/world/item/enchantment/LevelBasedValue;", cancellable = true)
    private void duration_1201261410(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1201261410L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1489931761(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1489931761L))
            info.setReturnValue(null);
    }


}
