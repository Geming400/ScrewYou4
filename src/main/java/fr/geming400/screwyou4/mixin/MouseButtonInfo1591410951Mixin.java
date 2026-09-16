package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.input.MouseButtonInfo.class)
public class MouseButtonInfo1591410951Mixin {
        @Inject(at = @At("HEAD"), method = "modifiers()I", cancellable = true)
    private void modifiers_2122476529(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2122476529L))
            info.setReturnValue(-1132754476);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_682784683(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(682784683L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1933132820(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1933132820L))
            info.setReturnValue("{\u6F3Fl");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__2146204254(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2146204254L))
            info.setReturnValue(288063221);
    }

    @Inject(at = @At("HEAD"), method = "input()I", cancellable = true)
    private void input__1369911965(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1369911965L))
            info.setReturnValue(482788356);
    }

    @Inject(at = @At("HEAD"), method = "button()I", cancellable = true)
    private void button__221028613(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-221028613L))
            info.setReturnValue(-1942787848);
    }


}
