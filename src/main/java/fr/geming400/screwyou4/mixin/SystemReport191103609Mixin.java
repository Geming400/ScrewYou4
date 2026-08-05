package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.SystemReport.class)
public class SystemReport191103609Mixin {
        @Inject(at = @At("HEAD"), method = "setDetail(Ljava/lang/String;Lnet/minecraft/CrashReportDetail;)V", cancellable = true)
    private void setDetail__1922557791(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1922557791L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setDetail(Ljava/lang/String;Ljava/lang/String;)V", cancellable = true)
    private void setDetail_1123291840(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1123291840L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "toLineSeparatedString()Ljava/lang/String;", cancellable = true)
    private void toLineSeparatedString__944356862(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-944356862L))
            info.setReturnValue("oj\uB0651|2 !-.\u49E1=W005aq,06N1//Z[Dr\u6386\u8A48b\u65DC\u100F,%e*dUEI\u293BY\"c\u0DAB*D'L'Fd$;C/v*Uh\uB394.pC\u6C17U[M4\uBED0`ek");
    }

    @Inject(at = @At("HEAD"), method = "sizeInMiB(J)F", cancellable = true)
    private static void sizeInMiB_1405928974(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1405928974L))
            info.setReturnValue(3.563665E8F);
    }

    @Inject(at = @At("HEAD"), method = "appendToCrashReportString(Ljava/lang/StringBuilder;)V", cancellable = true)
    private void appendToCrashReportString_1258886093(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1258886093L))
            info.cancel();
    }


}
