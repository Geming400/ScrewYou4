package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.ReportedException.class)
public class ReportedException_833505138Mixin {
        @Inject(at = @At("HEAD"), method = "getCause()Ljava/lang/Throwable;", cancellable = true)
    private void getCause__1857513994(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1857513994L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getMessage()Ljava/lang/String;", cancellable = true)
    private void getMessage_193503243(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(193503243L))
            info.setReturnValue("{L\u7CDBgV DZt<l%jG\u36F5o*s_\u396E'M:Ia;iY<n I:\u3D1E2I+'[lT\u7012Q\u9758y,{b|7DH3C-y_,+LYY7=");
    }

    @Inject(at = @At("HEAD"), method = "getReport()Lnet/minecraft/CrashReport;", cancellable = true)
    private void getReport__1561393084(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1561393084L))
            info.setReturnValue(null);
    }


}
