package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.CoralBlock.class)
public class CoralBlock1837732704Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__721380868(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-721380868L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStateForPlacement(Lnet/minecraft/world/item/context/BlockPlaceContext;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getStateForPlacement_579132937(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(579132937L))
            info.setReturnValue(null);
    }


}
