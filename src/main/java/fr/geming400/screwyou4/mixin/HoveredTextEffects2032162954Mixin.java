package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.GuiGraphicsExtractor.HoveredTextEffects.class)
public class HoveredTextEffects2032162954Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/gui/GuiGraphicsExtractor$HoveredTextEffects;", cancellable = true)
    private static void values__589391925(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-589391925L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/gui/GuiGraphicsExtractor$HoveredTextEffects;", cancellable = true)
    private static void valueOf__1702664814(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1702664814L))
            info.setReturnValue(net.minecraft.client.gui.GuiGraphicsExtractor.HoveredTextEffects.NONE);
    }

    @Inject(at = @At("HEAD"), method = "notClickable(Z)Lnet/minecraft/client/gui/GuiGraphicsExtractor$HoveredTextEffects;", cancellable = true)
    private static void notClickable__1871466949(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1871466949L))
            info.setReturnValue(net.minecraft.client.gui.GuiGraphicsExtractor.HoveredTextEffects.TOOLTIP_ONLY);
    }


}
