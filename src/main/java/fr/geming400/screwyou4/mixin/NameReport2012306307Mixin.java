package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.multiplayer.chat.report.NameReport.class)
public class NameReport2012306307Mixin {
        @Inject(at = @At("HEAD"), method = "copy()Lnet/minecraft/client/multiplayer/chat/report/Report;", cancellable = true)
    private void copy_605518101(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(605518101L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "copy()Lnet/minecraft/client/multiplayer/chat/report/NameReport;", cancellable = true)
    private void copy_333857930(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(333857930L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createScreen(Lnet/minecraft/client/gui/screens/Screen;Lnet/minecraft/client/multiplayer/chat/report/ReportingContext;)Lnet/minecraft/client/gui/screens/Screen;", cancellable = true)
    private void createScreen__308586123(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-308586123L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getReportedName()Ljava/lang/String;", cancellable = true)
    private void getReportedName_406900864(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(406900864L))
            info.setReturnValue("");
    }


}
