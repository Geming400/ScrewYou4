package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.FenceGateBlock.class)
public class FenceGateBlock_806632427Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1752481146(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1752481146L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStateForPlacement(Lnet/minecraft/world/item/context/BlockPlaceContext;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getStateForPlacement__451967341(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-451967341L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "connectsToDirection(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/core/Direction;)Z", cancellable = true)
    private static void connectsToDirection_687215508(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(687215508L))
            info.setReturnValue(null);
    }


}
