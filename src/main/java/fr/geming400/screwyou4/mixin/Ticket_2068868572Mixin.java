package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.level.Ticket.class)
public class Ticket_2068868572Mixin {
        @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1455675696(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1455675696L))
            info.setReturnValue("8fYOgllFO\uC1E2\u5520l\uB00Dv\u65CA])b\u6314\u87FE\u5796\uFA9D\u8E0AZOB2[\uCFB0\u0EC4y\uFB77K\u048D\uBFED<oc\u2C9DF5-OQ/^AU@Z(}KAj^XAn2|@Q`AE1y9\uB0EB&p\"");
    }

    @Inject(at = @At("HEAD"), method = "getType()Lnet/minecraft/server/level/TicketType;", cancellable = true)
    private void getType__236669178(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-236669178L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isTimedOut()Z", cancellable = true)
    private void isTimedOut__321859503(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-321859503L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getTicketLevel()I", cancellable = true)
    private void getTicketLevel_1048611423(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1048611423L))
            info.setReturnValue(-2114318774);
    }

    @Inject(at = @At("HEAD"), method = "decreaseTicksLeft()V", cancellable = true)
    private void decreaseTicksLeft__834188465(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-834188465L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "resetTicksLeft()V", cancellable = true)
    private void resetTicksLeft_1341019712(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1341019712L))
            info.cancel();
    }


}
