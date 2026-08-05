package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.SnifferEggBlock.class)
public class SnifferEggBlock1007869173Mixin {
        @Inject(at = @At("HEAD"), method = "tick(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/RandomSource;)V", cancellable = true)
    private void tick__1044199436(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1044199436L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getShape(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/BlockGetter;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/phys/shapes/CollisionContext;)Lnet/minecraft/world/phys/shapes/VoxelShape;", cancellable = true)
    private void getShape__1561614834(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1561614834L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1551244399(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1551244399L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isPathfindable(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/pathfinder/PathComputationType;)Z", cancellable = true)
    private void isPathfindable__764464298(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-764464298L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "onPlace(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Z)V", cancellable = true)
    private void onPlace__755581777(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-755581777L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getHatchLevel(Lnet/minecraft/world/level/block/state/BlockState;)I", cancellable = true)
    private void getHatchLevel_862563850(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(862563850L))
            info.setReturnValue(1725371288);
    }

    @Inject(at = @At("HEAD"), method = "hatchBoost(Lnet/minecraft/world/level/BlockGetter;Lnet/minecraft/core/BlockPos;)Z", cancellable = true)
    private static void hatchBoost_430340445(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(430340445L))
            info.setReturnValue(true);
    }


}
