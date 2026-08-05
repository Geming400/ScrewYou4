package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.FenceBlock.class)
public class FenceBlock870999904Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_1937445158(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1937445158L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStateForPlacement(Lnet/minecraft/world/item/context/BlockPlaceContext;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getStateForPlacement__1598188576(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1598188576L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "connectsTo(Lnet/minecraft/world/level/block/state/BlockState;ZLnet/minecraft/core/Direction;)Z", cancellable = true)
    private void connectsTo_766095042(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(766095042L))
            info.setReturnValue(false);
    }


}
