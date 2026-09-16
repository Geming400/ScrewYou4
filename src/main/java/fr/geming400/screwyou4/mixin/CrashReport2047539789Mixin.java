package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.CrashReport.class)
public class CrashReport2047539789Mixin {
        @Inject(at = @At("HEAD"), method = "getException()Ljava/lang/Throwable;", cancellable = true)
    private void getException__720498516(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-720498516L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addCategory(Ljava/lang/String;)Lnet/minecraft/CrashReportCategory;", cancellable = true)
    private void addCategory_1435961431(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1435961431L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addCategory(Ljava/lang/String;I)Lnet/minecraft/CrashReportCategory;", cancellable = true)
    private void addCategory__891233126(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-891233126L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "forThrowable(Ljava/lang/Throwable;Ljava/lang/String;)Lnet/minecraft/CrashReport;", cancellable = true)
    private static void forThrowable__9018578(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-9018578L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSaveFile()Ljava/nio/file/Path;", cancellable = true)
    private void getSaveFile__1257841862(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1257841862L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getExceptionMessage()Ljava/lang/String;", cancellable = true)
    private void getExceptionMessage__158348412(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-158348412L))
            info.setReturnValue("sGb%{-JXi#?H0,!Vai})'\u3AE1U*wR7t\uFB272!S\u85F807Es/x\u9831w4\uD59B05\uB63D r\u25C4*yTN}o\uB09AZ\u401DU<rd;;t");
    }

    @Inject(at = @At("HEAD"), method = "getSystemReport()Lnet/minecraft/SystemReport;", cancellable = true)
    private void getSystemReport__1930947107(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1930947107L))
            info.setReturnValue(new net.minecraft.SystemReport());
    }

    @Inject(at = @At("HEAD"), method = "getTitle()Ljava/lang/String;", cancellable = true)
    private void getTitle__202638088(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-202638088L))
            info.setReturnValue("h}Ze*>S(h)Pv:bQaOB]\u59C9U5]X\u96FE'u!A\uB614o3(");
    }

    @Inject(at = @At("HEAD"), method = "saveToFile(Ljava/nio/file/Path;Lnet/minecraft/ReportType;)Z", cancellable = true)
    private void saveToFile_66486620(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(66486620L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "saveToFile(Ljava/nio/file/Path;Lnet/minecraft/ReportType;Ljava/util/List;)Z", cancellable = true)
    private void saveToFile__492905459(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-492905459L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "preload()V", cancellable = true)
    private static void preload__700518001(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-700518001L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getFriendlyReport(Lnet/minecraft/ReportType;)Ljava/lang/String;", cancellable = true)
    private void getFriendlyReport_593308286(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(593308286L))
            info.setReturnValue("0CBuHrmRYj\u011F+");
    }

    @Inject(at = @At("HEAD"), method = "getFriendlyReport(Lnet/minecraft/ReportType;Ljava/util/List;)Ljava/lang/String;", cancellable = true)
    private void getFriendlyReport__165451795(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-165451795L))
            info.setReturnValue("QqRjLj=K,c}<");
    }

    @Inject(at = @At("HEAD"), method = "getDetails(Ljava/lang/StringBuilder;)V", cancellable = true)
    private void getDetails_2092637357(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2092637357L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getDetails()Ljava/lang/String;", cancellable = true)
    private void getDetails_341841634(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(341841634L))
            info.setReturnValue("mT'");
    }


}
