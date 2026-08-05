package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.packs.TransferableSelectionList.HeaderEntry.class)
public class HeaderEntry_190639656Mixin {
        @Inject(at = @At("HEAD"), method = "extractContent(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIZF)V", cancellable = true)
    private void extractContent_1102314715(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1102314715L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getNarration()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getNarration__1986269510(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1986269510L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPackId()Ljava/lang/String;", cancellable = true)
    private void getPackId__944820816(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-944820816L))
            info.setReturnValue("`%3ꀂee&#cnxc`w5ཊ/|d7w*Tg3Z'n5.06g#tjᷬy1NVKmE+4ﯛSZᆬ`pnઞwr/");
    }


}
