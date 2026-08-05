package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.phys.shapes.PositionCollisionContext.class)
public class PositionCollisionContext1659162324Mixin {
        @Inject(at = @At("HEAD"), method = "getCollisionShape(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/CollisionGetter;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/phys/shapes/VoxelShape;", cancellable = true)
    private void getCollisionShape__332684279(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-332684279L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isDescending()Z", cancellable = true)
    private void isDescending_1697440907(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1697440907L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "canStandOnFluid(Lnet/minecraft/world/level/material/FluidState;Lnet/minecraft/world/level/material/FluidState;)Z", cancellable = true)
    private void canStandOnFluid__1220918261(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1220918261L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "alwaysCollideWithFluid()Z", cancellable = true)
    private void alwaysCollideWithFluid_1697440907(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1697440907L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isHoldingItem(Lnet/minecraft/world/item/Item;)Z", cancellable = true)
    private void isHoldingItem__1104918044(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1104918044L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isAbove(Lnet/minecraft/world/phys/shapes/VoxelShape;Lnet/minecraft/core/BlockPos;Z)Z", cancellable = true)
    private void isAbove__1112334236(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1112334236L))
            info.setReturnValue(false);
    }


}
