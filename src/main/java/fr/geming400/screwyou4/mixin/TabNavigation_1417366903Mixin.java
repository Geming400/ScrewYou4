package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.navigation.FocusNavigationEvent.TabNavigation.class)
public class TabNavigation_1417366903Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_508740634(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(508740634L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__2107176869(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2107176869L))
            info.setReturnValue("CAX_RS\u8670'T5\u8339.{3F1X''\u146FEF*t2z8zj+Y%r3w;98Bf41");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1974718993(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1974718993L))
            info.setReturnValue(-886056996);
    }

    @Inject(at = @At("HEAD"), method = "forward()Z", cancellable = true)
    private void forward_1085653896(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1085653896L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getVerticalDirectionForInitialFocus()Lnet/minecraft/client/gui/navigation/ScreenDirection;", cancellable = true)
    private void getVerticalDirectionForInitialFocus__1015334828(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1015334828L))
            info.setReturnValue(net.minecraft.client.gui.navigation.ScreenDirection.UP);
    }


}
