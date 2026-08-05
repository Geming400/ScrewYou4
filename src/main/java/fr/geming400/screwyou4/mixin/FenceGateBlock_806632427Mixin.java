package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.FenceGateBlock.class)
public class FenceGateBlock_806632427Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_1873077680(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1873077680L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStateForPlacement(Lnet/minecraft/world/item/context/BlockPlaceContext;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getStateForPlacement__1662556054(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1662556054L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "connectsToDirection(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/core/Direction;)Z", cancellable = true)
    private static void connectsToDirection__584060999(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-584060999L))
            info.setReturnValue(false);
    }


}
