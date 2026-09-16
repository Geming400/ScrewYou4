package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.context.BlockPlaceContext.class)
public class BlockPlaceContext2086440743Mixin {
        @Inject(at = @At("HEAD"), method = "at(Lnet/minecraft/world/item/context/BlockPlaceContext;Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/Direction;)Lnet/minecraft/world/item/context/BlockPlaceContext;", cancellable = true)
    private static void at_202833589(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(202833589L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getClickedPos()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void getClickedPos__204470171(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-204470171L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canPlace()Z", cancellable = true)
    private void canPlace_23801895(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(23801895L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getNearestLookingDirection()Lnet/minecraft/core/Direction;", cancellable = true)
    private void getNearestLookingDirection_1563575510(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1563575510L))
            info.setReturnValue(net.minecraft.core.Direction.SOUTH);
    }

    @Inject(at = @At("HEAD"), method = "replacingClickedOnBlock()Z", cancellable = true)
    private void replacingClickedOnBlock__480041146(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-480041146L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getNearestLookingVerticalDirection()Lnet/minecraft/core/Direction;", cancellable = true)
    private void getNearestLookingVerticalDirection__1387724160(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1387724160L))
            info.setReturnValue(net.minecraft.core.Direction.UP);
    }

    @Inject(at = @At("HEAD"), method = "getNearestLookingDirections()[Lnet/minecraft/core/Direction;", cancellable = true)
    private void getNearestLookingDirections_487608572(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(487608572L))
            info.setReturnValue(null);
    }


}
