package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.TallSeagrassBlock.class)
public class TallSeagrassBlock241198987Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_1977052711(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1977052711L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canPlaceLiquid(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/level/BlockGetter;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/material/Fluid;)Z", cancellable = true)
    private void canPlaceLiquid_1243731819(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1243731819L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "placeLiquid(Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/material/FluidState;)Z", cancellable = true)
    private void placeLiquid__349017589(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-349017589L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getStateForPlacement(Lnet/minecraft/world/item/context/BlockPlaceContext;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getStateForPlacement__1017400780(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1017400780L))
            info.setReturnValue(null);
    }


}
