package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.SuppressedExceptionCollector.class)
public class SuppressedExceptionCollector576325686Mixin {
        @Inject(at = @At("HEAD"), method = "addEntry(Ljava/lang/String;Ljava/lang/Throwable;)V", cancellable = true)
    private void addEntry__372782486(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-372782486L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "dump()Ljava/lang/String;", cancellable = true)
    private void dump__559133793(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-559133793L))
            info.setReturnValue(null);
    }


}
