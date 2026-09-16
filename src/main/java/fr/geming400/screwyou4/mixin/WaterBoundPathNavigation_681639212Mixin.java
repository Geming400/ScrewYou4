package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.navigation.WaterBoundPathNavigation.class)
public class WaterBoundPathNavigation_681639212Mixin {
        @Inject(at = @At("HEAD"), method = "isStableDestination(Lnet/minecraft/core/BlockPos;)Z", cancellable = true)
    private void isStableDestination_627707967(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(627707967L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "canNavigateGround()Z", cancellable = true)
    private void canNavigateGround_1820339610(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1820339610L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "setCanFloat(Z)V", cancellable = true)
    private void setCanFloat__1827750826(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1827750826L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getMaxVerticalDistanceToWaypoint()F", cancellable = true)
    private void getMaxVerticalDistanceToWaypoint_935065(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(935065L))
            info.setReturnValue(7.834973E8F);
    }


}
