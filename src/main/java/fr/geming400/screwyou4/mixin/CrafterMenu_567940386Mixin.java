package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.inventory.CrafterMenu.class)
public class CrafterMenu_567940386Mixin {
        @Inject(at = @At("HEAD"), method = "getContainer()Lnet/minecraft/world/Container;", cancellable = true)
    private void getContainer_1997609141(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1997609141L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "dataChanged(Lnet/minecraft/world/inventory/AbstractContainerMenu;II)V", cancellable = true)
    private void dataChanged__1720694383(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1720694383L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "slotChanged(Lnet/minecraft/world/inventory/AbstractContainerMenu;ILnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void slotChanged__589202891(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-589202891L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "quickMoveStack(Lnet/minecraft/world/entity/player/Player;I)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void quickMoveStack_1441636135(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1441636135L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isSlotDisabled(I)Z", cancellable = true)
    private void isSlotDisabled_1781861201(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1781861201L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "setSlotState(IZ)V", cancellable = true)
    private void setSlotState__412239227(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-412239227L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "stillValid(Lnet/minecraft/world/entity/player/Player;)Z", cancellable = true)
    private void stillValid_1508545875(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1508545875L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isPowered()Z", cancellable = true)
    private void isPowered_606218968(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(606218968L))
            info.setReturnValue(true);
    }


}
