package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.AbortableIterationConsumer.Continuation.class)
public class Continuation1559910780Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/util/AbortableIterationConsumer$Continuation;", cancellable = true)
    private static void values__1351518782(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1351518782L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/util/AbortableIterationConsumer$Continuation;", cancellable = true)
    private static void valueOf_1449833151(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1449833151L))
            info.setReturnValue(net.minecraft.util.AbortableIterationConsumer.Continuation.ABORT);
    }

    @Inject(at = @At("HEAD"), method = "shouldAbort()Z", cancellable = true)
    private void shouldAbort_1598189363(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1598189363L))
            info.setReturnValue(true);
    }


}
