package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.CrashReport.class)
public class CrashReport2047539789Mixin {
        @Inject(at = @At("HEAD"), method = "getException()Ljava/lang/Throwable;", cancellable = true)
    private void getException__1523743707(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1523743707L))
            info.setReturnValue(new java.lang.Throwable());
    }

    @Inject(at = @At("HEAD"), method = "getSystemReport()Lnet/minecraft/SystemReport;", cancellable = true)
    private void getSystemReport__558787804(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-558787804L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSaveFile()Ljava/nio/file/Path;", cancellable = true)
    private void getSaveFile_913176107(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(913176107L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getExceptionMessage()Ljava/lang/String;", cancellable = true)
    private void getExceptionMessage_912079318(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(912079318L))
            info.setReturnValue("C\u22AAP^2R`Aw0\uB1B9Z<ud,)\"W] N_^s3@%7\u7289dj[vh\")9=7}sC'\u1D50@cl Y!\u8D75.{\uFDC1c$yK-\"\u99F0h-,f&Bl\u2618LT3&.I");
    }

    @Inject(at = @At("HEAD"), method = "getTitle()Ljava/lang/String;", cancellable = true)
    private void getTitle_912079318(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(912079318L))
            info.setReturnValue("C\u22AAP^2R`Aw0\uB1B9Z<ud,)\"W] N_^s3@%7\u7289dj[vh\")9=7}sC'\u1D50@cl Y!\u8D75.{\uFDC1c$yK-\"\u99F0h-,f&Bl\u2618LT3&.I");
    }

    @Inject(at = @At("HEAD"), method = "forThrowable(Ljava/lang/Throwable;Ljava/lang/String;)Lnet/minecraft/CrashReport;", cancellable = true)
    private static void forThrowable__558018057(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-558018057L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addCategory(Ljava/lang/String;)Lnet/minecraft/CrashReportCategory;", cancellable = true)
    private void addCategory__96587722(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-96587722L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addCategory(Ljava/lang/String;I)Lnet/minecraft/CrashReportCategory;", cancellable = true)
    private void addCategory__1155616613(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1155616613L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getFriendlyReport(Lnet/minecraft/ReportType;)Ljava/lang/String;", cancellable = true)
    private void getFriendlyReport__455295543(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-455295543L))
            info.setReturnValue("RJY(rvJM1G_BF0>f\uFECF\uFB9Bxz%=\uB3F11LO*ocatY;Cz:\uC1C8\"?21\u32421\u3663\u75B9?Jn/8<Dx\u2CF0zSf\uD6A0yz<0p/a9^m]Rn58egYpk= erNk\uA01B9^0ThyYI;%)!");
    }

    @Inject(at = @At("HEAD"), method = "getFriendlyReport(Lnet/minecraft/ReportType;Ljava/util/List;)Ljava/lang/String;", cancellable = true)
    private void getFriendlyReport_98633016(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(98633016L))
            info.setReturnValue("YtqL5_yCi8i-/k?O8-UoR\u7067uCky`0cZ_kWCXF$aEFg |4!\u1091msa!e\u2E0F<@Og?6N35T\uAC36Xv\u49F10+H\"yku\u611B&_X\u7A57qD\u746B\u1B31\u8C98");
    }

    @Inject(at = @At("HEAD"), method = "saveToFile(Ljava/nio/file/Path;Lnet/minecraft/ReportType;)Z", cancellable = true)
    private void saveToFile_598338640(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(598338640L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "saveToFile(Ljava/nio/file/Path;Lnet/minecraft/ReportType;Ljava/util/List;)Z", cancellable = true)
    private void saveToFile_1948638977(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1948638977L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getDetails()Ljava/lang/String;", cancellable = true)
    private void getDetails_912079318(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(912079318L))
            info.setReturnValue("C\u22AAP^2R`Aw0\uB1B9Z<ud,)\"W] N_^s3@%7\u7289dj[vh\")9=7}sC'\u1D50@cl Y!\u8D75.{\uFDC1c$yK-\"\u99F0h-,f&Bl\u2618LT3&.I");
    }

    @Inject(at = @At("HEAD"), method = "getDetails(Ljava/lang/StringBuilder;)V", cancellable = true)
    private void getDetails__1179645023(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1179645023L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "preload()V", cancellable = true)
    private static void preload_2085814776(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2085814776L))
            info.cancel();
    }


}
