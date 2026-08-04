package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.RotatedPillarBlock.class)
public class RotatedPillarBlock_1091476130Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1467637443(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1467637443L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "rotatePillar(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/Rotation;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private static void rotatePillar_1566954469(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1566954469L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStateForPlacement(Lnet/minecraft/world/item/context/BlockPlaceContext;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getStateForPlacement__167123638(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-167123638L))
            info.setReturnValue(null);
    }


}
