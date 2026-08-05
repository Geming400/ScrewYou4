package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.OptionInstance.IntRange.class)
public class IntRange1975635250Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__933819787(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-933819787L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_840175275(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(840175275L))
            info.setReturnValue("\u7A41_\u0130\u7DEFzjo}{\uA283;b93eONdP`9Z\u3725=><\u9D954\u5927Fm}Su2O\u5C44`V2eb5\u22CA)\"\u6FA7\u3D57\uB083UsWe Q>\uC3BD8K;RcN2\uC83DvXkY]\u4782-z-mQMQ;/J.)Rbe/p3j");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2013897992(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2013897992L))
            info.setReturnValue(666172962);
    }

    @Inject(at = @At("HEAD"), method = "validateValue(Ljava/lang/Object;)Ljava/util/Optional;", cancellable = true)
    private void validateValue_965907332(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(965907332L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "validateValue(Ljava/lang/Integer;)Ljava/util/Optional;", cancellable = true)
    private void validateValue_674650003(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(674650003L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/Codec;", cancellable = true)
    private void codec_1583669624(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1583669624L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "minInclusive()I", cancellable = true)
    private void minInclusive_2013897496(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2013897496L))
            info.setReturnValue(869320381);
    }

    @Inject(at = @At("HEAD"), method = "maxInclusive()I", cancellable = true)
    private void maxInclusive_2013897496(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2013897496L))
            info.setReturnValue(869320381);
    }

    @Inject(at = @At("HEAD"), method = "applyValueImmediately()Z", cancellable = true)
    private void applyValueImmediately_2013913833(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2013913833L))
            info.setReturnValue(true);
    }


}
