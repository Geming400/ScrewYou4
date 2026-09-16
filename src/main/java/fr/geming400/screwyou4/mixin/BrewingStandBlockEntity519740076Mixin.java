package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.block.entity.BrewingStandBlockEntity.class)
public class BrewingStandBlockEntity519740076Mixin {
        @Inject(at = @At("HEAD"), method = "getContainerSize()I", cancellable = true)
    private void getContainerSize__1536024666(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1536024666L))
            info.setReturnValue(58700160);
    }

    @Inject(at = @At("HEAD"), method = "serverTick(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/block/entity/BrewingStandBlockEntity;)V", cancellable = true)
    private static void serverTick_8225038(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(8225038L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canPlaceItem(ILnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void canPlaceItem_714249419(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(714249419L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getSlotsForFace(Lnet/minecraft/core/Direction;)[I", cancellable = true)
    private void getSlotsForFace__1798837068(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1798837068L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canPlaceItemThroughFace(ILnet/minecraft/world/item/ItemStack;Lnet/minecraft/core/Direction;)Z", cancellable = true)
    private void canPlaceItemThroughFace_1603384741(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1603384741L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "canTakeItemThroughFace(ILnet/minecraft/world/item/ItemStack;Lnet/minecraft/core/Direction;)Z", cancellable = true)
    private void canTakeItemThroughFace_1559868485(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1559868485L))
            info.setReturnValue(true);
    }


}
