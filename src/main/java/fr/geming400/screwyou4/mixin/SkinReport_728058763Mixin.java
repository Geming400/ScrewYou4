package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.multiplayer.chat.report.SkinReport.class)
public class SkinReport_728058763Mixin {
        @Inject(at = @At("HEAD"), method = "copy()Lnet/minecraft/client/multiplayer/chat/report/Report;", cancellable = true)
    private void copy__678729444(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-678729444L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "copy()Lnet/minecraft/client/multiplayer/chat/report/SkinReport;", cancellable = true)
    private void copy__2360865(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2360865L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSkinGetter()Ljava/util/function/Supplier;", cancellable = true)
    private void getSkinGetter_274658221(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(274658221L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createScreen(Lnet/minecraft/client/gui/screens/Screen;Lnet/minecraft/client/multiplayer/chat/report/ReportingContext;)Lnet/minecraft/client/gui/screens/Screen;", cancellable = true)
    private void createScreen__1592833668(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1592833668L))
            info.setReturnValue(null);
    }


}
