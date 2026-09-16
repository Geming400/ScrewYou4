package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.EndFlashState.class)
public class EndFlashState_97561714Mixin {
        @Inject(at = @At("HEAD"), method = "tick(J)V", cancellable = true)
    private void tick_400659195(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(400659195L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "flashStartedThisTick()Z", cancellable = true)
    private void flashStartedThisTick__498490692(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-498490692L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getYAngle()F", cancellable = true)
    private void getYAngle__953669052(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-953669052L))
            info.setReturnValue(1.276314E8F);
    }

    @Inject(at = @At("HEAD"), method = "getXAngle()F", cancellable = true)
    private void getXAngle_843282307(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(843282307L))
            info.setReturnValue(1.276314E8F);
    }

    @Inject(at = @At("HEAD"), method = "getIntensity(F)F", cancellable = true)
    private void getIntensity__783169337(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-783169337L))
            info.setReturnValue(1.276314E8F);
    }


}
