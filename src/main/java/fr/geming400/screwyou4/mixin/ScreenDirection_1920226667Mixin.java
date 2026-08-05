package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.navigation.ScreenDirection.class)
public class ScreenDirection_1920226667Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/gui/navigation/ScreenDirection;", cancellable = true)
    private static void values__1197453743(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1197453743L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/gui/navigation/ScreenDirection;", cancellable = true)
    private static void valueOf_1187054580(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1187054580L))
            info.setReturnValue(net.minecraft.client.gui.navigation.ScreenDirection.LEFT);
    }

    @Inject(at = @At("HEAD"), method = "isPositive()Z", cancellable = true)
    private void isPositive_1958505249(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1958505249L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isAfter(II)Z", cancellable = true)
    private void isAfter_924351041(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(924351041L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isBefore(II)Z", cancellable = true)
    private void isBefore_924351041(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(924351041L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getOpposite()Lnet/minecraft/client/gui/navigation/ScreenDirection;", cancellable = true)
    private void getOpposite_1365538802(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1365538802L))
            info.setReturnValue(net.minecraft.client.gui.navigation.ScreenDirection.LEFT);
    }

    @Inject(at = @At("HEAD"), method = "getAxis()Lnet/minecraft/client/gui/navigation/ScreenAxis;", cancellable = true)
    private void getAxis__1571780876(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1571780876L))
            info.setReturnValue(net.minecraft.client.gui.navigation.ScreenAxis.HORIZONTAL);
    }

    @Inject(at = @At("HEAD"), method = "coordinateValueComparator()Lit/unimi/dsi/fastutil/ints/IntComparator;", cancellable = true)
    private void coordinateValueComparator_693058569(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(693058569L))
            info.setReturnValue(null);
    }


}
