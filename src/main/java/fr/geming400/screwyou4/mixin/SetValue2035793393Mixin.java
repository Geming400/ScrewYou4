package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.enchantment.effects.SetValue.class)
public class SetValue2035793393Mixin {
        @Inject(at = @At("HEAD"), method = "value()Lnet/minecraft/world/item/enchantment/LevelBasedValue;", cancellable = true)
    private void value__233058287(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-233058287L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1127167125(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1127167125L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1488750378(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1488750378L))
            info.setReturnValue("9\u9E54+faSu");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1701821812(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1701821812L))
            info.setReturnValue(2072826644);
    }

    @Inject(at = @At("HEAD"), method = "process(ILnet/minecraft/util/RandomSource;F)F", cancellable = true)
    private void process_159784594(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(159784594L))
            info.setReturnValue(8.418469E8F);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1192728649(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1192728649L))
            info.setReturnValue(null);
    }


}
