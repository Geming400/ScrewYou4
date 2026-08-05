package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.components.tabs.GridLayoutTab.class)
public class GridLayoutTab_2065311049Mixin {
        @Inject(at = @At("HEAD"), method = "getLayout()Lnet/minecraft/client/gui/layouts/Layout;", cancellable = true)
    private void getLayout__168815592(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-168815592L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getTabExtraNarration()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getTabExtraNarration__111598117(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-111598117L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "visitChildren(Ljava/util/function/Consumer;)V", cancellable = true)
    private void visitChildren__1548639835(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1548639835L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getTabTitle()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getTabTitle__111598117(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-111598117L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "doLayout(Lnet/minecraft/client/gui/navigation/ScreenRectangle;)V", cancellable = true)
    private void doLayout_967462438(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(967462438L))
            info.cancel();
    }


}
