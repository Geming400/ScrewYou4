package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.LoggedPrintStream.class)
public class LoggedPrintStream837625437Mixin {
        @Inject(at = @At("HEAD"), method = "println(Ljava/lang/String;)V", cancellable = true)
    private void println_1909613387(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1909613387L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "println(Ljava/lang/Object;)V", cancellable = true)
    private void println_2142760157(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2142760157L))
            info.cancel();
    }


}
