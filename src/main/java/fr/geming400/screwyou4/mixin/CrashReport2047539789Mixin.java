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

    @Inject(at = @At("HEAD"), method = "getDetails(Ljava/lang/StringBuilder;)V", cancellable = true)
    private void getDetails__1179645023(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1179645023L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getDetails()Ljava/lang/String;", cancellable = true)
    private void getDetails_912079318(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(912079318L))
            info.setReturnValue("C⊪P^2R`Aw0놹Z<ud,)\"W] N_^s3@%7犉dj[vh\")9=7}sC'ᵐ@cl Y!赵.{ﷁc$yK-\"駰h-,f&Bl☘LT3&.I");
    }

    @Inject(at = @At("HEAD"), method = "preload()V", cancellable = true)
    private static void preload_2085814776(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2085814776L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "saveToFile(Ljava/nio/file/Path;Lnet/minecraft/ReportType;Ljava/util/List;)Z", cancellable = true)
    private void saveToFile_1948638977(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1948638977L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "saveToFile(Ljava/nio/file/Path;Lnet/minecraft/ReportType;)Z", cancellable = true)
    private void saveToFile_598338640(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(598338640L))
            info.setReturnValue(true);
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

    @Inject(at = @At("HEAD"), method = "forThrowable(Ljava/lang/Throwable;Ljava/lang/String;)Lnet/minecraft/CrashReport;", cancellable = true)
    private static void forThrowable__558018057(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-558018057L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTitle()Ljava/lang/String;", cancellable = true)
    private void getTitle_912079318(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(912079318L))
            info.setReturnValue("C⊪P^2R`Aw0놹Z<ud,)\"W] N_^s3@%7犉dj[vh\")9=7}sC'ᵐ@cl Y!赵.{ﷁc$yK-\"駰h-,f&Bl☘LT3&.I");
    }

    @Inject(at = @At("HEAD"), method = "getFriendlyReport(Lnet/minecraft/ReportType;Ljava/util/List;)Ljava/lang/String;", cancellable = true)
    private void getFriendlyReport_98633016(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(98633016L))
            info.setReturnValue("YtqL5_yCi8i-/k?O8-UoR灧uCky`0cZ_kWCXF$aEFg |4!႑msa!e⸏<@Og?6N35T갶Xv䧱0+H\"yku愛&_X穗qD瑫ᬱ貘");
    }

    @Inject(at = @At("HEAD"), method = "getFriendlyReport(Lnet/minecraft/ReportType;)Ljava/lang/String;", cancellable = true)
    private void getFriendlyReport__455295543(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-455295543L))
            info.setReturnValue("RJY(rvJM1G_BF0>fﻏﮛxz%=돱1LO*ocatY;Cz:쇈\"?21㉂1㙣疹?Jn/8<Dx⳰zSf횠yz<0p/a9^m]Rn58egYpk= erNkꀛ9^0ThyYI;%)!");
    }

    @Inject(at = @At("HEAD"), method = "getSaveFile()Ljava/nio/file/Path;", cancellable = true)
    private void getSaveFile_913176107(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(913176107L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getExceptionMessage()Ljava/lang/String;", cancellable = true)
    private void getExceptionMessage_912079318(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(912079318L))
            info.setReturnValue("C⊪P^2R`Aw0놹Z<ud,)\"W] N_^s3@%7犉dj[vh\")9=7}sC'ᵐ@cl Y!赵.{ﷁc$yK-\"駰h-,f&Bl☘LT3&.I");
    }

    @Inject(at = @At("HEAD"), method = "getSystemReport()Lnet/minecraft/SystemReport;", cancellable = true)
    private void getSystemReport__558787804(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-558787804L))
            info.setReturnValue(null);
    }


}
