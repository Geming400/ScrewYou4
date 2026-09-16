package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.inventory.SmithingScreen.class)
public class SmithingScreen_1859823977Mixin {
        @Inject(at = @At("HEAD"), method = "containerTick()V", cancellable = true)
    private void containerTick__1094177507(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1094177507L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "slotChanged(Lnet/minecraft/world/inventory/AbstractContainerMenu;ILnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void slotChanged__1244664602(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1244664602L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V", cancellable = true)
    private void extractRenderState__1448263678(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1448263678L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractBackground(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V", cancellable = true)
    private void extractBackground__1033688787(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1033688787L))
            info.cancel();
    }


}
