package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.predicates.EnchantmentPredicate.class)
public class EnchantmentPredicate_1670247308Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1239207730(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1239207730L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_534787332(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(534787332L))
            info.setReturnValue("A/z};@'bYu({0(.#\u3A95nYj\u0575@\uAE22-0g");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1708510049(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1708510049L))
            info.setReturnValue(1266576376);
    }

    @Inject(at = @At("HEAD"), method = "level()Lnet/minecraft/advancements/predicates/MinMaxBounds$Ints;", cancellable = true)
    private void level_1519012249(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1519012249L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "enchantments()Ljava/util/Optional;", cancellable = true)
    private void enchantments_1915708729(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1915708729L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "containedIn(Lnet/minecraft/world/item/enchantment/ItemEnchantments;)Z", cancellable = true)
    private void containedIn__1654821753(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1654821753L))
            info.setReturnValue(true);
    }


}
