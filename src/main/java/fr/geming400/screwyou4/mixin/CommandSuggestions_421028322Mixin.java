package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.components.CommandSuggestions.class)
public class CommandSuggestions_421028322Mixin {
        @Inject(at = @At("HEAD"), method = "keyPressed(Lnet/minecraft/client/input/KeyEvent;)Z", cancellable = true)
    private void keyPressed_389974690(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(389974690L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isVisible()Z", cancellable = true)
    private void isVisible__630460240(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-630460240L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "mouseClicked(Lnet/minecraft/client/input/MouseButtonEvent;)Z", cancellable = true)
    private void mouseClicked__567625287(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-567625287L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "mouseScrolled(D)Z", cancellable = true)
    private void mouseScrolled__1993537091(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1993537091L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "hide()V", cancellable = true)
    private void hide_1221690514(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1221690514L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setAllowSuggestions(Z)V", cancellable = true)
    private void setAllowSuggestions__1158042874(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1158042874L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getUsageNarration()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getUsageNarration_1672837547(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1672837547L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "showSuggestions(Z)V", cancellable = true)
    private void showSuggestions__538755376(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-538755376L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "updateCommandInfo()V", cancellable = true)
    private void updateCommandInfo_747098244(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(747098244L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setRestrictions(ZZ)V", cancellable = true)
    private void setRestrictions__167528949(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-167528949L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setAllowHiding(Z)V", cancellable = true)
    private void setAllowHiding_1704989828(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1704989828L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getNarrationMessage()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getNarrationMessage__1250814417(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1250814417L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasAllowedInput()Z", cancellable = true)
    private void hasAllowedInput__1040626084(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1040626084L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "extractSuggestions(Lnet/minecraft/client/gui/GuiGraphicsExtractor;II)Z", cancellable = true)
    private void extractSuggestions__2131734821(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2131734821L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "extractUsage(Lnet/minecraft/client/gui/GuiGraphicsExtractor;)V", cancellable = true)
    private void extractUsage__1388877207(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1388877207L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;II)V", cancellable = true)
    private void extractRenderState__794857341(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-794857341L))
            info.cancel();
    }


}
