package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.FenceBlock.class)
public class FenceBlock870999904Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1688113668(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1688113668L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStateForPlacement(Lnet/minecraft/world/item/context/BlockPlaceContext;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getStateForPlacement__387599863(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-387599863L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "connectsTo(Lnet/minecraft/world/level/block/state/BlockState;ZLnet/minecraft/core/Direction;)Z", cancellable = true)
    private void connectsTo_1779261598(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1779261598L))
            info.setReturnValue(false);
    }


}
