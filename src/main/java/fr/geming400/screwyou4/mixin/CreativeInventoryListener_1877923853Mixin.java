package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.inventory.CreativeInventoryListener.class)
public class CreativeInventoryListener_1877923853Mixin {
        @Inject(at = @At("HEAD"), method = "dataChanged(Lnet/minecraft/world/inventory/AbstractContainerMenu;II)V", cancellable = true)
    private void dataChanged__1950410458(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1950410458L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "slotChanged(Lnet/minecraft/world/inventory/AbstractContainerMenu;ILnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void slotChanged__1226564726(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1226564726L))
            info.cancel();
    }


}
