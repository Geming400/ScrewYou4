package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.options.controls.KeyBindsList.KeyEntry.class)
public class KeyEntry_982278604Mixin {
        @Inject(at = @At("HEAD"), method = "children()Ljava/util/List;", cancellable = true)
    private void children__2098022278(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2098022278L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "refreshEntry()V", cancellable = true)
    private void refreshEntry__1864781689(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1864781689L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractContent(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIZF)V", cancellable = true)
    private void extractContent_1497036087(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1497036087L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "narratables()Ljava/util/List;", cancellable = true)
    private void narratables__1592467474(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1592467474L))
            info.setReturnValue(null);
    }


}
