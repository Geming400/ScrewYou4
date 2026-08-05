package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.gui.screens.ConnectScreen.class)
public class ConnectScreen1275274536Mixin {
        @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1313549275(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1313549275L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "shouldCloseOnEsc()Z", cancellable = true)
    private void shouldCloseOnEsc_1313553119(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1313553119L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "extractRenderState(Lnet/minecraft/client/gui/GuiGraphicsExtractor;IIF)V", cancellable = true)
    private void extractRenderState_315587164(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(315587164L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "startConnecting(Lnet/minecraft/client/gui/screens/Screen;Lnet/minecraft/client/Minecraft;Lnet/minecraft/client/multiplayer/resolver/ServerAddress;Lnet/minecraft/client/multiplayer/ServerData;ZLnet/minecraft/client/multiplayer/TransferState;)V", cancellable = true)
    private static void startConnecting_1572784895(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1572784895L))
            info.cancel();
    }


}
