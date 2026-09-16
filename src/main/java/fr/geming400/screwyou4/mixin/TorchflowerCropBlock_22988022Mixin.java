package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.TorchflowerCropBlock.class)
public class TorchflowerCropBlock_22988022Mixin {
        @Inject(at = @At("HEAD"), method = "getShape(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/BlockGetter;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/phys/shapes/CollisionContext;)Lnet/minecraft/world/phys/shapes/VoxelShape;", cancellable = true)
    private void getShape__930370823(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-930370823L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_1089433275(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1089433275L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "randomTick(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/RandomSource;)V", cancellable = true)
    private void randomTick_133152500(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(133152500L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getMaxAge()I", cancellable = true)
    private void getMaxAge__1477667446(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1477667446L))
            info.setReturnValue(1609628686);
    }

    @Inject(at = @At("HEAD"), method = "getStateForAge(I)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getStateForAge_2091887673(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2091887673L))
            info.setReturnValue(null);
    }


}
