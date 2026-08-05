package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.navigation.ScreenDirection.class)
public class ScreenDirection_1920226667Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/gui/navigation/ScreenDirection;", cancellable = true)
    private static void values__436413197(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-436413197L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/gui/navigation/ScreenDirection;", cancellable = true)
    private static void valueOf_895104972(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(895104972L))
            info.setReturnValue(net.minecraft.client.gui.navigation.ScreenDirection.DOWN);
    }

    @Inject(at = @At("HEAD"), method = "isPositive()Z", cancellable = true)
    private void isPositive__1828226114(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1828226114L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isAfter(II)Z", cancellable = true)
    private void isAfter__1179429073(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1179429073L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isBefore(II)Z", cancellable = true)
    private void isBefore_1356723416(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1356723416L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getOpposite()Lnet/minecraft/client/gui/navigation/ScreenDirection;", cancellable = true)
    private void getOpposite__1757877707(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1757877707L))
            info.setReturnValue(net.minecraft.client.gui.navigation.ScreenDirection.UP);
    }

    @Inject(at = @At("HEAD"), method = "getAxis()Lnet/minecraft/client/gui/navigation/ScreenAxis;", cancellable = true)
    private void getAxis__787756661(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-787756661L))
            info.setReturnValue(net.minecraft.client.gui.navigation.ScreenAxis.VERTICAL);
    }

    @Inject(at = @At("HEAD"), method = "coordinateValueComparator()Lit/unimi/dsi/fastutil/ints/IntComparator;", cancellable = true)
    private void coordinateValueComparator_119119448(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(119119448L))
            info.setReturnValue(null);
    }


}
