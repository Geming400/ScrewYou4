package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.RedStoneWireBlock.class)
public class RedStoneWireBlock429128070Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_1495573324(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1495573324L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStateForPlacement(Lnet/minecraft/world/item/context/BlockPlaceContext;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getStateForPlacement__2040060410(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2040060410L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "animateTick(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/RandomSource;)V", cancellable = true)
    private void animateTick_833809603(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(833809603L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getBlockSignal(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;)I", cancellable = true)
    private void getBlockSignal_623356146(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(623356146L))
            info.setReturnValue(1774766963);
    }

    @Inject(at = @At("HEAD"), method = "getColorForPower(I)I", cancellable = true)
    private static void getColorForPower__605109082(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-605109082L))
            info.setReturnValue(-732054789);
    }


}
