package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.PeriodicNotificationManager.Notification.class)
public class Notification1239849716Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1669605321(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1669605321L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_104389741(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(104389741L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1278112458(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1278112458L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "message()Ljava/lang/String;", cancellable = true)
    private void message_104389245(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(104389245L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "delay()J", cancellable = true)
    private void delay_1278112923(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1278112923L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "period()J", cancellable = true)
    private void period_1278112923(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1278112923L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "title()Ljava/lang/String;", cancellable = true)
    private void title_104389245(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(104389245L))
            info.setReturnValue(null);
    }


}
