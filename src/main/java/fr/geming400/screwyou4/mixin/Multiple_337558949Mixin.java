package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.predicates.CollectionCountsPredicate.Multiple.class)
public class Multiple_337558949Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1723071207(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1723071207L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__797901027(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-797901027L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_375821690(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(375821690L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "test(Ljava/lang/Object;)Z", cancellable = true)
    private void test_1723199671(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1723199671L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "test(Ljava/lang/Iterable;)Z", cancellable = true)
    private void test__1782479452(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1782479452L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "entries()Ljava/util/List;", cancellable = true)
    private void entries_1963895764(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1963895764L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "unpack()Ljava/util/List;", cancellable = true)
    private void unpack_1963895764(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1963895764L))
            info.setReturnValue(null);
    }


}
