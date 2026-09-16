package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.phys.BlockHitResult.class)
public class BlockHitResult_1360006543Mixin {
        @Inject(at = @At("HEAD"), method = "getType()Lnet/minecraft/world/phys/HitResult$Type;", cancellable = true)
    private void getType__250376728(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-250376728L))
            info.setReturnValue(net.minecraft.world.phys.HitResult.Type.ENTITY);
    }

    @Inject(at = @At("HEAD"), method = "getDirection()Lnet/minecraft/core/Direction;", cancellable = true)
    private void getDirection__2139761502(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2139761502L))
            info.setReturnValue(net.minecraft.core.Direction.DOWN);
    }

    @Inject(at = @At("HEAD"), method = "withPosition(Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/phys/BlockHitResult;", cancellable = true)
    private void withPosition_1031648518(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1031648518L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBlockPos()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void getBlockPos_2121411250(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2121411250L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "miss(Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/core/Direction;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/phys/BlockHitResult;", cancellable = true)
    private static void miss_672567323(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(672567323L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isInside()Z", cancellable = true)
    private void isInside__1794470593(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1794470593L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "withDirection(Lnet/minecraft/core/Direction;)Lnet/minecraft/world/phys/BlockHitResult;", cancellable = true)
    private void withDirection_1311498486(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1311498486L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isWorldBorderHit()Z", cancellable = true)
    private void isWorldBorderHit_778815110(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(778815110L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "hitBorder()Lnet/minecraft/world/phys/BlockHitResult;", cancellable = true)
    private void hitBorder_1866188452(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1866188452L))
            info.setReturnValue(null);
    }


}
