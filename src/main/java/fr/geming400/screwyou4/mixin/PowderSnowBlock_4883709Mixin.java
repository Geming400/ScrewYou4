package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.PowderSnowBlock.class)
public class PowderSnowBlock_4883709Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_1740737432(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1740737432L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPickupSound()Ljava/util/Optional;", cancellable = true)
    private void getPickupSound_250345130(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(250345130L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fallOn(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/entity/Entity;D)V", cancellable = true)
    private void fallOn_1378688544(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1378688544L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canEntityWalkOnPowderSnow(Lnet/minecraft/world/entity/Entity;)Z", cancellable = true)
    private static void canEntityWalkOnPowderSnow__446836860(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-446836860L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pickupBlock(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void pickupBlock_1678325621(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1678325621L))
            info.setReturnValue(null);
    }


}
