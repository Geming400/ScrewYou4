package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.redstone.InstantNeighborUpdater.class)
public class InstantNeighborUpdater153996908Mixin {
        @Inject(at = @At("HEAD"), method = "shapeUpdate(Lnet/minecraft/core/Direction;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/BlockPos;II)V", cancellable = true)
    private void shapeUpdate__1588321158(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1588321158L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "neighborChanged(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/Block;Lnet/minecraft/world/level/redstone/Orientation;Z)V", cancellable = true)
    private void neighborChanged__232236600(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-232236600L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "neighborChanged(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/Block;Lnet/minecraft/world/level/redstone/Orientation;)V", cancellable = true)
    private void neighborChanged__763881743(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-763881743L))
            info.cancel();
    }


}
