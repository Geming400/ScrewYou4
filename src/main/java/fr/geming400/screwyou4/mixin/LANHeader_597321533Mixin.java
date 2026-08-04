package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.multiplayer.ServerSelectionList.LANHeader.class)
public class LANHeader_597321533Mixin {
        @Inject(at = @At("HEAD"), method = "join()V", cancellable = true)
    private void join_635596271(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(635596271L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractContent(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIZF)V", cancellable = true)
    private void extractContent_1508996592(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1508996592L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getNarration()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getNarration__1579587633(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1579587633L))
            info.setReturnValue(null);
    }


}
