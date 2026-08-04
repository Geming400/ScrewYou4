package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.worldselection.WorldSelectionList.LoadingHeader.class)
public class LoadingHeader130709481Mixin {
        @Inject(at = @At("HEAD"), method = "extractContent(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIZF)V", cancellable = true)
    private void extractContent_1042384541(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1042384541L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getNarration()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getNarration__2046199684(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2046199684L))
            info.setReturnValue(null);
    }


}
