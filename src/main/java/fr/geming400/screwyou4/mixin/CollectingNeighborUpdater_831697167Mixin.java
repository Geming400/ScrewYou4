package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.redstone.CollectingNeighborUpdater.class)
public class CollectingNeighborUpdater_831697167Mixin {
        @Inject(at = @At("HEAD"), method = "shapeUpdate(Lnet/minecraft/core/Direction;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/BlockPos;II)V", cancellable = true)
    private void shapeUpdate__910620900(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-910620900L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setDebugListener(Ljava/util/function/Consumer;)V", cancellable = true)
    private void setDebugListener_1512713579(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1512713579L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "neighborChanged(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/Block;Lnet/minecraft/world/level/redstone/Orientation;Z)V", cancellable = true)
    private void neighborChanged_445463658(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(445463658L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "neighborChanged(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/Block;Lnet/minecraft/world/level/redstone/Orientation;)V", cancellable = true)
    private void neighborChanged__86181485(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-86181485L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "updateNeighborsAtExceptFromFacing(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/Block;Lnet/minecraft/core/Direction;Lnet/minecraft/world/level/redstone/Orientation;)V", cancellable = true)
    private void updateNeighborsAtExceptFromFacing__1817423713(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1817423713L))
            info.cancel();
    }


}
