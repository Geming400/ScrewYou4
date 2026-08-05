package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.predicates.CollectionCountsPredicate.Single.class)
public class Single_586530669Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__322095600(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-322095600L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1356954193(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1356954193L))
            info.setReturnValue("7VF|\u1C55WcBle /Q\u0C16#n3Qlm]h}|elK\u5C406O5\u1DD3r\u7AC1fP\u06C88(X7k%4f(O\u1C44Q)h\u339C)hwMGx1\u3409<9");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1143882759(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1143882759L))
            info.setReturnValue(-963596214);
    }

    @Inject(at = @At("HEAD"), method = "test(Ljava/lang/Object;)Z", cancellable = true)
    private void test__1150441043(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1150441043L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "test(Ljava/lang/Iterable;)Z", cancellable = true)
    private void test__181916902(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-181916902L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "entry()Lnet/minecraft/advancements/predicates/CollectionCountsPredicate$Entry;", cancellable = true)
    private void entry__137222970(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-137222970L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "unpack()Ljava/util/List;", cancellable = true)
    private void unpack__803660594(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-803660594L))
            info.setReturnValue(null);
    }


}
