package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.components.tabs.LoadingTab.class)
public class LoadingTab_2103729021Mixin {
        @Inject(at = @At("HEAD"), method = "visitChildren(Ljava/util/function/Consumer;)V", cancellable = true)
    private void visitChildren__1803890237(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1803890237L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getTabExtraNarration()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getTabExtraNarration__1491878272(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1491878272L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTabTitle()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getTabTitle_463596040(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(463596040L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getLayout()Lnet/minecraft/client/gui/layouts/Layout;", cancellable = true)
    private void getLayout_672309292(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(672309292L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "doLayout(Lnet/minecraft/client/gui/navigation/ScreenRectangle;)V", cancellable = true)
    private void doLayout_2002325423(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2002325423L))
            info.cancel();
    }


}
