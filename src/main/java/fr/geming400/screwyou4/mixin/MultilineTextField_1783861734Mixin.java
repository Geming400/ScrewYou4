package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.components.MultilineTextField.class)
public class MultilineTextField_1783861734Mixin {
        @Inject(at = @At("HEAD"), method = "value()Ljava/lang/String;", cancellable = true)
    private void value_2080655391(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2080655391L))
            info.setReturnValue("Lj}BH34\u889E/b$HC?\u1DCC9\uB7FC(Fn,|");
    }

    @Inject(at = @At("HEAD"), method = "setValue(Ljava/lang/String;Z)V", cancellable = true)
    private void setValue__947231993(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-947231993L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setValue(Ljava/lang/String;)V", cancellable = true)
    private void setValue_1278729619(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1278729619L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "cursor()I", cancellable = true)
    private void cursor_161086005(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(161086005L))
            info.setReturnValue(301464592);
    }

    @Inject(at = @At("HEAD"), method = "deleteText(I)V", cancellable = true)
    private void deleteText_841937033(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(841937033L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "seekCursor(Lnet/minecraft/client/gui/components/Whence;I)V", cancellable = true)
    private void seekCursor__871448895(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-871448895L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "keyPressed(Lnet/minecraft/client/input/KeyEvent;)Z", cancellable = true)
    private void keyPressed_1752808102(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1752808102L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getSelected()Lnet/minecraft/client/gui/components/MultilineTextField$StringView;", cancellable = true)
    private void getSelected_829979155(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(829979155L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getLineCount()I", cancellable = true)
    private void getLineCount__1195417562(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1195417562L))
            info.setReturnValue(1813907959);
    }

    @Inject(at = @At("HEAD"), method = "hasSelection()Z", cancellable = true)
    private void hasSelection_1200035530(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1200035530L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "hasCharacterLimit()Z", cancellable = true)
    private void hasCharacterLimit_1897520080(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1897520080L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "setValueListener(Ljava/util/function/Consumer;)V", cancellable = true)
    private void setValueListener_1024207237(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1024207237L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "characterLimit()I", cancellable = true)
    private void characterLimit__1402359559(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1402359559L))
            info.setReturnValue(-116372070);
    }

    @Inject(at = @At("HEAD"), method = "getLineAtCursor()I", cancellable = true)
    private void getLineAtCursor_289512376(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(289512376L))
            info.setReturnValue(-1427334941);
    }

    @Inject(at = @At("HEAD"), method = "setCharacterLimit(I)V", cancellable = true)
    private void setCharacterLimit__1798815451(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1798815451L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setCursorListener(Ljava/lang/Runnable;)V", cancellable = true)
    private void setCursorListener_140811626(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(140811626L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hasLineLimit()Z", cancellable = true)
    private void hasLineLimit__21467889(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-21467889L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "setLineLimit(I)V", cancellable = true)
    private void setLineLimit__89624778(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-89624778L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "selectWordAtCursor()V", cancellable = true)
    private void selectWordAtCursor__1534917559(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1534917559L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setSelecting(Z)V", cancellable = true)
    private void setSelecting__227426106(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-227426106L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "seekCursorLine(I)V", cancellable = true)
    private void seekCursorLine_2022752403(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2022752403L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getLineView(I)Lnet/minecraft/client/gui/components/MultilineTextField$StringView;", cancellable = true)
    private void getLineView__1325862740(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1325862740L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "iterateLines()Ljava/lang/Iterable;", cancellable = true)
    private void iterateLines__2132513582(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2132513582L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "seekCursorToPoint(DD)V", cancellable = true)
    private void seekCursorToPoint__1536874191(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1536874191L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getSelectedText()Ljava/lang/String;", cancellable = true)
    private void getSelectedText__1801572404(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1801572404L))
            info.setReturnValue("@\"\uC4D4lzrtW&<e\u06FA\u5C47 r[{U>Ug\u8CCD6&M\u00D5oJ#|3*g\u0350NTE");
    }

    @Inject(at = @At("HEAD"), method = "getPreviousWord()Lnet/minecraft/client/gui/components/MultilineTextField$StringView;", cancellable = true)
    private void getPreviousWord__521792947(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-521792947L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getNextWord()Lnet/minecraft/client/gui/components/MultilineTextField$StringView;", cancellable = true)
    private void getNextWord_569475537(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(569475537L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "insertText(Ljava/lang/String;)V", cancellable = true)
    private void insertText__1360550308(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1360550308L))
            info.cancel();
    }


}
