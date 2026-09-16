package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.CreakingHeartBlock.class)
public class CreakingHeartBlock_475810515Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_1542255768(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1542255768L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTicker(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/entity/BlockEntityType;)Lnet/minecraft/world/level/block/entity/BlockEntityTicker;", cancellable = true)
    private void getTicker__1831014141(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1831014141L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStateForPlacement(Lnet/minecraft/world/item/context/BlockPlaceContext;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getStateForPlacement__1993377966(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1993377966L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "playerWillDestroy(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/entity/player/Player;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void playerWillDestroy_802873112(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(802873112L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "animateTick(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/RandomSource;)V", cancellable = true)
    private void animateTick_880492047(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(880492047L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hasRequiredLogs(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/LevelReader;Lnet/minecraft/core/BlockPos;)Z", cancellable = true)
    private static void hasRequiredLogs__1462707728(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1462707728L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "newBlockEntity(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)Lnet/minecraft/world/level/block/entity/BlockEntity;", cancellable = true)
    private void newBlockEntity_617385899(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(617385899L))
            info.setReturnValue(null);
    }


}
