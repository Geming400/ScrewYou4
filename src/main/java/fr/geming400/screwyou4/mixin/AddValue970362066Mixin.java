package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.enchantment.effects.AddValue.class)
public class AddValue970362066Mixin {
        @Inject(at = @At("HEAD"), method = "value()Lnet/minecraft/world/item/enchantment/LevelBasedValue;", cancellable = true)
    private void value_1102441665(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1102441665L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1939092971(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1939092971L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__165097909(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-165097909L))
            info.setReturnValue("s8\u844DSXAt6_g[fbLN[l6*2,\u0A89D\u3BB8Wtv=r!Hz*Uw]DKG*qSp&MAC\u0FACz9m.1TuE1<H<\u1EB9=fBK");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1008624808(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1008624808L))
            info.setReturnValue(2025865470);
    }

    @Inject(at = @At("HEAD"), method = "process(ILnet/minecraft/util/RandomSource;F)F", cancellable = true)
    private void process_1861954052(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1861954052L))
            info.setReturnValue(4.283665E8F);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1588751506(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1588751506L))
            info.setReturnValue(null);
    }


}
