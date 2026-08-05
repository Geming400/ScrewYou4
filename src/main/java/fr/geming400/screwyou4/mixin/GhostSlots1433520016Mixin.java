package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.recipebook.GhostSlots.class)
public class GhostSlots1433520016Mixin {
        @Inject(at = @At("HEAD"), method = "clear()V", cancellable = true)
    private void clear_647692310(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(647692310L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractTooltip(Lnet/minecraft/client/gui/GuiGraphicsExtractor;Lnet/minecraft/client/Minecraft;IILnet/minecraft/world/inventory/Slot;)V", cancellable = true)
    private void extractTooltip_1872269401(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1872269401L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;Lnet/minecraft/client/Minecraft;Z)V", cancellable = true)
    private void extractRenderState_673566956(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(673566956L))
            info.cancel();
    }


}
