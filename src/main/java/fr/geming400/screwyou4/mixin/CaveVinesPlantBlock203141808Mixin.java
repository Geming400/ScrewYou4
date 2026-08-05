package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.CaveVinesPlantBlock.class)
public class CaveVinesPlantBlock203141808Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_1938995532(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1938995532L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "performBonemeal(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/util/RandomSource;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)V", cancellable = true)
    private void performBonemeal__1939824745(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1939824745L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isBonemealSuccess(Lnet/minecraft/world/level/Level;Lnet/minecraft/util/RandomSource;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private void isBonemealSuccess__1769771335(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1769771335L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isValidBonemealTarget(Lnet/minecraft/world/level/LevelReader;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private void isValidBonemealTarget_247821566(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(247821566L))
            info.setReturnValue(false);
    }


}
