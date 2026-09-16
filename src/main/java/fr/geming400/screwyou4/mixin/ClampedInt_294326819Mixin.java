package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.valueproviders.ClampedInt.class)
public class ClampedInt_294326819Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__614299450(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-614299450L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1064750343(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1064750343L))
            info.setReturnValue("<gwV[[_F0f B(0#+zgY*I\"jcjIS=t@i \uA4829=V,+,b9\u9EA7>z=up>@p3*\u35A07)1|$E&AT`9+.bIom\u06B5sYl\u8CABq$!\u524E.}\u809F6%0Icm");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_851678909(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(851678909L))
            info.setReturnValue(1775264417);
    }

    @Inject(at = @At("HEAD"), method = "of(Lnet/minecraft/util/valueproviders/IntProvider;II)Lnet/minecraft/util/valueproviders/ClampedInt;", cancellable = true)
    private static void of_2122705403(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2122705403L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "source()Lnet/minecraft/util/valueproviders/IntProvider;", cancellable = true)
    private void source_508920752(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(508920752L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_1360772072(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1360772072L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "minInclusive()I", cancellable = true)
    private void minInclusive_639532174(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(639532174L))
            info.setReturnValue(1242787083);
    }

    @Inject(at = @At("HEAD"), method = "maxInclusive()I", cancellable = true)
    private void maxInclusive__1675512800(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1675512800L))
            info.setReturnValue(355623341);
    }

    @Inject(at = @At("HEAD"), method = "sample(Lnet/minecraft/util/RandomSource;)I", cancellable = true)
    private void sample__738735150(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-738735150L))
            info.setReturnValue(841654548);
    }


}
