package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.state.gui.GuiRenderState.class)
public class GuiRenderState658491334Mixin {
        @Inject(at = @At("HEAD"), method = "reset()V", cancellable = true)
    private void reset__1070945654(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1070945654L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "up()V", cancellable = true)
    private void up_366979262(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(366979262L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "forEachItem(Ljava/util/function/Consumer;)V", cancellable = true)
    private void forEachItem_2001689984(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2001689984L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "forEachPictureInPicture(Ljava/util/function/Consumer;)V", cancellable = true)
    private void forEachPictureInPicture__1053917656(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1053917656L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "sortElements(Ljava/util/Comparator;)V", cancellable = true)
    private void sortElements__2072916707(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2072916707L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "forEachElement(Ljava/util/function/Consumer;Lnet/minecraft/client/renderer/state/gui/GuiRenderState$TraverseRange;)V", cancellable = true)
    private void forEachElement_352567759(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(352567759L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getItemModelIdentities()Ljava/util/Set;", cancellable = true)
    private void getItemModelIdentities_370444620(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(370444620L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addBlitToCurrentLayer(Lnet/minecraft/client/renderer/state/gui/BlitRenderState;)V", cancellable = true)
    private void addBlitToCurrentLayer_952839073(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(952839073L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "forEachText(Ljava/util/function/Consumer;)V", cancellable = true)
    private void forEachText__274390758(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-274390758L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "nextStratum()V", cancellable = true)
    private void nextStratum_1664693968(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1664693968L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addPicturesInPictureState(Lnet/minecraft/client/renderer/state/gui/pip/PictureInPictureRenderState;)V", cancellable = true)
    private void addPicturesInPictureState_522801764(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(522801764L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "blurBeforeThisStratum()V", cancellable = true)
    private void blurBeforeThisStratum__2013135647(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2013135647L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addGuiElement(Lnet/minecraft/client/renderer/state/gui/GuiElementRenderState;)V", cancellable = true)
    private void addGuiElement__1231744090(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1231744090L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addGlyphToCurrentLayer(Lnet/minecraft/client/renderer/state/gui/GuiElementRenderState;)V", cancellable = true)
    private void addGlyphToCurrentLayer__435918782(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-435918782L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addText(Lnet/minecraft/client/renderer/state/gui/GuiTextRenderState;)V", cancellable = true)
    private void addText_361372889(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(361372889L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addItem(Lnet/minecraft/client/renderer/state/gui/GuiItemRenderState;)V", cancellable = true)
    private void addItem__127894119(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-127894119L))
            info.cancel();
    }


}
