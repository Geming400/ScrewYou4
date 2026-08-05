package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.data.structures.SnbtToNbt.class)
public class SnbtToNbt_532904598Mixin {
        @Inject(at = @At("HEAD"), method = "getName()Ljava/lang/String;", cancellable = true)
    private void getName__1355942305(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1355942305L))
            info.setReturnValue("B2Uc\uC697IgX\uC1CDE`:}/`oCud\u2233I^b2i\uCFBB-Ex\u3A24Q\"]E\u6E78$%c\u52BCig]\u184E]\u466F,#\u7A37\u6A57uM");
    }

    @Inject(at = @At("HEAD"), method = "run(Lnet/minecraft/data/CachedOutput;)Ljava/util/concurrent/CompletableFuture;", cancellable = true)
    private void run_632630340(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(632630340L))
            info.setReturnValue(new java.util.concurrent.CompletableFuture());
    }

    @Inject(at = @At("HEAD"), method = "addFilter(Lnet/minecraft/data/structures/SnbtToNbt$Filter;)Lnet/minecraft/data/structures/SnbtToNbt;", cancellable = true)
    private void addFilter_549221075(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(549221075L))
            info.setReturnValue(null);
    }


}
