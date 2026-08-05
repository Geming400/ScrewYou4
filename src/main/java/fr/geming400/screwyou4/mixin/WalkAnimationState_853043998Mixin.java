package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.WalkAnimationState.class)
public class WalkAnimationState_853043998Mixin {
        @Inject(at = @At("HEAD"), method = "update(FFF)V", cancellable = true)
    private void update_1616749830(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1616749830L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "position(F)F", cancellable = true)
    private void position_2064175030(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2064175030L))
            info.setReturnValue(6.34634E7F);
    }

    @Inject(at = @At("HEAD"), method = "position()F", cancellable = true)
    private void position_891303360(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(891303360L))
            info.setReturnValue(6.34634E7F);
    }

    @Inject(at = @At("HEAD"), method = "stop()V", cancellable = true)
    private void stop_891318736(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(891318736L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setSpeed(F)V", cancellable = true)
    private void setSpeed_2064190406(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2064190406L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "speed(F)F", cancellable = true)
    private void speed_2064175030(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2064175030L))
            info.setReturnValue(6.6624E7F);
    }

    @Inject(at = @At("HEAD"), method = "speed()F", cancellable = true)
    private void speed_891303360(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(891303360L))
            info.setReturnValue(6.6624E7F);
    }

    @Inject(at = @At("HEAD"), method = "isMoving()Z", cancellable = true)
    private void isMoving_891322580(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(891322580L))
            info.setReturnValue(true);
    }


}
