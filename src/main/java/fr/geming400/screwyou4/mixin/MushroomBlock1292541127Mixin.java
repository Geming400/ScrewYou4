package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.MushroomBlock.class)
public class MushroomBlock1292541127Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1266572445(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1266572445L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isValidBonemealTarget(Lnet/minecraft/world/level/LevelReader;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private void isValidBonemealTarget_1337220885(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1337220885L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "performBonemeal(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/util/RandomSource;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)V", cancellable = true)
    private void performBonemeal__850425426(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-850425426L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isBonemealSuccess(Lnet/minecraft/world/level/Level;Lnet/minecraft/util/RandomSource;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private void isBonemealSuccess__680372016(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-680372016L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "growMushroom(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/util/RandomSource;)Z", cancellable = true)
    private void growMushroom__1062974388(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1062974388L))
            info.setReturnValue(true);
    }


}
