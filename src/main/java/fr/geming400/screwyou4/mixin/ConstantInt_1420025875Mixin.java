package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.valueproviders.ConstantInt.class)
public class ConstantInt_1420025875Mixin {
        @Inject(at = @At("HEAD"), method = "value()I", cancellable = true)
    private void value__884645081(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-884645081L))
            info.setReturnValue(1572832614);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_511399606(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(511399606L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__2104518393(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2104518393L))
            info.setReturnValue("X\u34AB*ZOz \uB8E3AUN^9&s7idXI\u2BEE G\uB0468");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1977377965(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1977377965L))
            info.setReturnValue(-1500416928);
    }

    @Inject(at = @At("HEAD"), method = "of(I)Lnet/minecraft/util/valueproviders/ConstantInt;", cancellable = true)
    private static void of__1374896872(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1374896872L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1808496168(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1808496168L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "maxInclusive()I", cancellable = true)
    private void maxInclusive__549813744(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-549813744L))
            info.setReturnValue(1255301645);
    }

    @Inject(at = @At("HEAD"), method = "minInclusive()I", cancellable = true)
    private void minInclusive_1765231230(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1765231230L))
            info.setReturnValue(-1674071323);
    }

    @Inject(at = @At("HEAD"), method = "sample(Lnet/minecraft/util/RandomSource;)I", cancellable = true)
    private void sample_386963906(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(386963906L))
            info.setReturnValue(-61258547);
    }


}
