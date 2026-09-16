package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.CrashReportCategory.class)
public class CrashReportCategory2020815595Mixin {
        @Inject(at = @At("HEAD"), method = "fillInStackTrace(I)I", cancellable = true)
    private void fillInStackTrace_1993634127(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1993634127L))
            info.setReturnValue(1369329764);
    }

    @Inject(at = @At("HEAD"), method = "formatLocation(Lnet/minecraft/world/level/LevelHeightAccessor;DDD)Ljava/lang/String;", cancellable = true)
    private static void formatLocation__1682278203(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1682278203L))
            info.setReturnValue(",sjn'w%|M\"8U7\u3E3B1dQ?:\u6E3CRMg|Y\uAF02\u4E8FRt1Y");
    }

    @Inject(at = @At("HEAD"), method = "formatLocation(Lnet/minecraft/world/level/LevelHeightAccessor;III)Ljava/lang/String;", cancellable = true)
    private static void formatLocation__1688803712(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1688803712L))
            info.setReturnValue("\uD1E0Fh[\u06EBAD\u9F56fT%?xG]Zc`?EyKt8R0\uCE92GF3zJ:");
    }

    @Inject(at = @At("HEAD"), method = "formatLocation(Lnet/minecraft/world/level/LevelHeightAccessor;Lnet/minecraft/core/BlockPos;)Ljava/lang/String;", cancellable = true)
    private static void formatLocation_839935269(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(839935269L))
            info.setReturnValue("#Q]$!Yp|\u34A3 6^\u7F3C MG J(R)'@w,&/l\uCBF4I5m(\u717D\u1987bg2\u48C3YH{I+q/\"IlQI[!@B\"");
    }

    @Inject(at = @At("HEAD"), method = "populateBlockDetails(Lnet/minecraft/CrashReportCategory;Lnet/minecraft/world/level/LevelHeightAccessor;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)V", cancellable = true)
    private static void populateBlockDetails_945705(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(945705L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setDetail(Ljava/lang/String;Ljava/lang/Object;)Lnet/minecraft/CrashReportCategory;", cancellable = true)
    private void setDetail__1667399747(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1667399747L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setDetail(Ljava/lang/String;Lnet/minecraft/CrashReportDetail;)Lnet/minecraft/CrashReportCategory;", cancellable = true)
    private void setDetail_771901202(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(771901202L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "validateStackTrace(Ljava/lang/StackTraceElement;Ljava/lang/StackTraceElement;)Z", cancellable = true)
    private void validateStackTrace__811873169(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-811873169L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getStacktrace()[Ljava/lang/StackTraceElement;", cancellable = true)
    private void getStacktrace__264210594(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-264210594L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "populateBlockLocationDetails(Lnet/minecraft/CrashReportCategory;Lnet/minecraft/world/level/LevelHeightAccessor;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/CrashReportCategory;", cancellable = true)
    private static void populateBlockLocationDetails_178215921(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(178215921L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setDetailError(Ljava/lang/String;Ljava/lang/Throwable;)V", cancellable = true)
    private void setDetailError_1847059508(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1847059508L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getDetails(Ljava/lang/StringBuilder;)V", cancellable = true)
    private void getDetails_2065913163(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2065913163L))
            info.cancel();
    }


}
