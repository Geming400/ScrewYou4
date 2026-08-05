package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.valueproviders.ClampedNormalFloat.class)
public class ClampedNormalFloat846270755Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__2063184282(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2063184282L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__289189716(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-289189716L))
            info.setReturnValue("bv.q>OL {^");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_884533497(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(884533497L))
            info.setReturnValue(-1657862157);
    }

    @Inject(at = @At("HEAD"), method = "min()F", cancellable = true)
    private void min_884530118(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(884530118L))
            info.setReturnValue(3.877736E8F);
    }

    @Inject(at = @At("HEAD"), method = "max()F", cancellable = true)
    private void max_884530118(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(884530118L))
            info.setReturnValue(3.877736E8F);
    }

    @Inject(at = @At("HEAD"), method = "of(FFFF)Lnet/minecraft/util/valueproviders/ClampedNormalFloat;", cancellable = true)
    private static void of_206218601(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(206218601L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mean()F", cancellable = true)
    private void mean_884530118(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(884530118L))
            info.setReturnValue(3.877736E8F);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1712842817(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1712842817L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "deviation()F", cancellable = true)
    private void deviation_884530118(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(884530118L))
            info.setReturnValue(3.877736E8F);
    }

    @Inject(at = @At("HEAD"), method = "sample(Lnet/minecraft/util/RandomSource;FFFF)F", cancellable = true)
    private static void sample__1995712546(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1995712546L))
            info.setReturnValue(3.877736E8F);
    }

    @Inject(at = @At("HEAD"), method = "sample(Lnet/minecraft/util/RandomSource;)F", cancellable = true)
    private void sample__860759706(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-860759706L))
            info.setReturnValue(3.877736E8F);
    }


}
