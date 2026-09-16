package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.SnifferEggBlock.class)
public class SnifferEggBlock1007869173Mixin {
        @Inject(at = @At("HEAD"), method = "tick(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/RandomSource;)V", cancellable = true)
    private void tick_1950623607(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1950623607L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getShape(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/BlockGetter;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/phys/shapes/CollisionContext;)Lnet/minecraft/world/phys/shapes/VoxelShape;", cancellable = true)
    private void getShape_54510329(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(54510329L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_2074314427(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2074314427L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onPlace(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Z)V", cancellable = true)
    private void onPlace_882270999(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(882270999L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getHatchLevel(Lnet/minecraft/world/level/block/state/BlockState;)I", cancellable = true)
    private void getHatchLevel__762211920(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-762211920L))
            info.setReturnValue(1462800988);
    }

    @Inject(at = @At("HEAD"), method = "isPathfindable(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/pathfinder/PathComputationType;)Z", cancellable = true)
    private void isPathfindable__830396524(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-830396524L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "hatchBoost(Lnet/minecraft/world/level/BlockGetter;Lnet/minecraft/core/BlockPos;)Z", cancellable = true)
    private static void hatchBoost__264104582(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-264104582L))
            info.setReturnValue(false);
    }


}
