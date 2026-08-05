package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.GrassBlock.class)
public class GrassBlock1444267579Mixin {
        @Inject(at = @At("HEAD"), method = "getType()Lnet/minecraft/world/level/block/BonemealableBlock$Type;", cancellable = true)
    private void getType__370156407(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-370156407L))
            info.setReturnValue(net.minecraft.world.level.block.BonemealableBlock.Type.NEIGHBOR_SPREADER);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1784254463(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1784254463L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isValidBonemealTarget(Lnet/minecraft/world/level/LevelReader;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private void isValidBonemealTarget_1407309759(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1407309759L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isBonemealSuccess(Lnet/minecraft/world/level/Level;Lnet/minecraft/util/RandomSource;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private void isBonemealSuccess_2044520374(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2044520374L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "performBonemeal(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/util/RandomSource;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)V", cancellable = true)
    private void performBonemeal_587483418(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(587483418L))
            info.cancel();
    }


}
