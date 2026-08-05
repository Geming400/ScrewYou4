package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.ReportedException.class)
public class ReportedException_833505138Mixin {
        @Inject(at = @At("HEAD"), method = "getCause()Ljava/lang/Throwable;", cancellable = true)
    private void getCause_1557188937(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1557188937L))
            info.setReturnValue(new java.lang.Throwable());
    }

    @Inject(at = @At("HEAD"), method = "getMessage()Ljava/lang/String;", cancellable = true)
    private void getMessage__301955334(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-301955334L))
            info.setReturnValue("jJ$\u8DB0S[\uC9B9V,bk9");
    }

    @Inject(at = @At("HEAD"), method = "getReport()Lnet/minecraft/CrashReport;", cancellable = true)
    private void getReport__958986834(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-958986834L))
            info.setReturnValue(null);
    }


}
