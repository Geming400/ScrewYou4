package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.navigation.ScreenAxis.class)
public class ScreenAxis995681787Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/gui/navigation/ScreenAxis;", cancellable = true)
    private static void values__614121802(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-614121802L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/gui/navigation/ScreenAxis;", cancellable = true)
    private static void valueOf__964931789(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-964931789L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getNegative()Lnet/minecraft/client/gui/navigation/ScreenDirection;", cancellable = true)
    private void getNegative_440993923(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(440993923L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDirection(Z)Lnet/minecraft/client/gui/navigation/ScreenDirection;", cancellable = true)
    private void getDirection_1983801229(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1983801229L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPositive()Lnet/minecraft/client/gui/navigation/ScreenDirection;", cancellable = true)
    private void getPositive_440993923(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(440993923L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "orthogonal()Lnet/minecraft/client/gui/navigation/ScreenAxis;", cancellable = true)
    private void orthogonal_1798641541(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1798641541L))
            info.setReturnValue(null);
    }


}
