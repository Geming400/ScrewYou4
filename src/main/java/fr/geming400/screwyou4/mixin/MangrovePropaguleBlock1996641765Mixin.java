package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.MangrovePropaguleBlock.class)
public class MangrovePropaguleBlock1996641765Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1231880277(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1231880277L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStateForPlacement(Lnet/minecraft/world/item/context/BlockPlaceContext;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getStateForPlacement__472546715(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-472546715L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isValidBonemealTarget(Lnet/minecraft/world/level/LevelReader;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private void isValidBonemealTarget_1959683945(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1959683945L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isBonemealSuccess(Lnet/minecraft/world/level/Level;Lnet/minecraft/util/RandomSource;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private void isBonemealSuccess__1698072736(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1698072736L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "performBonemeal(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/util/RandomSource;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)V", cancellable = true)
    private void performBonemeal_1139857604(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1139857604L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createNewHangingPropagule()Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private static void createNewHangingPropagule_856977956(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(856977956L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createNewHangingPropagule(I)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private static void createNewHangingPropagule_420432697(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(420432697L))
            info.setReturnValue(null);
    }


}
