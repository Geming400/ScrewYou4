package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.components.MultilineTextField.class)
public class MultilineTextField_1783861734Mixin {
        @Inject(at = @At("HEAD"), method = "value()Ljava/lang/String;", cancellable = true)
    private void value_648401262(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(648401262L))
            info.setReturnValue("v\uD6FCdyaOM]>7uT*x{TR:I:y#\u5735");
    }

    @Inject(at = @At("HEAD"), method = "setValue(Ljava/lang/String;)V", cancellable = true)
    private void setValue__1358744414(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1358744414L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setValue(Ljava/lang/String;Z)V", cancellable = true)
    private void setValue__1104548392(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1104548392L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "cursor()I", cancellable = true)
    private void cursor_1822123979(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1822123979L))
            info.setReturnValue(-31376399);
    }

    @Inject(at = @At("HEAD"), method = "keyPressed(Lnet/minecraft/client/input/KeyEvent;)Z", cancellable = true)
    private void keyPressed_867226019(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(867226019L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getLineCount()I", cancellable = true)
    private void getLineCount_1822123979(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1822123979L))
            info.setReturnValue(-31376399);
    }

    @Inject(at = @At("HEAD"), method = "setCharacterLimit(I)V", cancellable = true)
    private void setCharacterLimit__1297188591(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1297188591L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setSelecting(Z)V", cancellable = true)
    private void setSelecting__1281488734(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1281488734L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hasSelection()Z", cancellable = true)
    private void hasSelection_1822140316(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1822140316L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "seekCursorLine(I)V", cancellable = true)
    private void seekCursorLine__1297188591(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1297188591L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setValueListener(Ljava/util/function/Consumer;)V", cancellable = true)
    private void setValueListener__1830089150(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1830089150L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "characterLimit()I", cancellable = true)
    private void characterLimit_1822123979(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1822123979L))
            info.setReturnValue(-31376399);
    }

    @Inject(at = @At("HEAD"), method = "hasCharacterLimit()Z", cancellable = true)
    private void hasCharacterLimit_1822140316(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1822140316L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getLineView(I)Lnet/minecraft/client/gui/components/MultilineTextField$StringView;", cancellable = true)
    private void getLineView__339278467(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-339278467L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPreviousWord()Lnet/minecraft/client/gui/components/MultilineTextField$StringView;", cancellable = true)
    private void getPreviousWord_1199089476(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1199089476L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "iterateLines()Ljava/lang/Iterable;", cancellable = true)
    private void iterateLines__225887955(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-225887955L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSelectedText()Ljava/lang/String;", cancellable = true)
    private void getSelectedText_648401262(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(648401262L))
            info.setReturnValue("v\uD6FCdyaOM]>7uT*x{TR:I:y#\u5735");
    }

    @Inject(at = @At("HEAD"), method = "getNextWord()Lnet/minecraft/client/gui/components/MultilineTextField$StringView;", cancellable = true)
    private void getNextWord_1199089476(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1199089476L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setCursorListener(Ljava/lang/Runnable;)V", cancellable = true)
    private void setCursorListener__1054363882(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1054363882L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "selectWordAtCursor()V", cancellable = true)
    private void selectWordAtCursor_1822136472(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1822136472L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getLineAtCursor()I", cancellable = true)
    private void getLineAtCursor_1822123979(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1822123979L))
            info.setReturnValue(-31376399);
    }

    @Inject(at = @At("HEAD"), method = "seekCursorToPoint(DD)V", cancellable = true)
    private void seekCursorToPoint_640218904(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(640218904L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setLineLimit(I)V", cancellable = true)
    private void setLineLimit__1297188591(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1297188591L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hasLineLimit()Z", cancellable = true)
    private void hasLineLimit_1822140316(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1822140316L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "insertText(Ljava/lang/String;)V", cancellable = true)
    private void insertText__1358744414(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1358744414L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "deleteText(I)V", cancellable = true)
    private void deleteText__1297188591(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1297188591L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "seekCursor(Lnet/minecraft/client/gui/components/Whence;I)V", cancellable = true)
    private void seekCursor__151403949(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-151403949L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getSelected()Lnet/minecraft/client/gui/components/MultilineTextField$StringView;", cancellable = true)
    private void getSelected_1199089476(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1199089476L))
            info.setReturnValue(null);
    }


}
