package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.font.TextFieldHelper.class)
public class TextFieldHelper_1161343859Mixin {
        @Inject(at = @At("HEAD"), method = "copy()V", cancellable = true)
    private void copy__1680970800(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1680970800L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "paste()V", cancellable = true)
    private void paste__1536966798(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1536966798L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "moveBy(IZLnet/minecraft/client/gui/font/TextFieldHelper$CursorStep;)V", cancellable = true)
    private void moveBy_505264502(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(505264502L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "selectAll()V", cancellable = true)
    private void selectAll__436078016(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-436078016L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "charTyped(Lnet/minecraft/client/input/CharacterEvent;)Z", cancellable = true)
    private void charTyped__779364626(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-779364626L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "keyPressed(Lnet/minecraft/client/input/KeyEvent;)Z", cancellable = true)
    private void keyPressed_1130290227(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1130290227L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "cut()V", cancellable = true)
    private void cut_1723879715(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1723879715L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getCursorPos()I", cancellable = true)
    private void getCursorPos__44582416(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-44582416L))
            info.setReturnValue(173497390);
    }

    @Inject(at = @At("HEAD"), method = "removeCharsFromCursor(I)V", cancellable = true)
    private void removeCharsFromCursor__183572969(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-183572969L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setSelectionPos(I)V", cancellable = true)
    private void setSelectionPos_871222728(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(871222728L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getSelectionPos()I", cancellable = true)
    private void getSelectionPos_1900559482(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1900559482L))
            info.setReturnValue(1187669785);
    }

    @Inject(at = @At("HEAD"), method = "setSelectionRange(II)V", cancellable = true)
    private void setSelectionRange_1834383826(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1834383826L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setClipboardContents(Lnet/minecraft/client/Minecraft;Ljava/lang/String;)V", cancellable = true)
    private static void setClipboardContents__35228341(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-35228341L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isSelecting()Z", cancellable = true)
    private void isSelecting_690016077(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(690016077L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "moveByChars(I)V", cancellable = true)
    private void moveByChars__975562861(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-975562861L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "moveByChars(IZ)V", cancellable = true)
    private void moveByChars__615155071(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-615155071L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getClipboardContents(Lnet/minecraft/client/Minecraft;)Ljava/lang/String;", cancellable = true)
    private static void getClipboardContents__1632447525(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1632447525L))
            info.setReturnValue("h?UT&ug");
    }

    @Inject(at = @At("HEAD"), method = "moveByWords(I)V", cancellable = true)
    private void moveByWords_1073025375(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1073025375L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "moveByWords(IZ)V", cancellable = true)
    private void moveByWords__1533429195(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1533429195L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setCursorPos(I)V", cancellable = true)
    private void setCursorPos__914811270(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-914811270L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setCursorPos(IZ)V", cancellable = true)
    private void setCursorPos_1268144250(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1268144250L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createClipboardGetter(Lnet/minecraft/client/Minecraft;)Ljava/util/function/Supplier;", cancellable = true)
    private static void createClipboardGetter_109893272(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(109893272L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "removeWordsFromCursor(I)V", cancellable = true)
    private void removeWordsFromCursor_784666851(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(784666851L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setCursorToEnd(Z)V", cancellable = true)
    private void setCursorToEnd_1659921687(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1659921687L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setCursorToEnd()V", cancellable = true)
    private void setCursorToEnd_344752701(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(344752701L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "removeFromCursor(ILnet/minecraft/client/gui/font/TextFieldHelper$CursorStep;)V", cancellable = true)
    private void removeFromCursor_602313610(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(602313610L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setCursorToStart()V", cancellable = true)
    private void setCursorToStart__215045546(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-215045546L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setCursorToStart(Z)V", cancellable = true)
    private void setCursorToStart_1486045214(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1486045214L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createClipboardSetter(Lnet/minecraft/client/Minecraft;)Ljava/util/function/Consumer;", cancellable = true)
    private static void createClipboardSetter__1768191174(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1768191174L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "insertText(Ljava/lang/String;)V", cancellable = true)
    private void insertText__1983068183(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1983068183L))
            info.cancel();
    }


}
