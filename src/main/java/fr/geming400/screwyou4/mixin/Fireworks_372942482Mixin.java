package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.component.Fireworks.class)
public class Fireworks_372942482Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__535683787(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-535683787L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1143366006(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1143366006L))
            info.setReturnValue("Gm4&4}\u798C1\u9105pf](FWkau\"oeganXB\">{!r\uA9F6;\uBD87=IdV\u7B38wh\u18E4IsS:+2 7<5E\uB012X%\uB7FESFwD6U5aM8^\u8705");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_930294572(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(930294572L))
            info.setReturnValue(1333812490);
    }

    @Inject(at = @At("HEAD"), method = "addToTooltip(Lnet/minecraft/world/item/Item$TooltipContext;Ljava/util/function/Consumer;Lnet/minecraft/world/item/TooltipFlag;Lnet/minecraft/core/component/DataComponentGetter;)V", cancellable = true)
    private void addToTooltip__2002277566(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2002277566L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "explosions()Ljava/util/List;", cancellable = true)
    private void explosions__811411009(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-811411009L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "flightDuration()I", cancellable = true)
    private void flightDuration__612373293(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-612373293L))
            info.setReturnValue(-2104696298);
    }


}
