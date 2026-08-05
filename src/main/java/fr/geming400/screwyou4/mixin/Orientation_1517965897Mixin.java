package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.layouts.LinearLayout.Orientation.class)
public class Orientation_1517965897Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/gui/layouts/LinearLayout$Orientation;", cancellable = true)
    private static void values__1053316248(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1053316248L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/gui/layouts/LinearLayout$Orientation;", cancellable = true)
    private static void valueOf_517062529(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(517062529L))
            info.setReturnValue(net.minecraft.client.gui.layouts.LinearLayout.Orientation.HORIZONTAL);
    }

    @Inject(at = @At("HEAD"), method = "addChild(Lnet/minecraft/client/gui/layouts/GridLayout;Lnet/minecraft/client/gui/layouts/LayoutElement;ILnet/minecraft/client/gui/layouts/LayoutSettings;)Lnet/minecraft/client/gui/layouts/LayoutElement;", cancellable = true)
    private void addChild__963266008(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-963266008L))
            info.setReturnValue(null);
    }


}
