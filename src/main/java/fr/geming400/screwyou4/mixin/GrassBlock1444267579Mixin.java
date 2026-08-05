package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.GrassBlock.class)
public class GrassBlock1444267579Mixin {
        @Inject(at = @At("HEAD"), method = "getType()Lnet/minecraft/world/level/block/BonemealableBlock$Type;", cancellable = true)
    private void getType_1563430105(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1563430105L))
            info.setReturnValue(net.minecraft.world.level.block.BonemealableBlock.Type.GROWER);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1114845993(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1114845993L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "performBonemeal(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/util/RandomSource;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)V", cancellable = true)
    private void performBonemeal__698698974(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-698698974L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isBonemealSuccess(Lnet/minecraft/world/level/Level;Lnet/minecraft/util/RandomSource;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private void isBonemealSuccess__528645564(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-528645564L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isValidBonemealTarget(Lnet/minecraft/world/level/LevelReader;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private void isValidBonemealTarget_1488947337(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1488947337L))
            info.setReturnValue(false);
    }


}
