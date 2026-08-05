package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.social.PlayerEntry.class)
public class PlayerEntry205639075Mixin {
        @Inject(at = @At("HEAD"), method = "children()Ljava/util/List;", cancellable = true)
    private void children_1831975891(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1831975891L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractContent(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIZF)V", cancellable = true)
    private void extractContent_1117314135(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1117314135L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "narratables()Ljava/util/List;", cancellable = true)
    private void narratables_1831975891(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1831975891L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isRemoved()Z", cancellable = true)
    private void isRemoved_243917658(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(243917658L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "setRemoved(Z)V", cancellable = true)
    private void setRemoved_1435255904(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1435255904L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getSkinGetter()Ljava/util/function/Supplier;", cancellable = true)
    private void getSkinGetter__263519516(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-263519516L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPlayerName()Ljava/lang/String;", cancellable = true)
    private void getPlayerName__929821396(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-929821396L))
            info.setReturnValue("h+fW0&BOy%[9]XT^N:))Bc\u5751j;=r>[6mhsji\u11C9\u4629?(5-H,\u204AN(@.\u627B%[aQA7hu!`T3\"$\u2490}\u09B8Pe");
    }

    @Inject(at = @At("HEAD"), method = "getPlayerId()Ljava/util/UUID;", cancellable = true)
    private void getPlayerId_616773558(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(616773558L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasRecentMessages()Z", cancellable = true)
    private void hasRecentMessages_243917658(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(243917658L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isChatReportable()Z", cancellable = true)
    private void isChatReportable_243917658(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(243917658L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "refreshHasDraftReport(Lnet/minecraft/client/multiplayer/chat/report/ReportingContext;)V", cancellable = true)
    private void refreshHasDraftReport__608350269(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-608350269L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setHasRecentMessages(Z)V", cancellable = true)
    private void setHasRecentMessages_1435255904(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1435255904L))
            info.cancel();
    }


}
