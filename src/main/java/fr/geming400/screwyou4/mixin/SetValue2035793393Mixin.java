package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.enchantment.effects.SetValue.class)
public class SetValue2035793393Mixin {
        @Inject(at = @At("HEAD"), method = "value()Lnet/minecraft/world/item/enchantment/LevelBasedValue;", cancellable = true)
    private void value__2127094304(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2127094304L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__873661644(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-873661644L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_900333418(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(900333418L))
            info.setReturnValue("z");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2074056135(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2074056135L))
            info.setReturnValue(728703146);
    }

    @Inject(at = @At("HEAD"), method = "process(ILnet/minecraft/util/RandomSource;F)F", cancellable = true)
    private void process__1367581917(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1367581917L))
            info.setReturnValue(7.94028E8F);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__523320179(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-523320179L))
            info.setReturnValue(null);
    }


}
