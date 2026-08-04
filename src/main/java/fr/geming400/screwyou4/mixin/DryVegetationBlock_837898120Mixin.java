package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.DryVegetationBlock.class)
public class DryVegetationBlock_837898120Mixin {
        @Inject(at = @At("HEAD"), method = "animateTick(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/RandomSource;)V", cancellable = true)
    private void animateTick_715296038(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(715296038L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1721215453(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1721215453L))
            info.setReturnValue(null);
    }


}
