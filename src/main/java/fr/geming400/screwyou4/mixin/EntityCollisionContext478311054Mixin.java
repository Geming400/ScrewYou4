package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.phys.shapes.EntityCollisionContext.class)
public class EntityCollisionContext478311054Mixin {
        @Inject(at = @At("HEAD"), method = "getEntity()Lnet/minecraft/world/entity/Entity;", cancellable = true)
    private void getEntity__1987767788(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1987767788L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canStandOnFluid(Lnet/minecraft/world/level/material/FluidState;Lnet/minecraft/world/level/material/FluidState;)Z", cancellable = true)
    private void canStandOnFluid_1893197765(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1893197765L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getCollisionShape(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/CollisionGetter;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/phys/shapes/VoxelShape;", cancellable = true)
    private void getCollisionShape__1513535549(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1513535549L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isDescending()Z", cancellable = true)
    private void isDescending_516589637(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(516589637L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isHoldingItem(Lnet/minecraft/world/item/Item;)Z", cancellable = true)
    private void isHoldingItem_2009197982(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2009197982L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isAbove(Lnet/minecraft/world/phys/shapes/VoxelShape;Lnet/minecraft/core/BlockPos;Z)Z", cancellable = true)
    private void isAbove_2001781790(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2001781790L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "alwaysCollideWithFluid()Z", cancellable = true)
    private void alwaysCollideWithFluid_516589637(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(516589637L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isPlacement()Z", cancellable = true)
    private void isPlacement_516589637(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(516589637L))
            info.setReturnValue(null);
    }


}
