package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.predicates.CollectionContentsPredicate.Zero.class)
public class Zero1905377529Mixin {
        @Inject(at = @At("HEAD"), method = "test(Ljava/lang/Object;)Z", cancellable = true)
    private void test_168405818(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(168405818L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "test(Ljava/lang/Iterable;)Z", cancellable = true)
    private void test_1136929959(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1136929959L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "unpack()Ljava/util/List;", cancellable = true)
    private void unpack_515186267(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(515186267L))
            info.setReturnValue(null);
    }


}
