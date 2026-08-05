package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.LeverBlock.class)
public class LeverBlock1935144423Mixin {
        @Inject(at = @At("HEAD"), method = "pull(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/entity/player/Player;)V", cancellable = true)
    private void pull_1950350436(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1950350436L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1293377619(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1293377619L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "animateTick(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/RandomSource;)V", cancellable = true)
    private void animateTick__1955141340(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1955141340L))
            info.cancel();
    }


}
