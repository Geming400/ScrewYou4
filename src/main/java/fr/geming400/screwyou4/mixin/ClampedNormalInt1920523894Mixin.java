package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.valueproviders.ClampedNormalInt.class)
public class ClampedNormalInt1920523894Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__988931143(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-988931143L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_785063423(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(785063423L))
            info.setReturnValue("YUFr;K+zC[[Z)掣PcD}Tp⥓聴>;+珝*4UUf堘0.e;P)YSw0");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1958786636(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1958786636L))
            info.setReturnValue(489526343);
    }

    @Inject(at = @At("HEAD"), method = "of(FFII)Lnet/minecraft/util/valueproviders/ClampedNormalInt;", cancellable = true)
    private static void of_138894377(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(138894377L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mean()F", cancellable = true)
    private void mean_1958783257(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1958783257L))
            info.setReturnValue(6.18976E8F);
    }

    @Inject(at = @At("HEAD"), method = "maxInclusive()I", cancellable = true)
    private void maxInclusive_1958786140(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1958786140L))
            info.setReturnValue(692673763);
    }

    @Inject(at = @At("HEAD"), method = "minInclusive()I", cancellable = true)
    private void minInclusive_1958786140(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1958786140L))
            info.setReturnValue(692673763);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__638589678(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-638589678L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "deviation()F", cancellable = true)
    private void deviation_1958783257(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1958783257L))
            info.setReturnValue(6.18976E8F);
    }

    @Inject(at = @At("HEAD"), method = "sample(Lnet/minecraft/util/RandomSource;FFFF)I", cancellable = true)
    private static void sample__921456524(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-921456524L))
            info.setReturnValue(242908958);
    }

    @Inject(at = @At("HEAD"), method = "sample(Lnet/minecraft/util/RandomSource;)I", cancellable = true)
    private void sample_213496316(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(213496316L))
            info.setReturnValue(13206958);
    }


}
