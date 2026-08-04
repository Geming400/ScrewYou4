package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.KelpPlantBlock.class)
public class KelpPlantBlock281224932Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_2017078656(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2017078656L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canPlaceLiquid(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/level/BlockGetter;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/material/Fluid;)Z", cancellable = true)
    private void canPlaceLiquid_1283757764(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1283757764L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "placeLiquid(Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/material/FluidState;)Z", cancellable = true)
    private void placeLiquid__308991644(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-308991644L))
            info.setReturnValue(null);
    }


}
