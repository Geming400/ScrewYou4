package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.triggers.EnchantedItemTrigger.TriggerInstance.class)
public class TriggerInstance_168631820Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__739994449(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-739994449L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_939055344(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(939055344L))
            info.setReturnValue("@\uB214g <");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_725983910(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(725983910L))
            info.setReturnValue(481271372);
    }

    @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/item/ItemStack;I)Z", cancellable = true)
    private void matches__309075927(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-309075927L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "item()Ljava/util/Optional;", cancellable = true)
    private void item__629882420(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-629882420L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "levels()Lnet/minecraft/advancements/predicates/MinMaxBounds$Ints;", cancellable = true)
    private void levels__1500895990(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1500895990L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "enchantedItem()Lnet/minecraft/advancements/triggers/Criterion;", cancellable = true)
    private static void enchantedItem_1717084583(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1717084583L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "player()Ljava/util/Optional;", cancellable = true)
    private void player__1062021222(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1062021222L))
            info.setReturnValue(null);
    }


}
