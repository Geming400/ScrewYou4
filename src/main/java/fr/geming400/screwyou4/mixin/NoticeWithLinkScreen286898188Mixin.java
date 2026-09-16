package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.NoticeWithLinkScreen.class)
public class NoticeWithLinkScreen286898188Mixin {
        @Inject(at = @At("HEAD"), method = "onClose()V", cancellable = true)
    private void onClose_1512913670(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1512913670L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getNarrationMessage()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getNarrationMessage__1384944550(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1384944550L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createWorldSymlinkWarningScreen(Ljava/lang/Runnable;)Lnet/minecraft/client/gui/screens/Screen;", cancellable = true)
    private static void createWorldSymlinkWarningScreen_143412849(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(143412849L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createPackSymlinkWarningScreen(Ljava/lang/Runnable;)Lnet/minecraft/client/gui/screens/Screen;", cancellable = true)
    private static void createPackSymlinkWarningScreen__30965102(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-30965102L))
            info.setReturnValue(null);
    }


}
