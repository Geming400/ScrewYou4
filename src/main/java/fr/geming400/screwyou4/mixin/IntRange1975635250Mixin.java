package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.OptionInstance.IntRange.class)
public class IntRange1975635250Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1067008982(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1067008982L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1548908521(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1548908521L))
            info.setReturnValue("eFYE.\u4091\u103Feb<<7U5E[9&\u10EB;QPY',(]+u`9\u9BAFFtd3,MV4\u75D8jq]nd\uD2E90,w*j+X8o\u4516\uA47D@.4-*1\u6ECF1_bp");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1761979955(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1761979955L))
            info.setReturnValue(-1249671855);
    }

    @Inject(at = @At("HEAD"), method = "validateValue(Ljava/lang/Object;)Ljava/util/Optional;", cancellable = true)
    private void validateValue__1704546369(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1704546369L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "validateValue(Ljava/lang/Integer;)Ljava/util/Optional;", cancellable = true)
    private void validateValue__505036104(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-505036104L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "applyValueImmediately()Z", cancellable = true)
    private void applyValueImmediately_1480222062(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1480222062L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/Codec;", cancellable = true)
    private void codec_170925710(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(170925710L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "maxInclusive()I", cancellable = true)
    private void maxInclusive_5795632(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(5795632L))
            info.setReturnValue(-237719248);
    }

    @Inject(at = @At("HEAD"), method = "minInclusive()I", cancellable = true)
    private void minInclusive__1974126690(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1974126690L))
            info.setReturnValue(1538436846);
    }


}
