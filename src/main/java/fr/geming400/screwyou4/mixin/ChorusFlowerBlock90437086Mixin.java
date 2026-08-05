package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.ChorusFlowerBlock.class)
public class ChorusFlowerBlock90437086Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_1156882340(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1156882340L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBlockSupportShape(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/BlockGetter;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/phys/shapes/VoxelShape;", cancellable = true)
    private void getBlockSupportShape__732796639(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-732796639L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "generatePlant(Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/RandomSource;I)V", cancellable = true)
    private static void generatePlant_898147864(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(898147864L))
            info.cancel();
    }


}
