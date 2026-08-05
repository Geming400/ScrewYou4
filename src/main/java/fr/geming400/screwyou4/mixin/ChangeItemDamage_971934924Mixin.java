package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.enchantment.effects.ChangeItemDamage.class)
public class ChangeItemDamage_971934924Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1937520114(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1937520114L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__163525052(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-163525052L))
            info.setReturnValue("YUCNfᥐ=&ퟁ콋F%A2⅏Aq_ﭚkjT2^$k]p^u휞e4}?g|3:8R,涳CV");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1010197665(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1010197665L))
            info.setReturnValue(-1471337656);
    }

    @Inject(at = @At("HEAD"), method = "apply(Lnet/minecraft/server/level/ServerLevel;ILnet/minecraft/world/item/enchantment/EnchantedItemInUse;Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/phys/Vec3;)V", cancellable = true)
    private void apply__2082280602(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2082280602L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "amount()Lnet/minecraft/world/item/enchantment/LevelBasedValue;", cancellable = true)
    private void amount_1104014522(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1104014522L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1587178649(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1587178649L))
            info.setReturnValue(null);
    }


}
