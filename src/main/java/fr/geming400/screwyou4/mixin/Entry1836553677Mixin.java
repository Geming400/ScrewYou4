package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.predicates.CollectionCountsPredicate.Entry.class)
public class Entry1836553677Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1072901360(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1072901360L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_701093702(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(701093702L))
            info.setReturnValue("`.):{&Q!8t7r#C덎j!8pNjIgm[WyxW}ퟄ@pIN8OMj");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1874816419(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1874816419L))
            info.setReturnValue(-184996879);
    }

    @Inject(at = @At("HEAD"), method = "test()Ljava/util/function/Predicate;", cancellable = true)
    private void test_1186668699(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1186668699L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "test(Ljava/lang/Iterable;)Z", cancellable = true)
    private void test__283484723(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-283484723L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "count()Lnet/minecraft/advancements/predicates/MinMaxBounds$Ints;", cancellable = true)
    private void count_1685318619(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1685318619L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec(Lcom/mojang/serialization/Codec;)Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void codec__1974735644(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1974735644L))
            info.setReturnValue(null);
    }


}
