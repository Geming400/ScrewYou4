package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.ChorusPlantBlock.class)
public class ChorusPlantBlock1069880812Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1489232760(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1489232760L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStateWithConnections(Lnet/minecraft/world/level/BlockGetter;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private static void getStateWithConnections_1243863850(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1243863850L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStateForPlacement(Lnet/minecraft/world/item/context/BlockPlaceContext;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getStateForPlacement__188718955(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-188718955L))
            info.setReturnValue(null);
    }


}
