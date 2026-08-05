package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.BundleMouseActions.class)
public class BundleMouseActions_1097324908Mixin {
        @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/inventory/Slot;)Z", cancellable = true)
    private void matches__1456207761(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1456207761L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "onStopHovering(Lnet/minecraft/world/inventory/Slot;)V", cancellable = true)
    private void onStopHovering__1456211605(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1456211605L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onSlotClicked(Lnet/minecraft/world/inventory/Slot;Lnet/minecraft/world/inventory/ContainerInput;)V", cancellable = true)
    private void onSlotClicked_334908173(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(334908173L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "unselectedBundleItem(Lnet/minecraft/world/item/ItemStack;I)V", cancellable = true)
    private void unselectedBundleItem__939379950(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-939379950L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onMouseScrolled(DDILnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void onMouseScrolled_446974656(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(446974656L))
            info.setReturnValue(true);
    }


}
