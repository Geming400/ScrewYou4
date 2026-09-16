package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.enchantment.LevelBasedValue.Fraction.class)
public class Fraction_283165930Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__625460339(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-625460339L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1053589454(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1053589454L))
            info.setReturnValue("&\u9AED");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_840518020(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(840518020L))
            info.setReturnValue(1490956323);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_1349611183(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1349611183L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "calculate(I)F", cancellable = true)
    private void calculate__2124034325(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2124034325L))
            info.setReturnValue(3.1643E8F);
    }

    @Inject(at = @At("HEAD"), method = "numerator()Lnet/minecraft/world/item/enchantment/LevelBasedValue;", cancellable = true)
    private void numerator_803302945(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(803302945L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "denominator()Lnet/minecraft/world/item/enchantment/LevelBasedValue;", cancellable = true)
    private void denominator__649405506(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-649405506L))
            info.setReturnValue(null);
    }


}
