package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.predicates.CollectionContentsPredicate.Single.class)
public class Single1557095209Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_648468941(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(648468941L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1967448562(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1967448562L))
            info.setReturnValue("/X_\u78BBz\uC97BW8K\u789B\u65E1\uC1D4H7B\u3549m;\"rv4f0\uC5A93Xz");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2114447300(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2114447300L))
            info.setReturnValue(1251701225);
    }

    @Inject(at = @At("HEAD"), method = "test(Ljava/lang/Object;)Z", cancellable = true)
    private void test__179876502(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-179876502L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "test(Ljava/lang/Iterable;)Z", cancellable = true)
    private void test_788647639(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(788647639L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "test()Ljava/util/function/Predicate;", cancellable = true)
    private void test__480932343(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-480932343L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "unpack()Ljava/util/List;", cancellable = true)
    private void unpack_166903947(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(166903947L))
            info.setReturnValue(null);
    }


}
