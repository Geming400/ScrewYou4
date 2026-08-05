package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.TestBlock.class)
public class TestBlock546331341Mixin {
        @Inject(at = @At("HEAD"), method = "newBlockEntity(Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)Lnet/minecraft/world/level/block/entity/BlockEntity;", cancellable = true)
    private void newBlockEntity__1039146314(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1039146314L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "ownSignal(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/BlockGetter;Lnet/minecraft/core/BlockPos;)I", cancellable = true)
    private void ownSignal__1847686629(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1847686629L))
            info.setReturnValue(-572653118);
    }

    @Inject(at = @At("HEAD"), method = "setModeOnStack(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/level/block/state/properties/TestBlockMode;)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private static void setModeOnStack__1981522093(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1981522093L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStateForPlacement(Lnet/minecraft/world/item/context/BlockPlaceContext;)Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getStateForPlacement__712268426(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-712268426L))
            info.setReturnValue(null);
    }


}
