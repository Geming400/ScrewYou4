package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.options.controls.KeyBindsList.KeyEntry.class)
public class KeyEntry_982278604Mixin {
        @Inject(at = @At("HEAD"), method = "children()Ljava/util/List;", cancellable = true)
    private void children__1686351877(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1686351877L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "refreshEntry()V", cancellable = true)
    private void refreshEntry_1020553342(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1020553342L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractContent(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIZF)V", cancellable = true)
    private void extractContent_1893953663(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1893953663L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "narratables()Ljava/util/List;", cancellable = true)
    private void narratables__1686351877(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1686351877L))
            info.setReturnValue(null);
    }


}
