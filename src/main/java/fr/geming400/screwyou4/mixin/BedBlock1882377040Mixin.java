package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.BedBlock.class)
public class BedBlock1882377040Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__676736532(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-676736532L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "playerWillDestroy(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/entity/player/Player;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void playerWillDestroy_1160320879(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1160320879L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getColor()Lnet/minecraft/world/item/DyeColor;", cancellable = true)
    private void getColor__977282026(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-977282026L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBedOrientation(Lnet/minecraft/world/level/BlockGetter;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/core/Direction;", cancellable = true)
    private static void getBedOrientation__1052693062(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1052693062L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fallOn(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/entity/Entity;D)V", cancellable = true)
    private void fallOn__1038785420(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1038785420L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "findStandUpPosition(Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/CollisionGetter;Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/Direction;F)Ljava/util/Optional;", cancellable = true)
    private static void findStandUpPosition_368776489(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(368776489L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBlockType(Lnet/minecraft/world/level/block/state/BlockState;)Lnet/minecraft/world/level/block/DoubleBlockCombiner$BlockType;", cancellable = true)
    private static void getBlockType_902158983(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(902158983L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getConnectedDirection(Lnet/minecraft/world/level/block/state/BlockState;)Lnet/minecraft/core/Direction;", cancellable = true)
    private static void getConnectedDirection_1013249028(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1013249028L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setPlacedBy(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void setPlacedBy__685158108(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-685158108L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getStateForPlacement(Lnet/minecraft/world/item/context/BlockPlaceContext;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getStateForPlacement_623777273(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(623777273L))
            info.setReturnValue(null);
    }


}
