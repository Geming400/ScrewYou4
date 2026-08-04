package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.advancements.predicates.CollectionContentsPredicate.Zero.class)
public class Zero1905377529Mixin {
        @Inject(at = @At("HEAD"), method = "test(Ljava/lang/Object;)Z", cancellable = true)
    private void test__1003949044(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1003949044L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "test(Ljava/lang/Iterable;)Z", cancellable = true)
    private void test__214660871(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-214660871L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "unpack()Ljava/util/List;", cancellable = true)
    private void unpack__763252951(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-763252951L))
            info.setReturnValue(null);
    }


}
