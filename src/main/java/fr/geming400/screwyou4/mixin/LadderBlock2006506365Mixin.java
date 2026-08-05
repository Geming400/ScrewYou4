package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.LadderBlock.class)
public class LadderBlock2006506365Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1222015677(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1222015677L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStateForPlacement(Lnet/minecraft/world/item/context/BlockPlaceContext;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getStateForPlacement__462682115(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-462682115L))
            info.setReturnValue(null);
    }


}
