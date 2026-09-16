package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.navigation.AmphibiousPathNavigation.class)
public class AmphibiousPathNavigation_2112419026Mixin {
        @Inject(at = @At("HEAD"), method = "setCanFloat(Z)V", cancellable = true)
    private void setCanFloat__396971012(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-396971012L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canNavigateGround()Z", cancellable = true)
    private void canNavigateGround__1043847872(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1043847872L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isStableDestination(Lnet/minecraft/core/BlockPos;)Z", cancellable = true)
    private void isStableDestination_2058487781(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2058487781L))
            info.setReturnValue(false);
    }


}
