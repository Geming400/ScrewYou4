package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.BubbleColumnBlock.class)
public class BubbleColumnBlock628477789Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1930635783(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1930635783L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPickupSound()Ljava/util/Optional;", cancellable = true)
    private void getPickupSound_873939211(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(873939211L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "animateTick(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/RandomSource;)V", cancellable = true)
    private void animateTick_505875708(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(505875708L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "updateColumn(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/state/BlockState;)V", cancellable = true)
    private static void updateColumn__620155942(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-620155942L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "updateColumn(Lnet/minecraft/world/level/block/Block;Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)V", cancellable = true)
    private static void updateColumn_1431547755(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1431547755L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "pickupBlock(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void pickupBlock__1993047594(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1993047594L))
            info.setReturnValue(null);
    }


}
