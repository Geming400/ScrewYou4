package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.layouts.LinearLayout.Orientation.class)
public class Orientation_1517965897Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/gui/layouts/LinearLayout$Orientation;", cancellable = true)
    private static void values__632545722(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-632545722L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/gui/layouts/LinearLayout$Orientation;", cancellable = true)
    private static void valueOf__957821527(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-957821527L))
            info.setReturnValue(net.minecraft.client.gui.layouts.LinearLayout.Orientation.HORIZONTAL);
    }

    @Inject(at = @At("HEAD"), method = "addChild(Lnet/minecraft/client/gui/layouts/GridLayout;Lnet/minecraft/client/gui/layouts/LayoutElement;ILnet/minecraft/client/gui/layouts/LayoutSettings;)Lnet/minecraft/client/gui/layouts/LayoutElement;", cancellable = true)
    private void addChild_621961475(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(621961475L))
            info.setReturnValue(null);
    }


}
