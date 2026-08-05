package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.NetherrackBlock.class)
public class NetherrackBlock_691563440Mixin {
        @Inject(at = @At("HEAD"), method = "getType()Lnet/minecraft/world/level/block/BonemealableBlock$Type;", cancellable = true)
    private void getType_810725965(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(810725965L))
            info.setReturnValue(net.minecraft.world.level.block.BonemealableBlock.Type.NEIGHBOR_SPREADER);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1867550133(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1867550133L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isValidBonemealTarget(Lnet/minecraft/world/level/LevelReader;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private void isValidBonemealTarget_736243197(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(736243197L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isBonemealSuccess(Lnet/minecraft/world/level/Level;Lnet/minecraft/util/RandomSource;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private void isBonemealSuccess__1281349704(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1281349704L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "performBonemeal(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/util/RandomSource;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)V", cancellable = true)
    private void performBonemeal__1451403114(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1451403114L))
            info.cancel();
    }


}
