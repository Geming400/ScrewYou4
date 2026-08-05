package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.NyliumBlock.class)
public class NyliumBlock_1229175617Mixin {
        @Inject(at = @At("HEAD"), method = "getType()Lnet/minecraft/world/level/block/BonemealableBlock$Type;", cancellable = true)
    private void getType_1348338142(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1348338142L))
            info.setReturnValue(net.minecraft.world.level.block.BonemealableBlock.Type.NEIGHBOR_SPREADER);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1329937956(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1329937956L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isValidBonemealTarget(Lnet/minecraft/world/level/LevelReader;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private void isValidBonemealTarget_1273855374(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1273855374L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "performBonemeal(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/util/RandomSource;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)V", cancellable = true)
    private void performBonemeal__913790937(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-913790937L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isBonemealSuccess(Lnet/minecraft/world/level/Level;Lnet/minecraft/util/RandomSource;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private void isBonemealSuccess__743737527(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-743737527L))
            info.setReturnValue(true);
    }


}
