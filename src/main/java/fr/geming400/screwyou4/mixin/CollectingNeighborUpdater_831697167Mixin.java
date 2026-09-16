package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.redstone.CollectingNeighborUpdater.class)
public class CollectingNeighborUpdater_831697167Mixin {
        @Inject(at = @At("HEAD"), method = "updateNeighborsAtExceptFromFacing(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/Block;Lnet/minecraft/core/Direction;Lnet/minecraft/world/level/redstone/Orientation;)V", cancellable = true)
    private void updateNeighborsAtExceptFromFacing__1483833321(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1483833321L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "shapeUpdate(Lnet/minecraft/core/Direction;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/BlockPos;II)V", cancellable = true)
    private void shapeUpdate_1495694482(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1495694482L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setDebugListener(Ljava/util/function/Consumer;)V", cancellable = true)
    private void setDebugListener_1741558544(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1741558544L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "neighborChanged(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/Block;Lnet/minecraft/world/level/redstone/Orientation;Z)V", cancellable = true)
    private void neighborChanged_1261862092(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1261862092L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "neighborChanged(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/Block;Lnet/minecraft/world/level/redstone/Orientation;)V", cancellable = true)
    private void neighborChanged_805886065(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(805886065L))
            info.cancel();
    }


}
