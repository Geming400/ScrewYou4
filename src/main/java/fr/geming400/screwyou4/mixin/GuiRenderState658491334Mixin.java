package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.state.gui.GuiRenderState.class)
public class GuiRenderState658491334Mixin {
        @Inject(at = @At("HEAD"), method = "reset()V", cancellable = true)
    private void reset_696766073(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(696766073L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "up()V", cancellable = true)
    private void up_696766073(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(696766073L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addItem(Lnet/minecraft/client/renderer/state/gui/GuiItemRenderState;)V", cancellable = true)
    private void addItem_162472557(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(162472557L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addGlyphToCurrentLayer(Lnet/minecraft/client/renderer/state/gui/GuiElementRenderState;)V", cancellable = true)
    private void addGlyphToCurrentLayer_1066940388(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1066940388L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "forEachItem(Ljava/util/function/Consumer;)V", cancellable = true)
    private void forEachItem_1339507747(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1339507747L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addBlitToCurrentLayer(Lnet/minecraft/client/renderer/state/gui/BlitRenderState;)V", cancellable = true)
    private void addBlitToCurrentLayer_1068035864(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1068035864L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "sortElements(Ljava/util/Comparator;)V", cancellable = true)
    private void sortElements_70365938(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(70365938L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "forEachElement(Ljava/util/function/Consumer;Lnet/minecraft/client/renderer/state/gui/GuiRenderState$TraverseRange;)V", cancellable = true)
    private void forEachElement_1115174557(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1115174557L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getItemModelIdentities()Ljava/util/Set;", cancellable = true)
    private void getItemModelIdentities__1170544152(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1170544152L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "forEachPictureInPicture(Ljava/util/function/Consumer;)V", cancellable = true)
    private void forEachPictureInPicture_1339507747(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1339507747L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addGuiElement(Lnet/minecraft/client/renderer/state/gui/GuiElementRenderState;)V", cancellable = true)
    private void addGuiElement_1066940388(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1066940388L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "blurBeforeThisStratum()V", cancellable = true)
    private void blurBeforeThisStratum_696766073(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(696766073L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "forEachText(Ljava/util/function/Consumer;)V", cancellable = true)
    private void forEachText_1339507747(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1339507747L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "nextStratum()V", cancellable = true)
    private void nextStratum_696766073(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(696766073L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addPicturesInPictureState(Lnet/minecraft/client/renderer/state/gui/pip/PictureInPictureRenderState;)V", cancellable = true)
    private void addPicturesInPictureState__851327402(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-851327402L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "addText(Lnet/minecraft/client/renderer/state/gui/GuiTextRenderState;)V", cancellable = true)
    private void addText__1138722681(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1138722681L))
            info.cancel();
    }


}
