package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.multiplayer.chat.report.ReportingContext.class)
public class ReportingContext1852352597Mixin {
        @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/client/multiplayer/chat/report/ReportEnvironment;)Z", cancellable = true)
    private void matches_1170221554(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1170221554L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/client/multiplayer/chat/report/ReportEnvironment;Lcom/mojang/authlib/minecraft/UserApiService;)Lnet/minecraft/client/multiplayer/chat/report/ReportingContext;", cancellable = true)
    private static void create_2012459448(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2012459448L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sender()Lnet/minecraft/client/multiplayer/chat/report/AbuseReportSender;", cancellable = true)
    private void sender__1923255918(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1923255918L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "draftReportHandled(Lnet/minecraft/client/Minecraft;Lnet/minecraft/client/gui/screens/Screen;Ljava/lang/Runnable;Z)V", cancellable = true)
    private void draftReportHandled__1629470048(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1629470048L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hasDraftReport()Z", cancellable = true)
    private void hasDraftReport_217414577(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(217414577L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "chatLog()Lnet/minecraft/client/multiplayer/chat/ChatLog;", cancellable = true)
    private void chatLog_652032563(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(652032563L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasDraftReportFor(Ljava/util/UUID;)Z", cancellable = true)
    private void hasDraftReportFor__261896942(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-261896942L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "setReportDraft(Lnet/minecraft/client/multiplayer/chat/report/Report;)V", cancellable = true)
    private void setReportDraft__332672563(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-332672563L))
            info.cancel();
    }


}
