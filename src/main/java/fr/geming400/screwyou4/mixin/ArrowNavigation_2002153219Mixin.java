package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.navigation.FocusNavigationEvent.ArrowNavigation.class)
public class ArrowNavigation_2002153219Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1093526950(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1093526950L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1522390553(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1522390553L))
            info.setReturnValue("(|L\u5192tw");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1735461987(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1735461987L))
            info.setReturnValue(1335940004);
    }

    @Inject(at = @At("HEAD"), method = "with(Lnet/minecraft/client/gui/navigation/ScreenRectangle;)Lnet/minecraft/client/gui/navigation/FocusNavigationEvent$ArrowNavigation;", cancellable = true)
    private void with_1519831937(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1519831937L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "direction()Lnet/minecraft/client/gui/navigation/ScreenDirection;", cancellable = true)
    private void direction_686220011(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(686220011L))
            info.setReturnValue(net.minecraft.client.gui.navigation.ScreenDirection.RIGHT);
    }

    @Inject(at = @At("HEAD"), method = "getVerticalDirectionForInitialFocus()Lnet/minecraft/client/gui/navigation/ScreenDirection;", cancellable = true)
    private void getVerticalDirectionForInitialFocus__430548512(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-430548512L))
            info.setReturnValue(net.minecraft.client.gui.navigation.ScreenDirection.RIGHT);
    }

    @Inject(at = @At("HEAD"), method = "previousFocus()Lnet/minecraft/client/gui/navigation/ScreenRectangle;", cancellable = true)
    private void previousFocus_786789529(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(786789529L))
            info.setReturnValue(null);
    }


}
