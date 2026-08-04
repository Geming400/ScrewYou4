package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.reporting.ReportReasonSelectionScreen.ReasonSelectionList.class)
public class ReasonSelectionList_1521349132Mixin {
        @Inject(at = @At("HEAD"), method = "findEntry(Lnet/minecraft/client/multiplayer/chat/report/ReportReason;)Lnet/minecraft/client/gui/screens/reporting/ReportReasonSelectionScreen$ReasonSelectionList$Entry;", cancellable = true)
    private void findEntry_581272096(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(581272096L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setSelected(Lnet/minecraft/client/gui/components/AbstractSelectionList$Entry;)V", cancellable = true)
    private void setSelected__916141132(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-916141132L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setSelected(Lnet/minecraft/client/gui/screens/reporting/ReportReasonSelectionScreen$ReasonSelectionList$Entry;)V", cancellable = true)
    private void setSelected_2047216234(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2047216234L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getRowWidth()I", cancellable = true)
    private void getRowWidth_1559611377(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1559611377L))
            info.setReturnValue(null);
    }


}
