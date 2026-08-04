package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.HangingRootsBlock.class)
public class HangingRootsBlock1956613630Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__602499942(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-602499942L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStateForPlacement(Lnet/minecraft/world/item/context/BlockPlaceContext;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getStateForPlacement_698013863(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(698013863L))
            info.setReturnValue(null);
    }


}
