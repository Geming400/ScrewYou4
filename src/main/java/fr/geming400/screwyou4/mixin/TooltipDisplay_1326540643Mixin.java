package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.component.TooltipDisplay.class)
public class TooltipDisplay_1326540643Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_417914374(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(417914374L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_2096964167(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2096964167L))
            info.setReturnValue("u}\u0BB4*zrD_#ph(,c.]?S5w3S;{hm6\uC4CF>@\u0A9D-4I\u8EE3}P/;EV\uC8C7*`R\u1DDB3m8\uD3F2\"{\uAD88w\uB11C?^Nbg,w");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1883892733(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1883892733L))
            info.setReturnValue(-1673003114);
    }

    @Inject(at = @At("HEAD"), method = "hiddenComponents()Ljava/util/SequencedSet;", cancellable = true)
    private void hiddenComponents_955960657(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(955960657L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withHidden(Lnet/minecraft/core/component/DataComponentType;Z)Lnet/minecraft/world/item/component/TooltipDisplay;", cancellable = true)
    private void withHidden_464095732(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(464095732L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "shows(Lnet/minecraft/core/component/DataComponentType;)Z", cancellable = true)
    private void shows_2131566867(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2131566867L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "hideTooltip()Z", cancellable = true)
    private void hideTooltip_900633944(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(900633944L))
            info.setReturnValue(false);
    }


}
