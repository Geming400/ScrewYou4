package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.FrostedIceBlock.class)
public class FrostedIceBlock_736359369Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1822754204(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1822754204L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onPlace(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Z)V", cancellable = true)
    private void onPlace__1027091582(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1027091582L))
            info.cancel();
    }


}
