package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.LoggedPrintStream.class)
public class LoggedPrintStream837625437Mixin {
        @Inject(at = @At("HEAD"), method = "println(Ljava/lang/String;)V", cancellable = true)
    private void println_1989986586(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1989986586L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "println(Ljava/lang/Object;)V", cancellable = true)
    private void println__2071833940(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2071833940L))
            info.cancel();
    }


}
