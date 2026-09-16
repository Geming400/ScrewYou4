package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.enchantment.LevelBasedValue.Lookup.class)
public class Lookup_2005453298Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1096827029(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1096827029L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1519090474(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1519090474L))
            info.setReturnValue("8");
    }

    @Inject(at = @At("HEAD"), method = "values()Ljava/util/List;", cancellable = true)
    private void values__1111592893(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1111592893L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1732161908(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1732161908L))
            info.setReturnValue(-2047213649);
    }

    @Inject(at = @At("HEAD"), method = "fallback()Lnet/minecraft/world/item/enchantment/LevelBasedValue;", cancellable = true)
    private void fallback_189469250(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(189469250L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1223068745(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1223068745L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "calculate(I)F", cancellable = true)
    private void calculate__401746957(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-401746957L))
            info.setReturnValue(3.762614E8F);
    }


}
