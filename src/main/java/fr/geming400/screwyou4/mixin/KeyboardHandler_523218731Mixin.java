package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.KeyboardHandler.class)
public class KeyboardHandler_523218731Mixin {
        @Inject(at = @At("HEAD"), method = "setup(Lcom/mojang/blaze3d/platform/Window;)V", cancellable = true)
    private void setup__346043797(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-346043797L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_561493469(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(561493469L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setClipboard(Ljava/lang/String;)V", cancellable = true)
    private void setClipboard_1675579879(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1675579879L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getClipboard()Ljava/lang/String;", cancellable = true)
    private void getClipboard__612241741(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-612241741L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "submitPreeditEvent(Lnet/minecraft/client/gui/components/events/GuiEventListener;Lnet/minecraft/client/input/PreeditEvent;)V", cancellable = true)
    private static void submitPreeditEvent_1559846631(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1559846631L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "resubmitLastPreeditEvent(Lnet/minecraft/client/gui/components/events/GuiEventListener;)V", cancellable = true)
    private void resubmitLastPreeditEvent__1655518464(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1655518464L))
            info.cancel();
    }


}
