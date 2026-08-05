package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.AbortableIterationConsumer.Continuation.class)
public class Continuation1559910780Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/util/AbortableIterationConsumer$Continuation;", cancellable = true)
    private static void values__1510503200(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1510503200L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/util/AbortableIterationConsumer$Continuation;", cancellable = true)
    private static void valueOf__73401369(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-73401369L))
            info.setReturnValue(net.minecraft.util.AbortableIterationConsumer.Continuation.ABORT);
    }

    @Inject(at = @At("HEAD"), method = "shouldAbort()Z", cancellable = true)
    private void shouldAbort__1238140906(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1238140906L))
            info.setReturnValue(true);
    }


}
