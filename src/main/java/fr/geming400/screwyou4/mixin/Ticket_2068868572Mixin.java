package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.level.Ticket.class)
public class Ticket_2068868572Mixin {
        @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_933408100(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(933408100L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getType()Lnet/minecraft/server/level/TicketType;", cancellable = true)
    private void getType__229204810(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-229204810L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTicketLevel()I", cancellable = true)
    private void getTicketLevel_2107130817(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2107130817L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "decreaseTicksLeft()V", cancellable = true)
    private void decreaseTicksLeft_2107143310(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2107143310L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "resetTicksLeft()V", cancellable = true)
    private void resetTicksLeft_2107143310(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2107143310L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isTimedOut()Z", cancellable = true)
    private void isTimedOut_2107147154(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2107147154L))
            info.setReturnValue(null);
    }


}
