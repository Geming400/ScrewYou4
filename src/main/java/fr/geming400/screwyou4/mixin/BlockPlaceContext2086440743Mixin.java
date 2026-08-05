package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.context.BlockPlaceContext.class)
public class BlockPlaceContext2086440743Mixin {
        @Inject(at = @At("HEAD"), method = "at(Lnet/minecraft/world/item/context/BlockPlaceContext;Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/Direction;)Lnet/minecraft/world/item/context/BlockPlaceContext;", cancellable = true)
    private static void at__662086072(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-662086072L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getClickedPos()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void getClickedPos_193053864(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(193053864L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getNearestLookingVerticalDirection()Lnet/minecraft/core/Direction;", cancellable = true)
    private void getNearestLookingVerticalDirection_1323585458(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1323585458L))
            info.setReturnValue(net.minecraft.core.Direction.SOUTH);
    }

    @Inject(at = @At("HEAD"), method = "getNearestLookingDirections()[Lnet/minecraft/core/Direction;", cancellable = true)
    private void getNearestLookingDirections_839172651(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(839172651L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getNearestLookingDirection()Lnet/minecraft/core/Direction;", cancellable = true)
    private void getNearestLookingDirection_1323585458(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1323585458L))
            info.setReturnValue(net.minecraft.core.Direction.SOUTH);
    }

    @Inject(at = @At("HEAD"), method = "canPlace()Z", cancellable = true)
    private void canPlace_2124719326(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2124719326L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "replacingClickedOnBlock()Z", cancellable = true)
    private void replacingClickedOnBlock_2124719326(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2124719326L))
            info.setReturnValue(true);
    }


}
