package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.predicates.CollectionCountsPredicate.Zero.class)
public class Zero651751651Mixin {
        @Inject(at = @At("HEAD"), method = "test(Ljava/lang/Object;)Z", cancellable = true)
    private void test__1085220060(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1085220060L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "test(Ljava/lang/Iterable;)Z", cancellable = true)
    private void test__116695919(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-116695919L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "unpack()Ljava/util/List;", cancellable = true)
    private void unpack__738439611(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-738439611L))
            info.setReturnValue(null);
    }


}
