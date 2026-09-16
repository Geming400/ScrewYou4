package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.navigation.GroundPathNavigation.class)
public class GroundPathNavigation1259266612Mixin {
        @Inject(at = @At("HEAD"), method = "canNavigateGround()Z", cancellable = true)
    private void canNavigateGround__1897000285(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1897000285L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "setAvoidSun(Z)V", cancellable = true)
    private void setAvoidSun__337568438(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-337568438L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setCanWalkOverFences(Z)V", cancellable = true)
    private void setCanWalkOverFences_407743966(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(407743966L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createPath(Lnet/minecraft/core/BlockPos;I)Lnet/minecraft/world/level/pathfinder/Path;", cancellable = true)
    private void createPath_411294095(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(411294095L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createPath(Lnet/minecraft/world/entity/Entity;I)Lnet/minecraft/world/level/pathfinder/Path;", cancellable = true)
    private void createPath__350578902(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-350578902L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setCanPathToTargetsBelowSurface(Z)V", cancellable = true)
    private void setCanPathToTargetsBelowSurface__1335934911(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1335934911L))
            info.cancel();
    }


}
