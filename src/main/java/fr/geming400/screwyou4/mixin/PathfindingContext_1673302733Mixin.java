package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.pathfinder.PathfindingContext.class)
public class PathfindingContext_1673302733Mixin {
        @Inject(at = @At("HEAD"), method = "level()Lnet/minecraft/world/level/CollisionGetter;", cancellable = true)
    private void level__223222545(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-223222545L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBlockState(Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getBlockState_2071928678(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2071928678L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPathTypeFromState(III)Lnet/minecraft/world/level/pathfinder/PathType;", cancellable = true)
    private void getPathTypeFromState__821076510(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-821076510L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "mobPosition()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void mobPosition__220084147(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-220084147L))
            info.setReturnValue(null);
    }


}
