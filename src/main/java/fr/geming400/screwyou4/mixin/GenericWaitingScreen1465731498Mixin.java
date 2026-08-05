package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.GenericWaitingScreen.class)
public class GenericWaitingScreen1465731498Mixin {
        @Inject(at = @At("HEAD"), method = "onClose()V", cancellable = true)
    private void onClose_1504006237(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1504006237L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1504006237(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1504006237L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V", cancellable = true)
    private void extractRenderState_506044126(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(506044126L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createCompleted(Lnet/minecraft/network/chat/Component;Lnet/minecraft/network/chat/Component;Lnet/minecraft/network/chat/Component;Ljava/lang/Runnable;)Lnet/minecraft/client/gui/screens/GenericWaitingScreen;", cancellable = true)
    private static void createCompleted_1997113234(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1997113234L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createWaitingWithoutButton(Lnet/minecraft/network/chat/Component;Lnet/minecraft/network/chat/Component;)Lnet/minecraft/client/gui/screens/GenericWaitingScreen;", cancellable = true)
    private static void createWaitingWithoutButton__1549148800(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1549148800L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createWaiting(Lnet/minecraft/network/chat/Component;Lnet/minecraft/network/chat/Component;Ljava/lang/Runnable;)Lnet/minecraft/client/gui/screens/GenericWaitingScreen;", cancellable = true)
    private static void createWaiting__1178253954(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1178253954L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getNarrationMessage()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getNarrationMessage__711177667(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-711177667L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "shouldCloseOnEsc()Z", cancellable = true)
    private void shouldCloseOnEsc_1504010081(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1504010081L))
            info.setReturnValue(false);
    }


}
