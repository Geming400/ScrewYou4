package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.WallSkullBlock.class)
public class WallSkullBlock_1300588258Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1927933785(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1927933785L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStateForPlacement(Lnet/minecraft/world/item/context/BlockPlaceContext;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getStateForPlacement__1168600223(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1168600223L))
            info.setReturnValue(null);
    }


}
