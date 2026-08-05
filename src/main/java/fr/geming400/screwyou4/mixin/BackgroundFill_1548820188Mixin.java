package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.components.FocusableTextWidget.BackgroundFill.class)
public class BackgroundFill_1548820188Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/gui/components/FocusableTextWidget$BackgroundFill;", cancellable = true)
    private static void values__1227306733(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1227306733L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/gui/components/FocusableTextWidget$BackgroundFill;", cancellable = true)
    private static void valueOf_492139152(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(492139152L))
            info.setReturnValue(net.minecraft.client.gui.components.FocusableTextWidget.BackgroundFill.ON_FOCUS);
    }


}
