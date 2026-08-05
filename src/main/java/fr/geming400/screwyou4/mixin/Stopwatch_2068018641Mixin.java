package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.Stopwatch.class)
public class Stopwatch_2068018641Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__841436397(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-841436397L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_932558665(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(932558665L))
            info.setReturnValue("Bzd-|Rm(IR\u393Eqh{re");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2106281382(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2106281382L))
            info.setReturnValue(643507484);
    }

    @Inject(at = @At("HEAD"), method = "creationTime()J", cancellable = true)
    private void creationTime_2106281847(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2106281847L))
            info.setReturnValue(-1662913447398318967L);
    }

    @Inject(at = @At("HEAD"), method = "elapsedSeconds(J)D", cancellable = true)
    private void elapsedSeconds__1012125461(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1012125461L))
            info.setReturnValue(7.655927000867107E8D);
    }

    @Inject(at = @At("HEAD"), method = "accumulatedElapsedTime()J", cancellable = true)
    private void accumulatedElapsedTime_2106281847(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2106281847L))
            info.setReturnValue(-1662913447397284367L);
    }

    @Inject(at = @At("HEAD"), method = "elapsedMilliseconds(J)J", cancellable = true)
    private void elapsedMilliseconds__1012119695(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1012119695L))
            info.setReturnValue(-2549790473192406433L);
    }


}
