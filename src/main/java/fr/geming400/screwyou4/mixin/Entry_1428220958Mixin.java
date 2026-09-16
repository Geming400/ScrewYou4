package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.reporting.ReportReasonSelectionScreen.ReasonSelectionList.Entry.class)
public class Entry_1428220958Mixin {
        @Inject(at = @At("HEAD"), method = "getReason()Lnet/minecraft/client/multiplayer/chat/report/ReportReason;", cancellable = true)
    private void getReason__736454682(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-736454682L))
            info.setReturnValue(net.minecraft.client.multiplayer.chat.report.ReportReason.SEXUALLY_INAPPROPRIATE);
    }

    @Inject(at = @At("HEAD"), method = "getNarration()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getNarration_2146385564(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2146385564L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mouseClicked(Lnet/minecraft/client/input/MouseButtonEvent;Z)Z", cancellable = true)
    private void mouseClicked_887714781(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(887714781L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "extractContent(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIZF)V", cancellable = true)
    private void extractContent_1942978441(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1942978441L))
            info.cancel();
    }


}
