package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.ChainBlock.class)
public class ChainBlock_1806827824Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1421694219(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1421694219L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStateForPlacement(Lnet/minecraft/world/item/context/BlockPlaceContext;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getStateForPlacement__662360657(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-662360657L))
            info.setReturnValue(null);
    }


}
