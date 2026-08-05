package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.components.MultiLineEditBox.class)
public class MultiLineEditBox773567054Mixin {
        @Inject(at = @At("HEAD"), method = "getValue()Ljava/lang/String;", cancellable = true)
    private void getValue__966796462(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-966796462L))
            info.setReturnValue("Sp/}|u{3H68l_[jVkfkLZJEH ?^P^\u9510[jk\u1FA9m86`a2\uFAB7R#',o0\"2\u7BA5D>a_CZ2%B+#Eh&/");
    }

    @Inject(at = @At("HEAD"), method = "builder()Lnet/minecraft/client/gui/components/MultiLineEditBox$Builder;", cancellable = true)
    private static void builder__115508241(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-115508241L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setValue(Ljava/lang/String;Z)V", cancellable = true)
    private void setValue__1957526672(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1957526672L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setValue(Ljava/lang/String;)V", cancellable = true)
    private void setValue_268434940(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(268434940L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "updateWidgetNarration(Lnet/minecraft/client/gui/narration/NarrationElementOutput;)V", cancellable = true)
    private void updateWidgetNarration__850297503(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-850297503L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setLineLimit(I)V", cancellable = true)
    private void setLineLimit__1099919457(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1099919457L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setValueListener(Ljava/util/function/Consumer;)V", cancellable = true)
    private void setValueListener_13912558(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(13912558L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setCharacterLimit(I)V", cancellable = true)
    private void setCharacterLimit_1485857166(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1485857166L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setFocused(Z)V", cancellable = true)
    private void setFocused__1604509184(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1604509184L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "onClick(Lnet/minecraft/client/input/MouseButtonEvent;Z)V", cancellable = true)
    private void onClick_1268026499(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1268026499L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "preeditUpdated(Lnet/minecraft/client/input/PreeditEvent;)Z", cancellable = true)
    private void preeditUpdated__404369880(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-404369880L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getInnerHeight()I", cancellable = true)
    private void getInnerHeight__1377687891(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1377687891L))
            info.setReturnValue(-860843308);
    }

    @Inject(at = @At("HEAD"), method = "keyPressed(Lnet/minecraft/client/input/KeyEvent;)Z", cancellable = true)
    private void keyPressed_742513423(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(742513423L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "charTyped(Lnet/minecraft/client/input/CharacterEvent;)Z", cancellable = true)
    private void charTyped__1167141430(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1167141430L))
            info.setReturnValue(true);
    }


}
