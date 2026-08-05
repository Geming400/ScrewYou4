package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.inventory.AnvilScreen.class)
public class AnvilScreen_1731821174Mixin {
        @Inject(at = @At("HEAD"), method = "resize(II)V", cancellable = true)
    private void resize_735941704(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(735941704L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractBackground(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V", cancellable = true)
    private void extractBackground_772133801(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(772133801L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "slotChanged(Lnet/minecraft/world/inventory/AbstractContainerMenu;ILnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void slotChanged_574677897(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(574677897L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "keyPressed(Lnet/minecraft/client/input/KeyEvent;)Z", cancellable = true)
    private void keyPressed_815185459(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(815185459L))
            info.setReturnValue(false);
    }


}
