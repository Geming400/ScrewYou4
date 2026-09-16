package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.enchantment.effects.AddValue.class)
public class AddValue970362066Mixin {
        @Inject(at = @At("HEAD"), method = "value()Lnet/minecraft/world/item/enchantment/LevelBasedValue;", cancellable = true)
    private void value__1298489614(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1298489614L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_61735798(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(61735798L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1740785591(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1740785591L))
            info.setReturnValue("\u3064\u3B63`FxM\u5C4B# [wj-l\u43F6.^JD(kyP\uD556$ck[-87!\uB874F\u0E32MdW>\u56B1&X\u4F847M\u3495bhxINH\u3323x/\u4CE14");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1527714157(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1527714157L))
            info.setReturnValue(-94451826);
    }

    @Inject(at = @At("HEAD"), method = "process(ILnet/minecraft/util/RandomSource;F)F", cancellable = true)
    private void process__905646733(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-905646733L))
            info.setReturnValue(2.747437E8F);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_2036807320(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2036807320L))
            info.setReturnValue(null);
    }


}
