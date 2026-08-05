package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.RedStoneWireBlock.class)
public class RedStoneWireBlock429128070Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__2129985502(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2129985502L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStateForPlacement(Lnet/minecraft/world/item/context/BlockPlaceContext;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getStateForPlacement__829471697(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-829471697L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "animateTick(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/RandomSource;)V", cancellable = true)
    private void animateTick_306525989(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(306525989L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getBlockSignal(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;)I", cancellable = true)
    private void getBlockSignal_1256720817(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1256720817L))
            info.setReturnValue(2086125409);
    }

    @Inject(at = @At("HEAD"), method = "getColorForPower(I)I", cancellable = true)
    private static void getColorForPower_1643032797(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1643032797L))
            info.setReturnValue(99900185);
    }


}
