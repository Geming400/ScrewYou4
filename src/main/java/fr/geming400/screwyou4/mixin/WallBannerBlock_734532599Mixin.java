package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.WallBannerBlock.class)
public class WallBannerBlock_734532599Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1824580974(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1824580974L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStateForPlacement(Lnet/minecraft/world/item/context/BlockPlaceContext;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getStateForPlacement__524067169(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-524067169L))
            info.setReturnValue(null);
    }


}
