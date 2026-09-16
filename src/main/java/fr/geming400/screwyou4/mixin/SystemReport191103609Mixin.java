package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.SystemReport.class)
public class SystemReport191103609Mixin {
        @Inject(at = @At("HEAD"), method = "setDetail(Ljava/lang/String;Lnet/minecraft/CrashReportDetail;)V", cancellable = true)
    private void setDetail_1527018228(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1527018228L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setDetail(Ljava/lang/String;Ljava/lang/String;)V", cancellable = true)
    private void setDetail_1188478157(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1188478157L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "toLineSeparatedString()Ljava/lang/String;", cancellable = true)
    private void toLineSeparatedString_1076779461(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1076779461L))
            info.setReturnValue("H]Sjo\u1C9BQB3\uA015xc{{W6TTUJiwX<5q]3\u6777) h}o CmwYW\u6B3C:dl4TW\u6C04k|:Ax5");
    }

    @Inject(at = @At("HEAD"), method = "appendToCrashReportString(Ljava/lang/StringBuilder;)V", cancellable = true)
    private void appendToCrashReportString__1613848956(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1613848956L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "sizeInMiB(J)F", cancellable = true)
    private static void sizeInMiB_1290678606(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1290678606L))
            info.setReturnValue(5.701713E8F);
    }


}
