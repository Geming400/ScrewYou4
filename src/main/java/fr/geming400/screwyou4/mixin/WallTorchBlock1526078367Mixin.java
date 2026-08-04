package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.WallTorchBlock.class)
public class WallTorchBlock1526078367Mixin {
        @Inject(at = @At("HEAD"), method = "getShape(Lnet/minecraft/world/level/block/state/BlockState;)Lnet/minecraft/world/phys/shapes/VoxelShape;", cancellable = true)
    private static void getShape_767006954(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(767006954L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1033035205(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1033035205L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canSurvive(Lnet/minecraft/world/level/LevelReader;Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/Direction;)Z", cancellable = true)
    private static void canSurvive_682682818(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(682682818L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "animateTick(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/RandomSource;)V", cancellable = true)
    private void animateTick_1403476286(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1403476286L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getStateForPlacement(Lnet/minecraft/world/item/context/BlockPlaceContext;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getStateForPlacement_267478600(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(267478600L))
            info.setReturnValue(null);
    }


}
