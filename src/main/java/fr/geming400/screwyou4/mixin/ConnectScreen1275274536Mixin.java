package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.ConnectScreen.class)
public class ConnectScreen1275274536Mixin {
        @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1145590878(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1145590878L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "shouldCloseOnEsc()Z", cancellable = true)
    private void shouldCloseOnEsc_686178158(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(686178158L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V", cancellable = true)
    private void extractRenderState__2032813118(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2032813118L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "startConnecting(Lnet/minecraft/client/gui/screens/Screen;Lnet/minecraft/client/Minecraft;Lnet/minecraft/client/multiplayer/resolver/ServerAddress;Lnet/minecraft/client/multiplayer/ServerData;ZLnet/minecraft/client/multiplayer/TransferState;)V", cancellable = true)
    private static void startConnecting__1104807291(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1104807291L))
            info.cancel();
    }


}
