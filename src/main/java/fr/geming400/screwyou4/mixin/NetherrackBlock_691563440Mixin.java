package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.NetherrackBlock.class)
public class NetherrackBlock_691563440Mixin {
        @Inject(at = @At("HEAD"), method = "getType()Lnet/minecraft/world/level/block/BonemealableBlock$Type;", cancellable = true)
    private void getType__1122860547(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1122860547L))
            info.setReturnValue(net.minecraft.world.level.block.BonemealableBlock.Type.GROWER);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_1758008693(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1758008693L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isValidBonemealTarget(Lnet/minecraft/world/level/LevelReader;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private void isValidBonemealTarget_654605619(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(654605619L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "performBonemeal(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/util/RandomSource;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)V", cancellable = true)
    private void performBonemeal__165220722(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-165220722L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isBonemealSuccess(Lnet/minecraft/world/level/Level;Lnet/minecraft/util/RandomSource;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private void isBonemealSuccess_1291816234(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1291816234L))
            info.setReturnValue(true);
    }


}
