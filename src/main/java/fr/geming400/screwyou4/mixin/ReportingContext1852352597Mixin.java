package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.multiplayer.chat.report.ReportingContext.class)
public class ReportingContext1852352597Mixin {
        @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/client/multiplayer/chat/report/ReportEnvironment;)Z", cancellable = true)
    private void matches_2092290885(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2092290885L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/client/multiplayer/chat/report/ReportEnvironment;Lcom/mojang/authlib/minecraft/UserApiService;)Lnet/minecraft/client/multiplayer/chat/report/ReportingContext;", cancellable = true)
    private static void create_375797948(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(375797948L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sender()Lnet/minecraft/client/multiplayer/chat/report/AbuseReportSender;", cancellable = true)
    private void sender__2065194531(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2065194531L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "chatLog()Lnet/minecraft/client/multiplayer/chat/ChatLog;", cancellable = true)
    private void chatLog__998576513(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-998576513L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setReportDraft(Lnet/minecraft/client/multiplayer/chat/report/Report;)V", cancellable = true)
    private void setReportDraft__1806649726(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1806649726L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hasDraftReportFor(Ljava/util/UUID;)Z", cancellable = true)
    private void hasDraftReportFor_1494800352(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1494800352L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "draftReportHandled(Lnet/minecraft/client/Minecraft;Lnet/minecraft/client/gui/screens/Screen;Ljava/lang/Runnable;Z)V", cancellable = true)
    private void draftReportHandled__372440249(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-372440249L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hasDraftReport()Z", cancellable = true)
    private void hasDraftReport_1890631180(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1890631180L))
            info.setReturnValue(true);
    }


}
