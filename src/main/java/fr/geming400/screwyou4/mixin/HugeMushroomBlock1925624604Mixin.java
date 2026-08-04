package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.HugeMushroomBlock.class)
public class HugeMushroomBlock1925624604Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__633488968(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-633488968L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStateForPlacement(Lnet/minecraft/world/item/context/BlockPlaceContext;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getStateForPlacement_667024837(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(667024837L))
            info.setReturnValue(null);
    }


}
