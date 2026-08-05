package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.worldselection.AbstractGameRulesScreen.RuleList.class)
public class RuleList_1253082925Mixin {
        @Inject(at = @At("HEAD"), method = "extractWidgetRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V", cancellable = true)
    private void extractWidgetRenderState__1954199958(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1954199958L))
            info.cancel();
    }


}
