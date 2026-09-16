package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.navigation.FlyingPathNavigation.class)
public class FlyingPathNavigation_750335172Mixin {
        @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_620651513(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(620651513L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createPath(Lnet/minecraft/world/entity/Entity;I)Lnet/minecraft/world/level/pathfinder/Path;", cancellable = true)
    private void createPath__859510343(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-859510343L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isStableDestination(Lnet/minecraft/core/BlockPos;)Z", cancellable = true)
    private void isStableDestination_696403927(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(696403927L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "canNavigateGround()Z", cancellable = true)
    private void canNavigateGround_1889035570(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1889035570L))
            info.setReturnValue(true);
    }


}
