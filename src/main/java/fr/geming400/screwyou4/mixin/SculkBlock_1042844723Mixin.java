package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.SculkBlock.class)
public class SculkBlock_1042844723Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1516268850(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1516268850L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canChangeBlockStateOnSpread()Z", cancellable = true)
    private void canChangeBlockStateOnSpread_1081123305(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1081123305L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "attemptUseCharge(Lnet/minecraft/world/level/block/SculkSpreader$ChargeCursor;Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/RandomSource;Lnet/minecraft/world/level/block/SculkSpreader;Z)I", cancellable = true)
    private void attemptUseCharge_915260254(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(915260254L))
            info.setReturnValue(null);
    }


}
