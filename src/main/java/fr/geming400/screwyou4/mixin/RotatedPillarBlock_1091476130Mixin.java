package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.RotatedPillarBlock.class)
public class RotatedPillarBlock_1091476130Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__2137045913(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2137045913L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStateForPlacement(Lnet/minecraft/world/item/context/BlockPlaceContext;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getStateForPlacement__1377712351(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1377712351L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "rotatePillar(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/Rotation;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private static void rotatePillar_1655066890(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1655066890L))
            info.setReturnValue(null);
    }


}
