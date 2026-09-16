package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.multiplayer.chat.report.AbuseReportSender.Services.class)
public class Services_976029425Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_67403156(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(67403156L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1746452949(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1746452949L))
            info.setReturnValue("\u16A1R[t/3|C\u102AESj:");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1533381515(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1533381515L))
            info.setReturnValue(-2046100276);
    }

    @Inject(at = @At("HEAD"), method = "isEnabled()Z", cancellable = true)
    private void isEnabled__1058118576(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1058118576L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "environment()Lnet/minecraft/client/multiplayer/chat/report/ReportEnvironment;", cancellable = true)
    private void environment__81796037(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-81796037L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "send(Ljava/util/UUID;Lnet/minecraft/client/multiplayer/chat/report/ReportType;Lcom/mojang/authlib/minecraft/report/AbuseReport;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void send__1606893876(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1606893876L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }

    @Inject(at = @At("HEAD"), method = "userApiService()Lcom/mojang/authlib/minecraft/UserApiService;", cancellable = true)
    private void userApiService__1589430875(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1589430875L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "reportLimits()Lcom/mojang/authlib/minecraft/report/AbuseReportLimits;", cancellable = true)
    private void reportLimits_1655968558(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1655968558L))
            info.setReturnValue(null);
    }


}
