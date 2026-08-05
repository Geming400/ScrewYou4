package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.SnowLayerBlock.class)
public class SnowLayerBlock_850038045Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_1916483298(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1916483298L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStateForPlacement(Lnet/minecraft/world/item/context/BlockPlaceContext;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getStateForPlacement__1619150436(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1619150436L))
            info.setReturnValue(null);
    }


}
