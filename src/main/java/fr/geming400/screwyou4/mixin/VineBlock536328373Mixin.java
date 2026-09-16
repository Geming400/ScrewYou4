package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.VineBlock.class)
public class VineBlock536328373Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_1602773627(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1602773627L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isAcceptableNeighbour(Lnet/minecraft/world/level/BlockGetter;Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/Direction;)Z", cancellable = true)
    private static void isAcceptableNeighbour__1002210824(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1002210824L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getPropertyForFace(Lnet/minecraft/core/Direction;)Lnet/minecraft/world/level/block/state/properties/BooleanProperty;", cancellable = true)
    private static void getPropertyForFace__46737299(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-46737299L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStateForPlacement(Lnet/minecraft/world/item/context/BlockPlaceContext;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getStateForPlacement__1932860107(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1932860107L))
            info.setReturnValue(null);
    }


}
