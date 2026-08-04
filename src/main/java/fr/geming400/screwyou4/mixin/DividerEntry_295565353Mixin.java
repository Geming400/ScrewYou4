package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.reporting.ChatSelectionScreen.ChatSelectionList.DividerEntry.class)
public class DividerEntry_295565353Mixin {
        @Inject(at = @At("HEAD"), method = "extractContent(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIZF)V", cancellable = true)
    private void extractContent_1207240412(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1207240412L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getNarration()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getNarration__1881343813(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1881343813L))
            info.setReturnValue(null);
    }


}
