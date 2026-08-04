package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.SnowLayerBlock.class)
public class SnowLayerBlock_850038045Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1709075528(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1709075528L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStateForPlacement(Lnet/minecraft/world/item/context/BlockPlaceContext;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getStateForPlacement__408561723(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-408561723L))
            info.setReturnValue(null);
    }


}
