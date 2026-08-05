package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.layouts.EqualSpacingLayout.Orientation.class)
public class Orientation_2071816895Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/gui/layouts/EqualSpacingLayout$Orientation;", cancellable = true)
    private static void values__1226831950(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1226831950L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/gui/layouts/EqualSpacingLayout$Orientation;", cancellable = true)
    private static void valueOf__1777966891(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1777966891L))
            info.setReturnValue(net.minecraft.client.gui.layouts.EqualSpacingLayout.Orientation.HORIZONTAL);
    }


}
