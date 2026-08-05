package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.piston.PistonMovingBlockEntity.class)
public class PistonMovingBlockEntity2121913979Mixin {
        @Inject(at = @At("HEAD"), method = "tick(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/piston/PistonMovingBlockEntity;)V", cancellable = true)
    private static void tick__270249064(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-270249064L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setLevel(Lnet/minecraft/world/level/Level;)V", cancellable = true)
    private void setLevel_1116939037(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1116939037L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getDirection()Lnet/minecraft/core/Direction;", cancellable = true)
    private void getDirection_1359058694(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1359058694L))
            info.setReturnValue(net.minecraft.core.Direction.UP);
    }

    @Inject(at = @At("HEAD"), method = "getXOff(F)F", cancellable = true)
    private void getXOff__961922284(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-961922284L))
            info.setReturnValue(4.740117E8F);
    }

    @Inject(at = @At("HEAD"), method = "getYOff(F)F", cancellable = true)
    private void getYOff__961922284(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-961922284L))
            info.setReturnValue(4.740117E8F);
    }

    @Inject(at = @At("HEAD"), method = "getZOff(F)F", cancellable = true)
    private void getZOff__961922284(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-961922284L))
            info.setReturnValue(4.740117E8F);
    }

    @Inject(at = @At("HEAD"), method = "getUpdateTag(Lnet/minecraft/core/HolderLookup$Provider;)Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private void getUpdateTag_955292431(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(955292431L))
            info.setReturnValue(new net.minecraft.nbt.CompoundTag());
    }

    @Inject(at = @At("HEAD"), method = "preRemoveSideEffects(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)V", cancellable = true)
    private void preRemoveSideEffects__396795599(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-396795599L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getCollisionShape(Lnet/minecraft/world/level/BlockGetter;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/phys/shapes/VoxelShape;", cancellable = true)
    private void getCollisionShape__507685372(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-507685372L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getMovedState()Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getMovedState__173844887(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-173844887L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getMovementDirection()Lnet/minecraft/core/Direction;", cancellable = true)
    private void getMovementDirection_1359058694(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1359058694L))
            info.setReturnValue(net.minecraft.core.Direction.UP);
    }

    @Inject(at = @At("HEAD"), method = "isSourcePiston()Z", cancellable = true)
    private void isSourcePiston__2134774734(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2134774734L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getPushDirection()Lnet/minecraft/core/Direction;", cancellable = true)
    private void getPushDirection_1359058694(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1359058694L))
            info.setReturnValue(net.minecraft.core.Direction.UP);
    }

    @Inject(at = @At("HEAD"), method = "isExtending()Z", cancellable = true)
    private void isExtending__2134774734(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2134774734L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getProgress(F)F", cancellable = true)
    private void getProgress__961922284(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-961922284L))
            info.setReturnValue(4.740117E8F);
    }

    @Inject(at = @At("HEAD"), method = "getLastTicked()J", cancellable = true)
    private void getLastTicked__2134790110(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2134790110L))
            info.setReturnValue(-4583002317402424327L);
    }

    @Inject(at = @At("HEAD"), method = "finalTick()V", cancellable = true)
    private void finalTick__2134778578(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2134778578L))
            info.cancel();
    }


}
