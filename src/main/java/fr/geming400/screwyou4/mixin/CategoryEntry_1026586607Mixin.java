package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.options.controls.KeyBindsList.CategoryEntry.class)
public class CategoryEntry_1026586607Mixin {
        @Inject(at = @At("HEAD"), method = "children()Ljava/util/List;", cancellable = true)
    private void children__2053714275(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2053714275L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "refreshEntry()V", cancellable = true)
    private void refreshEntry__1820473686(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1820473686L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractContent(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIZF)V", cancellable = true)
    private void extractContent_1541344090(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1541344090L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "narratables()Ljava/util/List;", cancellable = true)
    private void narratables__1548159471(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1548159471L))
            info.setReturnValue(null);
    }


}
