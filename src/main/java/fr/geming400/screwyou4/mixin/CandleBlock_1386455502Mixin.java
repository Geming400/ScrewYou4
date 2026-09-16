package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.CandleBlock.class)
public class CandleBlock_1386455502Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1842066541(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1842066541L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStateForPlacement(Lnet/minecraft/world/item/context/BlockPlaceContext;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getStateForPlacement__1082732979(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1082732979L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canLight(Lnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private static void canLight__326829627(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-326829627L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "placeLiquid(Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/material/FluidState;)Z", cancellable = true)
    private void placeLiquid__435005200(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-435005200L))
            info.setReturnValue(true);
    }


}
