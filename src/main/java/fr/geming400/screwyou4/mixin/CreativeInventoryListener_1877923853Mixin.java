package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.inventory.CreativeInventoryListener.class)
public class CreativeInventoryListener_1877923853Mixin {
        @Inject(at = @At("HEAD"), method = "slotChanged(Lnet/minecraft/world/inventory/AbstractContainerMenu;ILnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void slotChanged_720780576(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(720780576L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "dataChanged(Lnet/minecraft/world/inventory/AbstractContainerMenu;II)V", cancellable = true)
    private void dataChanged__410710916(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-410710916L))
            info.cancel();
    }


}
