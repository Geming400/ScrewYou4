package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.predicates.CollectionContentsPredicate.Multiple.class)
public class Multiple_1897392271Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_988766002(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(988766002L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1627151501(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1627151501L))
            info.setReturnValue("n\uC13B kz\u0630\u7675IX\uCFABW?FrIJ+-5>Rw\uCCB3Pnlp^KF%U5oT\u7498c\uA8E0z95dWU+be(-0\uC074V[_g");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1840222935(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1840222935L))
            info.setReturnValue(-289557194);
    }

    @Inject(at = @At("HEAD"), method = "test(Ljava/lang/Iterable;)Z", cancellable = true)
    private void test_1128944700(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1128944700L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "test(Ljava/lang/Object;)Z", cancellable = true)
    private void test_160420559(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(160420559L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "unpack()Ljava/util/List;", cancellable = true)
    private void unpack_507201008(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(507201008L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tests()Ljava/util/List;", cancellable = true)
    private void tests_371116639(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(371116639L))
            info.setReturnValue(null);
    }


}
