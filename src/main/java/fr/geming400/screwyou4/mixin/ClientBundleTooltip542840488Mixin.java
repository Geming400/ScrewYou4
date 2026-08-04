package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.inventory.tooltip.ClientBundleTooltip.class)
public class ClientBundleTooltip542840488Mixin {
        @Inject(at = @At("HEAD"), method = "showTooltipWithItemInHand()Z", cancellable = true)
    private void showTooltipWithItemInHand_581119071(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(581119071L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getWidth(Lnet/minecraft/client/gui/Font;)I", cancellable = true)
    private void getWidth__427945230(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-427945230L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "extractImage(Lnet/minecraft/client/gui/Font;IIIILnet/minecraft/client/gui/GuiGraphicsExtractor;)V", cancellable = true)
    private void extractImage_221159020(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(221159020L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getHeight(Lnet/minecraft/client/gui/Font;)I", cancellable = true)
    private void getHeight__427945230(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-427945230L))
            info.setReturnValue(null);
    }


}
