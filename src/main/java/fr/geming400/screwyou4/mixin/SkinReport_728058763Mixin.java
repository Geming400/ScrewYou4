package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.multiplayer.chat.report.SkinReport.class)
public class SkinReport_728058763Mixin {
        @Inject(at = @At("HEAD"), method = "copy()Lnet/minecraft/client/multiplayer/chat/report/Report;", cancellable = true)
    private void copy_886023921(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(886023921L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "copy()Lnet/minecraft/client/multiplayer/chat/report/SkinReport;", cancellable = true)
    private void copy__2106374860(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2106374860L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSkinGetter()Ljava/util/function/Supplier;", cancellable = true)
    private void getSkinGetter_258900171(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(258900171L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createScreen(Lnet/minecraft/client/gui/screens/Screen;Lnet/minecraft/client/multiplayer/chat/report/ReportingContext;)Lnet/minecraft/client/gui/screens/Screen;", cancellable = true)
    private void createScreen_1987724548(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1987724548L))
            info.setReturnValue(null);
    }


}
