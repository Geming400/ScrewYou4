package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.SeaPickleBlock.class)
public class SeaPickleBlock1759274376Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1469247666(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1469247666L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStateForPlacement(Lnet/minecraft/world/item/context/BlockPlaceContext;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getStateForPlacement__709914104(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-709914104L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isValidBonemealTarget(Lnet/minecraft/world/level/LevelReader;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private void isValidBonemealTarget_1722316556(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1722316556L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "performBonemeal(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/util/RandomSource;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)V", cancellable = true)
    private void performBonemeal_902490215(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(902490215L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isBonemealSuccess(Lnet/minecraft/world/level/Level;Lnet/minecraft/util/RandomSource;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private void isBonemealSuccess__1935440125(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1935440125L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isDead(Lnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private static void isDead_1313534712(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1313534712L))
            info.setReturnValue(true);
    }


}
