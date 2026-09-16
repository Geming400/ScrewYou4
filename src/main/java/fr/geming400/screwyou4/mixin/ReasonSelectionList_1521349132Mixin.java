package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.reporting.ReportReasonSelectionScreen.ReasonSelectionList.class)
public class ReasonSelectionList_1521349132Mixin {
        @Inject(at = @At("HEAD"), method = "findEntry(Lnet/minecraft/client/multiplayer/chat/report/ReportReason;)Lnet/minecraft/client/gui/screens/reporting/ReportReasonSelectionScreen$ReasonSelectionList$Entry;", cancellable = true)
    private void findEntry_2080550663(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2080550663L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setSelected(Lnet/minecraft/client/gui/screens/reporting/ReportReasonSelectionScreen$ReasonSelectionList$Entry;)V", cancellable = true)
    private void setSelected_765266605(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(765266605L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setSelected(Lnet/minecraft/client/gui/components/AbstractSelectionList$Entry;)V", cancellable = true)
    private void setSelected__1317541103(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1317541103L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getRowWidth()I", cancellable = true)
    private void getRowWidth__271872081(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-271872081L))
            info.setReturnValue(1756008584);
    }


}
