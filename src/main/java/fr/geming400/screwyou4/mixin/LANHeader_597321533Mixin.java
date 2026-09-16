package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.multiplayer.ServerSelectionList.LANHeader.class)
public class LANHeader_597321533Mixin {
        @Inject(at = @At("HEAD"), method = "join()V", cancellable = true)
    private void join_50215685(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(50215685L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractContent(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIZF)V", cancellable = true)
    private void extractContent_1112079016(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1112079016L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getNarration()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getNarration_1315486139(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1315486139L))
            info.setReturnValue(null);
    }


}
