package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.reporting.ReportReasonSelectionScreen.ReasonSelectionList.Entry.class)
public class Entry_1428220958Mixin {
        @Inject(at = @At("HEAD"), method = "getReason()Lnet/minecraft/client/multiplayer/chat/report/ReportReason;", cancellable = true)
    private void getReason_54463584(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(54463584L))
            info.setReturnValue(net.minecraft.client.multiplayer.chat.report.ReportReason.HATE_SPEECH);
    }

    @Inject(at = @At("HEAD"), method = "mouseClicked(Lnet/minecraft/client/input/MouseButtonEvent;Z)Z", cancellable = true)
    private void mouseClicked__186437921(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-186437921L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "extractContent(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIZF)V", cancellable = true)
    private void extractContent__1955071279(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1955071279L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getNarration()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getNarration__748688208(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-748688208L))
            info.setReturnValue(null);
    }


}
