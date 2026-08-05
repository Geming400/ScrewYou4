package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.components.tabs.TabNavigationBar.class)
public class TabNavigationBar1673537108Mixin {
        @Inject(at = @At("HEAD"), method = "builder(Lnet/minecraft/client/gui/components/tabs/TabManager;IIII)Lnet/minecraft/client/gui/components/tabs/TabNavigationBar$Builder;", cancellable = true)
    private static void builder__1242520042(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1242520042L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "children()Ljava/util/List;", cancellable = true)
    private void children__995093372(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-995093372L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "keyPressed(Lnet/minecraft/client/input/KeyEvent;)Z", cancellable = true)
    private void keyPressed_756901394(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(756901394L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "arrangeElements(I)V", cancellable = true)
    private void arrangeElements__1407513216(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1407513216L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setTabActiveState(IZ)V", cancellable = true)
    private void setTabActiveState_693357496(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(693357496L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setTabTooltip(ILnet/minecraft/client/gui/components/Tooltip;)V", cancellable = true)
    private void setTabTooltip_364601079(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(364601079L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setFocused(Z)V", cancellable = true)
    private void setFocused__1391813359(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1391813359L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setFocused(Lnet/minecraft/client/gui/components/events/GuiEventListener;)V", cancellable = true)
    private void setFocused__505200086(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-505200086L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "selectTab(IZ)V", cancellable = true)
    private void selectTab_693357496(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(693357496L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getTabs()Ljava/util/List;", cancellable = true)
    private void getTabs__995093372(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-995093372L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRectangle()Lnet/minecraft/client/gui/navigation/ScreenRectangle;", cancellable = true)
    private void getRectangle__1446404884(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1446404884L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isMouseOver(DD)Z", cancellable = true)
    private void isMouseOver_529898123(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(529898123L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "nextFocusPath(Lnet/minecraft/client/gui/navigation/FocusNavigationEvent;)Lnet/minecraft/client/gui/ComponentPath;", cancellable = true)
    private void nextFocusPath__1829079366(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1829079366L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "narrationPriority()Lnet/minecraft/client/gui/narration/NarratableEntry$NarrationPriority;", cancellable = true)
    private void narrationPriority__1789708097(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1789708097L))
            info.setReturnValue(net.minecraft.client.gui.narration.NarratableEntry.NarrationPriority.FOCUSED);
    }


}
