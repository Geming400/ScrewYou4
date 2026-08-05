package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.predicates.CollectionContentsPredicate.Multiple.class)
public class Multiple_1897392271Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1012062767(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1012062767L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_761932295(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(761932295L))
            info.setReturnValue("_R(1-|p4\u1D5A\u57E0\u9D67{^ILPm\"xI,<%3#\u01CDYwGv1!/+\u817D\u1867]UqS%\uF99CYTjlVA=");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1935655012(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1935655012L))
            info.setReturnValue(1726256647);
    }

    @Inject(at = @At("HEAD"), method = "test(Ljava/lang/Iterable;)Z", cancellable = true)
    private void test__222646130(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-222646130L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "test(Ljava/lang/Object;)Z", cancellable = true)
    private void test__1011934303(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1011934303L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "unpack()Ljava/util/List;", cancellable = true)
    private void unpack__771238210(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-771238210L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tests()Ljava/util/List;", cancellable = true)
    private void tests__771238210(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-771238210L))
            info.setReturnValue(null);
    }


}
