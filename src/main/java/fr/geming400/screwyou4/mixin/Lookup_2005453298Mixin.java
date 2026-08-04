package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.enchantment.LevelBasedValue.Lookup.class)
public class Lookup_2005453298Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__904001740(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-904001740L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_869993322(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(869993322L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "values()Ljava/util/List;", cancellable = true)
    private void values__663177183(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-663177183L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2043716039(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2043716039L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fallback()Lnet/minecraft/world/item/enchantment/LevelBasedValue;", cancellable = true)
    private void fallback_2137532896(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2137532896L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "calculate(I)F", cancellable = true)
    private void calculate__1075612403(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1075612403L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__553660275(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-553660275L))
            info.setReturnValue(null);
    }


}
