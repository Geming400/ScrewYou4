package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.enchantment.LevelBasedValue.Exponent.class)
public class Exponent_84476797Mixin {
        @Inject(at = @At("HEAD"), method = "base()Lnet/minecraft/world/item/enchantment/LevelBasedValue;", cancellable = true)
    private void base__1093725444(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1093725444L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__824149472(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-824149472L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_854900321(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(854900321L))
            info.setReturnValue("P?=I\u7963'*:^+rj>\"(9\u8106\u07F1Ef*W,OH(9z");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_641828887(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(641828887L))
            info.setReturnValue(1646490241);
    }

    @Inject(at = @At("HEAD"), method = "power()Lnet/minecraft/world/item/enchantment/LevelBasedValue;", cancellable = true)
    private void power_1608952880(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1608952880L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_1150922050(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1150922050L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "calculate(I)F", cancellable = true)
    private void calculate_1972243838(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1972243838L))
            info.setReturnValue(8.741916E8F);
    }


}
