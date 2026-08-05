package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.LayeredCauldronBlock.class)
public class LayeredCauldronBlock_1672789121Mixin {
        @Inject(at = @At("HEAD"), method = "isFull(Lnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private void isFull__529576339(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-529576339L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1555732922(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1555732922L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handlePrecipitation(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/biome/Biome$Precipitation;)V", cancellable = true)
    private void handlePrecipitation_1481188733(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1481188733L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "lowerFillLevel(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private static void lowerFillLevel_2597791(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2597791L))
            info.cancel();
    }


}
