package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.enchantment.effects.MultiplyValue.class)
public class MultiplyValue_1245604721Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1663850317(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1663850317L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_110144745(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(110144745L))
            info.setReturnValue("TZ&\u8E7Eb]\u7F394Hpj$7H}.J\u07EC_(C\u45F0&\u55C3* clg350sBPq\u0B2Erz\u5B9Cd,\uD69C9J,O8csL'#^v:tpgiH\u5C92|\u3316");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1283867462(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1283867462L))
            info.setReturnValue(-984529712);
    }

    @Inject(at = @At("HEAD"), method = "process(ILnet/minecraft/util/RandomSource;F)F", cancellable = true)
    private void process_2137196706(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2137196706L))
            info.setReturnValue(3.022232E8F);
    }

    @Inject(at = @At("HEAD"), method = "factor()Lnet/minecraft/world/item/enchantment/LevelBasedValue;", cancellable = true)
    private void factor_1377684319(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1377684319L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1313508852(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1313508852L))
            info.setReturnValue(null);
    }


}
