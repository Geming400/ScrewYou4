package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.predicates.CollectionCountsPredicate.Entry.class)
public class Entry1836553677Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_927927409(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(927927409L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1687990094(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1687990094L))
            info.setReturnValue("C4$x%nN\u80A0ylQ[mFbSux\u3D21ohy \u5593Vu{J_wT1uW^A3os:&{\uAC8C)\uC275fv8yhM$0+55");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1901061528(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1901061528L))
            info.setReturnValue(-1296234813);
    }

    @Inject(at = @At("HEAD"), method = "test()Ljava/util/function/Predicate;", cancellable = true)
    private void test__201473875(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-201473875L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "test(Ljava/lang/Iterable;)Z", cancellable = true)
    private void test_1068106107(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1068106107L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "count()Lnet/minecraft/advancements/predicates/MinMaxBounds$Ints;", cancellable = true)
    private void count__1054423764(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1054423764L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec(Lcom/mojang/serialization/Codec;)Lcom/mojang/serialization/Codec;", cancellable = true)
    private static void codec__2106764806(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2106764806L))
            info.setReturnValue(null);
    }


}
