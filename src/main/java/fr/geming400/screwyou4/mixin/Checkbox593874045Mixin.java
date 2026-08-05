package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.components.Checkbox.class)
public class Checkbox593874045Mixin {
        @Inject(at = @At("HEAD"), method = "builder(Lnet/minecraft/network/chat/Component;Lnet/minecraft/client/gui/Font;)Lnet/minecraft/client/gui/components/Checkbox$Builder;", cancellable = true)
    private static void builder_1596464932(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1596464932L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "adjustWidth(ILnet/minecraft/client/gui/Font;)I", cancellable = true)
    private void adjustWidth__135784146(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-135784146L))
            info.setReturnValue(-197295774);
    }

    @Inject(at = @At("HEAD"), method = "updateWidgetNarration(Lnet/minecraft/client/gui/narration/NarrationElementOutput;)V", cancellable = true)
    private void updateWidgetNarration_1855533531(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1855533531L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "selected()Z", cancellable = true)
    private void selected_632152628(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(632152628L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "extractContents(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V", cancellable = true)
    private void extractContents__365813327(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-365813327L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onPress(Lnet/minecraft/client/input/InputWithModifiers;)V", cancellable = true)
    private void onPress_1531657702(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1531657702L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getBoxSize(Lnet/minecraft/client/gui/Font;)I", cancellable = true)
    private static void getBoxSize__376911425(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-376911425L))
            info.setReturnValue(-1076565153);
    }


}
