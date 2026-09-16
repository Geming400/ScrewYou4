package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.component.predicates.DataComponentPredicate.Single.class)
public class Single1357004850Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/core/component/predicates/DataComponentPredicate$Type;", cancellable = true)
    private void type__443103897(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-443103897L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_448378582(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(448378582L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_2127428375(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2127428375L))
            info.setReturnValue("4m;CZ<\u56D1gy1tn*Hj\u39A9ituf-yoH``u\u7FD8Y?Ae\uC12257R1gd7$KBF60pn6K56Z!hd\u5C8AEO8g o\u589F\u4C0E'MRzb1\u8202-xIcC");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1914356941(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1914356941L))
            info.setReturnValue(-440154892);
    }

    @Inject(at = @At("HEAD"), method = "predicate()Lnet/minecraft/core/component/predicates/DataComponentPredicate;", cancellable = true)
    private void predicate__188425106(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-188425106L))
            info.setReturnValue(null);
    }


}
