package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.redstone.InstantNeighborUpdater.class)
public class InstantNeighborUpdater153996908Mixin {
        @Inject(at = @At("HEAD"), method = "shapeUpdate(Lnet/minecraft/core/Direction;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/BlockPos;II)V", cancellable = true)
    private void shapeUpdate_817994224(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(817994224L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "neighborChanged(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/Block;Lnet/minecraft/world/level/redstone/Orientation;Z)V", cancellable = true)
    private void neighborChanged_584161834(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(584161834L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "neighborChanged(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/Block;Lnet/minecraft/world/level/redstone/Orientation;)V", cancellable = true)
    private void neighborChanged_128185807(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(128185807L))
            info.cancel();
    }


}
