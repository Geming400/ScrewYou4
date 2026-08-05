package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.layouts.EqualSpacingLayout.Orientation.class)
public class Orientation_2071816895Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/gui/layouts/EqualSpacingLayout$Orientation;", cancellable = true)
    private static void values_1455534932(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1455534932L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/gui/layouts/EqualSpacingLayout$Orientation;", cancellable = true)
    private static void valueOf__1074229075(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1074229075L))
            info.setReturnValue(net.minecraft.client.gui.layouts.EqualSpacingLayout.Orientation.VERTICAL);
    }


}
