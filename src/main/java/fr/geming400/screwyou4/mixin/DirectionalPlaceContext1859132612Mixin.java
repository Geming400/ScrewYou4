package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.context.DirectionalPlaceContext.class)
public class DirectionalPlaceContext1859132612Mixin {
        @Inject(at = @At("HEAD"), method = "isSecondaryUseActive()Z", cancellable = true)
    private void isSecondaryUseActive_1021533496(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1021533496L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getRotation()F", cancellable = true)
    private void getRotation_942838515(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(942838515L))
            info.setReturnValue(3.177827E8F);
    }

    @Inject(at = @At("HEAD"), method = "getClickedPos()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void getClickedPos__431778302(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-431778302L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canPlace()Z", cancellable = true)
    private void canPlace__203506236(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-203506236L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getHorizontalDirection()Lnet/minecraft/core/Direction;", cancellable = true)
    private void getHorizontalDirection_1138318484(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1138318484L))
            info.setReturnValue(net.minecraft.core.Direction.NORTH);
    }

    @Inject(at = @At("HEAD"), method = "getNearestLookingDirection()Lnet/minecraft/core/Direction;", cancellable = true)
    private void getNearestLookingDirection_1336267379(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1336267379L))
            info.setReturnValue(net.minecraft.core.Direction.SOUTH);
    }

    @Inject(at = @At("HEAD"), method = "replacingClickedOnBlock()Z", cancellable = true)
    private void replacingClickedOnBlock__707349277(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-707349277L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getNearestLookingDirections()[Lnet/minecraft/core/Direction;", cancellable = true)
    private void getNearestLookingDirections_260300441(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(260300441L))
            info.setReturnValue(null);
    }


}
