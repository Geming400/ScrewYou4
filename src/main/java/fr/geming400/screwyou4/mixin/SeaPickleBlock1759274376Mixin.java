package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.SeaPickleBlock.class)
public class SeaPickleBlock1759274376Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__799839196(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-799839196L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStateForPlacement(Lnet/minecraft/world/item/context/BlockPlaceContext;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getStateForPlacement_500674609(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(500674609L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isValidBonemealTarget(Lnet/minecraft/world/level/LevelReader;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private void isValidBonemealTarget_1803954134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1803954134L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "performBonemeal(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/util/RandomSource;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)V", cancellable = true)
    private void performBonemeal__383692177(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-383692177L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isBonemealSuccess(Lnet/minecraft/world/level/Level;Lnet/minecraft/util/RandomSource;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private void isBonemealSuccess__213638767(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-213638767L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isDead(Lnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private static void isDead_1613985638(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1613985638L))
            info.setReturnValue(null);
    }


}
