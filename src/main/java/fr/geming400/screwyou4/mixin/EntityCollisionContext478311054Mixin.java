package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.phys.shapes.EntityCollisionContext.class)
public class EntityCollisionContext478311054Mixin {
        @Inject(at = @At("HEAD"), method = "canStandOnFluid(Lnet/minecraft/world/level/material/FluidState;Lnet/minecraft/world/level/material/FluidState;)Z", cancellable = true)
    private void canStandOnFluid__1508709568(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1508709568L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getCollisionShape(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/CollisionGetter;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/phys/shapes/VoxelShape;", cancellable = true)
    private void getCollisionShape_222500360(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(222500360L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isDescending()Z", cancellable = true)
    private void isDescending_1222994371(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1222994371L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getEntity()Lnet/minecraft/world/entity/Entity;", cancellable = true)
    private void getEntity_1815509275(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1815509275L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isHoldingItem(Lnet/minecraft/world/item/Item;)Z", cancellable = true)
    private void isHoldingItem__1939844982(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1939844982L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isPlacement()Z", cancellable = true)
    private void isPlacement__1286011830(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1286011830L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isAbove(Lnet/minecraft/world/phys/shapes/VoxelShape;Lnet/minecraft/core/BlockPos;Z)Z", cancellable = true)
    private void isAbove_1389130539(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1389130539L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "alwaysCollideWithFluid()Z", cancellable = true)
    private void alwaysCollideWithFluid__552759504(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-552759504L))
            info.setReturnValue(true);
    }


}
