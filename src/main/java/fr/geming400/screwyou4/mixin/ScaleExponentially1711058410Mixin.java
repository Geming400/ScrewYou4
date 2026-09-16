package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.enchantment.effects.ScaleExponentially.class)
public class ScaleExponentially1711058410Mixin {
        @Inject(at = @At("HEAD"), method = "base()Lnet/minecraft/world/item/enchantment/LevelBasedValue;", cancellable = true)
    private void base_532856170(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(532856170L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_802432142(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(802432142L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1813485361(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1813485361L))
            info.setReturnValue("+\uCAF2T_i9\u85FEG)M \"@8XX\u7E9B'\u7704NYEaIy\u4AE0o3[u\u2C63L4e");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__2026556795(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2026556795L))
            info.setReturnValue(136186480);
    }

    @Inject(at = @At("HEAD"), method = "exponent()Lnet/minecraft/world/item/enchantment/LevelBasedValue;", cancellable = true)
    private void exponent_357007304(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(357007304L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "process(ILnet/minecraft/util/RandomSource;F)F", cancellable = true)
    private void process__164950389(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-164950389L))
            info.setReturnValue(9.701042E8F);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1517463632(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1517463632L))
            info.setReturnValue(null);
    }


}
