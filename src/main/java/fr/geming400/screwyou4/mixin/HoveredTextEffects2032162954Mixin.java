package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.GuiGraphicsExtractor.HoveredTextEffects.class)
public class HoveredTextEffects2032162954Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/gui/GuiGraphicsExtractor$HoveredTextEffects;", cancellable = true)
    private static void values__2138386643(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2138386643L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/gui/GuiGraphicsExtractor$HoveredTextEffects;", cancellable = true)
    private static void valueOf__2043700630(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2043700630L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "notClickable(Z)Lnet/minecraft/client/gui/GuiGraphicsExtractor$HoveredTextEffects;", cancellable = true)
    private static void notClickable_1099908714(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1099908714L))
            info.setReturnValue(null);
    }


}
