package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.StonecutterBlock.class)
public class StonecutterBlock_1032153555Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1526960018(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1526960018L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStateForPlacement(Lnet/minecraft/world/item/context/BlockPlaceContext;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getStateForPlacement__226446213(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-226446213L))
            info.setReturnValue(null);
    }


}
