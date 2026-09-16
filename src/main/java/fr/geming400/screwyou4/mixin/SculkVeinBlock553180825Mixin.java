package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.SculkVeinBlock.class)
public class SculkVeinBlock553180825Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_1619626079(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1619626079L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSpreader()Lnet/minecraft/world/level/block/MultifaceSpreader;", cancellable = true)
    private void getSpreader__921727985(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-921727985L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasSubstrateAccess(Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/core/BlockPos;)Z", cancellable = true)
    private static void hasSubstrateAccess__740544134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-740544134L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getSameSpaceSpreader()Lnet/minecraft/world/level/block/MultifaceSpreader;", cancellable = true)
    private void getSameSpaceSpreader_1318822747(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1318822747L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "attemptUseCharge(Lnet/minecraft/world/level/block/SculkSpreader$ChargeCursor;Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/RandomSource;Lnet/minecraft/world/level/block/SculkSpreader;Z)I", cancellable = true)
    private void attemptUseCharge__1071762797(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1071762797L))
            info.setReturnValue(48598808);
    }

    @Inject(at = @At("HEAD"), method = "onDischarged(Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/RandomSource;)V", cancellable = true)
    private void onDischarged_1214497232(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1214497232L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "regrow(Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Ljava/util/Collection;)Z", cancellable = true)
    private static void regrow__675289266(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-675289266L))
            info.setReturnValue(false);
    }


}
