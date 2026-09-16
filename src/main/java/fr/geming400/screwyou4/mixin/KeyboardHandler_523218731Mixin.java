package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.KeyboardHandler.class)
public class KeyboardHandler_523218731Mixin {
        @Inject(at = @At("HEAD"), method = "setup(Lcom/mojang/blaze3d/platform/Window;)V", cancellable = true)
    private void setup__1815101298(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1815101298L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_393535072(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(393535072L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setClipboard(Ljava/lang/String;)V", cancellable = true)
    private void setClipboard__1765522413(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1765522413L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "submitPreeditEvent(Lnet/minecraft/client/gui/components/events/GuiEventListener;Lnet/minecraft/client/input/PreeditEvent;)V", cancellable = true)
    private static void submitPreeditEvent_754680354(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(754680354L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getClipboard()Ljava/lang/String;", cancellable = true)
    private void getClipboard__421341805(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-421341805L))
            info.setReturnValue("IqF>R\u55E5\u03E4E0k\u0FBB\u2F69P\u606D$1k[isEYae");
    }

    @Inject(at = @At("HEAD"), method = "resubmitLastPreeditEvent(Lnet/minecraft/client/gui/components/events/GuiEventListener;)V", cancellable = true)
    private void resubmitLastPreeditEvent__2122924338(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2122924338L))
            info.cancel();
    }


}
