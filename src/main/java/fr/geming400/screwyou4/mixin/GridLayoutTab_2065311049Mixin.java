package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.components.tabs.GridLayoutTab.class)
public class GridLayoutTab_2065311049Mixin {
        @Inject(at = @At("HEAD"), method = "doLayout(Lnet/minecraft/client/gui/navigation/ScreenRectangle;)V", cancellable = true)
    private void doLayout_1963907451(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1963907451L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getLayout()Lnet/minecraft/client/gui/layouts/Layout;", cancellable = true)
    private void getLayout_633891320(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(633891320L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "visitChildren(Ljava/util/function/Consumer;)V", cancellable = true)
    private void visitChildren__1842308209(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1842308209L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getTabTitle()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getTabTitle_425178068(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(425178068L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTabExtraNarration()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getTabExtraNarration__1530296244(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1530296244L))
            info.setReturnValue(null);
    }


}
