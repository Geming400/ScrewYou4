package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.navigation.FocusNavigationEvent.TabNavigation.class)
public class TabNavigation_1417366903Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1492088135(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1492088135L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_281906927(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(281906927L))
            info.setReturnValue("&ee+C.,r>&q踹NC|{佅MO:N.ꞧ瞞Z=6L{H\".^✜S/s?");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1455629644(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1455629644L))
            info.setReturnValue(-219829871);
    }

    @Inject(at = @At("HEAD"), method = "forward()Z", cancellable = true)
    private void forward_1455645485(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1455645485L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getVerticalDirectionForInitialFocus()Lnet/minecraft/client/gui/navigation/ScreenDirection;", cancellable = true)
    private void getVerticalDirectionForInitialFocus_862679038(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(862679038L))
            info.setReturnValue(net.minecraft.client.gui.navigation.ScreenDirection.LEFT);
    }


}
