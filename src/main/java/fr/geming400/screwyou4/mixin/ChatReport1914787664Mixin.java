package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.multiplayer.chat.report.ChatReport.class)
public class ChatReport1914787664Mixin {
        @Inject(at = @At("HEAD"), method = "copy()Lnet/minecraft/client/multiplayer/chat/report/Report;", cancellable = true)
    private void copy_507999458(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(507999458L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "copy()Lnet/minecraft/client/multiplayer/chat/report/ChatReport;", cancellable = true)
    private void copy_1508228650(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1508228650L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createScreen(Lnet/minecraft/client/gui/screens/Screen;Lnet/minecraft/client/multiplayer/chat/report/ReportingContext;)Lnet/minecraft/client/gui/screens/Screen;", cancellable = true)
    private void createScreen__406104766(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-406104766L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toggleReported(ILcom/mojang/authlib/minecraft/report/AbuseReportLimits;)V", cancellable = true)
    private void toggleReported__184800896(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-184800896L))
            info.cancel();
    }


}
