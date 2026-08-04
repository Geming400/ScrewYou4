package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.TurtleEggBlock.class)
public class TurtleEggBlock1521479400Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1037634172(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1037634172L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "stepOn(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/entity/Entity;)V", cancellable = true)
    private void stepOn_836281024(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(836281024L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "fallOn(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/entity/Entity;D)V", cancellable = true)
    private void fallOn__1399683060(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1399683060L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "playerDestroy(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/entity/player/Player;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/entity/BlockEntity;Lnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void playerDestroy_81736230(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(81736230L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onSand(Lnet/minecraft/world/level/BlockGetter;Lnet/minecraft/core/BlockPos;)Z", cancellable = true)
    private static void onSand_943950672(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(943950672L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isSand(Lnet/minecraft/world/level/BlockGetter;Lnet/minecraft/core/BlockPos;)Z", cancellable = true)
    private static void isSand_943950672(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(943950672L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStateForPlacement(Lnet/minecraft/world/item/context/BlockPlaceContext;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getStateForPlacement_262879633(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(262879633L))
            info.setReturnValue(null);
    }


}
