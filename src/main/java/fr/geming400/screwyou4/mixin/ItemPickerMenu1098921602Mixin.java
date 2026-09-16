package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.inventory.CreativeModeInventoryScreen.ItemPickerMenu.class)
public class ItemPickerMenu1098921602Mixin {
        @Inject(at = @At("HEAD"), method = "canScroll()Z", cancellable = true)
    private void canScroll_597476252(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(597476252L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getCarried()Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void getCarried_747063642(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(747063642L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canDragTo(Lnet/minecraft/world/inventory/Slot;)Z", cancellable = true)
    private void canDragTo_70139303(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(70139303L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "setCarried(Lnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void setCarried__2111900622(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2111900622L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "canTakeItemForPickAll(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/inventory/Slot;)Z", cancellable = true)
    private void canTakeItemForPickAll__1272949174(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1272949174L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "quickMoveStack(Lnet/minecraft/world/entity/player/Player;I)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void quickMoveStack__223907202(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-223907202L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "stillValid(Lnet/minecraft/world/entity/player/Player;)Z", cancellable = true)
    private void stillValid__934989568(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-934989568L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "scrollTo(F)V", cancellable = true)
    private void scrollTo__623637677(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-623637677L))
            info.cancel();
    }


}
