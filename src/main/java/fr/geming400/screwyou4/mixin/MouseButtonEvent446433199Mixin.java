package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.input.MouseButtonEvent.class)
public class MouseButtonEvent446433199Mixin {
        @Inject(at = @At("HEAD"), method = "modifiers()I", cancellable = true)
    private void modifiers_484695445(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(484695445L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1831945458(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1831945458L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__689026776(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-689026776L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_484695941(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(484695941L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "x()D", cancellable = true)
    private void x_484690640(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(484690640L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "input()I", cancellable = true)
    private void input_484695445(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(484695445L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "y()D", cancellable = true)
    private void y_484690640(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(484690640L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "buttonInfo()Lnet/minecraft/client/input/MouseButtonInfo;", cancellable = true)
    private void buttonInfo__371708307(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-371708307L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "button()I", cancellable = true)
    private void button_484695445(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(484695445L))
            info.setReturnValue(null);
    }


}
