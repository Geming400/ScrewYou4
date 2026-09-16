package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.inventory.AnvilScreen.class)
public class AnvilScreen_1731821174Mixin {
        @Inject(at = @At("HEAD"), method = "resize(II)V", cancellable = true)
    private void resize_614204692(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(614204692L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "slotChanged(Lnet/minecraft/world/inventory/AbstractContainerMenu;ILnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void slotChanged__1372667405(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1372667405L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractBackground(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V", cancellable = true)
    private void extractBackground__1161691590(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1161691590L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "keyPressed(Lnet/minecraft/client/input/KeyEvent;)Z", cancellable = true)
    private void keyPressed_1700767542(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1700767542L))
            info.setReturnValue(true);
    }


}
