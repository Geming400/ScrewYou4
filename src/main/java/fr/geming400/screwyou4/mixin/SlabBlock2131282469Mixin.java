package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.SlabBlock.class)
public class SlabBlock2131282469Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__427831103(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-427831103L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStateForPlacement(Lnet/minecraft/world/item/context/BlockPlaceContext;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getStateForPlacement_872682702(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(872682702L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canPlaceLiquid(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/level/BlockGetter;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/material/Fluid;)Z", cancellable = true)
    private void canPlaceLiquid__1161151995(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1161151995L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "placeLiquid(Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/material/FluidState;)Z", cancellable = true)
    private void placeLiquid_1541065893(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1541065893L))
            info.setReturnValue(null);
    }


}
