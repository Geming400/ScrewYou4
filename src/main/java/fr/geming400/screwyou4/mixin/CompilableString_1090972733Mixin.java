package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.CompilableString.class)
public class CompilableString_1090972733Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_182345968(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(182345968L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1861395761(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1861395761L))
            info.setReturnValue("%_\u7102&aQ`k<\u4E86^$\u54C0>B[-0(e,`TmmhOOQI}+ RxybEf+[g=Mo..C^");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1648324327(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1648324327L))
            info.setReturnValue(-1968911475);
    }

    @Inject(at = @At("HEAD"), method = "source()Ljava/lang/String;", cancellable = true)
    private void source_1969667488(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1969667488L))
            info.setReturnValue(",)hECuiA:\u6F83TQir82x4E6\u33B2(d+&jP2?`[8X[ANw[[4&\uB9EC1wV$(\u3E1C}D<t\uF945|eT s\u2EDDg]t");
    }

    @Inject(at = @At("HEAD"), method = "compiled()Ljava/lang/Object;", cancellable = true)
    private void compiled_1731898280(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1731898280L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "codec(Ljava/util/function/Function;)Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void codec__666165220(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-666165220L))
            info.setReturnValue(null);
    }


}
