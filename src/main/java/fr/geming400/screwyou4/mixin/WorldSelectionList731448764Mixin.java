package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.worldselection.WorldSelectionList.class)
public class WorldSelectionList731448764Mixin {
        @Inject(at = @At("HEAD"), method = "getSelectedOpt()Ljava/util/Optional;", cancellable = true)
    private void getSelectedOpt_1067004492(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1067004492L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "returnToScreen()V", cancellable = true)
    private void returnToScreen__77603144(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-77603144L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "updateFilter(Ljava/lang/String;)V", cancellable = true)
    private void updateFilter_627535288(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(627535288L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "reloadWorldList()V", cancellable = true)
    private void reloadWorldList__237370088(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-237370088L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setSelected(Lnet/minecraft/client/gui/components/AbstractSelectionList$Entry;)V", cancellable = true)
    private void setSelected__2107441470(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2107441470L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setSelected(Lnet/minecraft/client/gui/screens/worldselection/WorldSelectionList$Entry;)V", cancellable = true)
    private void setSelected_1936413938(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1936413938L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "updateWidgetNarration(Lnet/minecraft/client/gui/narration/NarrationElementOutput;)V", cancellable = true)
    private void updateWidgetNarration__892415793(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-892415793L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractWidgetRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V", cancellable = true)
    private void extractWidgetRenderState_1819133178(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1819133178L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getRowWidth()I", cancellable = true)
    private void getRowWidth__1061772448(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1061772448L))
            info.setReturnValue(1593911821);
    }

    @Inject(at = @At("HEAD"), method = "getScreen()Lnet/minecraft/client/gui/screens/Screen;", cancellable = true)
    private void getScreen__1770978970(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1770978970L))
            info.setReturnValue(null);
    }


}
