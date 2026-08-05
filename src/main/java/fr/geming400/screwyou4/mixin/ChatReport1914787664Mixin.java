package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.multiplayer.chat.report.ChatReport.class)
public class ChatReport1914787664Mixin {
        @Inject(at = @At("HEAD"), method = "copy()Lnet/minecraft/client/multiplayer/chat/report/Report;", cancellable = true)
    private void copy_2072752823(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2072752823L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "copy()Lnet/minecraft/client/multiplayer/chat/report/ChatReport;", cancellable = true)
    private void copy__595785345(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-595785345L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createScreen(Lnet/minecraft/client/gui/screens/Screen;Lnet/minecraft/client/multiplayer/chat/report/ReportingContext;)Lnet/minecraft/client/gui/screens/Screen;", cancellable = true)
    private void createScreen__1120513846(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1120513846L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toggleReported(ILcom/mojang/authlib/minecraft/report/AbuseReportLimits;)V", cancellable = true)
    private void toggleReported_876848231(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(876848231L))
            info.cancel();
    }


}
