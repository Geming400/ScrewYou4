package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.multiplayer.chat.report.ReportReason.class)
public class ReportReason_1106061300Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/multiplayer/chat/report/ReportReason;", cancellable = true)
    private static void values_2111881847(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2111881847L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/multiplayer/chat/report/ReportReason;", cancellable = true)
    private static void valueOf__612706672(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-612706672L))
            info.setReturnValue(net.minecraft.client.multiplayer.chat.report.ReportReason.I_WANT_TO_REPORT_THEM);
    }

    @Inject(at = @At("HEAD"), method = "description()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void description_792129922(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(792129922L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "title()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void title__856433442(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-856433442L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "backendName()Ljava/lang/String;", cancellable = true)
    private void backendName__2045810309(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2045810309L))
            info.setReturnValue("'fMzgUd#%[3+;Dx6r;$\uB338aK\u0A8D;*<m\u8987u)LoIb1n'a>\u381FB8D?iE_ZkFM&W1/CMj\u692C2|%Z}-#YeB;Z\u7E7BeWX<stY");
    }

    @Inject(at = @At("HEAD"), method = "getIncompatibleCategories(Lnet/minecraft/client/multiplayer/chat/report/ReportType;)Ljava/util/List;", cancellable = true)
    private static void getIncompatibleCategories_998726768(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(998726768L))
            info.setReturnValue(null);
    }


}
