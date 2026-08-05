package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.components.MultiLineEditBox.class)
public class MultiLineEditBox773567054Mixin {
        @Inject(at = @At("HEAD"), method = "getValue()Ljava/lang/String;", cancellable = true)
    private void getValue__361893417(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-361893417L))
            info.setReturnValue("c w#");
    }

    @Inject(at = @At("HEAD"), method = "builder()Lnet/minecraft/client/gui/components/MultiLineEditBox$Builder;", cancellable = true)
    private static void builder_929783572(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(929783572L))
            info.setReturnValue(new net.minecraft.client.gui.components.MultiLineEditBox.Builder());
    }

    @Inject(at = @At("HEAD"), method = "setValue(Ljava/lang/String;Z)V", cancellable = true)
    private void setValue__2114843071(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2114843071L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setValue(Ljava/lang/String;)V", cancellable = true)
    private void setValue_1925928203(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1925928203L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "preeditUpdated(Lnet/minecraft/client/input/PreeditEvent;)Z", cancellable = true)
    private void preeditUpdated__986799654(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-986799654L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getInnerHeight()I", cancellable = true)
    private void getInnerHeight_811829300(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(811829300L))
            info.setReturnValue(-717839023);
    }

    @Inject(at = @At("HEAD"), method = "setValueListener(Ljava/util/function/Consumer;)V", cancellable = true)
    private void setValueListener_1454583467(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1454583467L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setCharacterLimit(I)V", cancellable = true)
    private void setCharacterLimit_1987484026(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1987484026L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setLineLimit(I)V", cancellable = true)
    private void setLineLimit_1987484026(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1987484026L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "updateWidgetNarration(Lnet/minecraft/client/gui/narration/NarrationElementOutput;)V", cancellable = true)
    private void updateWidgetNarration_2035226540(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2035226540L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "charTyped(Lnet/minecraft/client/input/CharacterEvent;)Z", cancellable = true)
    private void charTyped__1313074410(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1313074410L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "keyPressed(Lnet/minecraft/client/input/KeyEvent;)Z", cancellable = true)
    private void keyPressed__143068660(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-143068660L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "onClick(Lnet/minecraft/client/input/MouseButtonEvent;Z)V", cancellable = true)
    private void onClick__841095668(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-841095668L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setFocused(Z)V", cancellable = true)
    private void setFocused_2003183883(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2003183883L))
            info.cancel();
    }


}
