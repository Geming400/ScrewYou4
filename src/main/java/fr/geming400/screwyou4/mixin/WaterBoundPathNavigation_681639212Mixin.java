package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.navigation.WaterBoundPathNavigation.class)
public class WaterBoundPathNavigation_681639212Mixin {
        @Inject(at = @At("HEAD"), method = "setCanFloat(Z)V", cancellable = true)
    private void setCanFloat_1911256040(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1911256040L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getMaxVerticalDistanceToWaypoint()F", cancellable = true)
    private void getMaxVerticalDistanceToWaypoint_719898574(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(719898574L))
            info.setReturnValue(2.226173E8F);
    }

    @Inject(at = @At("HEAD"), method = "isStableDestination(Lnet/minecraft/core/BlockPos;)Z", cancellable = true)
    private void isStableDestination_850409654(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(850409654L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "canNavigateGround()Z", cancellable = true)
    private void canNavigateGround_719917794(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(719917794L))
            info.setReturnValue(false);
    }


}
