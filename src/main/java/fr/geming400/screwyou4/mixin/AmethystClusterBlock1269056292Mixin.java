package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.AmethystClusterBlock.class)
public class AmethystClusterBlock1269056292Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1290057280(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1290057280L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStateForPlacement(Lnet/minecraft/world/item/context/BlockPlaceContext;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getStateForPlacement_10456525(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(10456525L))
            info.setReturnValue(null);
    }


}
