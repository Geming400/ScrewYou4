package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.StringDecomposer.class)
public class StringDecomposer392009240Mixin {
        @Inject(at = @At("HEAD"), method = "iterate(Ljava/lang/String;Lnet/minecraft/network/chat/Style;Lnet/minecraft/util/FormattedCharSink;)Z", cancellable = true)
    private static void iterate__1484671846(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1484671846L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "iterateBackwards(Ljava/lang/String;Lnet/minecraft/network/chat/Style;Lnet/minecraft/util/FormattedCharSink;)Z", cancellable = true)
    private static void iterateBackwards_2023147518(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2023147518L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getPlainText(Lnet/minecraft/network/chat/FormattedText;)Ljava/lang/String;", cancellable = true)
    private static void getPlainText__1268294542(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1268294542L))
            info.setReturnValue("\u8FB2O*u\u60DFz;\u4CD12CcL:\u1315 /zSXJkg9GL\u2231$a UVnTEf2\uCA84Ks>d\u8522P7hs$[\u61E1g+?6\u300F? ^$*i|`\u4BADNCs'\u7E9E@]*A3\u6891\u01E0l0\u941A_\uAC97wo{K\u4216E\u3557L\u1BDA\u2570(>@");
    }

    @Inject(at = @At("HEAD"), method = "filterBrokenSurrogates(Ljava/lang/String;)Ljava/lang/String;", cancellable = true)
    private static void filterBrokenSurrogates_798693815(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(798693815L))
            info.setReturnValue("RgB60\u02A5.> \u230AY\";yS9SUnMLz\uB30E\u0DC2CBf\u3DCC-(7TD?mp/mpv!D62l+#\"aa,.!k@\u7992Uj({r`ok{\u9632:6L78\"aQGe\u4E04:^\uAFA7\u9217\u8FAC\uB453WsiVQPU\u5B2Do");
    }

    @Inject(at = @At("HEAD"), method = "iterateFormatted(Lnet/minecraft/network/chat/FormattedText;Lnet/minecraft/network/chat/Style;Lnet/minecraft/util/FormattedCharSink;)Z", cancellable = true)
    private static void iterateFormatted__301208272(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-301208272L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "iterateFormatted(Ljava/lang/String;Lnet/minecraft/network/chat/Style;Lnet/minecraft/util/FormattedCharSink;)Z", cancellable = true)
    private static void iterateFormatted_1067331250(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1067331250L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "iterateFormatted(Ljava/lang/String;ILnet/minecraft/network/chat/Style;Lnet/minecraft/util/FormattedCharSink;)Z", cancellable = true)
    private static void iterateFormatted__1130945957(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1130945957L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "iterateFormatted(Ljava/lang/String;ILnet/minecraft/network/chat/Style;Lnet/minecraft/network/chat/Style;Lnet/minecraft/util/FormattedCharSink;)Z", cancellable = true)
    private static void iterateFormatted__1517095429(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1517095429L))
            info.setReturnValue(true);
    }


}
