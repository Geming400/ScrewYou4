package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.KeyDispatchDataCodec.class)
public class KeyDispatchDataCodec_712683543Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__195942726(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-195942726L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1483107067(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1483107067L))
            info.setReturnValue("{Y^c7u{FT|e_o6%t\"\uA39F@Q(A:oc}8O3}=:%'B\u68DCC0%t=Z");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1270035633(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1270035633L))
            info.setReturnValue(92288422);
    }

    @Inject(at = @At("HEAD"), method = "of(Lcom/mojang/serialization/MapCodec;)Lnet/minecraft/util/KeyDispatchDataCodec;", cancellable = true)
    private static void of_1184260652(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1184260652L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_1779128796(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1779128796L))
            info.setReturnValue(null);
    }


}
