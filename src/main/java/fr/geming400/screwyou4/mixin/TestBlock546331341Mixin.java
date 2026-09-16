package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.TestBlock.class)
public class TestBlock546331341Mixin {
        @Inject(at = @At("HEAD"), method = "ownSignal(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/BlockGetter;Lnet/minecraft/core/BlockPos;)I", cancellable = true)
    private void ownSignal_1317254029(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1317254029L))
            info.setReturnValue(1909006730);
    }

    @Inject(at = @At("HEAD"), method = "getStateForPlacement(Lnet/minecraft/world/item/context/BlockPlaceContext;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getStateForPlacement__1922857139(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1922857139L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setModeOnStack(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/level/block/state/properties/TestBlockMode;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private static void setModeOnStack__1324426153(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1324426153L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "newBlockEntity(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)Lnet/minecraft/world/level/block/entity/BlockEntity;", cancellable = true)
    private void newBlockEntity_687906726(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(687906726L))
            info.setReturnValue(null);
    }


}
