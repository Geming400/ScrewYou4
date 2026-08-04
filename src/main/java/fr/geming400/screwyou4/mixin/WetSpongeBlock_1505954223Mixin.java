package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.WetSpongeBlock.class)
public class WetSpongeBlock_1505954223Mixin {
        @Inject(at = @At("HEAD"), method = "animateTick(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/RandomSource;)V", cancellable = true)
    private void animateTick_1383352141(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1383352141L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1053159350(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1053159350L))
            info.setReturnValue(null);
    }


}
