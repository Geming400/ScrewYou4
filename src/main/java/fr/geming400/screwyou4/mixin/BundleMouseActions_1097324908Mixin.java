package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.BundleMouseActions.class)
public class BundleMouseActions_1097324908Mixin {
        @Inject(at = @At("HEAD"), method = "matches(Lnet/minecraft/world/inventory/Slot;)Z", cancellable = true)
    private void matches__1821559652(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1821559652L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "onMouseScrolled(DDILnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private void onMouseScrolled__72279022(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-72279022L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "onStopHovering(Lnet/minecraft/world/inventory/Slot;)V", cancellable = true)
    private void onStopHovering__356959612(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-356959612L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onSlotClicked(Lnet/minecraft/world/inventory/Slot;Lnet/minecraft/world/inventory/ContainerInput;)V", cancellable = true)
    private void onSlotClicked__454457629(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-454457629L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "unselectedBundleItem(Lnet/minecraft/world/item/ItemStack;I)V", cancellable = true)
    private void unselectedBundleItem_1874930139(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1874930139L))
            info.cancel();
    }


}
