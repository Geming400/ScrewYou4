package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.TorchflowerCropBlock.class)
public class TorchflowerCropBlock_22988022Mixin {
        @Inject(at = @At("HEAD"), method = "getShape(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/BlockGetter;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/phys/shapes/CollisionContext;)Lnet/minecraft/world/phys/shapes/VoxelShape;", cancellable = true)
    private void getShape_1748471310(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1748471310L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_1758841745(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1758841745L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "randomTick(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/RandomSource;)V", cancellable = true)
    private void randomTick__2029080588(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2029080588L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getStateForAge(I)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getStateForAge_1262545290(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1262545290L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getMaxAge()I", cancellable = true)
    private void getMaxAge_61250267(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(61250267L))
            info.setReturnValue(2055759206);
    }


}
