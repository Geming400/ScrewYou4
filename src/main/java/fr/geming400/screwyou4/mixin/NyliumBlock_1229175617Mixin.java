package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.NyliumBlock.class)
public class NyliumBlock_1229175617Mixin {
        @Inject(at = @At("HEAD"), method = "getType()Lnet/minecraft/world/level/block/BonemealableBlock$Type;", cancellable = true)
    private void getType__585248370(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-585248370L))
            info.setReturnValue(net.minecraft.world.level.block.BonemealableBlock.Type.GROWER);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1999346426(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1999346426L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isValidBonemealTarget(Lnet/minecraft/world/level/LevelReader;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private void isValidBonemealTarget_1192217796(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1192217796L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "performBonemeal(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/util/RandomSource;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)V", cancellable = true)
    private void performBonemeal_372391455(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(372391455L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isBonemealSuccess(Lnet/minecraft/world/level/Level;Lnet/minecraft/util/RandomSource;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private void isBonemealSuccess_1829428411(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1829428411L))
            info.setReturnValue(true);
    }


}
