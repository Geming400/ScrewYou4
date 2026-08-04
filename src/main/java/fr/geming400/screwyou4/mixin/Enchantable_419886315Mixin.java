package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.enchantment.Enchantable.class)
public class Enchantable_419886315Mixin {
        @Inject(at = @At("HEAD"), method = "value()I", cancellable = true)
    private void value_458148560(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(458148560L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1805398573(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1805398573L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__715573661(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-715573661L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_458149056(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(458149056L))
            info.setReturnValue(null);
    }


}
