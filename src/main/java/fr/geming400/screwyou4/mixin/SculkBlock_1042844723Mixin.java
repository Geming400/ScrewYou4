package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.SculkBlock.class)
public class SculkBlock_1042844723Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_2109289976(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2109289976L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "attemptUseCharge(Lnet/minecraft/world/level/block/SculkSpreader$ChargeCursor;Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/RandomSource;Lnet/minecraft/world/level/block/SculkSpreader;Z)I", cancellable = true)
    private void attemptUseCharge__582098900(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-582098900L))
            info.setReturnValue(-934925346);
    }

    @Inject(at = @At("HEAD"), method = "canChangeBlockStateOnSpread()Z", cancellable = true)
    private void canChangeBlockStateOnSpread_578748307(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(578748307L))
            info.setReturnValue(false);
    }


}
