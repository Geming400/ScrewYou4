package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.components.EditBox.class)
public class EditBox1558403507Mixin {
        @Inject(at = @At("HEAD"), method = "getValue()Ljava/lang/String;", cancellable = true)
    private void getValue_422943036(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(422943036L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setValue(Ljava/lang/String;)V", cancellable = true)
    private void setValue__1584202640(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1584202640L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getWordPosition(I)I", cancellable = true)
    private void getWordPosition__1522659310(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1522659310L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isVisible()Z", cancellable = true)
    private void isVisible_1596682090(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1596682090L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setX(I)V", cancellable = true)
    private void setX__1522646817(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1522646817L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setY(I)V", cancellable = true)
    private void setY__1522646817(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1522646817L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "preeditUpdated(Lnet/minecraft/client/input/PreeditEvent;)Z", cancellable = true)
    private void preeditUpdated__201963201(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-201963201L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canConsumeInput()Z", cancellable = true)
    private void canConsumeInput_1596682090(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1596682090L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setFocused(Z)V", cancellable = true)
    private void setFocused__1506946960(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1506946960L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onClick(Lnet/minecraft/client/input/MouseButtonEvent;Z)V", cancellable = true)
    private void onClick__56259215(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-56259215L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "keyPressed(Lnet/minecraft/client/input/KeyEvent;)Z", cancellable = true)
    private void keyPressed_641767793(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(641767793L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "charTyped(Lnet/minecraft/client/input/CharacterEvent;)Z", cancellable = true)
    private void charTyped__528237957(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-528237957L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setInvertHighlightedTextColor(Z)V", cancellable = true)
    private void setInvertHighlightedTextColor__1506946960(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1506946960L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setSuggestion(Ljava/lang/String;)V", cancellable = true)
    private void setSuggestion__1584202640(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1584202640L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getInnerWidth()I", cancellable = true)
    private void getInnerWidth_1596665753(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1596665753L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addFormatter(Lnet/minecraft/client/gui/components/EditBox$TextFormatter;)V", cancellable = true)
    private void addFormatter__1431394600(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1431394600L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getCursorPosition()I", cancellable = true)
    private void getCursorPosition_1596665753(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1596665753L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setHint(Lnet/minecraft/network/chat/Component;)V", cancellable = true)
    private void setHint__342775430(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-342775430L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "moveCursor(IZ)V", cancellable = true)
    private void moveCursor_578223895(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(578223895L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "insertText(Ljava/lang/String;)V", cancellable = true)
    private void insertText__1584202640(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1584202640L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setVisible(Z)V", cancellable = true)
    private void setVisible__1506946960(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1506946960L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isBordered()Z", cancellable = true)
    private void isBordered_1596682090(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1596682090L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getScreenX(I)I", cancellable = true)
    private void getScreenX__1522659310(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1522659310L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setCursorPosition(I)V", cancellable = true)
    private void setCursorPosition__1522646817(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1522646817L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setHighlightPos(I)V", cancellable = true)
    private void setHighlightPos__1522646817(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1522646817L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setTextColor(I)V", cancellable = true)
    private void setTextColor__1522646817(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1522646817L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setResponder(Ljava/util/function/Consumer;)V", cancellable = true)
    private void setResponder__2055547376(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2055547376L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setTextColorUneditable(I)V", cancellable = true)
    private void setTextColorUneditable__1522646817(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1522646817L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setCanLoseFocus(Z)V", cancellable = true)
    private void setCanLoseFocus__1506946960(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1506946960L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "deleteChars(I)V", cancellable = true)
    private void deleteChars__1522646817(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1522646817L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "deleteCharsToPos(I)V", cancellable = true)
    private void deleteCharsToPos__1522646817(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1522646817L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setCentered(Z)V", cancellable = true)
    private void setCentered__1506946960(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1506946960L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setTextShadow(Z)V", cancellable = true)
    private void setTextShadow__1506946960(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1506946960L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "moveCursorTo(IZ)V", cancellable = true)
    private void moveCursorTo_578223895(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(578223895L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "moveCursorToEnd(Z)V", cancellable = true)
    private void moveCursorToEnd__1506946960(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1506946960L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getHighlighted()Ljava/lang/String;", cancellable = true)
    private void getHighlighted_422943036(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(422943036L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setEditable(Z)V", cancellable = true)
    private void setEditable__1506946960(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1506946960L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "deleteWords(I)V", cancellable = true)
    private void deleteWords__1522646817(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1522646817L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "moveCursorToStart(Z)V", cancellable = true)
    private void moveCursorToStart__1506946960(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1506946960L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setBordered(Z)V", cancellable = true)
    private void setBordered__1506946960(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1506946960L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setMaxLength(I)V", cancellable = true)
    private void setMaxLength__1522646817(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1522646817L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractWidgetRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V", cancellable = true)
    private void extractWidgetRenderState_598716135(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(598716135L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "updateWidgetNarration(Lnet/minecraft/client/gui/narration/NarrationElementOutput;)V", cancellable = true)
    private void updateWidgetNarration__1474904303(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1474904303L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "playDownSound(Lnet/minecraft/client/sounds/SoundManager;)V", cancellable = true)
    private void playDownSound_1305213628(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1305213628L))
            info.cancel();
    }


}
