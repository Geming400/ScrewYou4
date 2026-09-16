package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.inventory.tooltip.ClientBundleTooltip.class)
public class ClientBundleTooltip542840488Mixin {
        @Inject(at = @At("HEAD"), method = "showTooltipWithItemInHand()Z", cancellable = true)
    private void showTooltipWithItemInHand_725457612(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(725457612L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getWidth(Lnet/minecraft/client/gui/Font;)I", cancellable = true)
    private void getWidth_1073553154(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1073553154L))
            info.setReturnValue(1862877096);
    }

    @Inject(at = @At("HEAD"), method = "extractImage(Lnet/minecraft/client/gui/Font;IIIILnet/minecraft/client/gui/GuiGraphicsExtractor;)V", cancellable = true)
    private void extractImage__1280867374(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1280867374L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getHeight(Lnet/minecraft/client/gui/Font;)I", cancellable = true)
    private void getHeight__2113487729(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2113487729L))
            info.setReturnValue(-928976293);
    }


}
