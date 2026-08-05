package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.inventory.SmithingScreen.class)
public class SmithingScreen_1859823977Mixin {
        @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V", cancellable = true)
    private void extractRenderState_900136604(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(900136604L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "slotChanged(Lnet/minecraft/world/inventory/AbstractContainerMenu;ILnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void slotChanged_702680700(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(702680700L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "containerTick()V", cancellable = true)
    private void containerTick_1898098715(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1898098715L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractBackground(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V", cancellable = true)
    private void extractBackground_900136604(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(900136604L))
            info.cancel();
    }


}
