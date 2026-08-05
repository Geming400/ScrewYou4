package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.navigation.AmphibiousPathNavigation.class)
public class AmphibiousPathNavigation_2112419026Mixin {
        @Inject(at = @At("HEAD"), method = "isStableDestination(Lnet/minecraft/core/BlockPos;)Z", cancellable = true)
    private void isStableDestination__2013777828(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2013777828L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "canNavigateGround()Z", cancellable = true)
    private void canNavigateGround__2144269688(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2144269688L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "setCanFloat(Z)V", cancellable = true)
    private void setCanFloat__952931442(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-952931442L))
            info.cancel();
    }


}
