package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.components.tabs.TabNavigationBar.class)
public class TabNavigationBar1673537108Mixin {
        @Inject(at = @At("HEAD"), method = "builder(Lnet/minecraft/client/gui/components/tabs/TabManager;IIII)Lnet/minecraft/client/gui/components/tabs/TabNavigationBar$Builder;", cancellable = true)
    private static void builder__1168120399(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1168120399L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "children()Ljava/util/List;", cancellable = true)
    private void children__1406763773(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1406763773L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "narrationPriority()Lnet/minecraft/client/gui/narration/NarratableEntry$NarrationPriority;", cancellable = true)
    private void narrationPriority_355493029(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(355493029L))
            info.setReturnValue(net.minecraft.client.gui.narration.NarratableEntry.NarrationPriority.NONE);
    }

    @Inject(at = @At("HEAD"), method = "nextFocusPath(Lnet/minecraft/client/gui/navigation/FocusNavigationEvent;)Lnet/minecraft/client/gui/ComponentPath;", cancellable = true)
    private void nextFocusPath__18055516(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-18055516L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRectangle()Lnet/minecraft/client/gui/navigation/ScreenRectangle;", cancellable = true)
    private void getRectangle_1425142867(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1425142867L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isMouseOver(DD)Z", cancellable = true)
    private void isMouseOver__2134948196(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2134948196L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getTabs()Ljava/util/List;", cancellable = true)
    private void getTabs_1780756088(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1780756088L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "selectTab(IZ)V", cancellable = true)
    private void selectTab__532918113(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-532918113L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "arrangeElements(I)V", cancellable = true)
    private void arrangeElements_1642138627(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1642138627L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setTabActiveState(IZ)V", cancellable = true)
    private void setTabActiveState_1284673888(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1284673888L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setTabTooltip(ILnet/minecraft/client/gui/components/Tooltip;)V", cancellable = true)
    private void setTabTooltip_1245975623(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1245975623L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "keyPressed(Lnet/minecraft/client/input/KeyEvent;)Z", cancellable = true)
    private void keyPressed_1642483477(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1642483477L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "setFocused(Lnet/minecraft/client/gui/components/events/GuiEventListener;)V", cancellable = true)
    private void setFocused__1410804321(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1410804321L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setFocused(Z)V", cancellable = true)
    private void setFocused__704539130(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-704539130L))
            info.cancel();
    }


}
