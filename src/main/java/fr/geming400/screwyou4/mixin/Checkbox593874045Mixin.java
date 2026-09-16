package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.components.Checkbox.class)
public class Checkbox593874045Mixin {
        @Inject(at = @At("HEAD"), method = "builder(Lnet/minecraft/network/chat/Component;Lnet/minecraft/client/gui/Font;)Lnet/minecraft/client/gui/components/Checkbox$Builder;", cancellable = true)
    private static void builder__2141913047(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2141913047L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "adjustWidth(ILnet/minecraft/client/gui/Font;)I", cancellable = true)
    private void adjustWidth__2130583529(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2130583529L))
            info.setReturnValue(446011277);
    }

    @Inject(at = @At("HEAD"), method = "selected()Z", cancellable = true)
    private void selected_1997428857(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1997428857L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "updateWidgetNarration(Lnet/minecraft/client/gui/narration/NarrationElementOutput;)V", cancellable = true)
    private void updateWidgetNarration__1029990512(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1029990512L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractContents(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V", cancellable = true)
    private void extractContents_1576067222(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1576067222L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getBoxSize(Lnet/minecraft/client/gui/Font;)I", cancellable = true)
    private static void getBoxSize__357329163(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-357329163L))
            info.setReturnValue(393719619);
    }

    @Inject(at = @At("HEAD"), method = "onPress(Lnet/minecraft/client/input/InputWithModifiers;)V", cancellable = true)
    private void onPress__361763446(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-361763446L))
            info.cancel();
    }


}
