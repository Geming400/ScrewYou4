package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.components.EditBox.class)
public class EditBox1558403507Mixin {
        @Inject(at = @At("HEAD"), method = "getValue()Ljava/lang/String;", cancellable = true)
    private void getValue__181960009(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-181960009L))
            info.setReturnValue("7&\u0571<\u3622M@{I");
    }

    @Inject(at = @At("HEAD"), method = "setValue(Ljava/lang/String;)V", cancellable = true)
    private void setValue_1053271393(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1053271393L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isVisible()Z", cancellable = true)
    private void isVisible_506914946(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(506914946L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "preeditUpdated(Lnet/minecraft/client/input/PreeditEvent;)Z", cancellable = true)
    private void preeditUpdated_380466573(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(380466573L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "canConsumeInput()Z", cancellable = true)
    private void canConsumeInput_526699788(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(526699788L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getWordPosition(I)I", cancellable = true)
    private void getWordPosition_1818116635(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1818116635L))
            info.setReturnValue(858014690);
    }

    @Inject(at = @At("HEAD"), method = "setY(I)V", cancellable = true)
    private void setY_1464781782(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1464781782L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setX(I)V", cancellable = true)
    private void setX_577278101(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(577278101L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "playDownSound(Lnet/minecraft/client/sounds/SoundManager;)V", cancellable = true)
    private void playDownSound_777043171(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(777043171L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "updateWidgetNarration(Lnet/minecraft/client/gui/narration/NarrationElementOutput;)V", cancellable = true)
    private void updateWidgetNarration__65461050(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-65461050L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractWidgetRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V", cancellable = true)
    private void extractWidgetRenderState__1648879375(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1648879375L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "charTyped(Lnet/minecraft/client/input/CharacterEvent;)Z", cancellable = true)
    private void charTyped__382304977(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-382304977L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "keyPressed(Lnet/minecraft/client/input/KeyEvent;)Z", cancellable = true)
    private void keyPressed_1527349876(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1527349876L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "onClick(Lnet/minecraft/client/input/MouseButtonEvent;Z)V", cancellable = true)
    private void onClick_2052862952(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2052862952L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setFocused(Z)V", cancellable = true)
    private void setFocused__819672731(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-819672731L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "insertText(Ljava/lang/String;)V", cancellable = true)
    private void insertText__1586008534(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1586008534L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setVisible(Z)V", cancellable = true)
    private void setVisible__1752676832(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1752676832L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isBordered()Z", cancellable = true)
    private void isBordered__1981708427(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1981708427L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getScreenX(I)I", cancellable = true)
    private void getScreenX__2132584248(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2132584248L))
            info.setReturnValue(968541536);
    }

    @Inject(at = @At("HEAD"), method = "moveCursor(IZ)V", cancellable = true)
    private void moveCursor_1475350192(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1475350192L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setHint(Lnet/minecraft/network/chat/Component;)V", cancellable = true)
    private void setHint_1551470545(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1551470545L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "moveCursorTo(IZ)V", cancellable = true)
    private void moveCursorTo__1895731851(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1895731851L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "deleteWords(I)V", cancellable = true)
    private void deleteWords_723022365(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(723022365L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "moveCursorToStart(Z)V", cancellable = true)
    private void moveCursorToStart_821164688(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(821164688L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getHighlighted()Ljava/lang/String;", cancellable = true)
    private void getHighlighted_1712011417(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1712011417L))
            info.setReturnValue(".X}_<p-Q:@Db\u88EA[X?0u`l.\u922DbE,IDZ\u9F86{2L<I\u4345_K-/2t'Gz}{\u85B7wNX}CHt,9\u8AEF9UII'VmY<,W9.");
    }

    @Inject(at = @At("HEAD"), method = "moveCursorToEnd(Z)V", cancellable = true)
    private void moveCursorToEnd_1559787465(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1559787465L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "deleteCharsToPos(I)V", cancellable = true)
    private void deleteCharsToPos__1606002778(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1606002778L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setResponder(Ljava/util/function/Consumer;)V", cancellable = true)
    private void setResponder_496751568(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(496751568L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "deleteChars(I)V", cancellable = true)
    private void deleteChars__1325565871(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1325565871L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setTextColor(I)V", cancellable = true)
    private void setTextColor__402138669(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-402138669L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setTextShadow(Z)V", cancellable = true)
    private void setTextShadow__1497748513(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1497748513L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setMaxLength(I)V", cancellable = true)
    private void setMaxLength__1695111673(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1695111673L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setCentered(Z)V", cancellable = true)
    private void setCentered__1570666970(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1570666970L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setEditable(Z)V", cancellable = true)
    private void setEditable_1204000982(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1204000982L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setCanLoseFocus(Z)V", cancellable = true)
    private void setCanLoseFocus__761743611(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-761743611L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setBordered(Z)V", cancellable = true)
    private void setBordered__501389571(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-501389571L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setTextColorUneditable(I)V", cancellable = true)
    private void setTextColorUneditable__509468880(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-509468880L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getInnerWidth()I", cancellable = true)
    private void getInnerWidth_299513427(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(299513427L))
            info.setReturnValue(260502494);
    }

    @Inject(at = @At("HEAD"), method = "getCursorPosition()I", cancellable = true)
    private void getCursorPosition_1270381860(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1270381860L))
            info.setReturnValue(1278135069);
    }

    @Inject(at = @At("HEAD"), method = "addFormatter(Lnet/minecraft/client/gui/components/EditBox$TextFormatter;)V", cancellable = true)
    private void addFormatter__273458175(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-273458175L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setSuggestion(Ljava/lang/String;)V", cancellable = true)
    private void setSuggestion__1461090902(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1461090902L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setCursorPosition(I)V", cancellable = true)
    private void setCursorPosition__995241024(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-995241024L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setHighlightPos(I)V", cancellable = true)
    private void setHighlightPos_183723489(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(183723489L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setInvertHighlightedTextColor(Z)V", cancellable = true)
    private void setInvertHighlightedTextColor_2130353739(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2130353739L))
            info.cancel();
    }


}
