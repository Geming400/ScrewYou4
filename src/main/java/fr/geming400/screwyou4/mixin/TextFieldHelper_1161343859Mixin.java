package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.font.TextFieldHelper.class)
public class TextFieldHelper_1161343859Mixin {
        @Inject(at = @At("HEAD"), method = "copy()V", cancellable = true)
    private void copy_1199618597(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1199618597L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "cut()V", cancellable = true)
    private void cut_1199618597(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1199618597L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "keyPressed(Lnet/minecraft/client/input/KeyEvent;)Z", cancellable = true)
    private void keyPressed_244708144(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(244708144L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "charTyped(Lnet/minecraft/client/input/CharacterEvent;)Z", cancellable = true)
    private void charTyped__925297606(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-925297606L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getCursorPos()I", cancellable = true)
    private void getCursorPos_1199606104(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1199606104L))
            info.setReturnValue(-744192896);
    }

    @Inject(at = @At("HEAD"), method = "insertText(Ljava/lang/String;)V", cancellable = true)
    private void insertText__1981262289(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1981262289L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "paste()V", cancellable = true)
    private void paste_1199618597(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1199618597L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "moveBy(IZLnet/minecraft/client/gui/font/TextFieldHelper$CursorStep;)V", cancellable = true)
    private void moveBy__270365570(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-270365570L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "selectAll()V", cancellable = true)
    private void selectAll_1199618597(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1199618597L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setSelectionPos(I)V", cancellable = true)
    private void setSelectionPos__1919706466(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1919706466L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isSelecting()Z", cancellable = true)
    private void isSelecting_1199622441(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1199622441L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "setSelectionRange(II)V", cancellable = true)
    private void setSelectionRange_165464389(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(165464389L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getSelectionPos()I", cancellable = true)
    private void getSelectionPos_1199606104(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1199606104L))
            info.setReturnValue(-744192896);
    }

    @Inject(at = @At("HEAD"), method = "removeCharsFromCursor(I)V", cancellable = true)
    private void removeCharsFromCursor__1919706466(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1919706466L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setCursorToEnd(Z)V", cancellable = true)
    private void setCursorToEnd__1904006609(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1904006609L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setCursorToEnd()V", cancellable = true)
    private void setCursorToEnd_1199618597(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1199618597L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setCursorToStart()V", cancellable = true)
    private void setCursorToStart_1199618597(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1199618597L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setCursorToStart(Z)V", cancellable = true)
    private void setCursorToStart__1904006609(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1904006609L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "moveByChars(I)V", cancellable = true)
    private void moveByChars__1919706466(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1919706466L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "moveByChars(IZ)V", cancellable = true)
    private void moveByChars_181164246(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(181164246L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createClipboardSetter(Lnet/minecraft/client/Minecraft;)Ljava/util/function/Consumer;", cancellable = true)
    private static void createClipboardSetter__494571213(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-494571213L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setClipboardContents(Lnet/minecraft/client/Minecraft;Ljava/lang/String;)V", cancellable = true)
    private static void setClipboardContents_1423570841(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1423570841L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "removeFromCursor(ILnet/minecraft/client/gui/font/TextFieldHelper$CursorStep;)V", cancellable = true)
    private void removeFromCursor_1391363142(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1391363142L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "removeWordsFromCursor(I)V", cancellable = true)
    private void removeWordsFromCursor__1919706466(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1919706466L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "moveByWords(I)V", cancellable = true)
    private void moveByWords__1919706466(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1919706466L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "moveByWords(IZ)V", cancellable = true)
    private void moveByWords_181164246(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(181164246L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setCursorPos(IZ)V", cancellable = true)
    private void setCursorPos_181164246(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(181164246L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setCursorPos(I)V", cancellable = true)
    private void setCursorPos__1919706466(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1919706466L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getClipboardContents(Lnet/minecraft/client/Minecraft;)Ljava/lang/String;", cancellable = true)
    private static void getClipboardContents__695567039(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-695567039L))
            info.setReturnValue("IJ#H\u7B1Fe{6qV_gO,]9\uCFDFUy&p@H-1\u63A376yw0Kzo\u6DAF=zN\u5DB4_u-eN\uBEBE/PUK\u673ET{Egj\uAE5D");
    }

    @Inject(at = @At("HEAD"), method = "createClipboardGetter(Lnet/minecraft/client/Minecraft;)Ljava/util/function/Supplier;", cancellable = true)
    private static void createClipboardGetter__125623395(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-125623395L))
            info.setReturnValue(null);
    }


}
