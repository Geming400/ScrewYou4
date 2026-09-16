package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.ReportType.class)
public class ReportType_1746081132Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_837454863(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(837454863L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1778462640(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1778462640L))
            info.setReturnValue("%G)(\uB409&<\u6ADFE3%\u4E59ONx`<Db");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1991534074(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1991534074L))
            info.setReturnValue(1713392884);
    }

    @Inject(at = @At("HEAD"), method = "header()Ljava/lang/String;", cancellable = true)
    private void header_1664491457(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1664491457L))
            info.setReturnValue("8[{5m\uD26CO,vE");
    }

    @Inject(at = @At("HEAD"), method = "getErrorComment()Ljava/lang/String;", cancellable = true)
    private void getErrorComment__2066771231(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2066771231L))
            info.setReturnValue("%6}b:VhL$`}XGr'v\u9484>Y\u470D1]Hu\u9C4A2cm6BM\u837CL.RKJ\u62F2z)g&&\uD494v'(0_Qp\u7008\u05C4wod#/5`P#EcJP]}*55\u2468u2S.\u708Bo\uA083U\u7E83.fH3HF@trm!?");
    }

    @Inject(at = @At("HEAD"), method = "appendHeader(Ljava/lang/StringBuilder;Ljava/util/List;)V", cancellable = true)
    private void appendHeader__1794290313(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1794290313L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "nuggets()Ljava/util/List;", cancellable = true)
    private void nuggets__1189414280(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1189414280L))
            info.setReturnValue(null);
    }


}
