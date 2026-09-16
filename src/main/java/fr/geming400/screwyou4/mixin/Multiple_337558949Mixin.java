package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.predicates.CollectionCountsPredicate.Multiple.class)
public class Multiple_337558949Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__571067320(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-571067320L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1107982473(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1107982473L))
            info.setReturnValue("]C\uCADDBr/L\":[+Jq[O25\"T3m\u9DFE\uFF14GA/sng");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_894911039(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(894911039L))
            info.setReturnValue(-1650102874);
    }

    @Inject(at = @At("HEAD"), method = "test(Ljava/lang/Object;)Z", cancellable = true)
    private void test__1399412763(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1399412763L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "test(Ljava/lang/Iterable;)Z", cancellable = true)
    private void test__430888622(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-430888622L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "entries()Ljava/util/List;", cancellable = true)
    private void entries_634472548(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(634472548L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "unpack()Ljava/util/List;", cancellable = true)
    private void unpack__1052632314(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1052632314L))
            info.setReturnValue(null);
    }


}
