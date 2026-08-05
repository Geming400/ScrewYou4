package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.navigation.FocusNavigationEvent.ArrowNavigation.class)
public class ArrowNavigation_2002153219Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__907301819(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-907301819L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_866693243(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(866693243L))
            info.setReturnValue("JEi?az\u819FKaSC;^K+FMP\uFD0E8;J%r\u0DD4w\u950F4");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2040415960(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2040415960L))
            info.setReturnValue(154665205);
    }

    @Inject(at = @At("HEAD"), method = "with(Lnet/minecraft/client/gui/navigation/ScreenRectangle;)Lnet/minecraft/client/gui/navigation/FocusNavigationEvent$ArrowNavigation;", cancellable = true)
    private void with_1457789447(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1457789447L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "direction()Lnet/minecraft/client/gui/navigation/ScreenDirection;", cancellable = true)
    private void direction_1447465354(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1447465354L))
            info.setReturnValue(net.minecraft.client.gui.navigation.ScreenDirection.UP);
    }

    @Inject(at = @At("HEAD"), method = "getVerticalDirectionForInitialFocus()Lnet/minecraft/client/gui/navigation/ScreenDirection;", cancellable = true)
    private void getVerticalDirectionForInitialFocus_1447465354(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1447465354L))
            info.setReturnValue(net.minecraft.client.gui.navigation.ScreenDirection.UP);
    }

    @Inject(at = @At("HEAD"), method = "previousFocus()Lnet/minecraft/client/gui/navigation/ScreenRectangle;", cancellable = true)
    private void previousFocus__1117788774(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1117788774L))
            info.setReturnValue(null);
    }


}
