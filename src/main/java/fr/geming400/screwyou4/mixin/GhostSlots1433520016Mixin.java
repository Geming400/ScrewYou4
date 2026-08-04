package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.recipebook.GhostSlots.class)
public class GhostSlots1433520016Mixin {
        @Inject(at = @At("HEAD"), method = "clear()V", cancellable = true)
    private void clear_1471794755(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1471794755L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;Lnet/minecraft/client/Minecraft;Z)V", cancellable = true)
    private void extractRenderState__1828223482(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1828223482L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractTooltip(Lnet/minecraft/client/gui/GuiGraphicsExtractor;Lnet/minecraft/client/Minecraft;IILnet/minecraft/world/inventory/Slot;)V", cancellable = true)
    private void extractTooltip_2024877719(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2024877719L))
            info.cancel();
    }


}
