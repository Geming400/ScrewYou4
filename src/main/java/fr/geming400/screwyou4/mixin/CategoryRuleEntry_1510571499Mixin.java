package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.worldselection.AbstractGameRulesScreen.CategoryRuleEntry.class)
public class CategoryRuleEntry_1510571499Mixin {
        @Inject(at = @At("HEAD"), method = "children()Ljava/util/List;", cancellable = true)
    private void children__1569729383(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1569729383L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractContent(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIZF)V", cancellable = true)
    private void extractContent_2025328982(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2025328982L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "narratables()Ljava/util/List;", cancellable = true)
    private void narratables__1064174579(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1064174579L))
            info.setReturnValue(null);
    }


}
