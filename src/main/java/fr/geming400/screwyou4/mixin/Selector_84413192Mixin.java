package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.variant.PriorityProvider.Selector.class)
public class Selector_84413192Mixin {
        @Inject(at = @At("HEAD"), method = "priority()I", cancellable = true)
    private void priority_122675437(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(122675437L))
            info.setReturnValue(-1780120868);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1469925450(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1469925450L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1051046784(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1051046784L))
            info.setReturnValue("Zw\u5DA6r(W!rr,M|6<]kA\uFC13W4k>-W{d+Wv*(AqLU$N-R};t\u3F11M $\u5F11WrmmT\u1071XNX]yg$\uC069");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_122675933(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(122675933L))
            info.setReturnValue(-1958644357);
    }

    @Inject(at = @At("HEAD"), method = "condition()Ljava/util/Optional;", cancellable = true)
    private void condition_329874613(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(329874613L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec(Lcom/mojang/serialization/Codec;)Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void codec_568091166(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(568091166L))
            info.setReturnValue(null);
    }


}
