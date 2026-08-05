package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.phys.BlockHitResult.class)
public class BlockHitResult_1360006543Mixin {
        @Inject(at = @At("HEAD"), method = "getType()Lnet/minecraft/world/phys/HitResult$Type;", cancellable = true)
    private void getType__1667053672(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1667053672L))
            info.setReturnValue(net.minecraft.world.phys.HitResult.Type.ENTITY);
    }

    @Inject(at = @At("HEAD"), method = "getDirection()Lnet/minecraft/core/Direction;", cancellable = true)
    private void getDirection_597151257(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(597151257L))
            info.setReturnValue(net.minecraft.core.Direction.NORTH);
    }

    @Inject(at = @At("HEAD"), method = "miss(Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/core/Direction;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/phys/BlockHitResult;", cancellable = true)
    private static void miss_1823361175(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1823361175L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isInside()Z", cancellable = true)
    private void isInside_1398285125(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1398285125L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getBlockPos()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void getBlockPos__533380337(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-533380337L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withPosition(Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/phys/BlockHitResult;", cancellable = true)
    private void withPosition__1355764809(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1355764809L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withDirection(Lnet/minecraft/core/Direction;)Lnet/minecraft/world/phys/BlockHitResult;", cancellable = true)
    private void withDirection__1172426769(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1172426769L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isWorldBorderHit()Z", cancellable = true)
    private void isWorldBorderHit_1398285125(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1398285125L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "hitBorder()Lnet/minecraft/world/phys/BlockHitResult;", cancellable = true)
    private void hitBorder__1618023965(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1618023965L))
            info.setReturnValue(null);
    }


}
