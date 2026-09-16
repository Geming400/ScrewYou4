package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.piston.MovingPistonBlock.class)
public class MovingPistonBlock_1888194952Mixin {
        @Inject(at = @At("HEAD"), method = "destroy(Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)V", cancellable = true)
    private void destroy_480898459(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(480898459L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1340327091(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1340327091L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTicker(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/entity/BlockEntityType;)Lnet/minecraft/world/level/block/entity/BlockEntityTicker;", cancellable = true)
    private void getTicker__418629704(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-418629704L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "newBlockEntity(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)Lnet/minecraft/world/level/block/entity/BlockEntity;", cancellable = true)
    private void newBlockEntity_2029770336(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2029770336L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "newMovingBlockEntity(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/core/Direction;ZZ)Lnet/minecraft/world/level/block/entity/BlockEntity;", cancellable = true)
    private static void newMovingBlockEntity__594759637(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-594759637L))
            info.setReturnValue(null);
    }


}
