package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.context.DirectionalPlaceContext.class)
public class DirectionalPlaceContext1859132612Mixin {
        @Inject(at = @At("HEAD"), method = "getRotation()F", cancellable = true)
    private void getRotation_1897391975(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1897391975L))
            info.setReturnValue(8.18229E7F);
    }

    @Inject(at = @At("HEAD"), method = "getClickedPos()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void getClickedPos__34254267(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-34254267L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isSecondaryUseActive()Z", cancellable = true)
    private void isSecondaryUseActive_1897411195(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1897411195L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getNearestLookingDirections()[Lnet/minecraft/core/Direction;", cancellable = true)
    private void getNearestLookingDirections_611864520(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(611864520L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getHorizontalDirection()Lnet/minecraft/core/Direction;", cancellable = true)
    private void getHorizontalDirection_1096277327(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1096277327L))
            info.setReturnValue(net.minecraft.core.Direction.NORTH);
    }

    @Inject(at = @At("HEAD"), method = "getNearestLookingDirection()Lnet/minecraft/core/Direction;", cancellable = true)
    private void getNearestLookingDirection_1096277327(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1096277327L))
            info.setReturnValue(net.minecraft.core.Direction.NORTH);
    }

    @Inject(at = @At("HEAD"), method = "canPlace()Z", cancellable = true)
    private void canPlace_1897411195(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1897411195L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "replacingClickedOnBlock()Z", cancellable = true)
    private void replacingClickedOnBlock_1897411195(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1897411195L))
            info.setReturnValue(true);
    }


}
