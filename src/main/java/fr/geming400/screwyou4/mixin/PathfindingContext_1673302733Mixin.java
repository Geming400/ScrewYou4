package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.pathfinder.PathfindingContext.class)
public class PathfindingContext_1673302733Mixin {
        @Inject(at = @At("HEAD"), method = "level()Lnet/minecraft/world/level/CollisionGetter;", cancellable = true)
    private void level__2031197973(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2031197973L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBlockState(Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getBlockState__1081781972(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1081781972L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mobPosition()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void mobPosition__1919053532(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1919053532L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPathTypeFromState(III)Lnet/minecraft/world/level/pathfinder/PathType;", cancellable = true)
    private void getPathTypeFromState_73620596(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(73620596L))
            info.setReturnValue(net.minecraft.world.level.pathfinder.PathType.BLOCKED);
    }


}
