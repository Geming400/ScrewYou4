package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.phys.shapes.PositionCollisionContext.class)
public class PositionCollisionContext1659162324Mixin {
        @Inject(at = @At("HEAD"), method = "canStandOnFluid(Lnet/minecraft/world/level/material/FluidState;Lnet/minecraft/world/level/material/FluidState;)Z", cancellable = true)
    private void canStandOnFluid__327858298(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-327858298L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isDescending()Z", cancellable = true)
    private void isDescending__1891121655(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1891121655L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getCollisionShape(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/CollisionGetter;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/phys/shapes/VoxelShape;", cancellable = true)
    private void getCollisionShape_1403351630(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1403351630L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isHoldingItem(Lnet/minecraft/world/item/Item;)Z", cancellable = true)
    private void isHoldingItem__758993712(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-758993712L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isAbove(Lnet/minecraft/world/phys/shapes/VoxelShape;Lnet/minecraft/core/BlockPos;Z)Z", cancellable = true)
    private void isAbove__1724985487(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1724985487L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "alwaysCollideWithFluid()Z", cancellable = true)
    private void alwaysCollideWithFluid_628091766(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(628091766L))
            info.setReturnValue(false);
    }


}
