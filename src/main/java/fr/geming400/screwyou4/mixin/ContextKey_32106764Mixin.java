package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.context.ContextKey.class)
public class ContextKey_32106764Mixin {
        @Inject(at = @At("HEAD"), method = "name()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void name__1326153763(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1326153763L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_802529792(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(802529792L))
            info.setReturnValue("2p\u7B17B\u325DHT'\u575Ew[6h_(aZ2\uBF1A\u152E<,BH\u6486^m6%\u60FA/u\uAC21b_W$e\"!>jn5Fp>\uD207m`IG=oPBm3a8em'nw\u2F0F[poP,Ewt^IE)6w\u5D02iHDY%vli");
    }

    @Inject(at = @At("HEAD"), method = "vanilla(Ljava/lang/String;)Lnet/minecraft/util/context/ContextKey;", cancellable = true)
    private static void vanilla__1524994259(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1524994259L))
            info.setReturnValue(null);
    }


}
