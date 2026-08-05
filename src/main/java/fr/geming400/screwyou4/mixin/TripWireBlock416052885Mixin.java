package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.TripWireBlock.class)
public class TripWireBlock416052885Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_1482498139(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1482498139L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStateForPlacement(Lnet/minecraft/world/item/context/BlockPlaceContext;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getStateForPlacement__2053135595(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2053135595L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "playerWillDestroy(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/entity/player/Player;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void playerWillDestroy_743115483(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(743115483L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "shouldConnectTo(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/core/Direction;)Z", cancellable = true)
    private void shouldConnectTo_117184501(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(117184501L))
            info.setReturnValue(true);
    }


}
