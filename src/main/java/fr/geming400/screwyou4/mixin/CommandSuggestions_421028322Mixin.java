package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.components.CommandSuggestions.class)
public class CommandSuggestions_421028322Mixin {
        @Inject(at = @At("HEAD"), method = "hide()V", cancellable = true)
    private void hide_459303060(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(459303060L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isVisible()Z", cancellable = true)
    private void isVisible_459306904(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(459306904L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "keyPressed(Lnet/minecraft/client/input/KeyEvent;)Z", cancellable = true)
    private void keyPressed__495607393(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-495607393L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;II)V", cancellable = true)
    private void extractRenderState_1636202153(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1636202153L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "mouseScrolled(D)Z", cancellable = true)
    private void mouseScrolled_1630331532(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1630331532L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "mouseClicked(Lnet/minecraft/client/input/MouseButtonEvent;)Z", cancellable = true)
    private void mouseClicked_644650615(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(644650615L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getUsageNarration()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getUsageNarration__1755880844(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1755880844L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasAllowedInput()Z", cancellable = true)
    private void hasAllowedInput_459306904(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(459306904L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "setAllowSuggestions(Z)V", cancellable = true)
    private void setAllowSuggestions_1650645150(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1650645150L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setRestrictions(ZZ)V", cancellable = true)
    private void setRestrictions__72455724(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-72455724L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setAllowHiding(Z)V", cancellable = true)
    private void setAllowHiding_1650645150(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1650645150L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractSuggestions(Lnet/minecraft/client/gui/GuiGraphicsExtractor;II)Z", cancellable = true)
    private void extractSuggestions_1636205997(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1636205997L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "extractUsage(Lnet/minecraft/client/gui/GuiGraphicsExtractor;)V", cancellable = true)
    private void extractUsage__266886967(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-266886967L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "updateCommandInfo()V", cancellable = true)
    private void updateCommandInfo_459303060(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(459303060L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getNarrationMessage()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getNarrationMessage__1755880844(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1755880844L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "showSuggestions(Z)V", cancellable = true)
    private void showSuggestions_1650645150(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1650645150L))
            info.cancel();
    }


}
