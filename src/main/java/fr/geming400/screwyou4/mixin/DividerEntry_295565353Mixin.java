package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.reporting.ChatSelectionScreen.ChatSelectionList.DividerEntry.class)
public class DividerEntry_295565353Mixin {
        @Inject(at = @At("HEAD"), method = "getNarration()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getNarration_1013729959(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1013729959L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractContent(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIZF)V", cancellable = true)
    private void extractContent_810322836(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(810322836L))
            info.cancel();
    }


}
