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
            info.setReturnValue("穁_İ緯zjo}{ꊃ;b93eONdP`9Z㜥=><鶕4大Fm}Su2O屄`V2eb5⋊)\"澧㵗낃UsWe Q>쎽8K;RcN2젽vXkY]䞂-z-mQMQ;/J.)Rbe/p3j");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2013897992(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2013897992L))
            info.setReturnValue(1128991362);
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

    @Inject(at = @At("HEAD"), method = "maxInclusive()I", cancellable = true)
    private void maxInclusive_2013897496(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2013897496L))
            info.setReturnValue(1332138781);
    }

    @Inject(at = @At("HEAD"), method = "minInclusive()I", cancellable = true)
    private void minInclusive_2013897496(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2013897496L))
            info.setReturnValue(1332138781);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/Codec;", cancellable = true)
    private void codec_1583669624(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1583669624L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "applyValueImmediately()Z", cancellable = true)
    private void applyValueImmediately_2013913833(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2013913833L))
            info.setReturnValue(true);
    }


}
