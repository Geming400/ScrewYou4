package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.piston.MovingPistonBlock.class)
public class MovingPistonBlock_1888194952Mixin {
        @Inject(at = @At("HEAD"), method = "destroy(Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)V", cancellable = true)
    private void destroy_1493523285(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1493523285L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__670918621(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-670918621L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTicker(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/entity/BlockEntityType;)Lnet/minecraft/world/level/block/entity/BlockEntityTicker;", cancellable = true)
    private void getTicker__65272392(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-65272392L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "newBlockEntity(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)Lnet/minecraft/world/level/block/entity/BlockEntity;", cancellable = true)
    private void newBlockEntity_302717296(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(302717296L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "newMovingBlockEntity(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/core/Direction;ZZ)Lnet/minecraft/world/level/block/entity/BlockEntity;", cancellable = true)
    private static void newMovingBlockEntity__89890355(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-89890355L))
            info.setReturnValue(null);
    }


}
