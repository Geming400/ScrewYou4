package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.predicates.CollectionPredicate.class)
public class CollectionPredicate1312931387Mixin {
        @Inject(at = @At("HEAD"), method = "size()Ljava/util/Optional;", cancellable = true)
    private void size_363420906(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(363420906L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_404305119(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(404305119L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_2083354912(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2083354912L))
            info.setReturnValue("JO].t\u164D\uBC40\u2927--\u7791+kp\u127Bu\u9CD9xg=\u800Br}4-/WSZc:iF#z.;[2e`-hDbwOw0(\uB322}\u75A9L%Mt`m}0WnfZTcSK?C[ni:!a\uC6F5\uB7B5#mUo7");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1870283478(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1870283478L))
            info.setReturnValue(-399735832);
    }

    @Inject(at = @At("HEAD"), method = "test(Ljava/lang/Object;)Z", cancellable = true)
    private void test__424040324(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-424040324L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "test(Ljava/lang/Iterable;)Z", cancellable = true)
    private void test_544483817(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(544483817L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "contains()Ljava/util/Optional;", cancellable = true)
    private void contains_157808904(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(157808904L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "counts()Ljava/util/Optional;", cancellable = true)
    private void counts_1909945645(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1909945645L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec(Lcom/mojang/serialization/Codec;)Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void codec_1664580200(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1664580200L))
            info.setReturnValue(null);
    }


}
