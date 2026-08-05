package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.RepeaterBlock.class)
public class RepeaterBlock751956887Mixin {
        @Inject(at = @At("HEAD"), method = "isLocked(Lnet/minecraft/world/level/LevelReader;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private void isLocked_2047548561(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2047548561L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_1818402141(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1818402141L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStateForPlacement(Lnet/minecraft/world/item/context/BlockPlaceContext;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getStateForPlacement__1717231593(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1717231593L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "animateTick(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/RandomSource;)V", cancellable = true)
    private void animateTick_1156638420(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1156638420L))
            info.cancel();
    }


}
