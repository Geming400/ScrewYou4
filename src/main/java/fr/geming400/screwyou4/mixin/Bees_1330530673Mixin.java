package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.component.Bees.class)
public class Bees_1330530673Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1578924365(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1578924365L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_195070697(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(195070697L))
            info.setReturnValue("螲㱤荦/`ᄲ?d{-(S^l%i緃弩D酂%똸{r`fLz@b堺0u_뙬[4tj&w.[깸[9gu涜-`7佤N@z*y}8Cl:)滆");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1368793414(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1368793414L))
            info.setReturnValue(-1506804125);
    }

    @Inject(at = @At("HEAD"), method = "bees()Ljava/util/List;", cancellable = true)
    private void bees__1338099808(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1338099808L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addToTooltip(Lnet/minecraft/world/item/Item$TooltipContext;Ljava/util/function/Consumer;Lnet/minecraft/world/item/TooltipFlag;Lnet/minecraft/core/component/DataComponentGetter;)V", cancellable = true)
    private void addToTooltip__1212187718(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1212187718L))
            info.cancel();
    }


}
