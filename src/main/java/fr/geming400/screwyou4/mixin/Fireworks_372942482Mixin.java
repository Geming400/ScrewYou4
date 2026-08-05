package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.component.Fireworks.class)
public class Fireworks_372942482Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1758454740(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1758454740L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__762517494(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-762517494L))
            info.setReturnValue("燩LCJiZ?u[<.C９:P>vEi堕,?.fvl<V-ƄQ28f&Ⴂ븐z饰0+o_qkGtQL");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_411205223(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(411205223L))
            info.setReturnValue(926729307);
    }

    @Inject(at = @At("HEAD"), method = "flightDuration()I", cancellable = true)
    private void flightDuration_411204727(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(411204727L))
            info.setReturnValue(1129876726);
    }

    @Inject(at = @At("HEAD"), method = "addToTooltip(Lnet/minecraft/world/item/Item$TooltipContext;Ljava/util/function/Consumer;Lnet/minecraft/world/item/TooltipFlag;Lnet/minecraft/core/component/DataComponentGetter;)V", cancellable = true)
    private void addToTooltip_2125191387(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2125191387L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "explosions()Ljava/util/List;", cancellable = true)
    private void explosions_1999279297(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1999279297L))
            info.setReturnValue(null);
    }


}
