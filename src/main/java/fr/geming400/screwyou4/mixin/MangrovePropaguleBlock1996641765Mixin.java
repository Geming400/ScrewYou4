package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.MangrovePropaguleBlock.class)
public class MangrovePropaguleBlock1996641765Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__562471807(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-562471807L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStateForPlacement(Lnet/minecraft/world/item/context/BlockPlaceContext;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getStateForPlacement_738041998(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(738041998L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isValidBonemealTarget(Lnet/minecraft/world/level/LevelReader;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private void isValidBonemealTarget_2041321523(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2041321523L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isBonemealSuccess(Lnet/minecraft/world/level/Level;Lnet/minecraft/util/RandomSource;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private void isBonemealSuccess_23728622(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(23728622L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "performBonemeal(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/util/RandomSource;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)V", cancellable = true)
    private void performBonemeal__146324788(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-146324788L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createNewHangingPropagule()Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private static void createNewHangingPropagule__299116853(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-299116853L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createNewHangingPropagule(I)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private static void createNewHangingPropagule__1058768014(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1058768014L))
            info.setReturnValue(null);
    }


}
