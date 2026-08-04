package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.RepeaterBlock.class)
public class RepeaterBlock751956887Mixin {
        @Inject(at = @At("HEAD"), method = "isLocked(Lnet/minecraft/world/level/LevelReader;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private void isLocked_796636645(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(796636645L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "animateTick(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/RandomSource;)V", cancellable = true)
    private void animateTick_629354806(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(629354806L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1807156685(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1807156685L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStateForPlacement(Lnet/minecraft/world/item/context/BlockPlaceContext;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getStateForPlacement__506642880(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-506642880L))
            info.setReturnValue(null);
    }


}
