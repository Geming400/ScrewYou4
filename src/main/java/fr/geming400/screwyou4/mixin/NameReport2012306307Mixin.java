package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.multiplayer.chat.report.NameReport.class)
public class NameReport2012306307Mixin {
        @Inject(at = @At("HEAD"), method = "copy()Lnet/minecraft/client/multiplayer/chat/report/Report;", cancellable = true)
    private void copy__2124695830(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2124695830L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "copy()Lnet/minecraft/client/multiplayer/chat/report/NameReport;", cancellable = true)
    private void copy__1770156065(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1770156065L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createScreen(Lnet/minecraft/client/gui/screens/Screen;Lnet/minecraft/client/multiplayer/chat/report/ReportingContext;)Lnet/minecraft/client/gui/screens/Screen;", cancellable = true)
    private void createScreen__1022995203(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1022995203L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getReportedName()Ljava/lang/String;", cancellable = true)
    private void getReportedName_876845836(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(876845836L))
            info.setReturnValue("!_7x5Z\uA689eJHdYzFcGqi!=*O]P&\u1F15\u00DD/T6eHU5?*4H-ClV8]Dq\u2336>,>\uD3CEjh\u9B18$5h$ix&%tdOAG\u1A73\uA22Bo]Mn\u0C2ARi^>Xdjm\u7281m0\u98B5w.");
    }


}
