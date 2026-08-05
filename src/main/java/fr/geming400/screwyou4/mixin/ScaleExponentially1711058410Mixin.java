package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.enchantment.effects.ScaleExponentially.class)
public class ScaleExponentially1711058410Mixin {
        @Inject(at = @At("HEAD"), method = "base()Lnet/minecraft/world/item/enchantment/LevelBasedValue;", cancellable = true)
    private void base_1843138009(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1843138009L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1198396627(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1198396627L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_575598435(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(575598435L))
            info.setReturnValue("fxEABL]-x}\u806Dq({naZ_IpOV8F!\u8AFB2UJ7\uA399\u5BCA_PZrN\uA6CEry':\u6DF5N'*H");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1749321152(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1749321152L))
            info.setReturnValue(-1407336473);
    }

    @Inject(at = @At("HEAD"), method = "exponent()Lnet/minecraft/world/item/enchantment/LevelBasedValue;", cancellable = true)
    private void exponent_1843138009(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1843138009L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "process(ILnet/minecraft/util/RandomSource;F)F", cancellable = true)
    private void process__1692316900(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1692316900L))
            info.setReturnValue(7.302531E8F);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__848055162(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-848055162L))
            info.setReturnValue(null);
    }


}
