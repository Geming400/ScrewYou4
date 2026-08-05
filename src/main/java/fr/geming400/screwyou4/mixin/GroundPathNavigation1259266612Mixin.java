package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.navigation.GroundPathNavigation.class)
public class GroundPathNavigation1259266612Mixin {
        @Inject(at = @At("HEAD"), method = "createPath(Lnet/minecraft/core/BlockPos;I)Lnet/minecraft/world/level/pathfinder/Path;", cancellable = true)
    private void createPath__1977820368(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1977820368L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createPath(Lnet/minecraft/world/entity/Entity;I)Lnet/minecraft/world/level/pathfinder/Path;", cancellable = true)
    private void createPath_821697547(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(821697547L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setAvoidSun(Z)V", cancellable = true)
    private void setAvoidSun__1806083855(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1806083855L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canNavigateGround()Z", cancellable = true)
    private void canNavigateGround_1297545195(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1297545195L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "setCanWalkOverFences(Z)V", cancellable = true)
    private void setCanWalkOverFences__1806083855(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1806083855L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setCanPathToTargetsBelowSurface(Z)V", cancellable = true)
    private void setCanPathToTargetsBelowSurface__1806083855(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1806083855L))
            info.cancel();
    }


}
