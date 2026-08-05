package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.predicates.CollectionCountsPredicate.Zero.class)
public class Zero651751651Mixin {
        @Inject(at = @At("HEAD"), method = "test(Ljava/lang/Object;)Z", cancellable = true)
    private void test_2037392374(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2037392374L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "test(Ljava/lang/Iterable;)Z", cancellable = true)
    private void test__1468286749(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1468286749L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "unpack()Ljava/util/List;", cancellable = true)
    private void unpack__2016878829(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2016878829L))
            info.setReturnValue(null);
    }


}
