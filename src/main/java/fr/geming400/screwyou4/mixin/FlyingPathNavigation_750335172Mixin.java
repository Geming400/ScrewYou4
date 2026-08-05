package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.navigation.FlyingPathNavigation.class)
public class FlyingPathNavigation_750335172Mixin {
        @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_788609910(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(788609910L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canNavigateGround()Z", cancellable = true)
    private void canNavigateGround_788613754(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(788613754L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isStableDestination(Lnet/minecraft/core/BlockPos;)Z", cancellable = true)
    private void isStableDestination_919105614(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(919105614L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "createPath(Lnet/minecraft/world/entity/Entity;I)Lnet/minecraft/world/level/pathfinder/Path;", cancellable = true)
    private void createPath_312766106(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(312766106L))
            info.setReturnValue(null);
    }


}
