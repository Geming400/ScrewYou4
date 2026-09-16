package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.WalkAnimationState.class)
public class WalkAnimationState_853043998Mixin {
        @Inject(at = @At("HEAD"), method = "update(FFF)V", cancellable = true)
    private void update__1872689969(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1872689969L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "position(F)F", cancellable = true)
    private void position__2073811425(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2073811425L))
            info.setReturnValue(6.319245E8F);
    }

    @Inject(at = @At("HEAD"), method = "position()F", cancellable = true)
    private void position_1866198583(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1866198583L))
            info.setReturnValue(6.319245E8F);
    }

    @Inject(at = @At("HEAD"), method = "stop()V", cancellable = true)
    private void stop__1864819954(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1864819954L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setSpeed(F)V", cancellable = true)
    private void setSpeed__756534005(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-756534005L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isMoving()Z", cancellable = true)
    private void isMoving__1880853060(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1880853060L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "speed(F)F", cancellable = true)
    private void speed_1655455421(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1655455421L))
            info.setReturnValue(6.319245E8F);
    }

    @Inject(at = @At("HEAD"), method = "speed()F", cancellable = true)
    private void speed_1432308185(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1432308185L))
            info.setReturnValue(6.319245E8F);
    }


}
