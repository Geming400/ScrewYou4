package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ElytraAnimationState.class)
public class ElytraAnimationState_901889142Mixin {
        @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_772205483(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(772205483L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getRotX(F)F", cancellable = true)
    private void getRotX__1077932635(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1077932635L))
            info.setReturnValue(4.154766E8F);
    }

    @Inject(at = @At("HEAD"), method = "getRotY(F)F", cancellable = true)
    private void getRotY__190428954(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-190428954L))
            info.setReturnValue(4.154766E8F);
    }

    @Inject(at = @At("HEAD"), method = "getRotZ(F)F", cancellable = true)
    private void getRotZ_697074727(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(697074727L))
            info.setReturnValue(4.154766E8F);
    }


}
