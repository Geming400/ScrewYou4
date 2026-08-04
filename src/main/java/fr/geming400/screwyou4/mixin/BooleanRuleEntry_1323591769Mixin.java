package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.worldselection.AbstractGameRulesScreen.BooleanRuleEntry.class)
public class BooleanRuleEntry_1323591769Mixin {
        @Inject(at = @At("HEAD"), method = "extractContent(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIZF)V", cancellable = true)
    private void extractContent__2059700468(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2059700468L))
            info.cancel();
    }


}
