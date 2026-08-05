package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.VineBlock.class)
public class VineBlock536328373Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__2022785199(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2022785199L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPropertyForFace(Lnet/minecraft/core/Direction;)Lnet/minecraft/world/level/block/state/properties/BooleanProperty;", cancellable = true)
    private static void getPropertyForFace__1031256846(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1031256846L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isAcceptableNeighbour(Lnet/minecraft/world/level/BlockGetter;Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/Direction;)Z", cancellable = true)
    private static void isAcceptableNeighbour_797216105(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(797216105L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getStateForPlacement(Lnet/minecraft/world/item/context/BlockPlaceContext;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getStateForPlacement__722271394(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-722271394L))
            info.setReturnValue(null);
    }


}
