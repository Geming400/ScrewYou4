package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.options.controls.KeyBindsList.CategoryEntry.class)
public class CategoryEntry_1026586607Mixin {
        @Inject(at = @At("HEAD"), method = "children()Ljava/util/List;", cancellable = true)
    private void children__1642043874(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1642043874L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractContent(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIZF)V", cancellable = true)
    private void extractContent_1938261666(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1938261666L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "narratables()Ljava/util/List;", cancellable = true)
    private void narratables__1642043874(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1642043874L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "refreshEntry()V", cancellable = true)
    private void refreshEntry_1064861345(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1064861345L))
            info.cancel();
    }


}
