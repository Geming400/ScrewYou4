package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.piston.PistonBaseBlock.class)
public class PistonBaseBlock_1498914411Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1060199162(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1060199162L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isPushable(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/Direction;ZLnet/minecraft/core/Direction;)Z", cancellable = true)
    private static void isPushable_867779951(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(867779951L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getStateForPlacement(Lnet/minecraft/world/item/context/BlockPlaceContext;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getStateForPlacement_240314643(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(240314643L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setPlacedBy(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void setPlacedBy__1068620738(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1068620738L))
            info.cancel();
    }


}
