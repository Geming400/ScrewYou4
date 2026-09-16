package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.valueproviders.ClampedNormalInt.class)
public class ClampedNormalInt1920523894Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1011897626(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1011897626L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1604020373(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1604020373L))
            info.setReturnValue("esF!oK;.C+E;mF\u715Cal(kr;AKc3m\u45CDU*IJydVI\u21730{|\uD4A10QF\u74D8$^?\u8EC9-ZN?\uC189\u859BtCT\u17A4lERtJ5-o9.wayn*fGCQI\u9631`vv");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1817091311(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1817091311L))
            info.setReturnValue(-156548149);
    }

    @Inject(at = @At("HEAD"), method = "of(FFII)Lnet/minecraft/util/valueproviders/ClampedNormalInt;", cancellable = true)
    private static void of__1707625088(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1707625088L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mean()F", cancellable = true)
    private void mean_1487677556(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1487677556L))
            info.setReturnValue(2.716935E8F);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1307998148(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1307998148L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "minInclusive()I", cancellable = true)
    private void minInclusive__2029238046(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2029238046L))
            info.setReturnValue(366331406);
    }

    @Inject(at = @At("HEAD"), method = "maxInclusive()I", cancellable = true)
    private void maxInclusive__49315724(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-49315724L))
            info.setReturnValue(278534484);
    }

    @Inject(at = @At("HEAD"), method = "deviation()F", cancellable = true)
    private void deviation_1820253496(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1820253496L))
            info.setReturnValue(2.716935E8F);
    }

    @Inject(at = @At("HEAD"), method = "sample(Lnet/minecraft/util/RandomSource;FFFF)I", cancellable = true)
    private static void sample__1892912738(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1892912738L))
            info.setReturnValue(1279876165);
    }

    @Inject(at = @At("HEAD"), method = "sample(Lnet/minecraft/util/RandomSource;)I", cancellable = true)
    private void sample_887461926(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(887461926L))
            info.setReturnValue(-692626590);
    }


}
