package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.enchantment.LevelBasedValue.Exponent.class)
public class Exponent_84476797Mixin {
        @Inject(at = @At("HEAD"), method = "base()Lnet/minecraft/world/item/enchantment/LevelBasedValue;", cancellable = true)
    private void base_216556395(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(216556395L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1469989055(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1469989055L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1050983179(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1050983179L))
            info.setReturnValue("p $C`.{cU(7U\u7688u^p`40\uCA78=G[OhQvS#C\"k\uADB2");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_122739538(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(122739538L))
            info.setReturnValue(1951659280);
    }

    @Inject(at = @At("HEAD"), method = "power()Lnet/minecraft/world/item/enchantment/LevelBasedValue;", cancellable = true)
    private void power_216556395(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(216556395L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_1820330520(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1820330520L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "calculate(I)F", cancellable = true)
    private void calculate_1298378392(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1298378392L))
            info.setReturnValue(1.231444E8F);
    }


}
