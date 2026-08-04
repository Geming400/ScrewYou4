package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.LiquidBlock.class)
public class LiquidBlock543483171Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__2015630401(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2015630401L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPickupSound()Ljava/util/Optional;", cancellable = true)
    private void getPickupSound_788944593(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(788944593L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pickupBlock(Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void pickupBlock__2078042212(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2078042212L))
            info.setReturnValue(null);
    }


}
