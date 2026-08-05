package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.EndFlashState.class)
public class EndFlashState_97561714Mixin {
        @Inject(at = @At("HEAD"), method = "tick(J)V", cancellable = true)
    private void tick_1312402206(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1312402206L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getIntensity(F)F", cancellable = true)
    private void getIntensity_1308692746(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1308692746L))
            info.setReturnValue(7.000976E8F);
    }

    @Inject(at = @At("HEAD"), method = "getYAngle()F", cancellable = true)
    private void getYAngle_135821076(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(135821076L))
            info.setReturnValue(7.000976E8F);
    }

    @Inject(at = @At("HEAD"), method = "getXAngle()F", cancellable = true)
    private void getXAngle_135821076(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(135821076L))
            info.setReturnValue(7.000976E8F);
    }

    @Inject(at = @At("HEAD"), method = "flashStartedThisTick()Z", cancellable = true)
    private void flashStartedThisTick_135840296(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(135840296L))
            info.setReturnValue(true);
    }


}
