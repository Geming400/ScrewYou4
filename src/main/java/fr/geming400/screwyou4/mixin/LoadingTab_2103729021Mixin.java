package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.components.tabs.LoadingTab.class)
public class LoadingTab_2103729021Mixin {
        @Inject(at = @At("HEAD"), method = "getLayout()Lnet/minecraft/client/gui/layouts/Layout;", cancellable = true)
    private void getLayout__130397620(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-130397620L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTabTitle()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getTabTitle__73180145(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-73180145L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTabExtraNarration()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getTabExtraNarration__73180145(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-73180145L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "visitChildren(Ljava/util/function/Consumer;)V", cancellable = true)
    private void visitChildren__1510221863(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1510221863L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "doLayout(Lnet/minecraft/client/gui/navigation/ScreenRectangle;)V", cancellable = true)
    private void doLayout_1005880410(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1005880410L))
            info.cancel();
    }


}
