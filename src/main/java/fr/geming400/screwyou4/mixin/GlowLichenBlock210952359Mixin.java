package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.GlowLichenBlock.class)
public class GlowLichenBlock210952359Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_1277397613(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1277397613L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "emission(I)Ljava/util/function/ToIntFunction;", cancellable = true)
    private static void emission_1315769304(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1315769304L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSpreader()Lnet/minecraft/world/level/block/MultifaceSpreader;", cancellable = true)
    private void getSpreader__1263956451(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1263956451L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isValidBonemealTarget(Lnet/minecraft/world/level/LevelReader;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private void isValidBonemealTarget_173994539(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(173994539L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isBonemealSuccess(Lnet/minecraft/world/level/Level;Lnet/minecraft/util/RandomSource;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)Z", cancellable = true)
    private void isBonemealSuccess_811205154(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(811205154L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "performBonemeal(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/util/RandomSource;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)V", cancellable = true)
    private void performBonemeal__645831802(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-645831802L))
            info.cancel();
    }


}
