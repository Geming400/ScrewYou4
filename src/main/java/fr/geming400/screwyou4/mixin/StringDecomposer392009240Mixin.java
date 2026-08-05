package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.StringDecomposer.class)
public class StringDecomposer392009240Mixin {
        @Inject(at = @At("HEAD"), method = "iterate(Ljava/lang/String;Lnet/minecraft/network/chat/Style;Lnet/minecraft/util/FormattedCharSink;)Z", cancellable = true)
    private static void iterate__164725676(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-164725676L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getPlainText(Lnet/minecraft/network/chat/FormattedText;)Ljava/lang/String;", cancellable = true)
    private static void getPlainText_1909904657(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1909904657L))
            info.setReturnValue("\u15C2\u2900\u692B8O\uA6E1(QnX4\"';3|)r\uD647A");
    }

    @Inject(at = @At("HEAD"), method = "iterateBackwards(Ljava/lang/String;Lnet/minecraft/network/chat/Style;Lnet/minecraft/util/FormattedCharSink;)Z", cancellable = true)
    private static void iterateBackwards__164725676(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-164725676L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "iterateFormatted(Lnet/minecraft/network/chat/FormattedText;Lnet/minecraft/network/chat/Style;Lnet/minecraft/util/FormattedCharSink;)Z", cancellable = true)
    private static void iterateFormatted_576058578(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(576058578L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "iterateFormatted(Ljava/lang/String;Lnet/minecraft/network/chat/Style;Lnet/minecraft/util/FormattedCharSink;)Z", cancellable = true)
    private static void iterateFormatted__164725676(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-164725676L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "iterateFormatted(Ljava/lang/String;ILnet/minecraft/network/chat/Style;Lnet/minecraft/util/FormattedCharSink;)Z", cancellable = true)
    private static void iterateFormatted__670004999(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-670004999L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "iterateFormatted(Ljava/lang/String;ILnet/minecraft/network/chat/Style;Lnet/minecraft/network/chat/Style;Lnet/minecraft/util/FormattedCharSink;)Z", cancellable = true)
    private static void iterateFormatted_2029597977(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2029597977L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "filterBrokenSurrogates(Ljava/lang/String;)Ljava/lang/String;", cancellable = true)
    private static void filterBrokenSurrogates_1604751311(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1604751311L))
            info.setReturnValue("Qg\u706Cl_Ua");
    }


}
