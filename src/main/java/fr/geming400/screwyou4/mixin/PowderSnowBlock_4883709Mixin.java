package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.PowderSnowBlock.class)
public class PowderSnowBlock_4883709Mixin {
        @Inject(at = @At("HEAD"), method = "canEntityWalkOnPowderSnow(Lnet/minecraft/world/entity/Entity;)Z", cancellable = true)
    private static void canEntityWalkOnPowderSnow_1921061371(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1921061371L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_1071328962(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1071328962L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPickupSound()Ljava/util/Optional;", cancellable = true)
    private void getPickupSound__1155198361(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1155198361L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pickupBlock(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void pickupBlock__961796316(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-961796316L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fallOn(Lnet/minecraft/world/level/Level;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/entity/Entity;D)V", cancellable = true)
    private void fallOn__2043349850(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2043349850L))
            info.cancel();
    }


}
