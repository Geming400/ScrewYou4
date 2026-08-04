package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.ChainBlock.class)
public class ChainBlock_1806827824Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__752285749(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-752285749L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStateForPlacement(Lnet/minecraft/world/item/context/BlockPlaceContext;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getStateForPlacement_548228056(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(548228056L))
            info.setReturnValue(null);
    }


}
