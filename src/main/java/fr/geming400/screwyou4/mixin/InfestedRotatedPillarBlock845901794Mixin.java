package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.InfestedRotatedPillarBlock.class)
public class InfestedRotatedPillarBlock845901794Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1713211778(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1713211778L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStateForPlacement(Lnet/minecraft/world/item/context/BlockPlaceContext;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getStateForPlacement__412697973(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-412697973L))
            info.setReturnValue(null);
    }


}
