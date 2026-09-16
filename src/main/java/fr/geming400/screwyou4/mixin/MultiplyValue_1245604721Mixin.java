package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.enchantment.effects.MultiplyValue.class)
public class MultiplyValue_1245604721Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_336978452(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(336978452L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_2016028245(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2016028245L))
            info.setReturnValue("5=F1k\u0678 0g");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1802956811(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1802956811L))
            info.setReturnValue(-1323527701);
    }

    @Inject(at = @At("HEAD"), method = "process(ILnet/minecraft/util/RandomSource;F)F", cancellable = true)
    private void process__630404079(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-630404079L))
            info.setReturnValue(3.365082E8F);
    }

    @Inject(at = @At("HEAD"), method = "factor()Lnet/minecraft/world/item/enchantment/LevelBasedValue;", cancellable = true)
    private void factor__734874642(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-734874642L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1982917322(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1982917322L))
            info.setReturnValue(null);
    }


}
