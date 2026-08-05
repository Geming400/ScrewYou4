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
            info.setReturnValue("tkIRWooGc=((*71eUl$8\u7826\u7DE72`,|D=S\u16AF4|M9uRawWtMd\u67349y'|#\u85B3ScKcj0;.)@>\uC875md0V\u4501\u2639FK^_[Wpg=\u3815)O_Z*s|");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_321428671(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(321428671L))
            info.setReturnValue(-907668540);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_2019019653(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2019019653L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "calculate(I)F", cancellable = true)
    private void calculate_1497067525(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1497067525L))
            info.setReturnValue(3.828355E8F);
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
