package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.CameraType.class)
public class CameraType199733251Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/CameraType;", cancellable = true)
    private static void values_1253477433(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1253477433L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/CameraType;", cancellable = true)
    private static void valueOf__1506734702(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1506734702L))
            info.setReturnValue(net.minecraft.client.CameraType.FIRST_PERSON);
    }

    @Inject(at = @At("HEAD"), method = "isMirrored()Z", cancellable = true)
    private void isMirrored_1896729298(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1896729298L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isFirstPerson()Z", cancellable = true)
    private void isFirstPerson__303105025(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-303105025L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "cycle()Lnet/minecraft/client/CameraType;", cancellable = true)
    private void cycle__1085233262(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1085233262L))
            info.setReturnValue(net.minecraft.client.CameraType.THIRD_PERSON_FRONT);
    }


}
