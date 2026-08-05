package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.CameraType.class)
public class CameraType199733251Mixin {
        @Inject(at = @At("HEAD"), method = "values()[Lnet/minecraft/client/CameraType;", cancellable = true)
    private static void values__2050107241(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2050107241L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/client/CameraType;", cancellable = true)
    private static void valueOf__800490054(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-800490054L))
            info.setReturnValue(net.minecraft.client.CameraType.FIRST_PERSON);
    }

    @Inject(at = @At("HEAD"), method = "isMirrored()Z", cancellable = true)
    private void isMirrored_238011834(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(238011834L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "cycle()Lnet/minecraft/client/CameraType;", cancellable = true)
    private void cycle__1998288712(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1998288712L))
            info.setReturnValue(net.minecraft.client.CameraType.THIRD_PERSON_FRONT);
    }

    @Inject(at = @At("HEAD"), method = "isFirstPerson()Z", cancellable = true)
    private void isFirstPerson_238011834(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(238011834L))
            info.setReturnValue(true);
    }


}
