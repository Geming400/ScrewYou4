package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.predicates.CollectionContentsPredicate.Single.class)
public class Single1557095209Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1352359828(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1352359828L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_421635234(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(421635234L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1595357951(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1595357951L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "test(Ljava/lang/Object;)Z", cancellable = true)
    private void test__1352231364(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1352231364L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "test(Ljava/lang/Iterable;)Z", cancellable = true)
    private void test__562943191(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-562943191L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "test()Ljava/util/function/Predicate;", cancellable = true)
    private void test_907210231(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(907210231L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "unpack()Ljava/util/List;", cancellable = true)
    private void unpack__1111535271(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1111535271L))
            info.setReturnValue(null);
    }


}
