package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.LightningRodBlock.class)
public class LightningRodBlock_1096322206Mixin {
        @Inject(at = @At("HEAD"), method = "animateTick(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/RandomSource;)V", cancellable = true)
    private void animateTick_973720124(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(973720124L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1462791367(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1462791367L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStateForPlacement(Lnet/minecraft/world/item/context/BlockPlaceContext;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getStateForPlacement__162277562(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-162277562L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onLightningStrike(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void onLightningStrike_1363136644(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1363136644L))
            info.cancel();
    }


}
