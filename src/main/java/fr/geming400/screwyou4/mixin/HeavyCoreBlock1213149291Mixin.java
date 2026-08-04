package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.HeavyCoreBlock.class)
public class HeavyCoreBlock1213149291Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1345964281(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1345964281L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStateForPlacement(Lnet/minecraft/world/item/context/BlockPlaceContext;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getStateForPlacement__45450476(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-45450476L))
            info.setReturnValue(null);
    }


}
