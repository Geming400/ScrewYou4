package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.TripWireHookBlock.class)
public class TripWireHookBlock_990710414Mixin {
        @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1568403159(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1568403159L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStateForPlacement(Lnet/minecraft/world/item/context/BlockPlaceContext;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getStateForPlacement__267889354(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-267889354L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setPlacedBy(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void setPlacedBy__1576824735(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1576824735L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "calculateState(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;ZZILnet/minecraft/world/level/block/state/BlockState;)V", cancellable = true)
    private static void calculateState_1007760044(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1007760044L))
            info.cancel();
    }


}
