package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.worldselection.WorldSelectionList.NoWorldsEntry.class)
public class NoWorldsEntry1120984224Mixin {
        @Inject(at = @At("HEAD"), method = "extractContent(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIZF)V", cancellable = true)
    private void extractContent_2032659284(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2032659284L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getNarration()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getNarration__1055924941(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1055924941L))
            info.setReturnValue(null);
    }


}
