package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.DirtPathBlock.class)
public class DirtPathBlock_1219787693Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__2008734350(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2008734350L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStateForPlacement(Lnet/minecraft/world/item/context/BlockPlaceContext;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getStateForPlacement__1249400788(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1249400788L))
            info.setReturnValue(null);
    }


}
