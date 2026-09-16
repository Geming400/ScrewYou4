package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.piston.PistonMovingBlockEntity.class)
public class PistonMovingBlockEntity2121913979Mixin {
        @Inject(at = @At("HEAD"), method = "tick(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/piston/PistonMovingBlockEntity;)V", cancellable = true)
    private static void tick_11541019(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(11541019L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setLevel(Lnet/minecraft/world/level/Level;)V", cancellable = true)
    private void setLevel__549765665(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-549765665L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getDirection()Lnet/minecraft/core/Direction;", cancellable = true)
    private void getDirection__1377854065(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1377854065L))
            info.setReturnValue(net.minecraft.core.Direction.WEST);
    }

    @Inject(at = @At("HEAD"), method = "getCollisionShape(Lnet/minecraft/world/level/BlockGetter;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/phys/shapes/VoxelShape;", cancellable = true)
    private void getCollisionShape__170624503(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-170624503L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getMovedState()Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getMovedState__1150458627(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1150458627L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isSourcePiston()Z", cancellable = true)
    private void isSourcePiston_473045812(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(473045812L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getMovementDirection()Lnet/minecraft/core/Direction;", cancellable = true)
    private void getMovementDirection_1589470048(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1589470048L))
            info.setReturnValue(net.minecraft.core.Direction.UP);
    }

    @Inject(at = @At("HEAD"), method = "finalTick()V", cancellable = true)
    private void finalTick__2008700709(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2008700709L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getLastTicked()J", cancellable = true)
    private void getLastTicked__598650886(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-598650886L))
            info.setReturnValue(-1457518860194778004L);
    }

    @Inject(at = @At("HEAD"), method = "getPushDirection()Lnet/minecraft/core/Direction;", cancellable = true)
    private void getPushDirection_380106005(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(380106005L))
            info.setReturnValue(net.minecraft.core.Direction.WEST);
    }

    @Inject(at = @At("HEAD"), method = "isExtending()Z", cancellable = true)
    private void isExtending_879263348(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(879263348L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getProgress(F)F", cancellable = true)
    private void getProgress__1342851977(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1342851977L))
            info.setReturnValue(8622901.0F);
    }

    @Inject(at = @At("HEAD"), method = "getUpdateTag(Lnet/minecraft/core/HolderLookup$Provider;)Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private void getUpdateTag_1543774100(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1543774100L))
            info.setReturnValue(new net.minecraft.nbt.CompoundTag());
    }

    @Inject(at = @At("HEAD"), method = "preRemoveSideEffects(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)V", cancellable = true)
    private void preRemoveSideEffects_1521768277(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1521768277L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getZOff(F)F", cancellable = true)
    private void getZOff_1484560863(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1484560863L))
            info.setReturnValue(8622901.0F);
    }

    @Inject(at = @At("HEAD"), method = "getXOff(F)F", cancellable = true)
    private void getXOff_1877587873(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1877587873L))
            info.setReturnValue(8622901.0F);
    }

    @Inject(at = @At("HEAD"), method = "getYOff(F)F", cancellable = true)
    private void getYOff_1681074368(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1681074368L))
            info.setReturnValue(8622901.0F);
    }


}
