package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.worldselection.WorldSelectionList.LoadingHeader.class)
public class LoadingHeader130709481Mixin {
        @Inject(at = @At("HEAD"), method = "getNarration()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getNarration_848874088(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(848874088L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractContent(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIZF)V", cancellable = true)
    private void extractContent_645466965(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(645466965L))
            info.cancel();
    }


}
