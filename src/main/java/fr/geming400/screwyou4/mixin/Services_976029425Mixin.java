package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.multiplayer.chat.report.AbuseReportSender.Services.class)
public class Services_976029425Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1933425613(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1933425613L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__159430551(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-159430551L))
            info.setReturnValue("k^{H/}\u7524vne\u506E#26']\uBF97\u3284>ZMP)\"n\u10694\u1F61<.NH-T\uA874{q7hh:JgDt}!YlW\u965C\u1E02\u2E53yR)x\u2932Li\uC81E}#\uB41CVLdt!U$\uD2963\u532C>'QB\u44D8iM\u4A70");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1014292166(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1014292166L))
            info.setReturnValue(1659753685);
    }

    @Inject(at = @At("HEAD"), method = "isEnabled()Z", cancellable = true)
    private void isEnabled_1014308007(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1014308007L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "environment()Lnet/minecraft/client/multiplayer/chat/report/ReportEnvironment;", cancellable = true)
    private void environment_162139048(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(162139048L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "send(Ljava/util/UUID;Lnet/minecraft/client/multiplayer/chat/report/ReportType;Lcom/mojang/authlib/minecraft/report/AbuseReport;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void send_1769166148(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1769166148L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }

    @Inject(at = @At("HEAD"), method = "userApiService()Lcom/mojang/authlib/minecraft/UserApiService;", cancellable = true)
    private void userApiService_2049629771(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2049629771L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "reportLimits()Lcom/mojang/authlib/minecraft/report/AbuseReportLimits;", cancellable = true)
    private void reportLimits__901006054(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-901006054L))
            info.setReturnValue(null);
    }


}
