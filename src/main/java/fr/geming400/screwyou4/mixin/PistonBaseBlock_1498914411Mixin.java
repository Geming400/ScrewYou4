package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.piston.PistonBaseBlock.class)
public class PistonBaseBlock_1498914411Mixin {
        @Inject(at = @At("HEAD"), method = "isPushable(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/Direction;ZLnet/minecraft/core/Direction;)Z", cancellable = true)
    private static void isPushable_445696173(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(445696173L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1729607632(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1729607632L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setPlacedBy(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void setPlacedBy__1292057932(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1292057932L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getStateForPlacement(Lnet/minecraft/world/item/context/BlockPlaceContext;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getStateForPlacement__970274070(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-970274070L))
            info.setReturnValue(null);
    }


}
