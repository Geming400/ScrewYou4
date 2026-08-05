package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.component.predicates.DataComponentPredicate.Single.class)
public class Single1357004850Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/core/component/predicates/DataComponentPredicate$Type;", cancellable = true)
    private void type_1078723425(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1078723425L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1552450187(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1552450187L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_221544875(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(221544875L))
            info.setReturnValue("o$?GSIN2xit闫u8s] %^VEU㘓熵Jg&(y>P>*Gv귚Q0;daK:-kᭋ㍅,Z+骰i%)");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1395267592(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1395267592L))
            info.setReturnValue(1531637477);
    }

    @Inject(at = @At("HEAD"), method = "predicate()Lnet/minecraft/core/component/predicates/DataComponentPredicate;", cancellable = true)
    private void predicate_1595219511(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1595219511L))
            info.setReturnValue(null);
    }


}
