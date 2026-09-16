package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.packs.TransferableSelectionList.HeaderEntry.class)
public class HeaderEntry_190639656Mixin {
        @Inject(at = @At("HEAD"), method = "extractContent(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIZF)V", cancellable = true)
    private void extractContent_705397139(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(705397139L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getNarration()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getNarration_908804262(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(908804262L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPackId()Ljava/lang/String;", cancellable = true)
    private void getPackId__171862470(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-171862470L))
            info.setReturnValue("Ex;e\uB4697rsICA`wsHe|t:S");
    }


}
