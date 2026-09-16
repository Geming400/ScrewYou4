package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.GenericWaitingScreen.class)
public class GenericWaitingScreen1465731498Mixin {
        @Inject(at = @At("HEAD"), method = "onClose()V", cancellable = true)
    private void onClose__1603220316(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1603220316L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1336047840(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1336047840L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createCompleted(Lnet/minecraft/network/chat/Component;Lnet/minecraft/network/chat/Component;Lnet/minecraft/network/chat/Component;Ljava/lang/Runnable;)Lnet/minecraft/client/gui/screens/GenericWaitingScreen;", cancellable = true)
    private static void createCompleted__1085229885(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1085229885L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createWaitingWithoutButton(Lnet/minecraft/network/chat/Component;Lnet/minecraft/network/chat/Component;)Lnet/minecraft/client/gui/screens/GenericWaitingScreen;", cancellable = true)
    private static void createWaitingWithoutButton__987625097(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-987625097L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createWaiting(Lnet/minecraft/network/chat/Component;Lnet/minecraft/network/chat/Component;Ljava/lang/Runnable;)Lnet/minecraft/client/gui/screens/GenericWaitingScreen;", cancellable = true)
    private static void createWaiting_1321538861(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1321538861L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "shouldCloseOnEsc()Z", cancellable = true)
    private void shouldCloseOnEsc_876635120(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(876635120L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V", cancellable = true)
    private void extractRenderState__1842356156(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1842356156L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getNarrationMessage()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getNarrationMessage__206111240(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-206111240L))
            info.setReturnValue(null);
    }


}
