package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.valueproviders.ClampedInt.class)
public class ClampedInt_294326819Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1679839077(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1679839077L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__841133157(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-841133157L))
            info.setReturnValue("T)Uh_䴾_榘h캦쉢U*?");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_332589560(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(332589560L))
            info.setReturnValue(-952316628);
    }

    @Inject(at = @At("HEAD"), method = "of(Lnet/minecraft/util/valueproviders/IntProvider;II)Lnet/minecraft/util/valueproviders/ClampedInt;", cancellable = true)
    private static void of_1519093554(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1519093554L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "source()Lnet/minecraft/util/valueproviders/IntProvider;", cancellable = true)
    private void source_2119607211(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2119607211L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_2030180542(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2030180542L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "maxInclusive()I", cancellable = true)
    private void maxInclusive_332589064(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(332589064L))
            info.setReturnValue(-1069280294);
    }

    @Inject(at = @At("HEAD"), method = "minInclusive()I", cancellable = true)
    private void minInclusive_332589064(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(332589064L))
            info.setReturnValue(-1069280294);
    }

    @Inject(at = @At("HEAD"), method = "sample(Lnet/minecraft/util/RandomSource;)I", cancellable = true)
    private void sample__1412700760(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1412700760L))
            info.setReturnValue(615928575);
    }


}
