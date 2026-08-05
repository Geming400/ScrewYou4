package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.TripWireBlock.class)
public class TripWireBlock416052885Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__2143060687(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2143060687L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStateForPlacement(Lnet/minecraft/world/item/context/BlockPlaceContext;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getStateForPlacement__842546882(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-842546882L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "playerWillDestroy(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/entity/player/Player;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void playerWillDestroy__306003276(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-306003276L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "shouldConnectTo(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/core/Direction;)Z", cancellable = true)
    private void shouldConnectTo_296635719(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(296635719L))
            info.setReturnValue(false);
    }


}
