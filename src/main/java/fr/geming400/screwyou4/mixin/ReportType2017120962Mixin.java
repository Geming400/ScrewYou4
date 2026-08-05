package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.multiplayer.chat.report.ReportType.class)
public class ReportType2017120962Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/multiplayer/chat/report/ReportType;", cancellable = true)
    private static void values__1332117330(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1332117330L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/multiplayer/chat/report/ReportType;", cancellable = true)
    private static void valueOf_777039057(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(777039057L))
            info.setReturnValue(net.minecraft.client.multiplayer.chat.report.ReportType.CHAT);
    }

    @Inject(at = @At("HEAD"), method = "backendName()Ljava/lang/String;", cancellable = true)
    private void backendName_881660491(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(881660491L))
            info.setReturnValue("Vud缺$zdC=E쓿zp,Ejm1^i묗");
    }


}
