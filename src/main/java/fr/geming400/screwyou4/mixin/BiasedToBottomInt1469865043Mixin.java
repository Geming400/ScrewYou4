package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.valueproviders.BiasedToBottomInt.class)
public class BiasedToBottomInt1469865043Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1439589994(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1439589994L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_334404572(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(334404572L))
            info.setReturnValue("藾K`KᥪNP:&b;⎶v$ OM辿4.ꭆᒧN=\"畟持;a≭괊Z#뜇y(l'jTY5)o!Sz=MPj|lepH75-w}!割i봘xL⇲");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1508127785(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1508127785L))
            info.setReturnValue(1373009874);
    }

    @Inject(at = @At("HEAD"), method = "of(II)Lnet/minecraft/util/valueproviders/BiasedToBottomInt;", cancellable = true)
    private static void of__420637181(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-420637181L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "maxInclusive()I", cancellable = true)
    private void maxInclusive_1508127289(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1508127289L))
            info.setReturnValue(1576157293);
    }

    @Inject(at = @At("HEAD"), method = "minInclusive()I", cancellable = true)
    private void minInclusive_1508127289(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1508127289L))
            info.setReturnValue(1576157293);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1089248529(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1089248529L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sample(Lnet/minecraft/util/RandomSource;)I", cancellable = true)
    private void sample__237162535(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-237162535L))
            info.setReturnValue(2107513554);
    }


}
