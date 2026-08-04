package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ElytraAnimationState.class)
public class ElytraAnimationState_901889142Mixin {
        @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_940163880(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(940163880L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getRotY(F)F", cancellable = true)
    private void getRotY_2113020174(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2113020174L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRotZ(F)F", cancellable = true)
    private void getRotZ_2113020174(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2113020174L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRotX(F)F", cancellable = true)
    private void getRotX_2113020174(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2113020174L))
            info.setReturnValue(null);
    }


}
