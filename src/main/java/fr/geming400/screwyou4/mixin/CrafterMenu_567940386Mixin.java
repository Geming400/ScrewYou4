package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.inventory.CrafterMenu.class)
public class CrafterMenu_567940386Mixin {
        @Inject(at = @At("HEAD"), method = "getContainer()Lnet/minecraft/world/Container;", cancellable = true)
    private void getContainer_337833738(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(337833738L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "stillValid(Lnet/minecraft/world/entity/player/Player;)Z", cancellable = true)
    private void stillValid__1465970785(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1465970785L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "dataChanged(Lnet/minecraft/world/inventory/AbstractContainerMenu;II)V", cancellable = true)
    private void dataChanged_1034573371(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1034573371L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "quickMoveStack(Lnet/minecraft/world/entity/player/Player;I)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void quickMoveStack__754888419(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-754888419L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "slotChanged(Lnet/minecraft/world/inventory/AbstractContainerMenu;ILnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void slotChanged_1758419103(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1758419103L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setSlotState(IZ)V", cancellable = true)
    private void setSlotState_600444532(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(600444532L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isSlotDisabled(I)Z", cancellable = true)
    private void isSlotDisabled__2137035467(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2137035467L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isPowered()Z", cancellable = true)
    private void isPowered__1132047554(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1132047554L))
            info.setReturnValue(true);
    }


}
