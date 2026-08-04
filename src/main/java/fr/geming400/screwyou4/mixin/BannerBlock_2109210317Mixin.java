package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.BannerBlock.class)
public class BannerBlock_2109210317Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__449903256(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-449903256L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStateForPlacement(Lnet/minecraft/world/item/context/BlockPlaceContext;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getStateForPlacement_850610549(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(850610549L))
            info.setReturnValue(null);
    }


}
