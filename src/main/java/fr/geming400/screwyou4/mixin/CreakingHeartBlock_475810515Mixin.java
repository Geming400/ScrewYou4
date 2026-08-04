package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.CreakingHeartBlock.class)
public class CreakingHeartBlock_475810515Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__2083303058(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2083303058L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "playerWillDestroy(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/entity/player/Player;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void playerWillDestroy__246245647(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-246245647L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "animateTick(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/RandomSource;)V", cancellable = true)
    private void animateTick_353208433(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(353208433L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "newBlockEntity(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)Lnet/minecraft/world/level/block/entity/BlockEntity;", cancellable = true)
    private void newBlockEntity__1109667141(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1109667141L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasRequiredLogs(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/LevelReader;Lnet/minecraft/core/BlockPos;)Z", cancellable = true)
    private static void hasRequiredLogs_1851429016(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1851429016L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTicker(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/entity/BlockEntityType;)Lnet/minecraft/world/level/block/entity/BlockEntityTicker;", cancellable = true)
    private void getTicker__1477656829(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1477656829L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStateForPlacement(Lnet/minecraft/world/item/context/BlockPlaceContext;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getStateForPlacement__782789253(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-782789253L))
            info.setReturnValue(null);
    }


}
