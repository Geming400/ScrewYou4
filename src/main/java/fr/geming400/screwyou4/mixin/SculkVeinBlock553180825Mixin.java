package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.SculkVeinBlock.class)
public class SculkVeinBlock553180825Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__2005932747(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2005932747L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSameSpaceSpreader()Lnet/minecraft/world/level/block/MultifaceSpreader;", cancellable = true)
    private void getSameSpaceSpreader_631123877(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(631123877L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasSubstrateAccess(Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/core/BlockPos;)Z", cancellable = true)
    private static void hasSubstrateAccess__1555250843(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1555250843L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getSpreader()Lnet/minecraft/world/level/block/MultifaceSpreader;", cancellable = true)
    private void getSpreader_631123877(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(631123877L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onDischarged(Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/RandomSource;)V", cancellable = true)
    private void onDischarged__445591953(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-445591953L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "attemptUseCharge(Lnet/minecraft/world/level/block/SculkSpreader$ChargeCursor;Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/RandomSource;Lnet/minecraft/world/level/block/SculkSpreader;Z)I", cancellable = true)
    private void attemptUseCharge_425596357(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(425596357L))
            info.setReturnValue(1752547134);
    }

    @Inject(at = @At("HEAD"), method = "regrow(Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Ljava/util/Collection;)Z", cancellable = true)
    private static void regrow__840760876(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-840760876L))
            info.setReturnValue(true);
    }


}
