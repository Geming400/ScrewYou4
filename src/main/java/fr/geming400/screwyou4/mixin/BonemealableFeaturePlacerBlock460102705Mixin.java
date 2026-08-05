package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.BonemealableFeaturePlacerBlock.class)
public class BonemealableFeaturePlacerBlock460102705Mixin {
        @Inject(at = @At("HEAD"), method = "getType()Lnet/minecraft/world/level/block/BonemealableBlock$Type;", cancellable = true)
    private void getType_579265231(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(579265231L))
            info.setReturnValue(net.minecraft.world.level.block.BonemealableBlock.Type.NEIGHBOR_SPREADER);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__2099010867(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2099010867L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isValidBonemealTarget(Lnet/minecraft/world/level/LevelReader;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private void isValidBonemealTarget_504782463(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(504782463L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "performBonemeal(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/util/RandomSource;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)V", cancellable = true)
    private void performBonemeal__1682863848(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1682863848L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isBonemealSuccess(Lnet/minecraft/world/level/Level;Lnet/minecraft/util/RandomSource;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private void isBonemealSuccess__1512810438(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1512810438L))
            info.setReturnValue(true);
    }


}
