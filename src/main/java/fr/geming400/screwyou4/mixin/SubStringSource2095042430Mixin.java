package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.chat.SubStringSource.class)
public class SubStringSource2095042430Mixin {
        @Inject(at = @At("HEAD"), method = "substring(IIZ)Ljava/util/List;", cancellable = true)
    private void substring__867250669(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-867250669L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/network/chat/FormattedText;Lit/unimi/dsi/fastutil/ints/Int2IntFunction;Ljava/util/function/UnaryOperator;)Lnet/minecraft/network/chat/SubStringSource;", cancellable = true)
    private static void create__699467142(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-699467142L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Lnet/minecraft/network/chat/FormattedText;)Lnet/minecraft/network/chat/SubStringSource;", cancellable = true)
    private static void create__1803473170(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1803473170L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPlainText()Ljava/lang/String;", cancellable = true)
    private void getPlainText__1913393240(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1913393240L))
            info.setReturnValue("\uC899iE5;J\u977DG7?LhsSqx^@y8f8RVlvo-|+Y>LV ;\uC0A8F:8lb7q\u974F:IN\u5E9343Xac8\u6C6B,U7_L*h?H1wi,j_\u4403@Z\"fY7Q 8<%sKge\u44C2?nOb&V");
    }


}
