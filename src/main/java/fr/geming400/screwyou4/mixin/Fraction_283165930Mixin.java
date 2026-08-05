package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.enchantment.LevelBasedValue.Fraction.class)
public class Fraction_283165930Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1668678188(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1668678188L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__852294046(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-852294046L))
            info.setReturnValue("tkIRWooGc=((*71eUl$8砦緧2`,|D=Sᚯ4|M9uRawWtMd朴9y'|#薳ScKcj0;.)@>졵md0V䔁☹FK^_[Wpg=㠕)O_Z*s|");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_321428671(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(321428671L))
            info.setReturnValue(-740194640);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_2019019653(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2019019653L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "calculate(I)F", cancellable = true)
    private void calculate_1497067525(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1497067525L))
            info.setReturnValue(5.503094E8F);
    }

    @Inject(at = @At("HEAD"), method = "denominator()Lnet/minecraft/world/item/enchantment/LevelBasedValue;", cancellable = true)
    private void denominator_415245528(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(415245528L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "numerator()Lnet/minecraft/world/item/enchantment/LevelBasedValue;", cancellable = true)
    private void numerator_415245528(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(415245528L))
            info.setReturnValue(null);
    }


}
