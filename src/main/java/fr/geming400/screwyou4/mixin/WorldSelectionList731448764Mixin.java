package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.worldselection.WorldSelectionList.class)
public class WorldSelectionList731448764Mixin {
        @Inject(at = @At("HEAD"), method = "updateWidgetNarration(Lnet/minecraft/client/gui/narration/NarrationElementOutput;)V", cancellable = true)
    private void updateWidgetNarration_1993108250(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1993108250L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractWidgetRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V", cancellable = true)
    private void extractWidgetRenderState__228238608(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-228238608L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getScreen()Lnet/minecraft/client/gui/screens/Screen;", cancellable = true)
    private void getScreen__1718301304(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1718301304L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setSelected(Lnet/minecraft/client/gui/screens/worldselection/WorldSelectionList$Entry;)V", cancellable = true)
    private void setSelected_1388149679(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1388149679L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setSelected(Lnet/minecraft/client/gui/components/AbstractSelectionList$Entry;)V", cancellable = true)
    private void setSelected__1706041499(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1706041499L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "returnToScreen()V", cancellable = true)
    private void returnToScreen_769723503(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(769723503L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "updateFilter(Ljava/lang/String;)V", cancellable = true)
    private void updateFilter_1883809913(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1883809913L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getSelectedOpt()Ljava/util/Optional;", cancellable = true)
    private void getSelectedOpt_976910186(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(976910186L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "reloadWorldList()V", cancellable = true)
    private void reloadWorldList_769723503(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(769723503L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getRowWidth()I", cancellable = true)
    private void getRowWidth_769711010(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(769711010L))
            info.setReturnValue(1458763954);
    }


}
